package javareflection2;

import java.lang.reflect.Constructor;

public class Reflection2 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        String s = "Scanner"; // por algum motivo o programa assume que aqui está escrito String

        Class<?> sc = s.getClass();
        System.out.println("********Construtores***********");
        Constructor<?> contrs[] = sc.getConstructors();
        
        for(Constructor<?> c: contrs)
            System.out.println(c);
    }
}