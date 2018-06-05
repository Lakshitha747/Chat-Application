
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

    private final static QName _GetMessages_QNAME = new QName("http://Web_Server/", "getMessages");
    private final static QName _GetMessagesResponse_QNAME = new QName("http://Web_Server/", "getMessagesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: web_server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMessages_Type }
     * 
     */
    public GetMessages_Type createGetMessages_Type() {
        return new GetMessages_Type();
    }

    /**
     * Create an instance of {@link GetMessagesResponse }
     * 
     */
    public GetMessagesResponse createGetMessagesResponse() {
        return new GetMessagesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessages_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Web_Server/", name = "getMessages")
    public JAXBElement<GetMessages_Type> createGetMessages(GetMessages_Type value) {
        return new JAXBElement<GetMessages_Type>(_GetMessages_QNAME, GetMessages_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Web_Server/", name = "getMessagesResponse")
    public JAXBElement<GetMessagesResponse> createGetMessagesResponse(GetMessagesResponse value) {
        return new JAXBElement<GetMessagesResponse>(_GetMessagesResponse_QNAME, GetMessagesResponse.class, null, value);
    }

}
