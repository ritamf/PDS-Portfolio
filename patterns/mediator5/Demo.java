import java.util.HashMap;

public class Demo {

    private static BikeMediator bikeMediator;

    private static HashMap<String, User> users;
    private static User user;

    public static void main(String[] args) {

        int numAllBikes = 10;
        createBikeMediator(numAllBikes);

        int numUsers = 11;
        createUsers(numUsers);

        testMediatorPattern();

    }

    private static void createBikeMediator(int numAllBikes) {
        bikeMediator = new BikeMediator(numAllBikes);
    }

    private static void createUsers(int numUsers) {
        users = new HashMap<>(); 
        for (int userID=1; userID <= numUsers; userID++) {
            user = new User(userID, bikeMediator);
            users.put(user.getUserID(), user);
        }
    }

    private static void testMediatorPattern() {

        System.out.println("Number of bikes in the park: " + bikeMediator.getNumBikes());

        for (int userID = 1; userID < users.size(); userID++)
            users.get("user"+userID).rent();

        System.out.println("\nNumber of bikes in the park: " + bikeMediator.getNumBikes());
        users.get("user1").rent();

        System.out.println();
        users.get("user1").deliver();
        users.get("user2").deliver();
        System.out.println("Number of bikes in the park: " + bikeMediator.getNumBikes());

        System.out.println();
        users.get("user3").deliver();
        System.out.println("Number of bikes in the park: " + bikeMediator.getNumBikes());
        users.get("user3").deliver();

        System.out.println();
        users.get("user3").rent();
        users.get("user3").rent();
        users.get("user3").deliver();
        System.out.println("Number of bikes in the park: " + bikeMediator.getNumBikes());

    }

}
