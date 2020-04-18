package com.capg.demo.lab1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Employee e;
        SBU sbu;
        ApplicationContext c=new AnnotationConfigApplicationContext(EmployeeConfig.class);
        sbu=(SBU)c.getBean("sbu");
        e=(Employee)c.getBean("employee");
        System.out.println("Employee details:");
        System.out.println("Employee id: "+e.employeeId);
        System.out.println("Employee name: "+e.employeeName);
        System.out.println("Employee salary: "+e.salary);
        System.out.println("Employee bu: "+e.getSbuDetails());
        System.out.println("Employee age: "+e.age);
        System.out.println(e);
        System.out.println("SBU Details:");
        System.out.println(sbu);

    	}
    }

