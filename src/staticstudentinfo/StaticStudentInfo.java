/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticstudentinfo;

/**
 *
 * @author Spy Hacker
 */
public class StaticStudentInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student myObj = new Student("Imran", 19104036);
       myObj.display();
       System.out.println(myObj.uni_name);
    }
    
}
