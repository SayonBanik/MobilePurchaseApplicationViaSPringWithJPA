package com.cg.mpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="purchasedetails")
public class PurchaseDetails 
{

	@Id
	@Column(name="PURCHASEID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq")
	@SequenceGenerator(name="seq",sequenceName="MOBSEQ",allocationSize=1)
	private Integer purchaseId;
	
	
	@NotEmpty(message="Name is Mandatory")
	@Pattern(regexp="[A-Z][a-zA-Z]{3,15}",message="Name should contain min 3 and max 15 letters")
	@Column(name="CNAME")
	private String custName;
	
	
	@NotEmpty(message="Phone No is Required")
	@Pattern(regexp="[0-9]{10}",message="Phone no should contain exact 10 digits")
	@Column(name="PHONENO")
	private String phoneNo;
	
	
	@Email(message="Enter a valid Email Id")
	@Column(name="MAILID")
	private String emailId;
	
	@Column(name="PURCHASEDATE")
	@Pattern(regexp="[0-9]{2}-[A-Za-z]{3}-[0-9]{4}",message="Date must be given in proper format Eg: 01-Jan-2018")
	private String purchaseDate;
	
	@Column(name="MOBILEID")
	private Integer mobileId;

	
	
	
	public PurchaseDetails()     //getters and setters
	{
		
	}




	public Integer getPurchaseId() {
		return purchaseId;
	}




	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}




	public String getCustName() {
		return custName;
	}




	public void setCustName(String custName) {
		this.custName = custName;
	}




	public String getPhoneNo() {
		return phoneNo;
	}




	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}




	public String getEmailId() {
		return emailId;
	}




	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}




	public String getPurchaseDate() {
		return purchaseDate;
	}




	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}




	public Integer getMobileId() {
		return mobileId;
	}




	public void setMobileId(Integer mobileId) {
		this.mobileId = mobileId;
	}
	
	
	
	
	
	
}
