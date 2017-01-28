
package ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchFoodsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchFoodsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listFoodSelectionResult" type="{http://ws/}foodSelection" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchFoodsResponse", propOrder = {
    "listFoodSelectionResult"
})
public class SearchFoodsResponse {

    protected List<FoodSelection> listFoodSelectionResult;

    /**
     * Gets the value of the listFoodSelectionResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listFoodSelectionResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListFoodSelectionResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodSelection }
     * 
     * 
     */
    public List<FoodSelection> getListFoodSelectionResult() {
        if (listFoodSelectionResult == null) {
            listFoodSelectionResult = new ArrayList<FoodSelection>();
        }
        return this.listFoodSelectionResult;
    }

}
