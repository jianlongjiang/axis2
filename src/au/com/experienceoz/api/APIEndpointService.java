/**
 * APIEndpointService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package au.com.experienceoz.api;

public interface APIEndpointService extends javax.xml.rpc.Service {
    public java.lang.String getAPIEndpointPortAddress();

    public au.com.experienceoz.ExperienceOZAPI getAPIEndpointPort() throws javax.xml.rpc.ServiceException;

    public au.com.experienceoz.ExperienceOZAPI getAPIEndpointPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
