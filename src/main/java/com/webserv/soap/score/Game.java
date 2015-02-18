
package com.webserv.soap.score;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for game complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="game">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bugdet" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="releaseMonth" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="releaseYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "game", propOrder = {
    "bugdet",
    "description",
    "name",
    "releaseMonth",
    "releaseYear"
})
public class Game {

    protected long bugdet;
    protected String description;
    protected String name;
    protected short releaseMonth;
    protected short releaseYear;

    /**
     * Gets the value of the bugdet property.
     * 
     */
    public long getBugdet() {
        return bugdet;
    }

    /**
     * Sets the value of the bugdet property.
     * 
     */
    public void setBugdet(long value) {
        this.bugdet = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the releaseMonth property.
     * 
     */
    public short getReleaseMonth() {
        return releaseMonth;
    }

    /**
     * Sets the value of the releaseMonth property.
     * 
     */
    public void setReleaseMonth(short value) {
        this.releaseMonth = value;
    }

    /**
     * Gets the value of the releaseYear property.
     * 
     */
    public short getReleaseYear() {
        return releaseYear;
    }

    /**
     * Sets the value of the releaseYear property.
     * 
     */
    public void setReleaseYear(short value) {
        this.releaseYear = value;
    }

}
