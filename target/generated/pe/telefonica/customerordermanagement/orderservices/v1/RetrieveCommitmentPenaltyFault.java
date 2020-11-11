
package pe.telefonica.customerordermanagement.orderservices.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.15
 * 2020-10-27T15:20:07.544-05:00
 * Generated source version: 3.1.15
 */

@WebFault(name = "RetrieveCommitmentPenaltyFault", targetNamespace = "http://telefonica.pe/CustomerOrderManagement/OrderServices/V1/types")
public class RetrieveCommitmentPenaltyFault extends Exception {
    
    private pe.telefonica.customerordermanagement.orderservices.v1.types.RetrieveCommitmentPenaltyFault retrieveCommitmentPenaltyFault;

    public RetrieveCommitmentPenaltyFault() {
        super();
    }
    
    public RetrieveCommitmentPenaltyFault(String message) {
        super(message);
    }
    
    public RetrieveCommitmentPenaltyFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public RetrieveCommitmentPenaltyFault(String message, pe.telefonica.customerordermanagement.orderservices.v1.types.RetrieveCommitmentPenaltyFault retrieveCommitmentPenaltyFault) {
        super(message);
        this.retrieveCommitmentPenaltyFault = retrieveCommitmentPenaltyFault;
    }

    public RetrieveCommitmentPenaltyFault(String message, pe.telefonica.customerordermanagement.orderservices.v1.types.RetrieveCommitmentPenaltyFault retrieveCommitmentPenaltyFault, java.lang.Throwable cause) {
        super(message, cause);
        this.retrieveCommitmentPenaltyFault = retrieveCommitmentPenaltyFault;
    }

    public pe.telefonica.customerordermanagement.orderservices.v1.types.RetrieveCommitmentPenaltyFault getFaultInfo() {
        return this.retrieveCommitmentPenaltyFault;
    }
}
