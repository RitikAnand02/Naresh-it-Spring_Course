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
	
	@Scheduled(fixedRate = 10000)
	public void generateReport() {
		System.out.println("Report On (Start)::"+new Date());
		try {
			Thread.sleep(15000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Report On (End)::"+new Date());
	}
}
