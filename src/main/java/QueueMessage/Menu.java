/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueMessage;

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class Menu {
    
    public void menu() {
        System.out.println("1. Input message");
        System.out.println("2. Send message");
        System.out.println("3. Received message/ View message");
        System.out.println("0. Exit");
    }

    public void run() {
        QueueMessage queueMessage = new QueueMessage();
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            System.out.print("Choose: ");
            try {
                int choose = sc.nextInt();
            switch (choose) {
                case 1 -> queueMessage.inputMessage();
                case 2 -> queueMessage.sendMessage();
                case 3 -> queueMessage.viewMessage();
                case 0 -> System.out.println("Aduie");
                default -> {
                    }

            }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Please choose again: ");
                sc.nextLine();
            }
            
        }
    }
}

