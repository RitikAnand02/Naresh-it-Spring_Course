package com.nt.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nt.listener.JobMonitoringListener;
import com.nt.processor.BookItemProcessor;
import com.nt.reader.BookItemReader;
import com.nt.writer.BookItemWriter;

@Configuration
@EnableBatchProcessing
public class BatchConfig {
	@Autowired
	private JobBuilderFactory  jbFactory;
	@Autowired
	private  StepBuilderFactory  stpFactory;
	@Autowired
	private  BookItemReader  reader;
	@Autowired
	private  BookItemWriter  writer;
	@Autowired
	private  BookItemProcessor processor;
	@Autowired
	private  JobMonitoringListener  listener;
	
	@Bean(name="step1")
	public  Step createStep1() {
		return   stpFactory.get("step1")
				       .<String,String>chunk(2)
				       .reader(reader)
				       .processor(processor)
				       .writer(writer)
				       .build();

	}
	
	@Bean(name="job1")
	public   Job  createJob1() {
		return  jbFactory.get("job1")
				     .incrementer(new RunIdIncrementer())
				     .listener(listener)
				     .start(createStep1())
				     .build();
	}

}
