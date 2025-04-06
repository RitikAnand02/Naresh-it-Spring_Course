package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("dcc")
@Data
public class DiagnosticCenterCatalog {
	@Value("${dc.xrayRate}")
     private Double xrayPrice;
	
	@Value("${dc.ctscanRate}")
     private Double ctscanPrice;
	
	@Value("${dc.mriScanRate}")
     private Double MRIScanPrice;
	
	@Value("${dc.ecgRate}")
     private Double ecgPrice;
     
     
}
