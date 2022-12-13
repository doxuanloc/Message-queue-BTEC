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
public class QueueMessage {
    private Stack stack;
    private Queue queue;
    private Scanner sc;
    public QueueMessage(){
        stack= new Stack();
        queue= new Queue();
        sc = new Scanner(System.in);
    }
    public void inputMessage(){
        while (true){
            System.out.println("Input message: ");
            String message = sc.nextLine();
            if(StringUlities.checkString(message)==1) System.out.println("Message is empty!");
            else if(StringUlities.checkString(message)==2) System.out.println("Length message > 250!");
            else {
                queue.enqueue(message);
                break;
            }
        }
    }
    public void sendMessage(){
        while(!queue.isEmpty()){
            String message = queue.dequeue();
            stack.push(message);
        }
        System.out.println("Send successfully");
    }
    public void viewMessage(){
        System.out.println("-----------------------------------");
        System.out.println("Received message/View message");
        System.out.println("-----------------------------------");
        while (!stack.isEmpty()){
            String message = stack.pop();
            System.out.println(message);
        }
        System.out.println("-----------------------------------");
    }
}
