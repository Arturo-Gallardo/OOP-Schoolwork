public class User {
    private String username;
    private double passwd;
    private String mail;

    //builder
    public User(String username, double passwd, String mail) {
        this.username = username;
        this.passwd = passwd;
        this.mail = mail;
    }

    public String getUsername(){
        return this.username;
    }
    public double getPasswd(){
        return this.passwd;
    }
    public String getMail(){
        return this.mail;
    }

    public void setUsername(String username){

    }


    // username passwd email metodo para q te muestre la info
}
