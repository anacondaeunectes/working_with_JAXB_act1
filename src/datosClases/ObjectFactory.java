//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.03 at 05:21:54 PM CEST 
//


package datosClases;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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

    private final static QName _Datoscentro_QNAME = new QName("", "datoscentro");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatoscentroType }
     * 
     */
    public DatoscentroType createDatoscentroType() {
        return new DatoscentroType();
    }

    /**
     * Create an instance of {@link ProfesorType }
     * 
     */
    public ProfesorType createProfesorType() {
        return new ProfesorType();
    }

    /**
     * Create an instance of {@link CentroType }
     * 
     */
    public CentroType createCentroType() {
        return new CentroType();
    }

    /**
     * Create an instance of {@link ProfesoresType }
     * 
     */
    public ProfesoresType createProfesoresType() {
        return new ProfesoresType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatoscentroType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "datoscentro")
    public JAXBElement<DatoscentroType> createDatoscentro(DatoscentroType value) {
        return new JAXBElement<DatoscentroType>(_Datoscentro_QNAME, DatoscentroType.class, null, value);
    }

}