
package ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "People", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface People {


    /**
     * 
     * @param idPerson
     * @param type
     * @return
     *     returns java.util.List<ws.Activity>
     */
    @WebMethod
    @WebResult(name = "listActivityResult", targetNamespace = "")
    @RequestWrapper(localName = "searchActivities", targetNamespace = "http://ws/", className = "ws.SearchActivities")
    @ResponseWrapper(localName = "searchActivitiesResponse", targetNamespace = "http://ws/", className = "ws.SearchActivitiesResponse")
    @Action(input = "http://ws/People/searchActivitiesRequest", output = "http://ws/People/searchActivitiesResponse")
    public List<Activity> searchActivities(
        @WebParam(name = "idPerson", targetNamespace = "")
        int idPerson,
        @WebParam(name = "type", targetNamespace = "")
        String type);

    /**
     * 
     * @param idPerson
     * @return
     *     returns ws.Person
     */
    @WebMethod
    @WebResult(name = "personResult", targetNamespace = "")
    @RequestWrapper(localName = "getPersonById", targetNamespace = "http://ws/", className = "ws.GetPersonById")
    @ResponseWrapper(localName = "getPersonByIdResponse", targetNamespace = "http://ws/", className = "ws.GetPersonByIdResponse")
    @Action(input = "http://ws/People/getPersonByIdRequest", output = "http://ws/People/getPersonByIdResponse")
    public Person getPersonById(
        @WebParam(name = "idPerson", targetNamespace = "")
        int idPerson);

    /**
     * 
     * @param q
     * @param idPerson
     * @param calories
     * @return
     *     returns java.util.List<ws.FoodSelection>
     */
    @WebMethod
    @WebResult(name = "listFoodSelectionResult", targetNamespace = "")
    @RequestWrapper(localName = "searchFoods", targetNamespace = "http://ws/", className = "ws.SearchFoods")
    @ResponseWrapper(localName = "searchFoodsResponse", targetNamespace = "http://ws/", className = "ws.SearchFoodsResponse")
    @Action(input = "http://ws/People/searchFoodsRequest", output = "http://ws/People/searchFoodsResponse")
    public List<FoodSelection> searchFoods(
        @WebParam(name = "idPerson", targetNamespace = "")
        int idPerson,
        @WebParam(name = "q", targetNamespace = "")
        List<String> q,
        @WebParam(name = "calories", targetNamespace = "")
        double calories);

    /**
     * 
     * @param idPerson
     * @param weight
     * @param age
     * @param height
     * @return
     *     returns ws.Person
     */
    @WebMethod
    @WebResult(name = "personResult", targetNamespace = "")
    @RequestWrapper(localName = "updateHealthMeasure", targetNamespace = "http://ws/", className = "ws.UpdateHealthMeasure")
    @ResponseWrapper(localName = "updateHealthMeasureResponse", targetNamespace = "http://ws/", className = "ws.UpdateHealthMeasureResponse")
    @Action(input = "http://ws/People/updateHealthMeasureRequest", output = "http://ws/People/updateHealthMeasureResponse")
    public Person updateHealthMeasure(
        @WebParam(name = "idPerson", targetNamespace = "")
        int idPerson,
        @WebParam(name = "height", targetNamespace = "")
        double height,
        @WebParam(name = "weight", targetNamespace = "")
        double weight,
        @WebParam(name = "age", targetNamespace = "")
        int age);

    /**
     * 
     * @param idPerson
     * @return
     *     returns java.util.List<ws.FoodSelection>
     */
    @WebMethod
    @WebResult(name = "listFoodSelectionResult", targetNamespace = "")
    @RequestWrapper(localName = "suggetFoodSelections", targetNamespace = "http://ws/", className = "ws.SuggetFoodSelections")
    @ResponseWrapper(localName = "suggetFoodSelectionsResponse", targetNamespace = "http://ws/", className = "ws.SuggetFoodSelectionsResponse")
    @Action(input = "http://ws/People/suggetFoodSelectionsRequest", output = "http://ws/People/suggetFoodSelectionsResponse")
    public List<FoodSelection> suggetFoodSelections(
        @WebParam(name = "idPerson", targetNamespace = "")
        int idPerson);

    /**
     * 
     * @param idPerson
     * @return
     *     returns java.util.List<ws.Activity>
     */
    @WebMethod
    @WebResult(name = "listActivityResult", targetNamespace = "")
    @RequestWrapper(localName = "suggestActivities", targetNamespace = "http://ws/", className = "ws.SuggestActivities")
    @ResponseWrapper(localName = "suggestActivitiesResponse", targetNamespace = "http://ws/", className = "ws.SuggestActivitiesResponse")
    @Action(input = "http://ws/People/suggestActivitiesRequest", output = "http://ws/People/suggestActivitiesResponse")
    public List<Activity> suggestActivities(
        @WebParam(name = "idPerson", targetNamespace = "")
        int idPerson);

    /**
     * 
     * @param idPerson
     * @param fs
     * @return
     *     returns ws.Person
     */
    @WebMethod
    @WebResult(name = "personResult", targetNamespace = "")
    @RequestWrapper(localName = "addFoodSelectionToGoal", targetNamespace = "http://ws/", className = "ws.AddFoodSelectionToGoal")
    @ResponseWrapper(localName = "addFoodSelectionToGoalResponse", targetNamespace = "http://ws/", className = "ws.AddFoodSelectionToGoalResponse")
    @Action(input = "http://ws/People/addFoodSelectionToGoalRequest", output = "http://ws/People/addFoodSelectionToGoalResponse")
    public Person addFoodSelectionToGoal(
        @WebParam(name = "idPerson", targetNamespace = "")
        int idPerson,
        @WebParam(name = "fs", targetNamespace = "")
        FoodSelection fs);

    /**
     * 
     * @param ac
     * @param idPerson
     * @return
     *     returns ws.Person
     */
    @WebMethod
    @WebResult(name = "personResult", targetNamespace = "")
    @RequestWrapper(localName = "addActivityToGoal", targetNamespace = "http://ws/", className = "ws.AddActivityToGoal")
    @ResponseWrapper(localName = "addActivityToGoalResponse", targetNamespace = "http://ws/", className = "ws.AddActivityToGoalResponse")
    @Action(input = "http://ws/People/addActivityToGoalRequest", output = "http://ws/People/addActivityToGoalResponse")
    public Person addActivityToGoal(
        @WebParam(name = "idPerson", targetNamespace = "")
        int idPerson,
        @WebParam(name = "ac", targetNamespace = "")
        Activity ac);

    /**
     * 
     * @param idPerson
     * @return
     *     returns java.util.List<ws.HealthMeasureHistory>
     */
    @WebMethod
    @WebResult(name = "listHealthMeasureHistoryResult", targetNamespace = "")
    @RequestWrapper(localName = "getMeasureHistories", targetNamespace = "http://ws/", className = "ws.GetMeasureHistories")
    @ResponseWrapper(localName = "getMeasureHistoriesResponse", targetNamespace = "http://ws/", className = "ws.GetMeasureHistoriesResponse")
    @Action(input = "http://ws/People/getMeasureHistoriesRequest", output = "http://ws/People/getMeasureHistoriesResponse")
    public List<HealthMeasureHistory> getMeasureHistories(
        @WebParam(name = "idPerson", targetNamespace = "")
        int idPerson);

    /**
     * 
     * @param idPerson
     * @return
     *     returns java.util.List<ws.Goal>
     */
    @WebMethod
    @WebResult(name = "listGoalResult", targetNamespace = "")
    @RequestWrapper(localName = "getGoalHistories", targetNamespace = "http://ws/", className = "ws.GetGoalHistories")
    @ResponseWrapper(localName = "getGoalHistoriesResponse", targetNamespace = "http://ws/", className = "ws.GetGoalHistoriesResponse")
    @Action(input = "http://ws/People/getGoalHistoriesRequest", output = "http://ws/People/getGoalHistoriesResponse")
    public List<Goal> getGoalHistories(
        @WebParam(name = "idPerson", targetNamespace = "")
        int idPerson);

    /**
     * 
     * @param as
     * @param idPerson
     * @return
     *     returns ws.Person
     */
    @WebMethod
    @WebResult(name = "personResult", targetNamespace = "")
    @RequestWrapper(localName = "updateTimeForActivitySelection", targetNamespace = "http://ws/", className = "ws.UpdateTimeForActivitySelection")
    @ResponseWrapper(localName = "updateTimeForActivitySelectionResponse", targetNamespace = "http://ws/", className = "ws.UpdateTimeForActivitySelectionResponse")
    @Action(input = "http://ws/People/updateTimeForActivitySelectionRequest", output = "http://ws/People/updateTimeForActivitySelectionResponse")
    public Person updateTimeForActivitySelection(
        @WebParam(name = "idPerson", targetNamespace = "")
        int idPerson,
        @WebParam(name = "as", targetNamespace = "")
        ActivitySelection as);

    /**
     * 
     * @param idPerson
     * @return
     *     returns ws.Person
     */
    @WebMethod
    @WebResult(name = "personResult", targetNamespace = "")
    @RequestWrapper(localName = "createNewGoal", targetNamespace = "http://ws/", className = "ws.CreateNewGoal")
    @ResponseWrapper(localName = "createNewGoalResponse", targetNamespace = "http://ws/", className = "ws.CreateNewGoalResponse")
    @Action(input = "http://ws/People/createNewGoalRequest", output = "http://ws/People/createNewGoalResponse")
    public Person createNewGoal(
        @WebParam(name = "idPerson", targetNamespace = "")
        int idPerson);

    /**
     * 
     * @param idPerson
     * @return
     *     returns ws.Motivation
     */
    @WebMethod
    @WebResult(name = "motivationResult", targetNamespace = "")
    @RequestWrapper(localName = "getMotivation", targetNamespace = "http://ws/", className = "ws.GetMotivation")
    @ResponseWrapper(localName = "getMotivationResponse", targetNamespace = "http://ws/", className = "ws.GetMotivationResponse")
    @Action(input = "http://ws/People/getMotivationRequest", output = "http://ws/People/getMotivationResponse")
    public Motivation getMotivation(
        @WebParam(name = "idPerson", targetNamespace = "")
        int idPerson);

}
