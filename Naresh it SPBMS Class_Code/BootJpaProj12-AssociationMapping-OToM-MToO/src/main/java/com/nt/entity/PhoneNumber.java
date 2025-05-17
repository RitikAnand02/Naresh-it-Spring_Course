//PhoneNumber.java
package com.nt.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="OTM_PHONENUMBER")
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class PhoneNumber {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "REGNO_SEQ",allocationSize = 1,initialValue = 1000)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private  Integer regNo;
	@NonNull
	private  Long mobileNo;
	
	@Column(length = 30)
	@NonNull
	private   String provider;
	
	@Column(length = 30)
	@NonNull
	private   String type;
	
	@ManyToOne(targetEntity = Customer.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "CUST_NO",referencedColumnName = "CNO")
	private  Customer  cust;
	
	public   PhoneNumber() {
		System.out.println("PhoneNumber:: 0-param constructor::"+this.getClass());
	}

	
	//toString()
	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", mobileNo=" + mobileNo + ", provider=" + provider + ", type=" + type
				+ "]";
	}
	

}
