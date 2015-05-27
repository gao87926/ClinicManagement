/**
 * IPatientWebPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.stevens.cs548.clinic.service.web.soap;

public interface IPatientWebPort extends java.rmi.Remote {
    public long createProvider(java.lang.String arg0, long arg1) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn;
    public void deletePatient(java.lang.String arg0, long arg1) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn;
    public edu.stevens.cs548.clinic.service.web.data.patient.PatientDto getPatientByDbId(long arg0) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn;
    public edu.stevens.cs548.clinic.service.web.soap.GetPatientByNameDobResponsePatientDto[] getPatientByNameDob(java.lang.String arg0, java.util.Calendar arg1) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn;
    public edu.stevens.cs548.clinic.service.web.soap.GetProviderByNameResponseProviderDto[] getProviderByName(java.lang.String arg0) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn;
    public edu.stevens.cs548.clinic.service.web.data.patient.PatientDto getPatientByPatId(long arg0) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn;
    public edu.stevens.cs548.clinic.service.web.data.provider.ProviderDto getProviderByNpi(long arg0) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn;
    public long createPatient(java.lang.String arg0, java.util.Calendar arg1, int arg2, long arg3) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn;
    public long addDrugTreatment(long arg0, long arg1, java.lang.String arg2, float arg3) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.ProviderExn;
    public long addSurgery(long arg0, long arg1, java.util.Calendar arg2) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.ProviderExn;
    public long addRadiology(long arg0, long arg1, java.util.Calendar[] arg2) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.ProviderExn;
    public edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto[] getTreatmentsByPatient(long arg0) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn, edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn;
    public edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto[] getTreatmentsByProvider(long arg0) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn;
    public edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto[] getTreatmentsByProvPat(long arg0, long arg1) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn, edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn, edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn;
    public void deleteTreatment(long arg0, long arg1) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn, edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn;
    public java.lang.String siteInfo() throws java.rmi.RemoteException;
}
