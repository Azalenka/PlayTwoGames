package Gamer;

public class User {
    private String name;

    public User(String name ){
        this.name= name;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
         if(name.equals("выход"))
             System.exit(0);
        else this.name = name;
    }


    public void showUserInfo(){
        System.out.println("Имя: " + name);
    }
}
