package com.felixwc.java8.file.old;

public abstract class HelloWorld {

	public  static void main(String[] args) {
		System.out.println("Hello World");
		HelloWorld t=new SearchJPGFiles();
		try{
			t.test();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void test() throws Exception {
	}
}
