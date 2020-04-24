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
public class Student {
    String name;
    int id;
    static String uni_name = "Canadian University of Bangladesh";
    
    Student(String n, int i){
        name = n;
        id = i;
        //uni_name = u;
    }
    
    void display(){
        System.out.println("Nane: "+name +"\nId: "+id +"\nUniversity: "+uni_name);
    }
}
