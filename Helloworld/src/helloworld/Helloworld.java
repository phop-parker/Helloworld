/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author Student
 */
public class Helloworld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
    Person phop =  new Person("phop",(byte)18,52,170);
    Person ant  =  new Person("ant",(byte)19,40,170);
    
    String str=phop.getName();
        System.out.println(str);
    }
    
}
