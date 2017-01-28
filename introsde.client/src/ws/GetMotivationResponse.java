
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMotivationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMotivationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="motivationResult" type="{http://ws/}motivation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMotivationResponse", propOrder = {
    "motivationResult"
})
public class GetMotivationResponse {

    protected Motivation motivationResult;

    /**
     * Gets the value of the motivationResult property.
     * 
     * @return
     *     possible object is
     *     {@link Motivation }
     *     
     */
    public Motivation getMotivationResult() {
        return motivationResult;
    }

    /**
     * Sets the value of the motivationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Motivation }
     *     
     */
    public void setMotivationResult(Motivation value) {
        this.motivationResult = value;
    }

}
