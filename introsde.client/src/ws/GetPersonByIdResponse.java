
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPersonByIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPersonByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personResult" type="{http://ws/}person" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonByIdResponse", propOrder = {
    "personResult"
})
public class GetPersonByIdResponse {

    protected Person personResult;

    /**
     * Gets the value of the personResult property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPersonResult() {
        return personResult;
    }

    /**
     * Sets the value of the personResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPersonResult(Person value) {
        this.personResult = value;
    }

}
