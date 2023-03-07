public abstract class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private String birthday;
    
   
    // constructor
    public Person(String first, String last, String bday) {
        this.firstName = first;
        this.lastName = last;
        this.birthday = bday;
    }
    
    // to string
    @Override
    public String toString(){
        return this.firstName + " " + this.lastName;
    }




    //sorts by last name first, then first name if last names are the same
    @Override
    public int compareTo(Person person){
        if(person.getLastName().compareTo(this.lastName) == 0){
            return this.firstName.compareTo(person.getFirstName());
        }
        else {
            return this.lastName.compareTo(person.getLastName());
        }
    }




    //getters and setters
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getBirthday(){
        return this.birthday;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }


    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    
 }


