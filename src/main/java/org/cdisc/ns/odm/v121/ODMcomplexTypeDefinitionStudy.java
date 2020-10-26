//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.15 at 01:17:07 PM EDT 
//


package org.cdisc.ns.odm.v121;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-Study complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-Study">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}GlobalVariables"/>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}BasicDefinitions" minOccurs="0"/>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}MetaDataVersion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}StudyElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}StudyAttributeExtension"/>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}StudyAttributeDefinition"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Study", propOrder = {
    "globalVariables",
    "basicDefinitions",
    "metaDataVersion"
})
public class ODMcomplexTypeDefinitionStudy {

    @XmlElement(name = "GlobalVariables", required = true)
    protected ODMcomplexTypeDefinitionGlobalVariables globalVariables;
    @XmlElement(name = "BasicDefinitions")
    protected ODMcomplexTypeDefinitionBasicDefinitions basicDefinitions;
    @XmlElement(name = "MetaDataVersion")
    protected List<ODMcomplexTypeDefinitionMetaDataVersion> metaDataVersion;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;

    /**
     * Gets the value of the globalVariables property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionGlobalVariables }
     *     
     */
    public ODMcomplexTypeDefinitionGlobalVariables getGlobalVariables() {
        return globalVariables;
    }

    /**
     * Sets the value of the globalVariables property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionGlobalVariables }
     *     
     */
    public void setGlobalVariables(ODMcomplexTypeDefinitionGlobalVariables value) {
        this.globalVariables = value;
    }

    /**
     * Gets the value of the basicDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionBasicDefinitions }
     *     
     */
    public ODMcomplexTypeDefinitionBasicDefinitions getBasicDefinitions() {
        return basicDefinitions;
    }

    /**
     * Sets the value of the basicDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionBasicDefinitions }
     *     
     */
    public void setBasicDefinitions(ODMcomplexTypeDefinitionBasicDefinitions value) {
        this.basicDefinitions = value;
    }

    /**
     * Gets the value of the metaDataVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaDataVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaDataVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionMetaDataVersion }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionMetaDataVersion> getMetaDataVersion() {
        if (metaDataVersion == null) {
            metaDataVersion = new ArrayList<ODMcomplexTypeDefinitionMetaDataVersion>();
        }
        return this.metaDataVersion;
    }

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

}
