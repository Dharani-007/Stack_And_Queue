import java.util.LinkedList;
import java.util.Scanner;

public class StackAndQueue {
    public static void main(String[] args) {

        System.out.println("Welcome to Stacks and Queues Problems using Linked List .");

        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> linkedList = new LinkedList<>();

        int choice;
        do {
            System.out.println("STACK & QUEUE OPERATIONS");
            System.out.println("1. PUSH in STACK \n2. POP from STACK \n3. DISPLAY STACK \n4. ENQUEUE in QUEUE \n5. DEQUEUE in QUEUE \n6. DISPLAY QUEUE \n7. EXIT \nEnter the Choice for Operation : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the Data to Push in Stack : ");
                    linkedList.addFirst(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Popped Element: " + linkedList.pop());
                    break;
                case 3:
                    System.out.println(linkedList.toString());
                    break;
                case 4:
                    System.out.println("Enter the Data to Enqueue in Queue : ");
                    linkedList.addLast(sc.nextInt());
                    break;
                case 5:
                    System.out.println("Dequeued Element: " + linkedList.removeFirst());
                    break;
                case 6:
                    System.out.println(linkedList.toString());
                    break;
            }
        }
        while(choice != 7);
    }
}