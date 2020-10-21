
package pe.telefonica.customerordermanagement.orderservices.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.15
 * 2020-10-20T15:27:48.618-05:00
 * Generated source version: 3.1.15
 */

@WebFault(name = "ChangeFunPackFault", targetNamespace = "http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types")
public class ChangeFunPackFault extends Exception {
    
    private pe.telefonica.customerordermanagement.orderservices.v1.types.ChangeFunPackFault changeFunPackFault;

    public ChangeFunPackFault() {
        super();
    }
    
    public ChangeFunPackFault(String message) {
        super(message);
    }
    
    public ChangeFunPackFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ChangeFunPackFault(String message, pe.telefonica.customerordermanagement.orderservices.v1.types.ChangeFunPackFault changeFunPackFault) {
        super(message);
        this.changeFunPackFault = changeFunPackFault;
    }

    public ChangeFunPackFault(String message, pe.telefonica.customerordermanagement.orderservices.v1.types.ChangeFunPackFault changeFunPackFault, java.lang.Throwable cause) {
        super(message, cause);
        this.changeFunPackFault = changeFunPackFault;
    }

    public pe.telefonica.customerordermanagement.orderservices.v1.types.ChangeFunPackFault getFaultInfo() {
        return this.changeFunPackFault;
    }
}
