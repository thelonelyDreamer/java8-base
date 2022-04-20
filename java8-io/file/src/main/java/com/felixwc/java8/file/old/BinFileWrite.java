package com.felixwc.java8.file.old;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
public class BinFileWrite{
  public static void main(String[] args) throws Exception{
	writeFile();
    System.out.println("done.");
  }
  
  public static void writeFile() {
	  FileOutputStream fos = null;
	  DataOutputStream dos = null;
	  BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream("F:\\Code\\Java\\temp\\def.dat"); // �ڵ���
			bos = new BufferedOutputStream(fos); // װ����
			dos = new DataOutputStream(bos); // װ����		
			
			dos.writeUTF("a");
			dos.writeInt(20);
			dos.writeInt(180);
			dos.writeUTF("b");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				dos.close(); // �ر����һ���࣬�Ὣ���еĵײ������ر�
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
