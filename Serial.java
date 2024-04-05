package SerializationDeSerialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) {
        try{
        Student s=new Student("jeeva","jeevakj3699@gamil.com",24,"pollachi");
        //write data to file
        FileOutputStream fos=new FileOutputStream("kj.txt");

            ObjectOutputStream oos=new ObjectOutputStream(fos);
            //Store serial
            oos.writeObject(s);
            oos.close();
            fos.close();
            System.out.println("Sucess");


    }catch (IOException e){
            e.printStackTrace();
        }

        }
}
