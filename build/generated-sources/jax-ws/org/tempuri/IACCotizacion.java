
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IACCotizacion", targetNamespace = "http://tempuri.org/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    org.datacontract.schemas._2004._07.abaseguros.ObjectFactory.class,
    org.tempuri.ObjectFactory.class
})
public interface IACCotizacion {


    /**
     * 
     * @param parameters
     * @return
     *     returns org.tempuri.Salida
     * @throws IACCotizacionCotizaAutoErrorFaultFaultMessage
     */
    @WebMethod(operationName = "CotizaAuto", action = "http://tempuri.org/IACCotizacion/CotizaAuto")
    @WebResult(name = "Salida", targetNamespace = "http://tempuri.org/", partName = "parameters")
    public Salida cotizaAuto(
        @WebParam(name = "Entrada", targetNamespace = "http://tempuri.org/", partName = "parameters")
        Entrada parameters)
        throws IACCotizacionCotizaAutoErrorFaultFaultMessage
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns org.tempuri.Salida
     * @throws IACCotizacionCotizaAutoASErrorFaultFaultMessage
     */
    @WebMethod(operationName = "CotizaAuto_AS", action = "http://tempuri.org/IACCotizacion/CotizaAuto_AS")
    @WebResult(name = "Salida", targetNamespace = "http://tempuri.org/", partName = "parameters")
    public Salida cotizaAutoAS(
        @WebParam(name = "Entrada", targetNamespace = "http://tempuri.org/", partName = "parameters")
        Entrada parameters)
        throws IACCotizacionCotizaAutoASErrorFaultFaultMessage
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns org.tempuri.Salida
     * @throws IACCotizacionCotizaWsAutoErrorFaultFaultMessage
     */
    @WebMethod(operationName = "CotizaWsAuto", action = "http://tempuri.org/IACCotizacion/CotizaWsAuto")
    @WebResult(name = "Salida", targetNamespace = "http://tempuri.org/", partName = "parameters")
    public Salida cotizaWsAuto(
        @WebParam(name = "Entrada", targetNamespace = "http://tempuri.org/", partName = "parameters")
        Entrada parameters)
        throws IACCotizacionCotizaWsAutoErrorFaultFaultMessage
    ;

}
