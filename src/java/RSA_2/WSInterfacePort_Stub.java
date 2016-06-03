// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package RSA_2;

import com.sun.xml.rpc.server.http.MessageContextProperties;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.encoding.literal.*;
import com.sun.xml.rpc.soap.streaming.*;
import com.sun.xml.rpc.soap.message.*;
import com.sun.xml.rpc.soap.SOAPVersion;
import com.sun.xml.rpc.soap.SOAPEncodingConstants;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;
import java.rmi.RemoteException;
import java.util.Iterator;
import java.lang.reflect.*;
import java.lang.Class;
import com.sun.xml.rpc.client.SenderException;
import com.sun.xml.rpc.client.*;
import com.sun.xml.rpc.client.http.*;
import javax.xml.rpc.handler.*;
import javax.xml.rpc.JAXRPCException;
import javax.xml.rpc.soap.SOAPFaultException;

public class WSInterfacePort_Stub
    extends com.sun.xml.rpc.client.StubBase
    implements RSA_2.WSInterfacePort {
    
    
    
    /*
     *  public constructor
     */
    public WSInterfacePort_Stub(HandlerChain handlerChain) {
        super(handlerChain);
        _setProperty(ENDPOINT_ADDRESS_PROPERTY, "https://www.rsaseguros.com.mx/blackBoxws/services/WSInterface");
    }
    
    
    /*
     *  implementation of doProcess
     */
    public java.lang.String doProcess(java.lang.String in0)
        throws java.rmi.RemoteException {
        
        try {
            
            StreamingSenderState _state = _start(_handlerChain);
            
            InternalSOAPMessage _request = _state.getRequest();
            _request.setOperationCode(doProcess_OPCODE);
            RSA_2.WSInterfacePort_doProcess_RequestStruct _myWSInterfacePort_doProcess_RequestStruct =
                new RSA_2.WSInterfacePort_doProcess_RequestStruct();
            
            _myWSInterfacePort_doProcess_RequestStruct.setIn0(in0);
            
            SOAPBlockInfo _bodyBlock = new SOAPBlockInfo(ns1_doProcess_doProcess_QNAME);
            _bodyBlock.setValue(_myWSInterfacePort_doProcess_RequestStruct);
            _bodyBlock.setSerializer(ns1_myWSInterfacePort_doProcess_RequestStruct_SOAPSerializer);
            _request.setBody(_bodyBlock);
            
            _state.getMessageContext().setProperty(HttpClientTransport.HTTP_SOAPACTION_PROPERTY, "");
            
            _send((java.lang.String) _getProperty(ENDPOINT_ADDRESS_PROPERTY), _state);
            
            RSA_2.WSInterfacePort_doProcess_ResponseStruct _myWSInterfacePort_doProcess_ResponseStruct = null;
            Object _responseObj = _state.getResponse().getBody().getValue();
            if (_responseObj instanceof SOAPDeserializationState) {
                _myWSInterfacePort_doProcess_ResponseStruct =
                    (RSA_2.WSInterfacePort_doProcess_ResponseStruct)((SOAPDeserializationState)_responseObj).getInstance();
            } else {
                _myWSInterfacePort_doProcess_ResponseStruct =
                    (RSA_2.WSInterfacePort_doProcess_ResponseStruct)_responseObj;
            }
            
            return _myWSInterfacePort_doProcess_ResponseStruct.getDoProcessReturn();
        } catch (RemoteException e) {
            // let this one through unchanged
            throw e;
        } catch (JAXRPCException e) {
            throw new RemoteException(e.getMessage(), e);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException)e;
            } else {
                throw new RemoteException(e.getMessage(), e);
            }
        }
    }
    
    
    /*
     *  this method deserializes the request/response structure in the body
     */
    protected void _readFirstBodyElement(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingSenderState  state) throws Exception {
        int opcode = state.getRequest().getOperationCode();
        switch (opcode) {
            case doProcess_OPCODE:
                _deserialize_doProcess(bodyReader, deserializationContext, state);
                break;
            default:
                throw new SenderException("sender.response.unrecognizedOperation", java.lang.Integer.toString(opcode));
        }
    }
    
    
    
    /*
     * This method deserializes the body of the doProcess operation.
     */
    private void _deserialize_doProcess(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingSenderState state) throws Exception {
        java.lang.Object myWSInterfacePort_doProcess_ResponseStructObj =
            ns1_myWSInterfacePort_doProcess_ResponseStruct_SOAPSerializer.deserialize(ns1_doProcess_doProcessResponse_QNAME,
                bodyReader, deserializationContext);
        
        SOAPBlockInfo bodyBlock = new SOAPBlockInfo(ns1_doProcess_doProcessResponse_QNAME);
        bodyBlock.setValue(myWSInterfacePort_doProcess_ResponseStructObj);
        state.getResponse().setBody(bodyBlock);
    }
    
    
    
    public java.lang.String _getDefaultEnvelopeEncodingStyle() {
        return SOAPNamespaceConstants.ENCODING;
    }
    
    public java.lang.String _getImplicitEnvelopeEncodingStyle() {
        return "";
    }
    
    public java.lang.String _getEncodingStyle() {
        return SOAPNamespaceConstants.ENCODING;
    }
    
    public void _setEncodingStyle(java.lang.String encodingStyle) {
        throw new UnsupportedOperationException("cannot set encoding style");
    }
    
    
    
    
    
    /*
     * This method returns an array containing (prefix, nsURI) pairs.
     */
    protected java.lang.String[] _getNamespaceDeclarations() {
        return myNamespace_declarations;
    }
    
    /*
     * This method returns an array containing the names of the headers we understand.
     */
    public javax.xml.namespace.QName[] _getUnderstoodHeaders() {
        return understoodHeaderNames;
    }
    
    public void _initialize(InternalTypeMappingRegistry registry) throws Exception {
        super._initialize(registry);
        ns1_myWSInterfacePort_doProcess_ResponseStruct_SOAPSerializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, RSA_2.WSInterfacePort_doProcess_ResponseStruct.class, ns1_doProcessResponse_TYPE_QNAME);
        ns1_myWSInterfacePort_doProcess_RequestStruct_SOAPSerializer = (CombinedSerializer)registry.getSerializer(SOAPConstants.NS_SOAP_ENCODING, RSA_2.WSInterfacePort_doProcess_RequestStruct.class, ns1_doProcess_TYPE_QNAME);
    }
    
    private static final javax.xml.namespace.QName _portName = new QName("http://wsdl.tempuri.org", "WSInterfacePort");
    private static final int doProcess_OPCODE = 0;
    private static final javax.xml.namespace.QName ns1_doProcess_doProcess_QNAME = new QName("http://wsdl.tempuri.org", "doProcess");
    private static final javax.xml.namespace.QName ns1_doProcess_TYPE_QNAME = new QName("http://wsdl.tempuri.org", "doProcess");
    private CombinedSerializer ns1_myWSInterfacePort_doProcess_RequestStruct_SOAPSerializer;
    private static final javax.xml.namespace.QName ns1_doProcess_doProcessResponse_QNAME = new QName("http://wsdl.tempuri.org", "doProcessResponse");
    private static final javax.xml.namespace.QName ns1_doProcessResponse_TYPE_QNAME = new QName("http://wsdl.tempuri.org", "doProcessResponse");
    private CombinedSerializer ns1_myWSInterfacePort_doProcess_ResponseStruct_SOAPSerializer;
    private static final java.lang.String[] myNamespace_declarations =
                                        new java.lang.String[] {
                                            "ns0", "http://wsdl.tempuri.org"
                                        };
    
    private static final QName[] understoodHeaderNames = new QName[] {  };
}