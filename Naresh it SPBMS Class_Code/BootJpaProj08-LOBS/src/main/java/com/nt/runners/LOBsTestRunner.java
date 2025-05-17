package com.nt.runners;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeeker;
import com.nt.service.IJobSeekerMgmtService;

//@Component
public class LOBsTestRunner implements CommandLineRunner {
	@Autowired
	private  IJobSeekerMgmtService  jsService;

	@Override
	public void run(String... args) throws Exception {
		try {
			//read inputs from enduser
			Scanner sc=new Scanner(System.in);
			System.out.println("enter  Job seeker name::");
			String name=sc.next();
			System.out.println("Enter  job seeker address::");
			String addrs=sc.next();
			System.out.println("Enter  Is job seeker married(true/false) ::");
			boolean msFlag=sc.nextBoolean();
			
			System.out.println("Enter job seeker photo file path");
			String photoPath=sc.next();
			System.out.println("Enter job seeker resumet file path");
			String resumePath=sc.next();
			//convert photo file content into  byte[]
			FileInputStream fis=new FileInputStream(photoPath);
			byte[]  photoData=fis.readAllBytes();
			//convert resume file content into  char[]
			File  file=new File(resumePath);
			char[]  resumeData=new char[(int)file.length()];
			FileReader  reader=new FileReader(resumePath);
			reader.read(resumeData);
		//	prepare Entity class obj  data
			  JobSeeker  js=new JobSeeker();
			  js.setJsname(name); js.setJsaddrs(addrs); js.setMarried(msFlag);
			  js.setPhoto(photoData);  js.setResume(resumeData);
		  //use 	 service
			  String msg=jsService.registerJobSeeker(js);
			  System.out.println(msg);
		}
		catch(Exception e) {
			 e.printStackTrace();
		}
		
	}//run

}//class
