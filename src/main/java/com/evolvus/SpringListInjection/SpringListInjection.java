package com.evolvus.SpringListInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringListInjection{
    public static void main(String[] args) {
     ApplicationContext context=new ClassPathXmlApplicationContext("listbean.xml");
     Passinglisttospring pass=context.getBean(Passinglisttospring.class);
     pass.display();
    }
}
