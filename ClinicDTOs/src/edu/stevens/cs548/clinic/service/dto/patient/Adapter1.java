//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.16 at 08:19:32 PM EST 
//


package edu.stevens.cs548.clinic.service.dto.patient;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (edu.stevens.cs548.clinic.service.dto.DataAdapter.parseDate(value));
    }

    public String marshal(Date value) {
        return (edu.stevens.cs548.clinic.service.dto.DataAdapter.printDate(value));
    }

}