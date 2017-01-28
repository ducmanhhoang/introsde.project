package resources;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import org.glassfish.jersey.client.ClientConfig;
import org.json.JSONArray;
import org.json.JSONObject;

import models.Recipe;

@Stateless
@LocalBean
@Path("/api")
public class RecipeReources {

	/*
	 * Getting api information.
	 * 
	 * URL: http://localhost:8080/introsde.external-adapter/api
	 * 
	 * GET: OK
	 */
	
	@GET
	@Produces({ MediaType.TEXT_HTML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public String getInfo() {
		System.out.println("Getting api information...");
		return "Hello! This is External adapter service";
	}
	
	/*
	 * Getting recipe from external foods service of Edaman.
	 * 
	 * URL: http://localhost:8080/introsde.external-adapter/api/recipe?q=pork&q=carrot&calories=1000
	 * 
	 * GET: OK
	 */
	
	@GET
	@Path("/recipe")
	@Produces({ MediaType.TEXT_XML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Recipe> getRecipes(@Context UriInfo ui) {
		List<Recipe> recipes = null;
		MultivaluedMap<String, String> queryParams = ui.getQueryParameters();
		List<String> q = queryParams.get("q");
		double calories = Double.parseDouble(queryParams.getFirst("calories"));

		String app_id = "3e294779";
		String app_key = "88c2e8d91ab7e75cbaf6fc169e41c899";
		String from = "0";
		String to = "1000";

		ClientConfig clientConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(clientConfig);
		WebTarget service = client.target(UriBuilder.fromUri("https://api.edamam.com").build()).path("search")
				.queryParam("q", q).queryParam("app_id", app_id).queryParam("app_key", app_key).queryParam("from", from)
				.queryParam("to", to);

		// System.out.println(service.toString());
		Response response = service.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).get();

		int httpStatus = response.getStatus();
		String json = response.readEntity(String.class);
		// System.out.println(json);
		if (httpStatus == 200) {
			JSONObject jobj = new JSONObject(json);

			JSONArray hits = jobj.getJSONArray("hits");
			recipes = new ArrayList<Recipe>();
			for (int i = 0; i < hits.length(); i++) {
				JSONObject jrecipe = hits.getJSONObject(i).getJSONObject("recipe");
				if (jrecipe.getLong("calories") <= calories) {
					Recipe recipe = new Recipe();
					recipe.setCalories(jrecipe.getLong("calories"));
					recipe.setIdFoodSelection(0);
					recipe.setImage(jrecipe.getString("image"));
					JSONArray jingredients = jrecipe.getJSONArray("ingredients");
					String ingredients = "";
					for (int j = 0; j < jingredients.length(); j++) {
						JSONObject jingredient = jingredients.getJSONObject(j);
						ingredients = ingredients + (j + 1) + ": " + jingredient.getString("text") + " ("
								+ jingredient.getDouble("weight") + ");";
					}
					recipe.setIngredients(ingredients);
					recipe.setLabel(jrecipe.getString("label"));
					recipe.setWeight(jrecipe.getLong("totalWeight"));
					recipe.setCurrent(1);
					recipes.add(recipe);
				}
			}
		}

		return recipes;
	}
}
