
package com.webserv.soap.score;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webserv.soap.score package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetScoresOverResponse_QNAME = new QName("http://score.soap.webserv.com/", "getScoresOverResponse");
    private final static QName _GetAllScoresResponse_QNAME = new QName("http://score.soap.webserv.com/", "getAllScoresResponse");
    private final static QName _GetScoresOver_QNAME = new QName("http://score.soap.webserv.com/", "getScoresOver");
    private final static QName _GetAllScores_QNAME = new QName("http://score.soap.webserv.com/", "getAllScores");
    private final static QName _GetPersonByNickResponse_QNAME = new QName("http://score.soap.webserv.com/", "getPersonByNickResponse");
    private final static QName _GetFirstScoreForGameResponse_QNAME = new QName("http://score.soap.webserv.com/", "getFirstScoreForGameResponse");
    private final static QName _GetPersonByNick_QNAME = new QName("http://score.soap.webserv.com/", "getPersonByNick");
    private final static QName _GetFirstScoreForGame_QNAME = new QName("http://score.soap.webserv.com/", "getFirstScoreForGame");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webserv.soap.score
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link com.webserv.soap.score.GetFirstScoreForGameResponse }
     * 
     */
    public GetFirstScoreForGameResponse createGetFirstScoreForGameResponse() {
        return new GetFirstScoreForGameResponse();
    }

    /**
     * Create an instance of {@link com.webserv.soap.score.GetPersonByNick }
     * 
     */
    public GetPersonByNick createGetPersonByNick() {
        return new GetPersonByNick();
    }

    /**
     * Create an instance of {@link com.webserv.soap.score.GetFirstScoreForGame }
     * 
     */
    public GetFirstScoreForGame createGetFirstScoreForGame() {
        return new GetFirstScoreForGame();
    }

    /**
     * Create an instance of {@link com.webserv.soap.score.GetAllScores }
     * 
     */
    public GetAllScores createGetAllScores() {
        return new GetAllScores();
    }

    /**
     * Create an instance of {@link com.webserv.soap.score.GetScoresOver }
     * 
     */
    public GetScoresOver createGetScoresOver() {
        return new GetScoresOver();
    }

    /**
     * Create an instance of {@link com.webserv.soap.score.GetAllScoresResponse }
     * 
     */
    public GetAllScoresResponse createGetAllScoresResponse() {
        return new GetAllScoresResponse();
    }

    /**
     * Create an instance of {@link com.webserv.soap.score.GetScoresOverResponse }
     * 
     */
    public GetScoresOverResponse createGetScoresOverResponse() {
        return new GetScoresOverResponse();
    }

    /**
     * Create an instance of {@link com.webserv.soap.score.GetPersonByNickResponse }
     * 
     */
    public GetPersonByNickResponse createGetPersonByNickResponse() {
        return new GetPersonByNickResponse();
    }

    /**
     * Create an instance of {@link Score }
     * 
     */
    public Score createScore() {
        return new Score();
    }

    /**
     * Create an instance of {@link com.webserv.soap.score.Game }
     * 
     */
    public Game createGame() {
        return new Game();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.webserv.soap.score.GetScoresOverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://score.soap.webserv.com/", name = "getScoresOverResponse")
    public JAXBElement<GetScoresOverResponse> createGetScoresOverResponse(GetScoresOverResponse value) {
        return new JAXBElement<GetScoresOverResponse>(_GetScoresOverResponse_QNAME, GetScoresOverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.webserv.soap.score.GetAllScoresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://score.soap.webserv.com/", name = "getAllScoresResponse")
    public JAXBElement<GetAllScoresResponse> createGetAllScoresResponse(GetAllScoresResponse value) {
        return new JAXBElement<GetAllScoresResponse>(_GetAllScoresResponse_QNAME, GetAllScoresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.webserv.soap.score.GetScoresOver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://score.soap.webserv.com/", name = "getScoresOver")
    public JAXBElement<GetScoresOver> createGetScoresOver(GetScoresOver value) {
        return new JAXBElement<GetScoresOver>(_GetScoresOver_QNAME, GetScoresOver.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.webserv.soap.score.GetAllScores }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://score.soap.webserv.com/", name = "getAllScores")
    public JAXBElement<GetAllScores> createGetAllScores(GetAllScores value) {
        return new JAXBElement<GetAllScores>(_GetAllScores_QNAME, GetAllScores.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.webserv.soap.score.GetPersonByNickResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://score.soap.webserv.com/", name = "getPersonByNickResponse")
    public JAXBElement<GetPersonByNickResponse> createGetPersonByNickResponse(GetPersonByNickResponse value) {
        return new JAXBElement<GetPersonByNickResponse>(_GetPersonByNickResponse_QNAME, GetPersonByNickResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.webserv.soap.score.GetFirstScoreForGameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://score.soap.webserv.com/", name = "getFirstScoreForGameResponse")
    public JAXBElement<GetFirstScoreForGameResponse> createGetFirstScoreForGameResponse(GetFirstScoreForGameResponse value) {
        return new JAXBElement<GetFirstScoreForGameResponse>(_GetFirstScoreForGameResponse_QNAME, GetFirstScoreForGameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.webserv.soap.score.GetPersonByNick }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://score.soap.webserv.com/", name = "getPersonByNick")
    public JAXBElement<GetPersonByNick> createGetPersonByNick(GetPersonByNick value) {
        return new JAXBElement<GetPersonByNick>(_GetPersonByNick_QNAME, GetPersonByNick.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.webserv.soap.score.GetFirstScoreForGame }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://score.soap.webserv.com/", name = "getFirstScoreForGame")
    public JAXBElement<GetFirstScoreForGame> createGetFirstScoreForGame(GetFirstScoreForGame value) {
        return new JAXBElement<GetFirstScoreForGame>(_GetFirstScoreForGame_QNAME, GetFirstScoreForGame.class, null, value);
    }

}
