public class Contact extends Person {


    private String company;
    private String phone;
    private String email;
    private String address;
    private boolean isFavorite;
    private boolean isBlocked;
    private boolean isEmergency;




    //constructor
    public Contact(String first, String last, String bday, String company, String phone, String email, String address, boolean fav, boolean block, boolean emergency) {
        super(first, last, bday);
        this.company = company;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.isFavorite = fav;
        this.isBlocked = block;
        this.isEmergency = emergency;
    }
    
    //print contact info
    public void printInfo() {
        System.out.println(this.getFirstName() + " " + this.getLastName());
        System.out.println("Birthday: " + this.getBirthday());
        System.out.println("Company: " + this.company);
        System.out.println("Phone #: " + this.phone);
        System.out.println("Email: " + this.email);
        System.out.println("Address: " + this.address);
        
        if (isFavorite) {
            System.out.println("* FAVORITE CONTACT");
        }
        if (isBlocked) {
            System.out.println("* BLOCKED CONTACT");
        }
        if (isEmergency) {
            System.out.println("* EMERGENCY CONTACT");
        }
    }


    //getters and setters
    public String getCompany(){
        return this.company;
    }
    public String getPhone(){
        return this.phone;
    }
    public String getEmail(){
        return this.email;
    }
    public String getAddress() {
        return this.address;
    }
    public boolean getIsFavorite(){
        return this.isFavorite;
    }
    public boolean getIsBlocked(){
        return this.isBlocked;
    }
    public boolean getIsEmergency(){
        return this.isEmergency;
    }
    
    public void setCompany(String company){
        this.company = company;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setIsFavorite(boolean favorite){
        this.isFavorite = favorite;
    }
    public void setIsBlocked(boolean blocked){
        this.isBlocked = blocked;
    }
    public void setIsEmergency(boolean emergency){
        this.isEmergency = emergency;
    }




 }


