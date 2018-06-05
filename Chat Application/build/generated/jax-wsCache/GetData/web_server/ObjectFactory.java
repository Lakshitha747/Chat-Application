
package web_server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the web_server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SendThreadIdResponse_QNAME = new QName("http://Web_Server/", "sendThreadIdResponse");
    private final static QName _GetThreadIdResponse_QNAME = new QName("http://Web_Server/", "getThreadIdResponse");
    private final static QName _GetDataResponse_QNAME = new QName("http://Web_Server/", "getDataResponse");
    private final static QName _GetThreadId_QNAME = new QName("http://Web_Server/", "getThreadId");
    private final static QName _SendThreadId_QNAME = new QName("http://Web_Server/", "sendThreadId");
    private final static QName _GetData_QNAME = new QName("http://Web_Server/", "getData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: web_server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendThreadIdResponse }
     * 
     */
    public SendThreadIdResponse createSendThreadIdResponse() {
        return new SendThreadIdResponse();
    }

    /**
     * Create an instance of {@link GetThreadIdResponse }
     * 
     */
    public GetThreadIdResponse createGetThreadIdResponse() {
        return new GetThreadIdResponse();
    }

    /**
     * Create an instance of {@link GetDataResponse }
     * 
     */
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }

    /**
     * Create an instance of {@link GetThreadId }
     * 
     */
    public GetThreadId createGetThreadId() {
        return new GetThreadId();
    }

    /**
     * Create an instance of {@link SendThreadId }
     * 
     */
    public SendThreadId createSendThreadId() {
        return new SendThreadId();
    }

    /**
     * Create an instance of {@link GetData_Type }
     * 
     */
    public GetData_Type createGetData_Type() {
        return new GetData_Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendThreadIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Web_Server/", name = "sendThreadIdResponse")
    public JAXBElement<SendThreadIdResponse> createSendThreadIdResponse(SendThreadIdResponse value) {
        return new JAXBElement<SendThreadIdResponse>(_SendThreadIdResponse_QNAME, SendThreadIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreadIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Web_Server/", name = "getThreadIdResponse")
    public JAXBElement<GetThreadIdResponse> createGetThreadIdResponse(GetThreadIdResponse value) {
        return new JAXBElement<GetThreadIdResponse>(_GetThreadIdResponse_QNAME, GetThreadIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Web_Server/", name = "getDataResponse")
    public JAXBElement<GetDataResponse> createGetDataResponse(GetDataResponse value) {
        return new JAXBElement<GetDataResponse>(_GetDataResponse_QNAME, GetDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreadId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Web_Server/", name = "getThreadId")
    public JAXBElement<GetThreadId> createGetThreadId(GetThreadId value) {
        return new JAXBElement<GetThreadId>(_GetThreadId_QNAME, GetThreadId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendThreadId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Web_Server/", name = "sendThreadId")
    public JAXBElement<SendThreadId> createSendThreadId(SendThreadId value) {
        return new JAXBElement<SendThreadId>(_SendThreadId_QNAME, SendThreadId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetData_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Web_Server/", name = "getData")
    public JAXBElement<GetData_Type> createGetData(GetData_Type value) {
        return new JAXBElement<GetData_Type>(_GetData_QNAME, GetData_Type.class, null, value);
    }

}
