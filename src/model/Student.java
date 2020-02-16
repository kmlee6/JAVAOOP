package model;

public class Student {
    private String name;
    private int age;
    private String gender;
    private int id;

    public Student(String name, int age, String gender, int id) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setID(id);
    }

    protected void setName(String name){
        this.name = name;
    }

    protected void setAge(int age){
        this.age = age;
    }

    protected void setGender(String gender){
        this.gender = gender;
    }

    protected void setID(int id){
        this.id = id;
    }

    protected String getName(){
        return this.name;
    }

    protected int getAge(){
        return this.age;
    }

    protected String getGender(){
        return this.gender;
    }

    protected int getID(){
        return this.id;
    }


    public String toString(){
        String student_info = "Name: " + this.getName()
                            + "\nAge: " + this.getAge()
                            + "\nGender: " + this.getGender()
                            + "\nID: " + this.getID();
        return student_info;
    }
}
