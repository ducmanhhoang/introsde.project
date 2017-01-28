
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for activity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="activity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idActivity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="activityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caloriesPerHour" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="activityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activity", propOrder = {
    "idActivity",
    "activityName",
    "caloriesPerHour",
    "activityType"
})
public class Activity {

    protected int idActivity;
    protected String activityName;
    protected double caloriesPerHour;
    protected String activityType;

    /**
     * Gets the value of the idActivity property.
     * 
     */
    public int getIdActivity() {
        return idActivity;
    }

    /**
     * Sets the value of the idActivity property.
     * 
     */
    public void setIdActivity(int value) {
        this.idActivity = value;
    }

    /**
     * Gets the value of the activityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * Sets the value of the activityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityName(String value) {
        this.activityName = value;
    }

    /**
     * Gets the value of the caloriesPerHour property.
     * 
     */
    public double getCaloriesPerHour() {
        return caloriesPerHour;
    }

    /**
     * Sets the value of the caloriesPerHour property.
     * 
     */
    public void setCaloriesPerHour(double value) {
        this.caloriesPerHour = value;
    }

    /**
     * Gets the value of the activityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityType() {
        return activityType;
    }

    /**
     * Sets the value of the activityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityType(String value) {
        this.activityType = value;
    }

}
