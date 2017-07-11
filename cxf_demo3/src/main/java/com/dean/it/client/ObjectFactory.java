
package com.dean.it.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dean.it.client package. 
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

    private final static QName _Customer_QNAME = new QName("http://server.it.dean.com/", "Customer");
    private final static QName _SelectMaxAgeStudent_QNAME = new QName("http://server.it.dean.com/", "selectMaxAgeStudent");
    private final static QName _SelectMaxAgeStudentResponse_QNAME = new QName("http://server.it.dean.com/", "selectMaxAgeStudentResponse");
    private final static QName _SelectMaxLongNameStudent_QNAME = new QName("http://server.it.dean.com/", "selectMaxLongNameStudent");
    private final static QName _SelectMaxLongNameStudentResponse_QNAME = new QName("http://server.it.dean.com/", "selectMaxLongNameStudentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dean.it.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link SelectMaxAgeStudent }
     * 
     */
    public SelectMaxAgeStudent createSelectMaxAgeStudent() {
        return new SelectMaxAgeStudent();
    }

    /**
     * Create an instance of {@link SelectMaxAgeStudentResponse }
     * 
     */
    public SelectMaxAgeStudentResponse createSelectMaxAgeStudentResponse() {
        return new SelectMaxAgeStudentResponse();
    }

    /**
     * Create an instance of {@link SelectMaxLongNameStudent }
     * 
     */
    public SelectMaxLongNameStudent createSelectMaxLongNameStudent() {
        return new SelectMaxLongNameStudent();
    }

    /**
     * Create an instance of {@link SelectMaxLongNameStudentResponse }
     * 
     */
    public SelectMaxLongNameStudentResponse createSelectMaxLongNameStudentResponse() {
        return new SelectMaxLongNameStudentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.it.dean.com/", name = "Customer")
    public JAXBElement<Customer> createCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectMaxAgeStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.it.dean.com/", name = "selectMaxAgeStudent")
    public JAXBElement<SelectMaxAgeStudent> createSelectMaxAgeStudent(SelectMaxAgeStudent value) {
        return new JAXBElement<SelectMaxAgeStudent>(_SelectMaxAgeStudent_QNAME, SelectMaxAgeStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectMaxAgeStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.it.dean.com/", name = "selectMaxAgeStudentResponse")
    public JAXBElement<SelectMaxAgeStudentResponse> createSelectMaxAgeStudentResponse(SelectMaxAgeStudentResponse value) {
        return new JAXBElement<SelectMaxAgeStudentResponse>(_SelectMaxAgeStudentResponse_QNAME, SelectMaxAgeStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectMaxLongNameStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.it.dean.com/", name = "selectMaxLongNameStudent")
    public JAXBElement<SelectMaxLongNameStudent> createSelectMaxLongNameStudent(SelectMaxLongNameStudent value) {
        return new JAXBElement<SelectMaxLongNameStudent>(_SelectMaxLongNameStudent_QNAME, SelectMaxLongNameStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectMaxLongNameStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.it.dean.com/", name = "selectMaxLongNameStudentResponse")
    public JAXBElement<SelectMaxLongNameStudentResponse> createSelectMaxLongNameStudentResponse(SelectMaxLongNameStudentResponse value) {
        return new JAXBElement<SelectMaxLongNameStudentResponse>(_SelectMaxLongNameStudentResponse_QNAME, SelectMaxLongNameStudentResponse.class, null, value);
    }

}
