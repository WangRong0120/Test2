package com.wr.test;

import java.util.ArrayList;

public class MainApp {
public static void main(String[] args) {
	Sup sup=new Sup();
	Sub sub=new Sub();
	
	
	//sub=sup;
	sup=(Sup)sub;
	
	String s1=new String("good");
	s1="test";
	System.out.println("s1==="+s1);
	
	String astr=" ?One? ";
	String bstr=astr;
	astr.toUpperCase();
	astr.trim();
	System.out.println("astr="+astr);
	System.out.println("bstr="+bstr);
	System.out.println(astr.toUpperCase());
	System.out.println(astr.trim());
	
	
	String foo="ABCDE";
	foo.substring(3);
	foo.concat("XYZ");
	System.out.println(foo);
	
	String a="";
	String b=null;
	System.out.println("a="+a);
	System.out.println("b="+b);
	
	ArrayList list=new ArrayList<>();
	System.out.println(list.contains(null));
	
	String str1="asd";
	System.out.println(str1=="asd");
}
}
