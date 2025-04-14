package com.nt.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ReportGenerator {
    
	/*@Scheduled(initialDelay = 2000,fixedDelay = 3000)
	public void generateReport() {
		System.out.println("Report On ::"+new Date());
	}*/
	
	/*@Scheduled(fixedDelay = 3000)
	public void generateReport() {
		System.out.println("Report On ::"+new Date());
	}*/
	
	/*	@Scheduled(fixedRate = 10000)
		public void generateReport() {
			System.out.println("Report On (Start)::"+new Date());
			try {
				Thread.sleep(5000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Report On (End)::"+new Date());
		}*/
	
	/*	@Scheduled(fixedRate = 10000)
		public void generateReport() {
			System.out.println("Report On (Start)::"+new Date());
			try {
				Thread.sleep(15000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Report On (End)::"+new Date());
		}*/
	
//	@Scheduled(cron="20 * * * * *")
//	@Scheduled(cron="0 54 * * * *")
//	@Scheduled(cron="0 0 10 1  * *")
//	@Scheduled(cron="0 0 10 15 8 *")
//	@Scheduled(cron="0 30 7 20 10 *")
//	@Scheduled(cron="0 0 9,2 * * *")
//	@Scheduled(cron="0 12 9-12 * * *")
//	@Scheduled(cron="0 0 10 1 1 SUN")
//	@Scheduled(cron="0 0 10 ? * TUE")
//	@Scheduled(cron="0 0 17 * * 4-6")
//	@Scheduled(cron="0 0 10 ? * TUE")
	/*public void generateReport() {
		System.out.println("Report On ::"+new Date());
	}*/
	
//	@Scheduled(cron="0/10 * * * * *")
//	@Scheduled(cron="0 0/2 10 * * *")
//	@Scheduled(cron="0 10 1/3  * * *")
//	@Scheduled(cron="* * * * * *")
//	@Scheduled(cron="0 0 19 ? 1/3 ?")
//	@Scheduled(cron="@hourly")
	@Scheduled(cron="0 49 8 * * SUN#2")
	public void generateReport() {
		System.out.println("Report On ::"+new Date());
	}
}
