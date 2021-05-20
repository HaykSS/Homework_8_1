package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private String sex;
    private String nationality;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.length() >= 3 && firstName.length() <= 15){
            this.firstName = firstName;
        }else{
            System.out.println("Your name is awkward");
        }

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.length() >= 6 && lastName.length() <= 20){
            this.lastName = lastName;
        }else{
            System.out.println("Your last name is shit!!!");
        }
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        boolean allInt = false;
        if(passportId.charAt(0) == 'A' && passportId.charAt(1) == 'N' && passportId.length() <= 8){

            for(int i = 2; i < passportId.length(); i ++){
                if(Character.isDigit(passportId.charAt(i))){
                    allInt = true;

                }
            }
        }
        if(allInt){
            this.passportId = passportId;
        }else {
            System.out.println("Invalid password inputs");
        }


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 18 && age <= 99) {
            this.age = age;
        }else{
            System.out.println("Your age is not valid");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if(sex.equalsIgnoreCase("male") || sex.equalsIgnoreCase("female")){
            this.sex = sex;
        }else {
            System.out.println("Invalid sex entry");
        }
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Person() {
    }

    public Person(String firstName, String lastName, String passportId, int age, String sex, String nationality) {
        setFirstName(firstName);
        setLastName(lastName);
        setPassportId(passportId);
        setAge(age);
        setSex(sex);
        setNationality(nationality);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passportId='" + passportId + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public void display(){
        System.out.println(toString());

    }
}
