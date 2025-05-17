//Customer.java
package com.nt.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="OTM_CUSTOMER_TAB")
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Customer {
	@Id
	@SequenceGenerator(name = "gen1",sequenceName ="CNO_SEQ1", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
   private  Integer cno;
	
   @Column(length = 30)
   @NonNull
   private  String  cname;
   
   @Column(length = 30)
   @NonNull
   private   String  caddrs;
   @NonNull
   private   Double billamt;
   
   @OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL, fetch =FetchType.EAGER ,mappedBy = "cust")
   //@JoinColumn(name = "CUST_NO",referencedColumnName = "CNO")  // FK  col pointing pk Column
   private  Set<PhoneNumber> phones;  //for Collection type HAS-A property for 1-M association
   
   public Customer() {
	 System.out.println("Customer:: 0-param constructor::"+this.getClass());
   }


   
   //toString()  (alt+shift+s,s)
   @Override
   public String toString() {
   	return "Customer [cno=" + cno + ", cname=" + cname + ", caddrs=" + caddrs + ", billamt=" + billamt + "]";
   }
   
}
