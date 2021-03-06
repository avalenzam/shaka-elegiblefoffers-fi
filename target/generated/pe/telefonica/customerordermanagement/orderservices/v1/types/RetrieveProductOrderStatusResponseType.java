
package pe.telefonica.customerordermanagement.orderservices.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import pe.telefonica.tefresponseheader.v1.TefHeaderRes;


/**
 * <p>Java class for RetrieveProductOrderStatusResponse_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveProductOrderStatusResponse_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://telefonica.pe/TefResponseHeader/V1}TefHeaderRes"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetrieveProductOrderStatusResponse_data" type="{http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types}RetrieveProductOrderStatusResponse_data_type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveProductOrderStatusResponse_type", propOrder = {
    "retrieveProductOrderStatusResponseData"
})
public class RetrieveProductOrderStatusResponseType
    extends TefHeaderRes
{

    @XmlElement(name = "RetrieveProductOrderStatusResponse_data", required = true)
    protected RetrieveProductOrderStatusResponseDataType retrieveProductOrderStatusResponseData;

    /**
     * Gets the value of the retrieveProductOrderStatusResponseData property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveProductOrderStatusResponseDataType }
     *     
     */
    public RetrieveProductOrderStatusResponseDataType getRetrieveProductOrderStatusResponseData() {
        return retrieveProductOrderStatusResponseData;
    }

    /**
     * Sets the value of the retrieveProductOrderStatusResponseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveProductOrderStatusResponseDataType }
     *     
     */
    public void setRetrieveProductOrderStatusResponseData(RetrieveProductOrderStatusResponseDataType value) {
        this.retrieveProductOrderStatusResponseData = value;
    }

}
