/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author 91936
 */
import java.util.ArrayList;


public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<String>();
        list.add("javafx");
        list.add("java");
        list.add("opencv");
        list.add("openNLp");
        list.add("java script");
        System.out.println(list);
        System.out.println("searched element is");
        for(String element:list)
        {
            
            if(element.startsWith("j")&& element.endsWith("x"))
                
            {
              System.out.println(element);  
            }
        }
        
        
       
       
        
        // TODO code application logic here
    }
    
}
