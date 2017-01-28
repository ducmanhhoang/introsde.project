
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for activitySelection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="activitySelection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idActivitySelection" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element ref="{http://ws/}activity" minOccurs="0"/>
 *         &lt;element name="usedCalories" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activitySelection", propOrder = {
    "idActivitySelection",
    "time",
    "activity",
    "usedCalories",
    "current"
})
public class ActivitySelection {

    protected int idActivitySelection;
    protected double time;
    @XmlElement(namespace = "http://ws/")
    protected Activity activity;
    protected double usedCalories;
    protected int current;

    /**
     * Gets the value of the idActivitySelection property.
     * 
     */
    public int getIdActivitySelection() {
        return idActivitySelection;
    }

    /**
     * Sets the value of the idActivitySelection property.
     * 
     */
    public void setIdActivitySelection(int value) {
        this.idActivitySelection = value;
    }

    /**
     * Gets the value of the time property.
     * 
     */
    public double getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     */
    public void setTime(double value) {
        this.time = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link Activity }
     *     
     */
    public Activity getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Activity }
     *     
     */
    public void setActivity(Activity value) {
        this.activity = value;
    }

    /**
     * Gets the value of the usedCalories property.
     * 
     */
    public double getUsedCalories() {
        return usedCalories;
    }

    /**
     * Sets the value of the usedCalories property.
     * 
     */
    public void setUsedCalories(double value) {
        this.usedCalories = value;
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

}
