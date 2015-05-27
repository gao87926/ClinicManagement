/**
 * TreatmentDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.stevens.cs548.clinic.service.web.data.treatment;

public class TreatmentDto  implements java.io.Serializable {
    private long id;

    private edu.stevens.cs548.clinic.service.web.data.treatment.DrugTreatmentType drugTreatment;

    private java.lang.String[] radiology;

    private edu.stevens.cs548.clinic.service.web.data.treatment.SurgeryType surgery;

    public TreatmentDto() {
    }

    public TreatmentDto(
           long id,
           edu.stevens.cs548.clinic.service.web.data.treatment.DrugTreatmentType drugTreatment,
           java.lang.String[] radiology,
           edu.stevens.cs548.clinic.service.web.data.treatment.SurgeryType surgery) {
           this.id = id;
           this.drugTreatment = drugTreatment;
           this.radiology = radiology;
           this.surgery = surgery;
    }


    /**
     * Gets the id value for this TreatmentDto.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this TreatmentDto.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the drugTreatment value for this TreatmentDto.
     * 
     * @return drugTreatment
     */
    public edu.stevens.cs548.clinic.service.web.data.treatment.DrugTreatmentType getDrugTreatment() {
        return drugTreatment;
    }


    /**
     * Sets the drugTreatment value for this TreatmentDto.
     * 
     * @param drugTreatment
     */
    public void setDrugTreatment(edu.stevens.cs548.clinic.service.web.data.treatment.DrugTreatmentType drugTreatment) {
        this.drugTreatment = drugTreatment;
    }


    /**
     * Gets the radiology value for this TreatmentDto.
     * 
     * @return radiology
     */
    public java.lang.String[] getRadiology() {
        return radiology;
    }


    /**
     * Sets the radiology value for this TreatmentDto.
     * 
     * @param radiology
     */
    public void setRadiology(java.lang.String[] radiology) {
        this.radiology = radiology;
    }


    /**
     * Gets the surgery value for this TreatmentDto.
     * 
     * @return surgery
     */
    public edu.stevens.cs548.clinic.service.web.data.treatment.SurgeryType getSurgery() {
        return surgery;
    }


    /**
     * Sets the surgery value for this TreatmentDto.
     * 
     * @param surgery
     */
    public void setSurgery(edu.stevens.cs548.clinic.service.web.data.treatment.SurgeryType surgery) {
        this.surgery = surgery;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TreatmentDto)) return false;
        TreatmentDto other = (TreatmentDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.drugTreatment==null && other.getDrugTreatment()==null) || 
             (this.drugTreatment!=null &&
              this.drugTreatment.equals(other.getDrugTreatment()))) &&
            ((this.radiology==null && other.getRadiology()==null) || 
             (this.radiology!=null &&
              java.util.Arrays.equals(this.radiology, other.getRadiology()))) &&
            ((this.surgery==null && other.getSurgery()==null) || 
             (this.surgery!=null &&
              this.surgery.equals(other.getSurgery())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getId()).hashCode();
        if (getDrugTreatment() != null) {
            _hashCode += getDrugTreatment().hashCode();
        }
        if (getRadiology() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRadiology());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRadiology(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSurgery() != null) {
            _hashCode += getSurgery().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TreatmentDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/data/treatment", "TreatmentDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drugTreatment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "drug-treatment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/data/treatment", "DrugTreatmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiology");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radiology"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "date"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surgery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "surgery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/data/treatment", "SurgeryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
