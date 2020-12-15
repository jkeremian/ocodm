//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.15 at 02:51:39 PM EST 
//


package org.openclinica.ns.odm_ext_v130.v31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.cdisc.ns.odm.v130.ODMcomplexTypeDefinitionDecode;


/**
 * <p>Java class for OCodmComplexTypeDefinition-MultiSelectListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-MultiSelectListItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Decode"/>
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}MultiSelectListItemElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}MultiSelectListItemAttributeExtension"/>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}MultiSelectListItemAttributeDefinition"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-MultiSelectListItem", propOrder = {
    "decode"
})
public class OCodmComplexTypeDefinitionMultiSelectListItem {

    @XmlElement(name = "Decode", namespace = "http://www.cdisc.org/ns/odm/v1.3", required = true)
    protected ODMcomplexTypeDefinitionDecode decode;
    @XmlAttribute(name = "CodedOptionValue", required = true)
    protected String codedOptionValue;

    /**
     * Gets the value of the decode property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionDecode }
     *     
     */
    public ODMcomplexTypeDefinitionDecode getDecode() {
        return decode;
    }

    /**
     * Sets the value of the decode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionDecode }
     *     
     */
    public void setDecode(ODMcomplexTypeDefinitionDecode value) {
        this.decode = value;
    }

    /**
     * Gets the value of the codedOptionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodedOptionValue() {
        return codedOptionValue;
    }

    /**
     * Sets the value of the codedOptionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodedOptionValue(String value) {
        this.codedOptionValue = value;
    }

}
