//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.27 at 03:29:29 PM EDT 
//


package org.cdisc.ns.odm.v130;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.openclinica.ns.odm_ext_v130.v31.OCodmComplexTypeDefinitionMultiSelectList;
import org.openclinica.ns.odm_ext_v130.v31.OCodmComplexTypeDefinitionStudyDetails;
import org.openclinica.ns.odm_ext_v130.v31.OCodmComplexTypeDefinitionStudyGroupClassList;
import org.openclinica.ns.rules.v31.Rules;


/**
 * <p>Java class for ODMcomplexTypeDefinition-MetaDataVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-MetaDataVersion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}MetaDataVersionPreIncludeElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Include" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Protocol" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}StudyEventDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}FormDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}ItemGroupDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}ItemDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}CodeList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}ImputationMethod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Presentation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}ConditionDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}MethodDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}MetaDataVersionElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}MetaDataVersionAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}MetaDataVersionAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-MetaDataVersion", propOrder = {
    "include",
    "protocol",
    "studyEventDef",
    "formDef",
    "itemGroupDef",
    "itemDef",
    "codeList",
    "imputationMethod",
    "presentation",
    "conditionDef",
    "methodDef",
    "metaDataVersionElementExtension"
})
public class ODMcomplexTypeDefinitionMetaDataVersion {

    @XmlElement(name = "Include")
    protected ODMcomplexTypeDefinitionInclude include;
    @XmlElement(name = "Protocol")
    protected ODMcomplexTypeDefinitionProtocol protocol;
    @XmlElement(name = "StudyEventDef")
    protected List<ODMcomplexTypeDefinitionStudyEventDef> studyEventDef;
    @XmlElement(name = "FormDef")
    protected List<ODMcomplexTypeDefinitionFormDef> formDef;
    @XmlElement(name = "ItemGroupDef")
    protected List<ODMcomplexTypeDefinitionItemGroupDef> itemGroupDef;
    @XmlElement(name = "ItemDef")
    protected List<ODMcomplexTypeDefinitionItemDef> itemDef;
    @XmlElement(name = "CodeList")
    protected List<ODMcomplexTypeDefinitionCodeList> codeList;
    @XmlElement(name = "ImputationMethod")
    protected List<ODMcomplexTypeDefinitionImputationMethod> imputationMethod;
    @XmlElement(name = "Presentation")
    protected List<ODMcomplexTypeDefinitionPresentation> presentation;
    @XmlElement(name = "ConditionDef")
    protected List<ODMcomplexTypeDefinitionConditionDef> conditionDef;
    @XmlElement(name = "MethodDef")
    protected List<ODMcomplexTypeDefinitionMethodDef> methodDef;
    @XmlElements({
        @XmlElement(name = "MultiSelectList", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1", type = OCodmComplexTypeDefinitionMultiSelectList.class),
        @XmlElement(name = "StudyGroupClassList", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1", type = OCodmComplexTypeDefinitionStudyGroupClassList.class),
        @XmlElement(name = "StudyDetails", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1", type = OCodmComplexTypeDefinitionStudyDetails.class),
        @XmlElement(name = "Rules", namespace = "http://www.openclinica.org/ns/rules/v3.1", type = Rules.class)
    })
    protected List<Object> metaDataVersionElementExtension;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Description")
    protected String description;

    /**
     * Gets the value of the include property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionInclude }
     *     
     */
    public ODMcomplexTypeDefinitionInclude getInclude() {
        return include;
    }

    /**
     * Sets the value of the include property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionInclude }
     *     
     */
    public void setInclude(ODMcomplexTypeDefinitionInclude value) {
        this.include = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionProtocol }
     *     
     */
    public ODMcomplexTypeDefinitionProtocol getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionProtocol }
     *     
     */
    public void setProtocol(ODMcomplexTypeDefinitionProtocol value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the studyEventDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studyEventDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudyEventDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionStudyEventDef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionStudyEventDef> getStudyEventDef() {
        if (studyEventDef == null) {
            studyEventDef = new ArrayList<ODMcomplexTypeDefinitionStudyEventDef>();
        }
        return this.studyEventDef;
    }

    /**
     * Gets the value of the formDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionFormDef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionFormDef> getFormDef() {
        if (formDef == null) {
            formDef = new ArrayList<ODMcomplexTypeDefinitionFormDef>();
        }
        return this.formDef;
    }

    /**
     * Gets the value of the itemGroupDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemGroupDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemGroupDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionItemGroupDef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionItemGroupDef> getItemGroupDef() {
        if (itemGroupDef == null) {
            itemGroupDef = new ArrayList<ODMcomplexTypeDefinitionItemGroupDef>();
        }
        return this.itemGroupDef;
    }

    /**
     * Gets the value of the itemDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionItemDef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionItemDef> getItemDef() {
        if (itemDef == null) {
            itemDef = new ArrayList<ODMcomplexTypeDefinitionItemDef>();
        }
        return this.itemDef;
    }

    /**
     * Gets the value of the codeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionCodeList }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionCodeList> getCodeList() {
        if (codeList == null) {
            codeList = new ArrayList<ODMcomplexTypeDefinitionCodeList>();
        }
        return this.codeList;
    }

    /**
     * Gets the value of the imputationMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imputationMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImputationMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionImputationMethod }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionImputationMethod> getImputationMethod() {
        if (imputationMethod == null) {
            imputationMethod = new ArrayList<ODMcomplexTypeDefinitionImputationMethod>();
        }
        return this.imputationMethod;
    }

    /**
     * Gets the value of the presentation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presentation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionPresentation }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionPresentation> getPresentation() {
        if (presentation == null) {
            presentation = new ArrayList<ODMcomplexTypeDefinitionPresentation>();
        }
        return this.presentation;
    }

    /**
     * Gets the value of the conditionDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionConditionDef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionConditionDef> getConditionDef() {
        if (conditionDef == null) {
            conditionDef = new ArrayList<ODMcomplexTypeDefinitionConditionDef>();
        }
        return this.conditionDef;
    }

    /**
     * Gets the value of the methodDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the methodDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethodDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionMethodDef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionMethodDef> getMethodDef() {
        if (methodDef == null) {
            methodDef = new ArrayList<ODMcomplexTypeDefinitionMethodDef>();
        }
        return this.methodDef;
    }

    /**
     * Gets the value of the metaDataVersionElementExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaDataVersionElementExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaDataVersionElementExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionMultiSelectList }
     * {@link OCodmComplexTypeDefinitionStudyGroupClassList }
     * {@link OCodmComplexTypeDefinitionStudyDetails }
     * {@link Rules }
     * 
     * 
     */
    public List<Object> getMetaDataVersionElementExtension() {
        if (metaDataVersionElementExtension == null) {
            metaDataVersionElementExtension = new ArrayList<Object>();
        }
        return this.metaDataVersionElementExtension;
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

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
