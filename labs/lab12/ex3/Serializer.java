// package ex3;

import java.lang.reflect.Method;

public class Serializer {
    public static String fromObject(Object o) {

        Class cl = o.getClass();

        String result = "";

        // // Explore os metodos
        // Method[] methods = cl.getDeclaredMethods();
        // Field[] fields = cl.getDeclaredFields();

        // for (Method m : methods)
        //     System.out.println(m.getName());

        // for (Field f : fields)
        //     System.out.println(f);

        // Veja o javadoc das classes: Class, Method, Field, Modifier

        try {
            Method getNameMethodOfShip = cl.getMethod("getName");
            String nameValueOfShip = getNameMethodOfShip.invoke(o).toString();
            result += "Name: " + nameValueOfShip;

            // :ALTERNATIVA: 
            // Field name = c1.getDeclaredField("name");
            // name.setAccessible(true);
            // String fieldName = (String)name.get(o);

            Method getSizeMethodOfShip = cl.getMethod("getSize");
            Integer sizeValueOfShip = (Integer) getSizeMethodOfShip.invoke(o);
            result += "\nSize: " + sizeValueOfShip;

            Method getOwnerMethodOfShip = cl.getMethod("getOwner");
            Owner ownerValueOfShip = (Owner) getOwnerMethodOfShip.invoke(o);

            Method getNameMethodOfOwner = ownerValueOfShip.getClass().getMethod("getName");
            String nameValueOfOwner = getNameMethodOfOwner.invoke(ownerValueOfShip).toString();
            result += "\nOwner: {\nName: " + nameValueOfOwner + "\n}";

            Method getPassageirosMethodOfShip = cl.getMethod("getPassageiros");
            String[] passageirosValueOfShip = (String[]) getPassageirosMethodOfShip.invoke(o);
            result += "\nPassageiros: [";
            
            for (String passageiro : passageirosValueOfShip)
                if (passageiro!=null)
                    result += passageiro + ", ";
            
            result = result.substring(0, result.length() - 2); 
            result += "]";
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return result;
    }

    public static void main(String[] args) {
        Ship s = new Ship("BelaRia", 200);
        s.setOwner(new Owner("Manuel"));
        s.setPassageiros(new String[] { "Manuel", "Amilcar" });
        System.out.println(Serializer.fromObject(s));
    }

}
