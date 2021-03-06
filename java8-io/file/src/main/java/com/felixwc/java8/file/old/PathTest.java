package com.felixwc.java8.file.old;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest extends HelloWorld {
	@Override
	public void test() {
		// Path �� java.io.File ��������
		// ���path����һ,c:/temp/abc.txt
		Path path = FileSystems.getDefault().getPath("c:/temp", "abc.txt");
		System.out.println(path.getNameCount());

		// ���path����������File��toPath()�������Path����
		File file = new File("c:/temp/abc.txt");
		Path pathOther = file.toPath();
		// 0,˵��������path����ȵ�
		System.out.println(path.compareTo(pathOther));

		// ���path������
		Path path3 = Paths.get("c:/temp", "abc.txt");
		System.out.println(path3.toString());

		// �ϲ�����path
		Path path4 = Paths.get("c:/temp");
		System.out.println("path4: " + path4.resolve("abc.txt"));

		if (Files.isReadable(path)) {
			System.out.println("it is readable");
		} else {
			System.out.println("it is not readable");
		}
	}
}
