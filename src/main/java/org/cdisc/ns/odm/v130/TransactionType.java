//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.08 at 02:21:24 PM EST 
//


package org.cdisc.ns.odm.v130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Insert"/&gt;
 *     &lt;enumeration value="Update"/&gt;
 *     &lt;enumeration value="Remove"/&gt;
 *     &lt;enumeration value="Upsert"/&gt;
 *     &lt;enumeration value="Context"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionType")
@XmlEnum
public enum TransactionType {

    @XmlEnumValue("Insert")
    INSERT("Insert"),
    @XmlEnumValue("Update")
    UPDATE("Update"),
    @XmlEnumValue("Remove")
    REMOVE("Remove"),
    @XmlEnumValue("Upsert")
    UPSERT("Upsert"),
    @XmlEnumValue("Context")
    CONTEXT("Context");
    private final String value;

    TransactionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionType fromValue(String v) {
        for (TransactionType c: TransactionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
