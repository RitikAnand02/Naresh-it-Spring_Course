package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("pInfo")
@Data
public class PatientInfo {
	@Value("1001")
   private Integer pid;
	
	@Value("${pi.name}")
   private String pname;
	
	@Value("${pi.mobileNo}")
   private Long mobileNo;
	
	@Value("${pi.addrs}")
   private String paddrs;
	
	@Value("#{dcc.xrayPrice + dcc.ctscanPrice +dcc.ecgPrice}") //SPEL
   private Double billAmount;
	
	@Value("#{dcc.ecgPrice<=0}") //SPEL
   private Boolean ecgFee;
	
	@Value("${os.name}")
   private String osName;
	
	@Value("${Path}")
   private String PathData;

	@Override
	public String toString() {
		return "PatientInfo [pid=" + pid + ", pname=" + pname + ", mobileNo=" + mobileNo + ", paddrs=" + paddrs
				+ ", billAmount=" + billAmount + ", ecgFee=" + ecgFee + ", osName=" + osName + ", PathData=" + PathData
				+ "]";
	}
   
   
}
