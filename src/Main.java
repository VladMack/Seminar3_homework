import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyLinkedList users = new MyLinkedList();
        users.add(new User(1, "1st"));
        users.add(new User(2, "2st"));
        users.add(new User(3, "3st"));

        for (Node node : users) {
            System.out.println(node.getUser());
        }
    }
}