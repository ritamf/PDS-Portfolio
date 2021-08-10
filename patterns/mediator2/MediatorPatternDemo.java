public class MediatorPatternDemo {
    public static void main(String[] args) {
       User robert = new User("Robert");
       User john = new User("John");
 
       robert.sendMessage("Hi, @" + john.getName() + "!");
       john.sendMessage("Hello, @" + robert.getName() + "!");
    }
 }