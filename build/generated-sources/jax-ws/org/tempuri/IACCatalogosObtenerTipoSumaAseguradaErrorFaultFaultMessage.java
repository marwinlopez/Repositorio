
package org.tempuri;

import javax.xml.ws.WebFault;
import org.datacontract.schemas._2004._07.abaseguros.Error;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Error", targetNamespace = "http://schemas.datacontract.org/2004/07/Abaseguros.AutoConnect")
public class IACCatalogosObtenerTipoSumaAseguradaErrorFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private Error faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public IACCatalogosObtenerTipoSumaAseguradaErrorFaultFaultMessage(String message, Error faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public IACCatalogosObtenerTipoSumaAseguradaErrorFaultFaultMessage(String message, Error faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.datacontract.schemas._2004._07.abaseguros.Error
     */
    public Error getFaultInfo() {
        return faultInfo;
    }

}
