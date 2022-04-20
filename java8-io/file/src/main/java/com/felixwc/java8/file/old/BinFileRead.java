package com.felixwc.java8.file.old;

import java.io.*;
public class BinFileRead{
  public static void main(String[] args) throws Exception{
	  readFile();
  }
  public static void readFile() {
		//try-resource ��䣬�Զ��ر���Դ
		try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("F:\\Code\\Java\\temp\\def.dat")))) {
			String a, b;
		    int c, d;
		    a=dis.readUTF();
		    c=dis.readInt();
		    d=dis.readInt();
		    b=dis.readUTF();
		    System.out.println("a: "+a);
		    System.out.println("c: "+c);
		    System.out.println("d: "+d);
		    System.out.println("b: "+b);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
