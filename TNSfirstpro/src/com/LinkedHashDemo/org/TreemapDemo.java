package com.LinkedHashDemo.org;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreemapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String,String> Pm=new TreeMap<String,String>();//Record display within curly braces in dictionory
		Pm.put("pratiksha@gmail.com", "Pratiksha Nikam");//email-key, Name-Value ..display output sorted based on key 
		Pm.put("sejal@gmail.com", "Sejal Jambhulkar");
		Pm.put("avantika@gmail.com", "Avantika junagade");
		
		System.out.println(Pm);
		System.out.println("-------------------------------------");
		Pm.put("pratiksha@gmail.com", "Pratiksha Rajendra Nikam");//it uses unique key if we add duplicate then it will replace with this
		
		System.out.println(Pm);
        Pm.put("pratikshaNikam@gmail.com", "Pratiksha Rajendra Nikam");
		
		System.out.println(Pm);//In tree map null not allow
		
		Set<String> emailIdset = Pm.keySet();
		System.out.println(emailIdset);
		
		Collection<String> name = Pm.values();
		System.out.println(name);
		System.out.println(Pm.get("pratiksha@gmail.com"));
		//System.out.println(Pm.get(""));
		//Entry interface is a interface which is nested in map interface
		
		Set<Map.Entry<String,String>> persons=Pm.entrySet();
		Iterator<Map.Entry<String, String>> p=persons.iterator();
		while(p.hasNext()) {
			Map.Entry<String, String> entry = p.next();
			System.out.println(entry);
			}
		
		
		
		
	}

}
