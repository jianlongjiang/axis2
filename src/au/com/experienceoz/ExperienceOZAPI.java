/**
 * ExperienceOZAPI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package au.com.experienceoz;

public interface ExperienceOZAPI extends java.rmi.Remote {
    public au.com.experienceoz.Availability[] getAvailability(au.com.experienceoz.AvailabilityRequest availabilityRequest) throws java.rmi.RemoteException, au.com.experienceoz.API;
    public au.com.experienceoz.Purchase makePurchase(au.com.experienceoz.PurchaseRequest purchaseRequest) throws java.rmi.RemoteException, au.com.experienceoz.API;
    public au.com.experienceoz.ReceiptPurchaseResponse receipt(au.com.experienceoz.ReceiptPurchaseRequest receiptPurchaseRequest) throws java.rmi.RemoteException, au.com.experienceoz.API;
}
