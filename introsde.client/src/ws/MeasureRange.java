
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for measureRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="measureRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMeasureRange" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rangeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="alarmLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="endValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "measureRange", propOrder = {
    "idMeasureRange",
    "rangeName",
    "startValue",
    "alarmLevel",
    "endValue"
})
public class MeasureRange {

    protected int idMeasureRange;
    protected String rangeName;
    protected double startValue;
    protected int alarmLevel;
    protected double endValue;

    /**
     * Gets the value of the idMeasureRange property.
     * 
     */
    public int getIdMeasureRange() {
        return idMeasureRange;
    }

    /**
     * Sets the value of the idMeasureRange property.
     * 
     */
    public void setIdMeasureRange(int value) {
        this.idMeasureRange = value;
    }

    /**
     * Gets the value of the rangeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeName() {
        return rangeName;
    }

    /**
     * Sets the value of the rangeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeName(String value) {
        this.rangeName = value;
    }

    /**
     * Gets the value of the startValue property.
     * 
     */
    public double getStartValue() {
        return startValue;
    }

    /**
     * Sets the value of the startValue property.
     * 
     */
    public void setStartValue(double value) {
        this.startValue = value;
    }

    /**
     * Gets the value of the alarmLevel property.
     * 
     */
    public int getAlarmLevel() {
        return alarmLevel;
    }

    /**
     * Sets the value of the alarmLevel property.
     * 
     */
    public void setAlarmLevel(int value) {
        this.alarmLevel = value;
    }

    /**
     * Gets the value of the endValue property.
     * 
     */
    public double getEndValue() {
        return endValue;
    }

    /**
     * Sets the value of the endValue property.
     * 
     */
    public void setEndValue(double value) {
        this.endValue = value;
    }

}
