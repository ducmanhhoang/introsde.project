
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for healthMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="healthMeasure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idHealthMeasure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element ref="{http://ws/}measureDefinition" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "healthMeasure", propOrder = {
    "idHealthMeasure",
    "measureDefinition",
    "value"
})
public class HealthMeasure {

    protected int idHealthMeasure;
    @XmlElement(namespace = "http://ws/")
    protected MeasureDefinition measureDefinition;
    protected double value;

    /**
     * Gets the value of the idHealthMeasure property.
     * 
     */
    public int getIdHealthMeasure() {
        return idHealthMeasure;
    }

    /**
     * Sets the value of the idHealthMeasure property.
     * 
     */
    public void setIdHealthMeasure(int value) {
        this.idHealthMeasure = value;
    }

    /**
     * Gets the value of the measureDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureDefinition }
     *     
     */
    public MeasureDefinition getMeasureDefinition() {
        return measureDefinition;
    }

    /**
     * Sets the value of the measureDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureDefinition }
     *     
     */
    public void setMeasureDefinition(MeasureDefinition value) {
        this.measureDefinition = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

}
