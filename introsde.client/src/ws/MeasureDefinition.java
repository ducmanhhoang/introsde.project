
package ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for measureDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="measureDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMeasureDefinition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="measureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="measureRanges" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="measureRanges" type="{http://ws/}measureRange" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "measureDefinition", propOrder = {
    "idMeasureDefinition",
    "measureName",
    "measureType",
    "measureRanges"
})
public class MeasureDefinition {

    protected int idMeasureDefinition;
    protected String measureName;
    protected String measureType;
    protected MeasureDefinition.MeasureRanges measureRanges;

    /**
     * Gets the value of the idMeasureDefinition property.
     * 
     */
    public int getIdMeasureDefinition() {
        return idMeasureDefinition;
    }

    /**
     * Sets the value of the idMeasureDefinition property.
     * 
     */
    public void setIdMeasureDefinition(int value) {
        this.idMeasureDefinition = value;
    }

    /**
     * Gets the value of the measureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureName() {
        return measureName;
    }

    /**
     * Sets the value of the measureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureName(String value) {
        this.measureName = value;
    }

    /**
     * Gets the value of the measureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureType() {
        return measureType;
    }

    /**
     * Sets the value of the measureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureType(String value) {
        this.measureType = value;
    }

    /**
     * Gets the value of the measureRanges property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureDefinition.MeasureRanges }
     *     
     */
    public MeasureDefinition.MeasureRanges getMeasureRanges() {
        return measureRanges;
    }

    /**
     * Sets the value of the measureRanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureDefinition.MeasureRanges }
     *     
     */
    public void setMeasureRanges(MeasureDefinition.MeasureRanges value) {
        this.measureRanges = value;
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
     *         &lt;element name="measureRanges" type="{http://ws/}measureRange" maxOccurs="unbounded" minOccurs="0"/>
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
        "measureRanges"
    })
    public static class MeasureRanges {

        @XmlElement(nillable = true)
        protected List<MeasureRange> measureRanges;

        /**
         * Gets the value of the measureRanges property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the measureRanges property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMeasureRanges().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MeasureRange }
         * 
         * 
         */
        public List<MeasureRange> getMeasureRanges() {
            if (measureRanges == null) {
                measureRanges = new ArrayList<MeasureRange>();
            }
            return this.measureRanges;
        }

    }

}
