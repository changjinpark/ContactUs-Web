package com.myconpany.contactus.dao;

public interface ContactDao {
	void memberInsert(String fullName, String Email, String Phone, String Subject, String Message);
	
}
