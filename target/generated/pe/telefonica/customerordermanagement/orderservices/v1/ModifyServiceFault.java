
package pe.telefonica.customerordermanagement.orderservices.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.15
 * 2020-10-20T15:27:48.462-05:00
 * Generated source version: 3.1.15
 */

@WebFault(name = "ModifyServiceFault", targetNamespace = "http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types")
public class ModifyServiceFault extends Exception {
    
    private pe.telefonica.customerordermanagement.orderservices.v1.types.ModifyServiceFault modifyServiceFault;

    public ModifyServiceFault() {
        super();
    }
    
    public ModifyServiceFault(String message) {
        super(message);
    }
    
    public ModifyServiceFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ModifyServiceFault(String message, pe.telefonica.customerordermanagement.orderservices.v1.types.ModifyServiceFault modifyServiceFault) {
        super(message);
        this.modifyServiceFault = modifyServiceFault;
    }

    public ModifyServiceFault(String message, pe.telefonica.customerordermanagement.orderservices.v1.types.ModifyServiceFault modifyServiceFault, java.lang.Throwable cause) {
        super(message, cause);
        this.modifyServiceFault = modifyServiceFault;
    }

    public pe.telefonica.customerordermanagement.orderservices.v1.types.ModifyServiceFault getFaultInfo() {
        return this.modifyServiceFault;
    }
}
