package hackerrank.dataStructures;

import java.util.Scanner;
import java.io.IOException;
import java.lang.reflect.Method;

public class JavaGenerics {
    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }


}

class Printer{
    public <E> void printArray(E[] arr){
        for (E anArr : arr) {
            System.out.println(anArr);
        }
    }
}
