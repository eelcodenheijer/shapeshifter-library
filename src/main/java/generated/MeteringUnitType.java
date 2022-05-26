//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.26 at 08:11:22 PM BST 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeteringUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeteringUnitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="kW"/>
 *     &lt;enumeration value="kWh"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeteringUnitType")
@XmlEnum
public enum MeteringUnitType {


    /**
     * kW must be used with Power profile values.
     * 
     */
    @XmlEnumValue("kW")
    K_W("kW"),

    /**
     * kWh must be used with energy profile values (ImportEnergy,ExportEnergy,ImportMeterReading,ExportMeterReading).
     * 
     */
    @XmlEnumValue("kWh")
    K_WH("kWh");
    private final String value;

    MeteringUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeteringUnitType fromValue(String v) {
        for (MeteringUnitType c: MeteringUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
