package com.webserv.soap;

import javax.xml.soap.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;

/**
 * SOAP with Attachments API for Java (SAAJ) is mainly used for dealing directly with SOAP Request/Response messages
 * which happens behind the scenes in any Web Service API. It allows the developers to directly send and receive soap
 * messages instead of using JAX-WS.
 */
public class ScoreSOAPClientSAAJ {
	/**
	 * Starting point for the SAAJ - SOAP Client Testing
	 */
	public static void main(String args[]) {
		try {
			// Create SOAP Connection
			SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
			SOAPConnection soapConnection = soapConnectionFactory.createConnection();

			// Send SOAP Message to SOAP Server
			String url = "http://isimion-wstraining.rhcloud.com/isimion/ScoreSOAPService";
			SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(), url);
			// Process the SOAP Response
			printSOAPResponse(soapResponse);

			soapConnection.close();
		} catch (Exception e) {
			System.err.println("Error occurred while sending SOAP Request to Server");
			e.printStackTrace();
		}
	}

	private static SOAPMessage createSOAPRequest() throws Exception {
		MessageFactory messageFactory = MessageFactory.newInstance();
		SOAPMessage soapMessage = messageFactory.createMessage();
		SOAPPart soapPart = soapMessage.getSOAPPart();

		String serverURI = "http://score.soap.webserv.com/";

		// SOAP Envelope
		SOAPEnvelope envelope = soapPart.getEnvelope();
		envelope.addNamespaceDeclaration("scor", serverURI);

        /*
			<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:scor="http://score.soap.webserv.com/">
			   <soapenv:Header/>
			   <soapenv:Body>
				  <scor:getAllScores/>
			   </soapenv:Body>
			</soapenv:Envelope>         */

		// SOAP Body
		SOAPBody soapBody = envelope.getBody();
		soapBody.addChildElement("getAllScores", "scor");
		soapMessage.saveChanges();

        /* Print the request message */
		System.out.print("Request SOAP Message = ");
		soapMessage.writeTo(System.out);
		System.out.println();

		return soapMessage;
	}

	/**
	 * Method used to print the SOAP Response
	 */
	private static void printSOAPResponse(SOAPMessage soapResponse) throws Exception {
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		Source sourceContent = soapResponse.getSOAPPart().getContent();
		System.out.print("\nResponse SOAP Message = ");
		StreamResult result = new StreamResult(System.out);
		transformer.transform(sourceContent, result);
	}
}
