package template;

abstract class Generalization {
    public void findSolution() {
        stepOne();
        stepTwo();
        stepThr();
        stepFor();
    }

    protected void stepOne() {
        System.out.println("Generalization.stepOne"); 
    }

    abstract protected void stepTwo();

    abstract protected void stepThr();

    protected void stepFor() {
        System.out.println("Generalization.stepFor"); 
    }
}
