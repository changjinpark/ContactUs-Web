package com.myconpany.contactus.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.mycompany.contactus.vo.Contact;

@Component
public class ContactDaoImpl implements ContactDao {
	
private HashMap<String, Contact> dbMap;
	
	public ContactDaoImpl() {
		dbMap = new HashMap<String, Contact>();
	}
	
	@Override
	public void memberInsert(String fullName, String Email, String Phone, String Subject, String Message) {
				
		Contact member = new Contact();
		member.setfullName(fullName);
		member.setEmail(Email);
		member.setPhone(Phone);
		member.setSubject(Subject);
		member.setMessage(Message);
		
		dbMap.put(fullName, member);
		
		Set<String> keys = dbMap.keySet();
		Iterator<String> iterator = keys.iterator();
		
		while(iterator.hasNext()) {
			String key = (String) iterator.next();
			Contact mem = (Contact) dbMap.get(key);
			System.out.print("memberId:" + mem.getfullName() + "\t");
		}
	}

	
}
