package Patients;

/**
 * @author Propietario
 */

public class Patients {
    
    private String name, gender, direction;
    private int age;
    
    public Patients() {        
    }
    
    public Patients(String name, int age, String gender, String direction) {
        this.name = "";
        this.age = 0;
        this.gender = "";
        this.direction = "";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getDirection() {
        return direction;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }
}