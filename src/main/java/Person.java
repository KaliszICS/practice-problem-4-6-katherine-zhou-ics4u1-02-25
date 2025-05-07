public class Person{
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings = 0;
    private Person[] siblings;

    public Person(String firstName, String lastName, int birthDay, int birthMonth, int birthYear, String ssn){
        this.fistName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setFirstName(String firstName){
        this.firstName= firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getBirthday(){
        return this.birthDay + "/"+ this.birthMonth+"/" + this.birthYear;
    }

    public void addSiblings( Person siblings){
        Person[] newSiblings = this.siblings[];
        this.siblings = newSiblings;
        this.numberOfSiblings++;
    }

    public Person[] getSiblings(){
        return this.siblings;
    }

    

}