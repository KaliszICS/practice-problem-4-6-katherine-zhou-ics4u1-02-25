public class Person{
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings = 0;
    private Person[] siblings = new Person[0];

    public Person(String firstName, String lastName, int birthDay, int birthMonth, int birthYear, String ssn){
        this.firstName = firstName;
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

    public void addSibling (Person sibling){
        Person[] newSiblings = new Person[this.numberOfSiblings + 1];
        for (int i = 0; i<this.numberOfSiblings; i++){
            newSiblings[i]=this.siblings[i];
        }
        
        newSiblings[this.numberOfSiblings] = sibling;
        this.siblings = newSiblings;
        this.numberOfSiblings++;

    }

    public Person[] getSiblings(){
        return this.siblings;
    }

    

}