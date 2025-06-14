package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.StockDetails;
import com.nt.service.IStockMgmtService;

@Component
public class MongoTemplateTestRunner implements CommandLineRunner {
	@Autowired
	private IStockMgmtService  service;

	@Override
	public void run(String... args) throws Exception {
		/*try {
					StockDetails details=new StockDetails();
					details.setName("ICICI");details.setExchange("BSE");
					details.setPrice(200.0); 
					String msg=service.registerStock(details);
					System.out.println(msg);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		
		
		try {
			StockDetails details1=new StockDetails();
			details1.setName("SBI");details1.setExchange("BSE");
			details1.setPrice(201.0);
			
			StockDetails details2=new StockDetails();
			details2.setName("HDFC");details2.setExchange("BSE");
			details2.setPrice(250.0);
			
			String msg=service.registerMultipleStocks(List.of(details1,details2));
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		*/		
		
		/*try {
		   List<StockDetails>  list=service.showStocksByPriceRange(100.0, 230.0);
		   list.forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		/*	try {
				String msg=service.updateExchangeByPrice(100.0, 230.0, "NSE");
				System.out.println(msg);
			}
			catch(Exception  e) {
				e.printStackTrace();
			}
		*/	
		/*try {
			String msg=service.registerOrUpdateStock("SBI", "BSE", 501.0);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		try {
		  String msg=service.removeStocksByPrice(200.0, 300.0);
		  System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}



}
