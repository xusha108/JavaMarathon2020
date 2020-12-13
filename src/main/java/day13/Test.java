package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Nick");
        User user2 = new User("Kate");
        User user3 = new User("Bob");


        user1.sendMessage( user2, "Hi");
        user1.sendMessage( user2, "How are you?");

        user2.sendMessage( user1, "Hello");
        user2.sendMessage( user1, "Im fine");
        user2.sendMessage( user1, "Thank you!");

        user3.sendMessage( user1, "Hi my friend");
        user3.sendMessage( user1, "What about our job?");
        user3.sendMessage( user1, "Call me");

        user1.sendMessage( user3, "Hi");
        user1.sendMessage( user3, "Im busy today");
        user1.sendMessage( user3, "See you tomorrow");

        user3.sendMessage( user1, "ok");

        MessageDatabase.showDialog(user1, user3);

    }
}
