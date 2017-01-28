
package ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPerson" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="healthMeasures" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="healthMeasures" type="{http://ws/}healthMeasure" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="healthMeasuresHistories" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="healthMeasuresHistories" type="{http://ws/}healthMeasureHistory" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="goals" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="goals" type="{http://ws/}goal" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "person", propOrder = {
    "idPerson",
    "firstname",
    "lastname",
    "birthdate",
    "username",
    "sex",
    "healthMeasures",
    "healthMeasuresHistories",
    "goals"
})
public class Person {

    protected int idPerson;
    protected String firstname;
    protected String lastname;
    protected String birthdate;
    protected String username;
    protected int sex;
    protected Person.HealthMeasures healthMeasures;
    protected Person.HealthMeasuresHistories healthMeasuresHistories;
    protected Person.Goals goals;

    /**
     * Gets the value of the idPerson property.
     * 
     */
    public int getIdPerson() {
        return idPerson;
    }

    /**
     * Sets the value of the idPerson property.
     * 
     */
    public void setIdPerson(int value) {
        this.idPerson = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthdate(String value) {
        this.birthdate = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     */
    public int getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     */
    public void setSex(int value) {
        this.sex = value;
    }

    /**
     * Gets the value of the healthMeasures property.
     * 
     * @return
     *     possible object is
     *     {@link Person.HealthMeasures }
     *     
     */
    public Person.HealthMeasures getHealthMeasures() {
        return healthMeasures;
    }

    /**
     * Sets the value of the healthMeasures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person.HealthMeasures }
     *     
     */
    public void setHealthMeasures(Person.HealthMeasures value) {
        this.healthMeasures = value;
    }

    /**
     * Gets the value of the healthMeasuresHistories property.
     * 
     * @return
     *     possible object is
     *     {@link Person.HealthMeasuresHistories }
     *     
     */
    public Person.HealthMeasuresHistories getHealthMeasuresHistories() {
        return healthMeasuresHistories;
    }

    /**
     * Sets the value of the healthMeasuresHistories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person.HealthMeasuresHistories }
     *     
     */
    public void setHealthMeasuresHistories(Person.HealthMeasuresHistories value) {
        this.healthMeasuresHistories = value;
    }

    /**
     * Gets the value of the goals property.
     * 
     * @return
     *     possible object is
     *     {@link Person.Goals }
     *     
     */
    public Person.Goals getGoals() {
        return goals;
    }

    /**
     * Sets the value of the goals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person.Goals }
     *     
     */
    public void setGoals(Person.Goals value) {
        this.goals = value;
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
     *         &lt;element name="goals" type="{http://ws/}goal" maxOccurs="unbounded" minOccurs="0"/>
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
        "goals"
    })
    public static class Goals {

        @XmlElement(nillable = true)
        protected List<Goal> goals;

        /**
         * Gets the value of the goals property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the goals property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGoals().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Goal }
         * 
         * 
         */
        public List<Goal> getGoals() {
            if (goals == null) {
                goals = new ArrayList<Goal>();
            }
            return this.goals;
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
     *         &lt;element name="healthMeasures" type="{http://ws/}healthMeasure" maxOccurs="unbounded" minOccurs="0"/>
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
        "healthMeasures"
    })
    public static class HealthMeasures {

        @XmlElement(nillable = true)
        protected List<HealthMeasure> healthMeasures;

        /**
         * Gets the value of the healthMeasures property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the healthMeasures property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHealthMeasures().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HealthMeasure }
         * 
         * 
         */
        public List<HealthMeasure> getHealthMeasures() {
            if (healthMeasures == null) {
                healthMeasures = new ArrayList<HealthMeasure>();
            }
            return this.healthMeasures;
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
     *         &lt;element name="healthMeasuresHistories" type="{http://ws/}healthMeasureHistory" maxOccurs="unbounded" minOccurs="0"/>
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
        "healthMeasuresHistories"
    })
    public static class HealthMeasuresHistories {

        @XmlElement(nillable = true)
        protected List<HealthMeasureHistory> healthMeasuresHistories;

        /**
         * Gets the value of the healthMeasuresHistories property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the healthMeasuresHistories property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHealthMeasuresHistories().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HealthMeasureHistory }
         * 
         * 
         */
        public List<HealthMeasureHistory> getHealthMeasuresHistories() {
            if (healthMeasuresHistories == null) {
                healthMeasuresHistories = new ArrayList<HealthMeasureHistory>();
            }
            return this.healthMeasuresHistories;
        }

    }

}
