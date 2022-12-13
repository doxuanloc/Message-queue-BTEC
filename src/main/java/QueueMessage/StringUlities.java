/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueMessage;

/**
 *
 * @author PC
 */
public class StringUlities {
    public static int checkString(String value){
        if(value.equals("")) return 1;
        else if(value.length()>250) return 2;
        return 0;
}
}
