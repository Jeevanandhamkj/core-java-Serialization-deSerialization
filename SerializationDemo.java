package SerializationDeSerialization;

import java.io.FileOutputStream;
import java.io.Serializable;


class Student implements Serializable {
    private static final long serialVersionUID = -3835218372770796890L;

    private String name;
   transient private String email; //not showing in console
    private int age;
    private String address;

    public Student() {
    }

    public Student(String name, String email, int age, String address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
    }


   public void jee(){
        System.out.println("name:"+getName()+"Age:"+getAge()+"Email:"+getEmail()+"Address:"+getAddress());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}