package ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import model.Activity;
import model.ActivitySelection;
import model.FoodSelection;
import model.Goal;
import model.HealthMeasure;
import model.HealthMeasureHistory;
import model.Motivation;
import model.Person;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL) // optional
public interface People {

	/*
	 * Getting the detail information of a Person identified by idPerson.
	 * 
	 */
	 

	@WebMethod(operationName = "getPersonById")
	@WebResult(name = "personResult")
	public Person getPersonById(@WebParam(name = "idPerson") int idPerson);

	
	/* 
	 * Searching the activities
	 * 
	 */
	
	@WebMethod(operationName = "searchActivities")
	@WebResult(name = "listActivityResult")
	public List<Activity> searchActivities(@WebParam(name = "idPerson") int idPerson, @WebParam(name = "type") String type);
	
	/*
	 * Searching the foods
	 */
	
	@WebMethod(operationName = "searchFoods")
	@WebResult(name = "listFoodSelectionResult")
	public List<FoodSelection> searchFoods(@WebParam(name = "idPerson") int idPerson, @WebParam(name = "q") List<String> q, @WebParam(name = "calories") double calories);
	
	/*
	 * Updating health profile.
	 */
	
	@WebMethod(operationName = "updateHealthMeasure")
	@WebResult(name = "personResult")
	public Person updateHealthMeasure(@WebParam(name = "idPerson") int idPerson, @WebParam(name = "height") double height, @WebParam(name = "weight") double weight, @WebParam(name = "age") int age);
	
	/*
	 * Getting suggestion for foods
	 */
	
	@WebMethod(operationName = "suggetFoodSelections")
	@WebResult(name = "listFoodSelectionResult")
	public List<FoodSelection> suggetFoodSelections(@WebParam(name = "idPerson") int idPerson);
	
	/*
	 * Getting suggestion for activities.
	 */
	
	@WebMethod(operationName = "suggestActivities")
	@WebResult(name = "listActivityResult")
	public List<Activity> suggestActivities(@WebParam(name = "idPerson") int idPerson);
	
	/*
	 * Adding a food into the food list of goal
	 */
	
	@WebMethod(operationName = "addFoodSelectionToGoal")
	@WebResult(name = "personResult")
	public Person addFoodSelectionToGoal(@WebParam(name = "idPerson") int idPerson, @WebParam(name = "fs") FoodSelection fs);
	
	/*
	 * Adding a activity into the activity list of goal
	 */
	
	@WebMethod(operationName = "addActivityToGoal")
	@WebResult(name = "personResult")
	public Person addActivityToGoal(@WebParam(name = "idPerson") int idPerson, @WebParam(name = "ac") Activity ac);
	
	/*
	 * Getting list of health measure histories.
	 */
	
	@WebMethod(operationName = "getMeasureHistories")
	@WebResult(name = "listHealthMeasureHistoryResult")
	public List<HealthMeasureHistory> getMeasureHistories(@WebParam(name = "idPerson") int idPerson);
	
	
	/*
	 * Getting list of goal histories
	 */
	
	@WebMethod(operationName = "getGoalHistories")
	@WebResult(name = "listGoalResult")
	public List<Goal> getGoalHistories(@WebParam(name = "idPerson") int idPerson);
	
	/*
	 * Updating time activity selection
	 */
	
	@WebMethod(operationName = "updateTimeForActivitySelection")
	@WebResult(name = "personResult")
	public Person updateTimeForActivitySelection(@WebParam(name = "idPerson") int idPerson, @WebParam(name = "as") ActivitySelection as);
	
	/*
	 * Creating new goal for person
	 */
	
	@WebMethod(operationName = "createNewGoal")
	@WebResult(name = "personResult")
	public Person createNewGoal(@WebParam(name = "idPerson") int idPerson);
	
	/*
	 * Getting motivating quote.
	 */
	
	@WebMethod(operationName = "getMotivation")
	@WebResult(name = "motivationResult")
	public Motivation getMotivation(@WebParam(name = "idPerson") int idPerson);
}