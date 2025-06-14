package com.nt.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.MongoItemWriter;
import org.springframework.batch.item.data.builder.MongoItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.transaction.PlatformTransactionManager;

import com.nt.listener.JobMonitoringListener;
import com.nt.model.ExamResult;
import com.nt.processor.ExamResultItemProcessor;

@Configuration
public class BatchConfig {
	@Autowired
	private  JobMonitoringListener  listener;
	@Autowired
	private  ExamResultItemProcessor  processor;
	@Autowired
	private   DataSource ds;
	
	@Bean(name="reader")
	public  FlatFileItemReader<ExamResult>   createReader(){
		return new FlatFileItemReaderBuilder<ExamResult>()
				               .name("file-reader")
				               .resource(new ClassPathResource("TopBrains.csv"))
				               .delimited()
				               .names("id","dob","semester","percentage")
				               .targetType(ExamResult.class)
				               .build();
	}
	
	@Autowired
	private  MongoTemplate  template;
	
	@Bean(name="writer")
	public   MongoItemWriter<ExamResult>  createWirter(){
		    return   new MongoItemWriterBuilder<ExamResult>()
		    		       .collection("SuperBrains")
		    		       .template(template)
		    		       .build();
		    		       
		    		       
		    		       
		    		        
		    		        
			}
	
	@Bean(name="step1")
	public  Step createStep1(JobRepository  repository,PlatformTransactionManager  txMgmr) {
		return   new StepBuilder("step1",repository)
				       .<ExamResult,ExamResult>chunk(1,txMgmr)
				       .reader(createReader())
				       .processor(processor)
				       .writer(createWirter())
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
