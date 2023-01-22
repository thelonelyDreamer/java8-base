package org.example.loader;

import java.io.*;

/**
 * in order to learn java!
 * created at 2022/11/14 18:30
 *
 * @author felixwc
 */
public class CustomClassLoader extends ClassLoader {

    String path;

    public CustomClassLoader(String dir) {
        this.path = dir;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            this.path = this.path + name + ".class";
            File f = new File(path);
            InputStream in = new FileInputStream(f);
            byte[] bys = new byte[(int) f.length()];
            int len = 0;
            while ((len = in.read(bys)) != -1) {

            }
            // byte[] -> .class
            return defineClass("org.example.pojo.Person",bys, 0, bys.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.findClass(name);
    }
}

