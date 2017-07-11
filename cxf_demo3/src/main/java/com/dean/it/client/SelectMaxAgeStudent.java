
package com.dean.it.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>selectMaxAgeStudent complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="selectMaxAgeStudent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="c1" type="{http://server.it.dean.com/}customer" minOccurs="0"/&gt;
 *         &lt;element name="c2" type="{http://server.it.dean.com/}customer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selectMaxAgeStudent", propOrder = {
    "c1",
    "c2"
})
public class SelectMaxAgeStudent {

    protected Customer c1;
    protected Customer c2;

    /**
     * 获取c1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getC1() {
        return c1;
    }

    /**
     * 设置c1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setC1(Customer value) {
        this.c1 = value;
    }

    /**
     * 获取c2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getC2() {
        return c2;
    }

    /**
     * 设置c2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setC2(Customer value) {
        this.c2 = value;
    }

}
