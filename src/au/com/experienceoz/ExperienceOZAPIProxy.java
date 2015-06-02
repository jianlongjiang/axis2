package au.com.experienceoz;

public class ExperienceOZAPIProxy implements au.com.experienceoz.ExperienceOZAPI {
  private String _endpoint = null;
  private au.com.experienceoz.ExperienceOZAPI experienceOZAPI = null;
  
  public ExperienceOZAPIProxy() {
    _initExperienceOZAPIProxy();
  }
  
  public ExperienceOZAPIProxy(String endpoint) {
    _endpoint = endpoint;
    _initExperienceOZAPIProxy();
  }
  
  private void _initExperienceOZAPIProxy() {
    try {
      experienceOZAPI = (new au.com.experienceoz.api.APIEndpointServiceLocator()).getAPIEndpointPort();
      if (experienceOZAPI != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)experienceOZAPI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)experienceOZAPI)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (experienceOZAPI != null)
      ((javax.xml.rpc.Stub)experienceOZAPI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public au.com.experienceoz.ExperienceOZAPI getExperienceOZAPI() {
    if (experienceOZAPI == null)
      _initExperienceOZAPIProxy();
    return experienceOZAPI;
  }
  
  public au.com.experienceoz.Availability[] getAvailability(au.com.experienceoz.AvailabilityRequest availabilityRequest) throws java.rmi.RemoteException, au.com.experienceoz.API{
    if (experienceOZAPI == null)
      _initExperienceOZAPIProxy();
    return experienceOZAPI.getAvailability(availabilityRequest);
  }
  
  public au.com.experienceoz.Purchase makePurchase(au.com.experienceoz.PurchaseRequest purchaseRequest) throws java.rmi.RemoteException, au.com.experienceoz.API{
    if (experienceOZAPI == null)
      _initExperienceOZAPIProxy();
    return experienceOZAPI.makePurchase(purchaseRequest);
  }
  
  public au.com.experienceoz.ReceiptPurchaseResponse receipt(au.com.experienceoz.ReceiptPurchaseRequest receiptPurchaseRequest) throws java.rmi.RemoteException, au.com.experienceoz.API{
    if (experienceOZAPI == null)
      _initExperienceOZAPIProxy();
    return experienceOZAPI.receipt(receiptPurchaseRequest);
  }
  
  
}