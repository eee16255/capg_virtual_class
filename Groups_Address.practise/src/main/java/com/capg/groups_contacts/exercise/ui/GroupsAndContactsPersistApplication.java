package com.capg.groups_contacts.exercise.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.capg.groups_contacts.exercise.models.Contact;
import com.capg.groups_contacts.exercise.models.Group;
import com.capg.groups_contacts.exercise.util.JPAUtil;


public class GroupsAndContactsPersistApplication {

	public static void main(String[] args) {
	    
		Group family  = new Group("FAMILY" ,"This group belongs to Family" ,new  TreeSet<Contact>());
		Group school  = new Group("SCHOOL" ,"This group belongs to School" ,new  TreeSet<Contact>());
		Group college = new Group("COLLEGE","This group belongs to College" ,new TreeSet<Contact>());
		
		
		family.getContact().add(new Contact("chitti","jitta",9876543210L,"chitti@gmail.com","09/03/1996","HNO : 23-97,sangaredddy ","Hyderabad ,Telangana",family));
		family.getContact().add(new Contact("kittu","d" ,1234567890L ,"kittu@gmail.com" ,"07/07/1998" ," HNO : 23-97,sangaredddy","Hyderabad , Telangana",family));
		family.getContact().add(new Contact("prathyu","abc" ,9876543211L ,"prathyu@gmail.com","07/07/1998" ," HNO : 23-97,sangaredddy","Hyderabad , Telangana",family));
		
		school.getContact().add(new Contact("prameela","moka" ,1234567891L ,"prameela@gmail.com","28/12/1998" ," HNO : 23-97,sangaredddy","Hyderabad , Telangana",school));
		school.getContact().add(new Contact("sirisha","n" ,9876543212L ,"sirisha@bvrit.ac.in","16/12/1998" ," HNO : 23-97,sangaredddy","Hyderabad ,Telangana",school)); 
		school.getContact().add(new Contact("ashu","methari" ,1234567893L ,"ashu@gmail.com","06/03/1999" ," HNO : 23-97,sangaredddy","Hyderabad ,Telangana",school));
        
        college.getContact().add(new Contact("rebeca","kanugula" ,9876543213L ,"16211a0255@bvrit.ac.in","16/04/1999" ," HNO : 23-97,sangaredddy","Hyderabad , Telangana",college));
        college.getContact().add(new Contact("shailu" ,"ameti" ,1234567894L ,"16211a0238@bvrit.ac.in","07/07/1998" ," HNO : 23-97,sangaredddy","Hyderabad , Telangana",college));
        
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(family);
		em.persist(college);
		em.persist(school);
		em.getTransaction().commit();
		System.out.println("Saved");
		JPAUtil.shutdown();
	}
    
}
