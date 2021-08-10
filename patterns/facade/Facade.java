public class Facade {

    private SubSystemA subSystemA;
    private SubSystemB subSystemB;
    private SubSystemC subSystemC;


    public Facade() {
        this.subSystemA = new SubSystemA();
        this.subSystemB = new SubSystemB();
        this.subSystemC = new SubSystemC();
    }

    public String create() {
        String result = this.subSystemA.method();
        result += this.subSystemB.method();
        result += this.subSystemC.method();

        return result;
    }

    public static void main(String[] args ) {
        Facade f = new Facade();
        String result = f.create();

        System.out.println("Result -> " + result);
    }
}
