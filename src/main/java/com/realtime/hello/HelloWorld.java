
package com.realtime.hello;

public class HelloWorld {
    public static void main (String[] args){
        HelloWorld hw = new HelloWorld();
        String display = hw.sayHello("Siang Yee");
        System.out.println(display);
    }
    
    public String sayHello(String name){
        String helloUser = "Hello " +name;
        return helloUser;
    }
    
}
