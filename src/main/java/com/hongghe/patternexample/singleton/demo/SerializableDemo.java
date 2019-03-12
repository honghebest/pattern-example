package com.hongghe.patternexample.singleton.demo;

import java.io.*;

/**
 * @author: hongghe @date: 2019-03-12 11:48
 */
public class SerializableDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Write Obj to file
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
        oos.writeObject(DoubleLockSerializableSingleton.getInstance());

        //Read Obj from file
        File file = new File("tempFile");
        ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(file));

        DoubleLockSerializableSingleton newInstance = (DoubleLockSerializableSingleton) ois.readObject();
        //判断是否是同一个对象
        System.out.println(newInstance == DoubleLockSerializableSingleton.getInstance());
    }
}
