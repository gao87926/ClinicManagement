/**
 * PatientWebPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.stevens.cs548.clinic.service.web.soap;

public class PatientWebPortBindingStub extends org.apache.axis.client.Stub implements edu.stevens.cs548.clinic.service.web.soap.IPatientWebPort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[16];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createProvider");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderServiceExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderServiceExn"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deletePatient");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientServiceExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientServiceExn"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPatientByDbId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/data/patient", ">PatientDto"));
        oper.setReturnClass(edu.stevens.cs548.clinic.service.web.data.patient.PatientDto.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/data/patient", "PatientDto"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientServiceExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientServiceExn"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPatientByNameDob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", ">getPatientByNameDobResponse>PatientDto"));
        oper.setReturnClass(edu.stevens.cs548.clinic.service.web.soap.GetPatientByNameDobResponsePatientDto[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientDto"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientServiceExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientServiceExn"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProviderByName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", ">getProviderByNameResponse>ProviderDto"));
        oper.setReturnClass(edu.stevens.cs548.clinic.service.web.soap.GetProviderByNameResponseProviderDto[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderDto"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderServiceExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderServiceExn"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPatientByPatId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/data/patient", ">PatientDto"));
        oper.setReturnClass(edu.stevens.cs548.clinic.service.web.data.patient.PatientDto.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/data/patient", "PatientDto"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientServiceExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientServiceExn"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getProviderByNpi");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/data/provider", ">ProviderDto"));
        oper.setReturnClass(edu.stevens.cs548.clinic.service.web.data.provider.ProviderDto.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/data/provider", "ProviderDto"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderServiceExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderServiceExn"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createPatient");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientServiceExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientServiceExn"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addDrugTreatment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderNotFoundExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderNotFoundExn"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientNotFoundExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientNotFoundExn"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.ProviderExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderExn"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addSurgery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderNotFoundExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderNotFoundExn"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientNotFoundExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientNotFoundExn"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.ProviderExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderExn"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addRadiology");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderNotFoundExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderNotFoundExn"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientNotFoundExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientNotFoundExn"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.ProviderExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderExn"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTreatmentsByPatient");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/data/treatment", "TreatmentDto"));
        oper.setReturnClass(edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "TreatmentDto"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientServiceExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientServiceExn"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "TreatmentNotFoundExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "TreatmentNotFoundExn"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientNotFoundExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientNotFoundExn"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTreatmentsByProvider");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/data/treatment", "TreatmentDto"));
        oper.setReturnClass(edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "TreatmentDto"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderNotFoundExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderNotFoundExn"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "TreatmentNotFoundExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "TreatmentNotFoundExn"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTreatmentsByProvPat");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/data/treatment", "TreatmentDto"));
        oper.setReturnClass(edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "TreatmentDto"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientServiceExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientServiceExn"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderNotFoundExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderNotFoundExn"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "TreatmentNotFoundExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "TreatmentNotFoundExn"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderServiceExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderServiceExn"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientNotFoundExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientNotFoundExn"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteTreatment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientServiceExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientServiceExn"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "TreatmentNotFoundExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "TreatmentNotFoundExn"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientNotFoundExn"),
                      "edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn",
                      new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientNotFoundExn"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("siteInfo");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

    }

    public PatientWebPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PatientWebPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PatientWebPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/data/patient", ">PatientDto");
            cachedSerQNames.add(qName);
            cls = edu.stevens.cs548.clinic.service.web.data.patient.PatientDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/data/provider", ">ProviderDto");
            cachedSerQNames.add(qName);
            cls = edu.stevens.cs548.clinic.service.web.data.provider.ProviderDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/data/treatment", "DrugTreatmentType");
            cachedSerQNames.add(qName);
            cls = edu.stevens.cs548.clinic.service.web.data.treatment.DrugTreatmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/data/treatment", "RadiologyType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "date");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/data/treatment", "SurgeryType");
            cachedSerQNames.add(qName);
            cls = edu.stevens.cs548.clinic.service.web.data.treatment.SurgeryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/data/treatment", "TreatmentDto");
            cachedSerQNames.add(qName);
            cls = edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", ">getPatientByNameDobResponse>PatientDto");
            cachedSerQNames.add(qName);
            cls = edu.stevens.cs548.clinic.service.web.soap.GetPatientByNameDobResponsePatientDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", ">getProviderByNameResponse>ProviderDto");
            cachedSerQNames.add(qName);
            cls = edu.stevens.cs548.clinic.service.web.soap.GetProviderByNameResponseProviderDto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientNotFoundExn");
            cachedSerQNames.add(qName);
            cls = edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "PatientServiceExn");
            cachedSerQNames.add(qName);
            cls = edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderExn");
            cachedSerQNames.add(qName);
            cls = edu.stevens.cs548.clinic.service.web.soap.ProviderExn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderNotFoundExn");
            cachedSerQNames.add(qName);
            cls = edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "ProviderServiceExn");
            cachedSerQNames.add(qName);
            cls = edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "TreatmentNotFoundExn");
            cachedSerQNames.add(qName);
            cls = edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public long createProvider(java.lang.String arg0, long arg1) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "createProvider"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, new java.lang.Long(arg1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void deletePatient(java.lang.String arg0, long arg1) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "deletePatient"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, new java.lang.Long(arg1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public edu.stevens.cs548.clinic.service.web.data.patient.PatientDto getPatientByDbId(long arg0) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "getPatientByDbId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(arg0)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (edu.stevens.cs548.clinic.service.web.data.patient.PatientDto) _resp;
            } catch (java.lang.Exception _exception) {
                return (edu.stevens.cs548.clinic.service.web.data.patient.PatientDto) org.apache.axis.utils.JavaUtils.convert(_resp, edu.stevens.cs548.clinic.service.web.data.patient.PatientDto.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public edu.stevens.cs548.clinic.service.web.soap.GetPatientByNameDobResponsePatientDto[] getPatientByNameDob(java.lang.String arg0, java.util.Calendar arg1) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "getPatientByNameDob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (edu.stevens.cs548.clinic.service.web.soap.GetPatientByNameDobResponsePatientDto[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (edu.stevens.cs548.clinic.service.web.soap.GetPatientByNameDobResponsePatientDto[]) org.apache.axis.utils.JavaUtils.convert(_resp, edu.stevens.cs548.clinic.service.web.soap.GetPatientByNameDobResponsePatientDto[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public edu.stevens.cs548.clinic.service.web.soap.GetProviderByNameResponseProviderDto[] getProviderByName(java.lang.String arg0) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "getProviderByName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (edu.stevens.cs548.clinic.service.web.soap.GetProviderByNameResponseProviderDto[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (edu.stevens.cs548.clinic.service.web.soap.GetProviderByNameResponseProviderDto[]) org.apache.axis.utils.JavaUtils.convert(_resp, edu.stevens.cs548.clinic.service.web.soap.GetProviderByNameResponseProviderDto[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public edu.stevens.cs548.clinic.service.web.data.patient.PatientDto getPatientByPatId(long arg0) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "getPatientByPatId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(arg0)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (edu.stevens.cs548.clinic.service.web.data.patient.PatientDto) _resp;
            } catch (java.lang.Exception _exception) {
                return (edu.stevens.cs548.clinic.service.web.data.patient.PatientDto) org.apache.axis.utils.JavaUtils.convert(_resp, edu.stevens.cs548.clinic.service.web.data.patient.PatientDto.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public edu.stevens.cs548.clinic.service.web.data.provider.ProviderDto getProviderByNpi(long arg0) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "getProviderByNpi"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(arg0)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (edu.stevens.cs548.clinic.service.web.data.provider.ProviderDto) _resp;
            } catch (java.lang.Exception _exception) {
                return (edu.stevens.cs548.clinic.service.web.data.provider.ProviderDto) org.apache.axis.utils.JavaUtils.convert(_resp, edu.stevens.cs548.clinic.service.web.data.provider.ProviderDto.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createPatient(java.lang.String arg0, java.util.Calendar arg1, int arg2, long arg3) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "createPatient"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1, new java.lang.Integer(arg2), new java.lang.Long(arg3)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long addDrugTreatment(long arg0, long arg1, java.lang.String arg2, float arg3) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.ProviderExn {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "addDrugTreatment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(arg0), new java.lang.Long(arg1), arg2, new java.lang.Float(arg3)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.ProviderExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.ProviderExn) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long addSurgery(long arg0, long arg1, java.util.Calendar arg2) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.ProviderExn {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "addSurgery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(arg0), new java.lang.Long(arg1), arg2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.ProviderExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.ProviderExn) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long addRadiology(long arg0, long arg1, java.util.Calendar[] arg2) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.ProviderExn {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "addRadiology"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(arg0), new java.lang.Long(arg1), arg2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.ProviderExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.ProviderExn) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto[] getTreatmentsByPatient(long arg0) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn, edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "getTreatmentsByPatient"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(arg0)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto[]) org.apache.axis.utils.JavaUtils.convert(_resp, edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto[] getTreatmentsByProvider(long arg0) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "getTreatmentsByProvider"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(arg0)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto[]) org.apache.axis.utils.JavaUtils.convert(_resp, edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto[] getTreatmentsByProvPat(long arg0, long arg1) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn, edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn, edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "getTreatmentsByProvPat"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(arg0), new java.lang.Long(arg1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto[]) org.apache.axis.utils.JavaUtils.convert(_resp, edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void deleteTreatment(long arg0, long arg1) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn, edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "deleteTreatment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(arg0), new java.lang.Long(arg1)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn) {
              throw (edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String siteInfo() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://cs548.stevens.edu/clinic/service/web/soap", "siteInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
