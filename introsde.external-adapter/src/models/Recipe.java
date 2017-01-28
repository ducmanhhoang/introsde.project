package models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="recipe")
@XmlType(propOrder = {"idFoodSelection", "label", "image", "calories", "weight", "ingredients", "current"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Recipe {
	private int idFoodSelection;
	private String label;
	private String image;
	private Long calories;
	private Long weight;
	private String ingredients;
	private int current;
	
	public Recipe() {
		
	}

	public int getIdFoodSelection() {
		return idFoodSelection;
	}

	public void setIdFoodSelection(int idFoodSelection) {
		this.idFoodSelection = idFoodSelection;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Long getCalories() {
		return calories;
	}

	public void setCalories(Long calories) {
		this.calories = calories;
	}

	public Long getWeight() {
		return weight;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}
	
}
