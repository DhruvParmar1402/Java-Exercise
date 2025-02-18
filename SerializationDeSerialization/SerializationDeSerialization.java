package org.SerializationDeSerialization;

import java.io.*;

class data implements Serializable
{
    int RollNo;
    String Name;
    String City;

    @Override
    public String toString() {
        return "data{" +
                "RollNo=" + RollNo +
                ", Name='" + Name + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
}

public class SerializationDeSerialization {
    public static void main(String[] args) {
        data data1=new data();
        data1.RollNo=10;
        data1.City="Junagadh";
        data1.Name="Dhruv Parmar";
        try
        {

            File f=new File("data.ser");
            FileOutputStream fis=new FileOutputStream(f);
            ObjectOutputStream objstr=new ObjectOutputStream(fis);

            objstr.writeObject(data1);

            objstr.close();
            fis.close();
            System.out.println("Done");
        }
        catch (Exception e)
        {
            System.out.println("Error while writing the file");
        }

        try{
            FileInputStream fis=new FileInputStream("data.ser");
            ObjectInput obs=new ObjectInputStream(fis);

            data dta=(data)obs.readObject();
            System.out.println(dta);
        }
        catch (Exception e)
        {
            System.out.println("Error while reading."+ e);
        }
    }
}
