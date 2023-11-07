package org.example;

import org.example.services.PetStoreService;
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");

        ApplicationContext groovyContext = new GenericGroovyApplicationContext("services.groovy");

        GenericApplicationContext genericApplicationContext = new GenericApplicationContext();
        new XmlBeanDefinitionReader(genericApplicationContext).loadBeanDefinitions("services.xml", "daos.xml");
        new GroovyBeanDefinitionReader(genericApplicationContext).loadBeanDefinitions("services.groovy");
        genericApplicationContext.refresh();

        PetStoreService service = context.getBean("petStore", PetStoreService.class);

        List<String> userList = service.getUsernameList();


        System.out.println("Hello world!");
    }
}