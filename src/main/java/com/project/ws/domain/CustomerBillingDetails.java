package com.project.ws.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

/**
 * Database entity for customer_billing_details table.
 * We used JPA annotations to map it with database table.
 */
@XmlRootElement
@Entity
@Table(name="customer_billing_details")
@Component
public class CustomerBillingDetails implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="cust_bill_id")
	private Integer custBillId;
	
	@Column(name="cust_id")
	private Integer customerId;
	
	@Column(name="card_no")
	private String cardNo;
	
	@Column(name="card_type")
	private String cardType;
	
	@Column(name="cvv")
	private String cvv;
	
	@Column(name="card_name")
	private String cardName;
	
	@Column(name="card_expiry")
	private Date cardExpiry;
	
	@Column(name="bill_addr_line1")
	private String billAddrLine1;
	
	@Column(name="bill_addr_line2")
	private String billAddrLine2;
	
	@Column(name="bill_city")
	private String billCity;
	
	@Column(name="bill_state")
	private String billState;
	
	@Column(name="bill_zip_code")
	private String billZipCode;
	
	@Column(name="amount_charged")
	private Double amountCharged;
	
	//default constructor
	
	public CustomerBillingDetails() {
		this.cardNo = "";
		this.cardType = "";
		this.cvv = "";
		this.cardName = "";
		this.billAddrLine1 = "";
		this.billAddrLine2 = "";
		this.billCity = "";
		this.billState = "";
		this.billZipCode = "";
		this.amountCharged = 0.00;
	}
	
	public CustomerBillingDetails(Integer customerId, String cardType, String cardNo, String cvv, Date expiry, String cardName, String addr1, String addr2, String city, String state, String zip) {
		this.customerId = customerId;
		this.cardType = cardType;
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.cardExpiry = expiry;
		this.cardName = cardName;
		this.billAddrLine1 = addr1;
		this.billAddrLine2 = addr2;
		this.billCity = city;
		this.billState = state;
		this.billZipCode = zip;
		this.amountCharged = 0.00;
	}
	
	//setters
	
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public void setCustBillId(Integer custBillId) {
		this.custBillId = custBillId;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public void setCVV(String cvv) {
		this.cvv = cvv;
	}
	
	public void setCardExpiry(Date cardExpiry) {
		this.cardExpiry = cardExpiry;
	}
	
	public void setBillAddrLine1(String billAddrLine1) {
		this.billAddrLine1 = billAddrLine1;
	}
	
	public void setBillAddrLine2(String billAddrLine2) {
		this.billAddrLine2 = billAddrLine2;
	}	
	
	public void setBillCity(String billCity) {
		this.billCity = billCity;
	}
	
	public void setBillState(String billState) {
		this.billState = billState;
	}

	public void setBillZipCode(String billZipCode) {
		this.billZipCode = billZipCode;
	}
	
	public void setAmountCharged(Double amountCharged) {
		this.amountCharged = amountCharged;
	}
	
	//getters
	public Integer getCustomerId() {
		return this.customerId;
	}

	public Integer getCustBillId() {
		return this.custBillId;
	}
	
	public Date getCardExpiry() {
		return this.cardExpiry;
	}
	
	public String getCardNo() {
		return this.cardNo;
	}

	public String getCardType() {
		return this.cardType;
	}
	
	public String getCardName() {
		return this.cardName;
	}
	
	public String getCVV() {
		return this.cvv;
	}
	
	public String getBillAddrLine1() {
		return this.billAddrLine1;
	}
	
	public String getBillAddrLine2() {
		return this.billAddrLine2;
	}	
	
	public String getBillCity() {
		return this.billCity;
	}
	
	public String getBillState() {
		return this.billState;
	}

	public String getBillZipCode() {
		return this.billZipCode;
	}
	
	public Double getAmountCharged() {
		return this.amountCharged;
	}
}
