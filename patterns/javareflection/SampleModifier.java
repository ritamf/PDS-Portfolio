package javareflection;

import java.util.Scanner;
import java.lang.reflect.Modifier;

public class SampleModifier {
    public static void main(String[] args) {
        printModifiers(new String());
        printModifiers(new Scanner(System.in));
        printModifiers(new SampleModifier());
    }

    public static void printModifiers(Object o) {
        Class<?> c = o.getClass();
        // returns the Class object of o
        System.out.print("***** Class " + c.getName() + " : ");
        int m = c.getModifiers();
        // return the class modifiers
        if (Modifier.isPublic(m))
            // checks if is public
            System.out.print("public ");
        if (Modifier.isAbstract(m))
            // checks if it is abstract
            System.out.print("abstract ");
        if (Modifier.isFinal(m))
            // checks if it is final
            System.out.print("final ");
        System.out.println();
    }
}