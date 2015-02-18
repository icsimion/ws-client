
package com.webserv.soap.score;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
* <p>Java class for score complex type.
*
* <p>The following schema fragment specifies the expected content contained within this class.
*
* <pre>
* &lt;complexType name="score">
*   &lt;complexContent>
*     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
*       &lt;sequence>
*         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
*         &lt;element name="game" type="{http://score.soap.webserv.com/}game" minOccurs="0"/>
*         &lt;element name="person" type="{http://score.soap.webserv.com/}person" minOccurs="0"/>
*         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}long"/>
*       &lt;/sequence>
*     &lt;/restriction>
*   &lt;/complexContent>
* &lt;/complexType>
* </pre>
*
*
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "score", propOrder = {
    "date",
    "game",
    "person",
    "score"
})
public class Score {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected Game game;
    protected Person person;
    protected long score;

    /**
     * Gets the value of the date property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the game property.
     *
     * @return
     *     possible object is
     *     {@link com.webserv.soap.score.Game }
     *
     */
    public Game getGame() {
        return game;
    }

    /**
     * Sets the value of the game property.
     *
     * @param value
     *     allowed object is
     *     {@link com.webserv.soap.score.Game }
     *
     */
    public void setGame(Game value) {
        this.game = value;
    }

    /**
     * Gets the value of the person property.
     *
     * @return
     *     possible object is
     *     {@link com.webserv.soap.score.Person }
     *
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     *
     * @param value
     *     allowed object is
     *     {@link com.webserv.soap.score.Person }
     *
     */
    public void setPerson(Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the score property.
     *
     */
    public long getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     *
     */
    public void setScore(long value) {
        this.score = value;
    }

}
