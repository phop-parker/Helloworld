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
public class Person {
    
    String name;
    byte age ;
    float weight ;
    float height ;

    public Person(String name22, byte age22, float weight22, float height22) {
        this.name = name22;
        this.age = age22;
        this.weight = weight22;
        this.height = height22;
    }
   
    public String getName(){
        return this.name;
    }  
}
