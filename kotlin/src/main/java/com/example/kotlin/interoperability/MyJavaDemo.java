package com.example.kotlin.interoperability;

/**
 * Created by Deepak Rattan on 12/5/20.
 * 1. Accessing kotlin Function form Java file
 * 2. Accessing Default functions from Java file
 */
public class MyJavaDemo {
    public static void main(String[] args) {
        //Accessing Kotlin code from java
        //MyKotlinDemoKt.showKotlin();
        MyCustomKotlin.showKotlin();
        // We can not access the default functions of any Kotlin file
        // from Java file as Java doesn't support default functions
        // To access default functions of kotlin file from the Java file
        // we need to use @JvmOverloads annotation for the function which we want
        // to be accessed by java file
        // area() function is defined with @JvmOverloads annotation in Kotlin file

        MyCustomKotlin.area(10);
    }
    public static void showJava(){
        System.out.println("Java code");
    }
}
