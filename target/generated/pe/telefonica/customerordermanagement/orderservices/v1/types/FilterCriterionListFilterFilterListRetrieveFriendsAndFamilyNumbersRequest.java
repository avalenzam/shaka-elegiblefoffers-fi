
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterCriterionList_Filter_FilterList_RetrieveFriendsAndFamilyNumbersRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterCriterionList_Filter_FilterList_RetrieveFriendsAndFamilyNumbersRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filterCriterion" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}FilterCriterion_RetrieveFriendsAndFamilyNumbersRequest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterCriterionList_Filter_FilterList_RetrieveFriendsAndFamilyNumbersRequest", propOrder = {
    "filterCriterion"
})
public class FilterCriterionListFilterFilterListRetrieveFriendsAndFamilyNumbersRequest {

    protected List<FilterCriterionRetrieveFriendsAndFamilyNumbersRequest> filterCriterion;

    /**
     * Gets the value of the filterCriterion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterCriterion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterCriterion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterCriterionRetrieveFriendsAndFamilyNumbersRequest }
     * 
     * 
     */
    public List<FilterCriterionRetrieveFriendsAndFamilyNumbersRequest> getFilterCriterion() {
        if (filterCriterion == null) {
            filterCriterion = new ArrayList<FilterCriterionRetrieveFriendsAndFamilyNumbersRequest>();
        }
        return this.filterCriterion;
    }

}
