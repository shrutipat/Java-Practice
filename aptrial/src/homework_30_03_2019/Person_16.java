package homework_30_03_2019;

public class Person_16 {

    String firstname, lastname, fullName;
    int age;

    public static void main(String[] args) {

        /**
         * This is correct only Declaration of variable follow java naming convention
         * Bellow is my solution for this programme. Just for your knowledge.
         */


        Person_16 person = new Person_16();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

    }

    public void setFirstName(String str){
        firstname = str;
           }

    public void setLastName(String str2){
        lastname = str2;
    }

    public void setAge(int i) {
        if (i < 0 || i > 100) {
            age = 0;
        } else {
            age = i;
        }
    }

    public String getFirstName(){

        return(firstname);
    }

    public String getLastName(){
        return(lastname);
    }

    public boolean isTeen(){
        if(age>12&&age<20){
            return true;
        }
        else {
            return false;
        }
    }

    public String getFullName(){


        if(firstname==""&&lastname=="") {
            fullName="";
        }
        else if (firstname.isEmpty()){
            System.out.println(lastname);
        }
        else if (lastname.isEmpty()){
            System.out.println(firstname);
        }
        else{
            fullName = firstname.concat(firstname.concat(" "));
        }
        return fullName;

    }

     /*
    * private String firstName;
    private String lastName;
    private int age;
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }

    private String getFirstName(){
        return firstName;
    }

    private String getLastName(){
        return lastName;
    }

    private int getAge(){
        return age;
    }

    private void setFirstName(String firstName){
        this.firstName = firstName;

    }

    private String getFullName(){
        if (firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }else if (firstName.isEmpty()){
            return getLastName();
        }else if (lastName.isEmpty()){
            return getFirstName();
        }else {
            return firstName+ " " +lastName;
        }
    }

    private void setLastName(String lastName){
        this.lastName = lastName;
    }

    private void setAge(int age){
        if (age > 100 || age < 0){
            this.age =0;
        }else {
            this.age = age;
        }
    }

    private boolean isTeen(){
        return getAge() > 12 && getAge() < 20;
    }*/



}
