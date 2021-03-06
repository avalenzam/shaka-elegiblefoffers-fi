package com.telefonica.eof.proxy.offering;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.telefonica.globalintegration.header.HeaderInType;
import com.telefonica.globalintegration.services.retrieveofferings.v1.RetrieveOfferingsRequestType;
import com.telefonica.globalintegration.services.retrieveofferings.v1.RetrieveOfferingsResponseType;

/**
 * 
 * @Author: Alexandra Valenza Medrano
 * @Datecreation: August 2020
 * @FileName: OfferingsConnection.java
 * @AuthorCompany: Telefonica
 * @version: 0.1
 * @Description: Representa la conexion con el servicio SOAP
 */
@Component
public class OfferingsConnection {

    @SuppressWarnings("unchecked")
    public JAXBElement<RetrieveOfferingsResponseType> callWebService(String url, RetrieveOfferingsRequestType request, String metodrequest,
	    HeaderInType headerInType){

	WebServiceTemplate webServiceTemplate = new WebServiceTemplate();

	return (JAXBElement<RetrieveOfferingsResponseType>) webServiceTemplate.marshalSendAndReceive(
		new JAXBElement<RetrieveOfferingsRequestType>(new QName(url, metodrequest), RetrieveOfferingsRequestType.class, request),
		new SoapHeaders(headerInType));
    
	
	
    }
}