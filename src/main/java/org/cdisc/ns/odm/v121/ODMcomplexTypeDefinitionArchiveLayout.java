//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.15 at 01:17:07 PM EDT 
//


package org.cdisc.ns.odm.v121;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-ArchiveLayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-ArchiveLayout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}ArchiveLayoutElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}ArchiveLayoutAttributeDefinition"/>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}ArchiveLayoutAttributeExtension"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ArchiveLayout")
public class ODMcomplexTypeDefinitionArchiveLayout {

    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "PdfFileName", required = true)
    protected String pdfFileName;
    @XmlAttribute(name = "PresentationOID")
    protected String presentationOID;

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOID() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOID(String value) {
        this.oid = value;
    }

    /**
     * Gets the value of the pdfFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfFileName() {
        return pdfFileName;
    }

    /**
     * Sets the value of the pdfFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfFileName(String value) {
        this.pdfFileName = value;
    }

    /**
     * Gets the value of the presentationOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationOID() {
        return presentationOID;
    }

    /**
     * Sets the value of the presentationOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationOID(String value) {
        this.presentationOID = value;
    }

}
