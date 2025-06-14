package com.nt.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import com.nt.listener.JobMonitoringListener;
import com.nt.processor.EmployeeItemProcessor;
import com.nt.reader.BookItemReader;
import com.nt.writer.BookItemWriter;

@Configuration
public class BatchConfig {
	@Autowired
	private  BookItemReader  reader;
	@Autowired
	private  BookItemWriter  writer;
	@Autowired
	private  EmployeeItemProcessor processor;
	@Autowired
	private  JobMonitoringListener  listener;
	
	@Bean(name="step1")
	public  Step createStep1(JobRepository  repository,PlatformTransactionManager  txMgmr) {
		return   new StepBuilder("step1",repository)
				       .<String,String>chunk(3,txMgmr)
				       .reader(reader)
				       .processor(processor)
				       .writer(writer)
				       .build();

	}
	
	@Bean(name="job1")
	public   Job  createJob1(Step  step1,JobRepository  repository) {
		return  new  JobBuilder("job1", repository)
				       .incrementer(new RunIdIncrementer())
				     .listener(listener)
				     .start(step1)
				     .build();
	}

}
