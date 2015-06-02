package au.com.experienceoz.api;

import java.rmi.RemoteException;
import java.util.Calendar;

import javax.xml.rpc.ServiceException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.soap.impl.dom.SOAPHeaderBlockImpl;
import org.apache.axiom.soap.impl.dom.soap11.SOAP11Factory;
import org.apache.axiom.soap.impl.dom.soap11.SOAP11HeaderBlockImpl;

import au.com.experienceoz.API;
import au.com.experienceoz.AvailabilityRequest;
import au.com.experienceoz.ExperienceOZAPI;

public class Test1 {
	
	public static void main(String[] args) throws ServiceException {
		
		try {
			APIEndpointService service = new APIEndpointServiceLocator();
			ExperienceOZAPI experienceOZAPI =  service.getAPIEndpointPort();
			
			
			APIEndpointServiceSoapBindingStub  stub = new APIEndpointServiceSoapBindingStub(service);
//			new APIEndpointServiceSoapBindingStub().get
			 String username = "admin";
		        String password = "1";
		        SOAP11Factory factory = new SOAP11Factory();
		        OMNamespace SecurityElementNamespace = factory
		                .createOMNamespace(
		                        "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd",
		                        "wsse");
		       
		        OMNamespace SecurityElementNamespace = factory
		                .createOMNamespace(
		                        "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd",
		                        "wsse");

		        OMElement usernameTokenEl = factory.createOMElement("UsernameToken",
		                SecurityElementNamespace);
		        OMElement usernameEl = factory.createOMElement("Username",
		                SecurityElementNamespace);
		        OMElement passwordEl = factory.createOMElement("Password",
		                SecurityElementNamespace);
//		        OMElement actionEl = factory.createOMElement("Action",
//		                SecurityElementNamespace);

		        passwordEl
		                .addAttribute(factory
		                        .createOMAttribute(
		                                "Type",
		                                null,
		                                "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText"));

		        usernameEl.setText(username);
		        passwordEl.setText(password);
		        usernameTokenEl.addChild(usernameEl);
		        usernameTokenEl.addChild(passwordEl);
//		        usernameTokenEl.addChild(actionEl);
		        
		        SOAPHeaderElement block = new SOAPHeaderElement(,
		                SecurityElementNamespace, factory);
		        block.addChild(usernameTokenEl);
		        
		        stub.setHeader(block);
		        
			
			
			
			AvailabilityRequest availabilityRequest = new AvailabilityRequest(1L , Calendar.getInstance()) ;
			experienceOZAPI.getAvailability(availabilityRequest);
		} catch (API e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
