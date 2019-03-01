package com.cg.banking.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Customer {
	@Id
	private String panCardNumber;
	private String customerName;
	private String emailId;
	private long mobileNo;
	private long cibilScore;
	public Customer() {}
	public Customer(String panCardNumber, String customerName, String emailId, long mobileNo, long cibilScore) {
		super();
		this.panCardNumber = panCardNumber;
		this.customerName = customerName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.cibilScore = cibilScore;
	}
	public String getPanCardNumber() {
		return panCardNumber;
	}
	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public long getCibilScore() {
		return cibilScore;
	}
	public void setCibilScore(long cibilScore) {
		this.cibilScore = cibilScore;
	}
	@Override
	public String toString() {
		return "Customer [panCardNumber=" + panCardNumber + ", customerName=" + customerName + ", emailId=" + emailId
				+ ", mobNo=" + mobileNo + ", cibilScore=" + cibilScore + "]";
	}
}
