package com.nt.runners;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.BootJpaProj08LOBsApplication;
import com.nt.entity.JobSeeker;
import com.nt.service.IJobSeekerMgmtService;

@Component
public class LOBsTestRunner1 implements CommandLineRunner {

    @Autowired
	private  IJobSeekerMgmtService  jsService;

    
	@Override
	public void run(String... args) throws Exception {
		try {
			//read inputs from enduser
			Scanner sc=new Scanner(System.in);
			System.out.println("enter  Job seeker Id::");
			int jsId=sc.nextInt();
			//invoke the service method
			JobSeeker  js=jsService.showJobSeekerById(jsId);
			System.out.println(js.getJsid()+" "+js.getJsname()+"  "+js.getJsaddrs()+" "+js.isMarried());
			byte[]  photoData=js.getPhoto();
			char[]  resumeData=js.getResume();
			//write  byte[]  data to new file
			FileOutputStream  fos=new FileOutputStream("new_photo.gif");
			fos.write(photoData);
			fos.flush(); fos.close();
			//write char[]  data to  new file
			FileWriter writer=new FileWriter("new_resume.txt");
			writer.write(resumeData);  writer.flush(); writer.close(); 
			}
		catch(Exception e) {
			 e.printStackTrace();
		}
		
	}//run

}//class
