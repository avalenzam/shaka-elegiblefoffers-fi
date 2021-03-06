
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateSingleConfigurationOnProductRequest_data_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSingleConfigurationOnProductRequest_data_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productComponent" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ProductComponent_UpdateSingleConfigurationOnProductRequest"/&gt;
 *         &lt;element name="productOrder" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ProductOrder" minOccurs="0"/&gt;
 *         &lt;element name="configurationActionList" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ProductConfigurationActionList"/&gt;
 *         &lt;element name="activity" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}ActivityInformation_UpdateSingleConfigurationOnProductRequest" minOccurs="0"/&gt;
 *         &lt;element name="isConfirmationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="callbackURL" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}URL" minOccurs="0"/&gt;
 *         &lt;element name="userID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="salesChannel" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSingleConfigurationOnProductRequest_data_type", propOrder = {
    "productComponent",
    "productOrder",
    "configurationActionList",
    "activity",
    "isConfirmationRequired",
    "callbackURL",
    "userID",
    "salesChannel"
})
public class UpdateSingleConfigurationOnProductRequestDataType {

    @XmlElement(required = true)
    protected ProductComponentUpdateSingleConfigurationOnProductRequest productComponent;
    protected ProductOrder productOrder;
    @XmlElement(required = true)
    protected ProductConfigurationActionList configurationActionList;
    protected ActivityInformationUpdateSingleConfigurationOnProductRequest activity;
    protected Boolean isConfirmationRequired;
    protected URL callbackURL;
    protected String userID;
    protected String salesChannel;

    /**
     * Gets the value of the productComponent property.
     * 
     * @return
     *     possible object is
     *     {@link ProductComponentUpdateSingleConfigurationOnProductRequest }
     *     
     */
    public ProductComponentUpdateSingleConfigurationOnProductRequest getProductComponent() {
        return productComponent;
    }

    /**
     * Sets the value of the productComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductComponentUpdateSingleConfigurationOnProductRequest }
     *     
     */
    public void setProductComponent(ProductComponentUpdateSingleConfigurationOnProductRequest value) {
        this.productComponent = value;
    }

    /**
     * Gets the value of the productOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ProductOrder }
     *     
     */
    public ProductOrder getProductOrder() {
        return productOrder;
    }

    /**
     * Sets the value of the productOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOrder }
     *     
     */
    public void setProductOrder(ProductOrder value) {
        this.productOrder = value;
    }

    /**
     * Gets the value of the configurationActionList property.
     * 
     * @return
     *     possible object is
     *     {@link ProductConfigurationActionList }
     *     
     */
    public ProductConfigurationActionList getConfigurationActionList() {
        return configurationActionList;
    }

    /**
     * Sets the value of the configurationActionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductConfigurationActionList }
     *     
     */
    public void setConfigurationActionList(ProductConfigurationActionList value) {
        this.configurationActionList = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityInformationUpdateSingleConfigurationOnProductRequest }
     *     
     */
    public ActivityInformationUpdateSingleConfigurationOnProductRequest getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityInformationUpdateSingleConfigurationOnProductRequest }
     *     
     */
    public void setActivity(ActivityInformationUpdateSingleConfigurationOnProductRequest value) {
        this.activity = value;
    }

    /**
     * Gets the value of the isConfirmationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConfirmationRequired() {
        return isConfirmationRequired;
    }

    /**
     * Sets the value of the isConfirmationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConfirmationRequired(Boolean value) {
        this.isConfirmationRequired = value;
    }

    /**
     * Gets the value of the callbackURL property.
     * 
     * @return
     *     possible object is
     *     {@link URL }
     *     
     */
    public URL getCallbackURL() {
        return callbackURL;
    }

    /**
     * Sets the value of the callbackURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link URL }
     *     
     */
    public void setCallbackURL(URL value) {
        this.callbackURL = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the salesChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChannel() {
        return salesChannel;
    }

    /**
     * Sets the value of the salesChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChannel(String value) {
        this.salesChannel = value;
    }

}
