package com.capg.demo.Practise;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.capg.demo.Practise.Trainee;
//import com.capg.demo.Practise.TrainerConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con=new AnnotationConfigApplicationContext(TrainerConfig.class);
        
        Trainee t1=(Trainee) con.getBean("trainee");
        t1.display();
    }
}
