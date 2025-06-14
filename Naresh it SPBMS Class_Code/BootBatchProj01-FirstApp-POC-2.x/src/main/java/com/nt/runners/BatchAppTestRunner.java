package com.nt.runners;

import java.util.Random;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

//@Component
public class BatchAppTestRunner implements CommandLineRunner {
	@Autowired
	private   JobLauncher  launcher;
	@Autowired
	private Job  job;

	
	@Override
	public void run(String... args) throws Exception {
		try {
			JobParameters parameter=new JobParametersBuilder().addLong("jobId", new Random().nextLong(1000000L)).toJobParameters();
			JobExecution  execution=launcher.run(job, parameter);
			System.out.println("Job Execution status::"+execution.getExitStatus());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.exit(0);
	}

}
