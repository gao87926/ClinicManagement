package edu.stevens.cs548.clinic.service.web.soap;

public class IPatientWebPortProxy implements edu.stevens.cs548.clinic.service.web.soap.IPatientWebPort {
  private String _endpoint = null;
  private edu.stevens.cs548.clinic.service.web.soap.IPatientWebPort iPatientWebPort = null;
  
  public IPatientWebPortProxy() {
    _initIPatientWebPortProxy();
  }
  
  public IPatientWebPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initIPatientWebPortProxy();
  }
  
  private void _initIPatientWebPortProxy() {
    try {
      iPatientWebPort = (new edu.stevens.cs548.clinic.service.web.soap.PatientWebServiceLocator()).getPatientWebPort();
      if (iPatientWebPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iPatientWebPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iPatientWebPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iPatientWebPort != null)
      ((javax.xml.rpc.Stub)iPatientWebPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public edu.stevens.cs548.clinic.service.web.soap.IPatientWebPort getIPatientWebPort() {
    if (iPatientWebPort == null)
      _initIPatientWebPortProxy();
    return iPatientWebPort;
  }
  
  public long createPatient(java.lang.String arg0, java.util.Calendar arg1, int arg2, long arg3) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn{
    if (iPatientWebPort == null)
      _initIPatientWebPortProxy();
    return iPatientWebPort.createPatient(arg0, arg1, arg2, arg3);
  }
  
  public long addRadiology(long arg0, long arg1, java.util.Calendar[] arg2) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.ProviderExn{
    if (iPatientWebPort == null)
      _initIPatientWebPortProxy();
    return iPatientWebPort.addRadiology(arg0, arg1, arg2);
  }
  
  public long addSurgery(long arg0, long arg1, java.util.Calendar arg2) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.ProviderExn{
    if (iPatientWebPort == null)
      _initIPatientWebPortProxy();
    return iPatientWebPort.addSurgery(arg0, arg1, arg2);
  }
  
  public void deletePatient(java.lang.String arg0, long arg1) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn{
    if (iPatientWebPort == null)
      _initIPatientWebPortProxy();
    iPatientWebPort.deletePatient(arg0, arg1);
  }
  
  public java.lang.String siteInfo() throws java.rmi.RemoteException{
    if (iPatientWebPort == null)
      _initIPatientWebPortProxy();
    return iPatientWebPort.siteInfo();
  }
  
  public edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto[] getTreatmentsByProvider(long arg0) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn{
    if (iPatientWebPort == null)
      _initIPatientWebPortProxy();
    return iPatientWebPort.getTreatmentsByProvider(arg0);
  }
  
  public long addDrugTreatment(long arg0, long arg1, java.lang.String arg2, float arg3) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.ProviderExn{
    if (iPatientWebPort == null)
      _initIPatientWebPortProxy();
    return iPatientWebPort.addDrugTreatment(arg0, arg1, arg2, arg3);
  }
  
  public edu.stevens.cs548.clinic.service.web.data.provider.ProviderDto getProviderByNpi(long arg0) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn{
    if (iPatientWebPort == null)
      _initIPatientWebPortProxy();
    return iPatientWebPort.getProviderByNpi(arg0);
  }
  
  public edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto[] getTreatmentsByProvPat(long arg0, long arg1) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn, edu.stevens.cs548.clinic.service.web.soap.ProviderNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn, edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn{
    if (iPatientWebPort == null)
      _initIPatientWebPortProxy();
    return iPatientWebPort.getTreatmentsByProvPat(arg0, arg1);
  }
  
  public edu.stevens.cs548.clinic.service.web.data.treatment.TreatmentDto[] getTreatmentsByPatient(long arg0) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn, edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn{
    if (iPatientWebPort == null)
      _initIPatientWebPortProxy();
    return iPatientWebPort.getTreatmentsByPatient(arg0);
  }
  
  public void deleteTreatment(long arg0, long arg1) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn, edu.stevens.cs548.clinic.service.web.soap.TreatmentNotFoundExn, edu.stevens.cs548.clinic.service.web.soap.PatientNotFoundExn{
    if (iPatientWebPort == null)
      _initIPatientWebPortProxy();
    iPatientWebPort.deleteTreatment(arg0, arg1);
  }
  
  public edu.stevens.cs548.clinic.service.web.soap.GetProviderByNameResponseProviderDto[] getProviderByName(java.lang.String arg0) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn{
    if (iPatientWebPort == null)
      _initIPatientWebPortProxy();
    return iPatientWebPort.getProviderByName(arg0);
  }
  
  public long createProvider(java.lang.String arg0, long arg1) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.ProviderServiceExn{
    if (iPatientWebPort == null)
      _initIPatientWebPortProxy();
    return iPatientWebPort.createProvider(arg0, arg1);
  }
  
  public edu.stevens.cs548.clinic.service.web.data.patient.PatientDto getPatientByDbId(long arg0) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn{
    if (iPatientWebPort == null)
      _initIPatientWebPortProxy();
    return iPatientWebPort.getPatientByDbId(arg0);
  }
  
  public edu.stevens.cs548.clinic.service.web.data.patient.PatientDto getPatientByPatId(long arg0) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn{
    if (iPatientWebPort == null)
      _initIPatientWebPortProxy();
    return iPatientWebPort.getPatientByPatId(arg0);
  }
  
  public edu.stevens.cs548.clinic.service.web.soap.GetPatientByNameDobResponsePatientDto[] getPatientByNameDob(java.lang.String arg0, java.util.Calendar arg1) throws java.rmi.RemoteException, edu.stevens.cs548.clinic.service.web.soap.PatientServiceExn{
    if (iPatientWebPort == null)
      _initIPatientWebPortProxy();
    return iPatientWebPort.getPatientByNameDob(arg0, arg1);
  }
  
  
}