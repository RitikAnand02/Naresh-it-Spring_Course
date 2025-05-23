package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotel")
public class Hotel {
	@Value("1111") //Direct value injection
	private Integer hotelId;
	
	@Value("${hotel.name}")
	private String hotelName;
	
	@Value("${hotel.addrs}")
	private String hotelAddrs;
	
	@Value("${hotel.contactno}")
	private String mobileNo;
	
	@Value("${customer.name}")
	private String custName;
	
	@Value("#{menup.idlyPrice + menup.dosaPrice}") // SPEL For arithmetic operation
	private Float billAmount;
	
	@Value("${os.name}") // os.name is fixed system property key
	private String osName;
	
	@Value("${user.name}") // user.name is fixed system property key
	private String windowsUser;
	
	@Value("${Path}") // Path is fixed env variable name
	private String pathData;

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAddrs=" + hotelAddrs + ", mobileNo="
				+ mobileNo + ", custName=" + custName + ", billAmount=" + billAmount + ", osName=" + osName
				+ ", windowsUser=" + windowsUser + ", pathData=" + pathData + "]";
	}
	
}
