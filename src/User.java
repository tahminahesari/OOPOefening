public class User {
    //Dit zijn instance variables
    public int age;
    public String userName;
    private String password;
    public String hobby;
    public String email;

    // Dit is de constructor
    public User(int age, String userName, String password, String hobby, String email) {
        this.age = age;
        this.userName = userName;
        this.password = password;
        this.hobby = hobby;
        this.email = email;
    }

    //getters en setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //    public User(int age, String userName, String password, String hobby, String email) {
//        this.age = age;
//        this.userName = userName;
//        this.password = password;
//        this.hobby = hobby;
//        this.email = email;
//
//    }
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String newPassword ) {
//        this.password = newPassword;
//    }

}
