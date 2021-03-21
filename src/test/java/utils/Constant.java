package utils;

public class Constant {
    static String url;
    private static String userName, password;

    public void setUserName(){
        userName = "ashik";
    }
    public void setPassword(){
        password = "Ashik@123";
    }
    public static String getUserName() {
        return userName;
    }
    public static String getPassword() {
        return password;
    }

    public void setURL(){
        url = "https://parabank.parasoft.com/parabank/index.htm";
    }
    public static String getURL(){
        return url;
    }
}
