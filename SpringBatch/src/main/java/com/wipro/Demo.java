package com.wipro;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException {

ApplicationContext ctx = new ClassPathXmlApplicationContext("com/wipro/bean.xml");
System.out.println("hellooo");
Job myjob = (Job) ctx.getBean("myjob");
JobLauncher launcher = (JobLauncher) ctx.getBean("jobLauncher");
launcher.run(myjob, new JobParameters());

	}

}
