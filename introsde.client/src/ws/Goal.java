
package ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for goal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="goal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idGoal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="goalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idealWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idealBmi" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="shavedCalories" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="foodSelections" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="foodSelections" type="{http://ws/}foodSelection" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="activitySelections" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="activitySelections" type="{http://ws/}activitySelection" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "goal", propOrder = {
    "idGoal",
    "goalName",
    "current",
    "idealWeight",
    "date",
    "idealBmi",
    "shavedCalories",
    "foodSelections",
    "activitySelections"
})
public class Goal {

    protected int idGoal;
    protected String goalName;
    protected int current;
    protected double idealWeight;
    protected String date;
    protected double idealBmi;
    protected double shavedCalories;
    protected Goal.FoodSelections foodSelections;
    protected Goal.ActivitySelections activitySelections;

    /**
     * Gets the value of the idGoal property.
     * 
     */
    public int getIdGoal() {
        return idGoal;
    }

    /**
     * Sets the value of the idGoal property.
     * 
     */
    public void setIdGoal(int value) {
        this.idGoal = value;
    }

    /**
     * Gets the value of the goalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoalName() {
        return goalName;
    }

    /**
     * Sets the value of the goalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoalName(String value) {
        this.goalName = value;
    }

    /**
     * Gets the value of the current property.
     * 
     */
    public int getCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     */
    public void setCurrent(int value) {
        this.current = value;
    }

    /**
     * Gets the value of the idealWeight property.
     * 
     */
    public double getIdealWeight() {
        return idealWeight;
    }

    /**
     * Sets the value of the idealWeight property.
     * 
     */
    public void setIdealWeight(double value) {
        this.idealWeight = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the idealBmi property.
     * 
     */
    public double getIdealBmi() {
        return idealBmi;
    }

    /**
     * Sets the value of the idealBmi property.
     * 
     */
    public void setIdealBmi(double value) {
        this.idealBmi = value;
    }

    /**
     * Gets the value of the shavedCalories property.
     * 
     */
    public double getShavedCalories() {
        return shavedCalories;
    }

    /**
     * Sets the value of the shavedCalories property.
     * 
     */
    public void setShavedCalories(double value) {
        this.shavedCalories = value;
    }

    /**
     * Gets the value of the foodSelections property.
     * 
     * @return
     *     possible object is
     *     {@link Goal.FoodSelections }
     *     
     */
    public Goal.FoodSelections getFoodSelections() {
        return foodSelections;
    }

    /**
     * Sets the value of the foodSelections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Goal.FoodSelections }
     *     
     */
    public void setFoodSelections(Goal.FoodSelections value) {
        this.foodSelections = value;
    }

    /**
     * Gets the value of the activitySelections property.
     * 
     * @return
     *     possible object is
     *     {@link Goal.ActivitySelections }
     *     
     */
    public Goal.ActivitySelections getActivitySelections() {
        return activitySelections;
    }

    /**
     * Sets the value of the activitySelections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Goal.ActivitySelections }
     *     
     */
    public void setActivitySelections(Goal.ActivitySelections value) {
        this.activitySelections = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="activitySelections" type="{http://ws/}activitySelection" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "activitySelections"
    })
    public static class ActivitySelections {

        @XmlElement(nillable = true)
        protected List<ActivitySelection> activitySelections;

        /**
         * Gets the value of the activitySelections property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the activitySelections property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActivitySelections().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActivitySelection }
         * 
         * 
         */
        public List<ActivitySelection> getActivitySelections() {
            if (activitySelections == null) {
                activitySelections = new ArrayList<ActivitySelection>();
            }
            return this.activitySelections;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="foodSelections" type="{http://ws/}foodSelection" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "foodSelections"
    })
    public static class FoodSelections {

        @XmlElement(nillable = true)
        protected List<FoodSelection> foodSelections;

        /**
         * Gets the value of the foodSelections property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the foodSelections property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFoodSelections().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FoodSelection }
         * 
         * 
         */
        public List<FoodSelection> getFoodSelections() {
            if (foodSelections == null) {
                foodSelections = new ArrayList<FoodSelection>();
            }
            return this.foodSelections;
        }

    }

}
