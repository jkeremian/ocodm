//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.08 at 02:21:24 PM EST 
//


package org.cdisc.ns.odm.v130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ODMcomplexTypeDefinition-AuditRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-AuditRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}UserRef"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}LocationRef"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}DateTimeStamp"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}ReasonForChange" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}SourceID" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}AuditRecordElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}AuditRecordAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}AuditRecordAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-AuditRecord", propOrder = {
    "userRef",
    "locationRef",
    "dateTimeStamp",
    "reasonForChange",
    "sourceID"
})
public class ODMcomplexTypeDefinitionAuditRecord {

    @XmlElement(name = "UserRef", required = true)
    protected ODMcomplexTypeDefinitionUserRef userRef;
    @XmlElement(name = "LocationRef", required = true)
    protected ODMcomplexTypeDefinitionLocationRef locationRef;
    @XmlElement(name = "DateTimeStamp", required = true)
    protected ODMcomplexTypeDefinitionDateTimeStamp dateTimeStamp;
    @XmlElement(name = "ReasonForChange")
    protected ODMcomplexTypeDefinitionReasonForChange reasonForChange;
    @XmlElement(name = "SourceID")
    protected ODMcomplexTypeDefinitionSourceID sourceID;
    @XmlAttribute(name = "EditPoint")
    protected EditPointType editPoint;
    @XmlAttribute(name = "UsedImputationMethod")
    protected YesOrNo usedImputationMethod;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the userRef property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionUserRef }
     *     
     */
    public ODMcomplexTypeDefinitionUserRef getUserRef() {
        return userRef;
    }

    /**
     * Sets the value of the userRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionUserRef }
     *     
     */
    public void setUserRef(ODMcomplexTypeDefinitionUserRef value) {
        this.userRef = value;
    }

    /**
     * Gets the value of the locationRef property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionLocationRef }
     *     
     */
    public ODMcomplexTypeDefinitionLocationRef getLocationRef() {
        return locationRef;
    }

    /**
     * Sets the value of the locationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionLocationRef }
     *     
     */
    public void setLocationRef(ODMcomplexTypeDefinitionLocationRef value) {
        this.locationRef = value;
    }

    /**
     * Gets the value of the dateTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionDateTimeStamp }
     *     
     */
    public ODMcomplexTypeDefinitionDateTimeStamp getDateTimeStamp() {
        return dateTimeStamp;
    }

    /**
     * Sets the value of the dateTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionDateTimeStamp }
     *     
     */
    public void setDateTimeStamp(ODMcomplexTypeDefinitionDateTimeStamp value) {
        this.dateTimeStamp = value;
    }

    /**
     * Gets the value of the reasonForChange property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionReasonForChange }
     *     
     */
    public ODMcomplexTypeDefinitionReasonForChange getReasonForChange() {
        return reasonForChange;
    }

    /**
     * Sets the value of the reasonForChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionReasonForChange }
     *     
     */
    public void setReasonForChange(ODMcomplexTypeDefinitionReasonForChange value) {
        this.reasonForChange = value;
    }

    /**
     * Gets the value of the sourceID property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionSourceID }
     *     
     */
    public ODMcomplexTypeDefinitionSourceID getSourceID() {
        return sourceID;
    }

    /**
     * Sets the value of the sourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionSourceID }
     *     
     */
    public void setSourceID(ODMcomplexTypeDefinitionSourceID value) {
        this.sourceID = value;
    }

    /**
     * Gets the value of the editPoint property.
     * 
     * @return
     *     possible object is
     *     {@link EditPointType }
     *     
     */
    public EditPointType getEditPoint() {
        return editPoint;
    }

    /**
     * Sets the value of the editPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditPointType }
     *     
     */
    public void setEditPoint(EditPointType value) {
        this.editPoint = value;
    }

    /**
     * Gets the value of the usedImputationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link YesOrNo }
     *     
     */
    public YesOrNo getUsedImputationMethod() {
        return usedImputationMethod;
    }

    /**
     * Sets the value of the usedImputationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesOrNo }
     *     
     */
    public void setUsedImputationMethod(YesOrNo value) {
        this.usedImputationMethod = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

}
