package template;

abstract class Specialization extends Generalization {
    protected void stepThr() {
        step3_1();
        step3_2();
        step3_3();
    }

    protected void step3_1() {
        System.out.println("Specialization step3_1");
    }

    abstract protected void step3_2();

    protected void step3_3() {
        System.out.println("Specialization.step3_3");
    }
}