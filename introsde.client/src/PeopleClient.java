import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ws.Goal;
import ws.HealthMeasure;
import ws.HealthMeasureHistory;
import ws.Motivation;
import ws.Activity;
import ws.ActivitySelection;
import ws.FoodSelection;
import ws.People;
import ws.PeopleService;
import ws.Person;

public class PeopleClient {
	private final static int idPerson = 1;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";

		PeopleService service = new PeopleService();
		People people = service.getPeopleImplPort();
		
		List<FoodSelection> searchingListOffoodSelections = new ArrayList<FoodSelection>();
		List<Activity> searchingListOfActivities = new ArrayList<Activity>();
		
		List<FoodSelection> suggestionFoods = new ArrayList<FoodSelection>();
		List<Activity> suggestionActivities = new ArrayList<Activity>();
		
		Person person = people.getPersonById(idPerson);

		while (true) {
			System.out.println("This is the console. To quit this program, please type 'q' or 'Q'.");	
			System.out.println("\n\n");
			System.out.println("MENU");
			System.out.println("1: Show person information.");
			System.out.println("2: Update your health profile.");
			
			System.out.println("3: Create new goal.");
			
			System.out.println("4: Get suggestion for foods and select food for diet.");
			System.out.println("5: Get suggestion for activities and select activity for exercie.");
			System.out.println("6: Search for foods and select food for diet.");
			System.out.println("7: Search for activities and select activity for exercie.");
			System.out.println("8: Update time of the current activity.");
			
			System.out.println("9: Show health measure histories.");
			System.out.println("10: Show goal histories.");
			input = br.readLine();
			if (input.equals("q") || input.equals("Q")) {
				System.exit(0);
			} else {
				switch (input) {
				case "1":
					write(person, people.getMotivation(idPerson));
					break;
				case "2":
					System.out.print("Height: "); input = br.readLine();
					double height = Double.parseDouble(input);
					System.out.print("Weight: "); input = br.readLine();
					double weight = Double.parseDouble(input);
					System.out.print("age: "); input = br.readLine();
					int age = Integer.parseInt(input);
					person = people.updateHealthMeasure(idPerson, height, weight, age);
					break;
				case "4":
					suggestionFoods = people.suggetFoodSelections(idPerson);
					writeFoodSelections(suggestionFoods);
					System.out.print("Enter the food ID(to exit enter q): "); input = br.readLine();
					if (input.equals("q") || input.equals("Q")) {
						break;
					} else {
						int select = Integer.parseInt(input);
						FoodSelection foodSelection = suggestionFoods.get(select - 1);
						person = people.addFoodSelectionToGoal(idPerson, foodSelection);
					}
					break;
				case "5":
					suggestionActivities = people.suggestActivities(idPerson);
					writeActivities(suggestionActivities);
					System.out.print("Enter the activity ID(to exit enter q): "); input = br.readLine();
					if (input.equals("q") || input.equals("Q")) {
						break;
					} else {
						int select = Integer.parseInt(input);
						for (Activity activity : suggestionActivities) {
							if (activity.getIdActivity() == select) {
								person = people.addActivityToGoal(idPerson, activity);
							}
						}
					}
					break;
				case "6":
					System.out.print("Enter your foods(separated by ','): "); input = br.readLine();
					List<String> q = Arrays.asList(input.split("\\s*,\\s*"));
					System.out.print("Enter your needed calories: "); input = br.readLine();
					double calories = Double.parseDouble(input);
					searchingListOffoodSelections = people.searchFoods(idPerson, q, calories);
					writeFoodSelections(searchingListOffoodSelections);
					System.out.print("Enter the food ID(to exit enter q): "); input = br.readLine();
					if (input.equals("q") || input.equals("Q")) {
						break;
					} else {
						int select = Integer.parseInt(input);
						FoodSelection foodSelection = searchingListOffoodSelections.get(select - 1);
						person = people.addFoodSelectionToGoal(idPerson, foodSelection);
					}
					break;
				case "7":
					System.out.print("Enter your activity type: "); input = br.readLine();
					searchingListOfActivities = people.searchActivities(idPerson, input);
					writeActivities(searchingListOfActivities);
					System.out.print("Enter the activity ID(to exit enter q): "); input = br.readLine();
					if (input.equals("q") || input.equals("Q")) {
						break;
					} else {
						int select = Integer.parseInt(input);
						for (Activity activity : searchingListOfActivities) {
							if (activity.getIdActivity() == select) {
								person = people.addActivityToGoal(idPerson, activity);
							}
						}
					}
					break;
				case "8":
					System.out.print("Enter activity time(hour): "); input = br.readLine();
					double time = Double.parseDouble(input);
					for (Goal goal: person.getGoals().getGoals()) {
						if (goal.getCurrent() == 1) {
							for (ActivitySelection activitySelection : goal.getActivitySelections().getActivitySelections()) {
								if (activitySelection.getCurrent() == 1) {
									ActivitySelection tmpActivitySelection = activitySelection;
									tmpActivitySelection.setTime(time);
									person = people.updateTimeForActivitySelection(idPerson, tmpActivitySelection);
								}
							}
						}
					}
					break;
				case "3":
					person = people.createNewGoal(idPerson);
					break;
				case "9":
					List<HealthMeasureHistory> healthMeasureHistories = people.getMeasureHistories(idPerson);
					writeHealthMeasureHistories(healthMeasureHistories);
					break;
				case "10":
					List<Goal> goals = people.getGoalHistories(idPerson);
					writeGoals(goals);
					break;
				
				}
					
			}
		}

	}
	
	
	public static void writeHealthMeasureHistories(List<HealthMeasureHistory> healthMeasureHistories) {
		System.out.println("HEALTH HISTORIES INFORMATION:");
		System.out.println("*************************************************");
		for (HealthMeasureHistory healthMeasureHistory : healthMeasureHistories) {
			System.out.format("%1s%15s%30f%20s%3s\n", "*", healthMeasureHistory.getMeasureDefinition().getMeasureName() + ": ", healthMeasureHistory.getValue(), healthMeasureHistory.getTimestamp(), "*");
		}
		System.out.println("*************************************************");
	}
	
	public static void writeGoals(List<Goal> goals) {
		System.out.println("GOAL HISTORIES INFORMATION:");
		System.out.println("*********************************************************************");
		for (Goal goal : goals) {
			System.out.format("%1s%25s%40s%3s\n", "*", "Name: ", goal.getGoalName(), "*");
			System.out.format("%1s%25s%40s%3s\n", "*", "Date: ", goal.getDate(), "*");
			System.out.format("%1s%25s%40f%3s\n", "*", "Ideal BMI: ", goal.getIdealBmi(), "*");
			System.out.format("%1s%25s%40f%3s\n", "*", "Ideal Weight: ", goal.getIdealWeight(), "*");
			System.out.format("%1s%25s%40f%3s\n", "*", "Shaved Calories: ", goal.getShavedCalories(), "*");
			System.out.println("*********************************************************************");
			System.out.println("FOODS INFORMATION:");
			System.out.println("***************************************************************************************************");
			for (FoodSelection foodSelection : goal.getFoodSelections().getFoodSelections()) {
				System.out.format("%1s%25s%70s%3s\n", "*", "Name: ", foodSelection.getLabel(), "*");
				System.out.format("%1s%25s%70f%3s\n", "*", "Weight: ", foodSelection.getWeight(), "*");
				System.out.format("%1s%25s%70f%3s\n", "*", "Calories: ", foodSelection.getCalories(), "*");
				System.out.println("---------------------------------------------------------------------------------------------------");
			}
			System.out.println("***************************************************************************************************");
			System.out.println("ACTIVITIES INFORMATION:");
			System.out.println("***************************************************************************************************");
			for (ActivitySelection activitySelection : goal.getActivitySelections().getActivitySelections()) {
				System.out.format("%1s%25s%70s%3s\n", "*", "Name: ", activitySelection.getActivity().getActivityName(),	"*");
				System.out.format("%1s%25s%70f%3s\n", "*", "Time: ", activitySelection.getTime(), "*");
				System.out.format("%1s%25s%70f%3s\n", "*", "Used Calories: ", activitySelection.getUsedCalories(), "*");
				System.out.format("%1s%25s%70f%3s\n", "*", "Rate Calories/Hour: ",
						activitySelection.getActivity().getCaloriesPerHour(), "*");
				System.out.println("--------------------------------------------------------------------------------------------------");
			}
			System.out.println("***************************************************************************************************");
		}
	}
	
	public static void write(Person person, Motivation motivation) {
		System.out.println("PERSONAL INFORMATION:");
		System.out.println("*************************************************");
		System.out.format("%1s%15s%30d%3s\n", "*", "ID: ", person.getIdPerson(), "*");
		System.out.format("%1s%15s%30s%3s\n", "*", "Name: ", (person.getFirstname() + " " + person.getLastname()), "*");
		System.out.format("%1s%15s%30s%3s\n", "*", "Birthdate: ", person.getBirthdate(), "*");
		System.out.format("%1s%15s%30s%3s\n", "*", "Sex: ", (person.getSex() == 1) ? "Male" : "Female", "*");
		System.out.println("*************************************************");
		
		System.out.println("HEALTH INFORMATION:");
		System.out.println("*************************************************");
		for (HealthMeasure healthMeasure : person.getHealthMeasures().getHealthMeasures()) {
			System.out.format("%1s%15s%30f%3s\n", "*", healthMeasure.getMeasureDefinition().getMeasureName() + ": ", healthMeasure.getValue(), "*");
		}
		System.out.println("*************************************************");
		
		System.out.println("GOAL INFORMATION:");
		System.out.println("*********************************************************************");
		for (Goal goal : person.getGoals().getGoals()) {
			if (goal.getCurrent() == 1) {
				System.out.format("%1s%25s%40s%3s\n", "*", "Name: ", goal.getGoalName(), "*");
				System.out.format("%1s%25s%40s%3s\n", "*", "Date: ", goal.getDate(), "*");
				System.out.format("%1s%25s%40f%3s\n", "*", "Ideal BMI: ", goal.getIdealBmi(), "*");
				System.out.format("%1s%25s%40f%3s\n", "*", "Ideal Weight: ", goal.getIdealWeight(), "*");
				System.out.format("%1s%25s%40f%3s\n", "*", "Shaved Calories: ", goal.getShavedCalories(), "*");
				System.out.println("*********************************************************************");
				System.out.println("FOODS INFORMATION:");
				System.out.println("***************************************************************************************************");
				for (FoodSelection foodSelection : goal.getFoodSelections().getFoodSelections()) {
					System.out.format("%1s%25s%70s%3s\n", "*", "Name: ", foodSelection.getLabel(), "*");
					System.out.format("%1s%25s%70f%3s\n", "*", "Weight: ", foodSelection.getWeight(), "*");
					System.out.format("%1s%25s%70f%3s\n", "*", "Calories: ", foodSelection.getCalories(), "*");
					System.out.println("---------------------------------------------------------------------------------------------------");
				}
				System.out.println("***************************************************************************************************");
				System.out.println("ACTIVITIES INFORMATION:");
				System.out.println("***************************************************************************************************");
				for (ActivitySelection activitySelection : goal.getActivitySelections().getActivitySelections()) {
					System.out.format("%1s%25s%70s%3s\n", "*", "Name: ", activitySelection.getActivity().getActivityName(), "*");
					System.out.format("%1s%25s%70f%3s\n", "*", "Time: ", activitySelection.getTime(), "*");
					System.out.format("%1s%25s%70f%3s\n", "*", "Used Calories: ", activitySelection.getUsedCalories(), "*");
					System.out.format("%1s%25s%70f%3s\n", "*", "Rate Calories/Hour: ", activitySelection.getActivity().getCaloriesPerHour(), "*");
					System.out.println("--------------------------------------------------------------------------------------------------");
				}
				System.out.println("***************************************************************************************************");
			}
		}
		System.out.println("MOTIVATION:");
		System.out.println("\"" + motivation.getText() + "\"");
		
	}
	
	public static void writeActivities(List<Activity> activities) {
		if (activities != null) {
			System.out.println("ACTIVITIES INFORMATION:");
			System.out.println("***************************************************************************************************");
			for (Activity activity : activities) {
				System.out.format("%1s%25s%70d%3s\n", "*", "ID: ", activity.getIdActivity(),"*");
				System.out.format("%1s%25s%70s%3s\n", "*", "Name: ", activity.getActivityName(),"*");
				System.out.format("%1s%25s%70s%3s\n", "*", "Type: ", activity.getActivityType(), "*");
				System.out.format("%1s%25s%70f%3s\n", "*", "Used Calories: ", activity.getCaloriesPerHour(), "*");
				System.out.println("--------------------------------------------------------------------------------------------------");
			}
			System.out.println("***************************************************************************************************");
		}
	}
	
	public static void writeFoodSelections(List<FoodSelection> foodSelections) {
		if (foodSelections != null) {
			System.out.println("ACTIVITIES INFORMATION:");
			System.out.println("***************************************************************************************************");
			int i = 0;
			for (FoodSelection foodSelection : foodSelections) {
				System.out.format("%1s%25s%70d%3s\n", "*", "ID: ", i + 1,"*");
				System.out.format("%1s%25s%70s%3s\n", "*", "Name: ", foodSelection.getLabel(),"*");
				System.out.format("%1s%25s%70f%3s\n", "*", "Calories: ", foodSelection.getCalories(), "*");
				System.out.format("%1s%25s%70f%3s\n", "*", "Weight: ", foodSelection.getWeight(), "*");
				System.out.format("%1s%25s%70s%3s\n", "*", "Ingredients: ", foodSelection.getIngredients(), "*");
				System.out.println("--------------------------------------------------------------------------------------------------");
				i = i + 1;
			}
			System.out.println("***************************************************************************************************");
		}
	}

}
