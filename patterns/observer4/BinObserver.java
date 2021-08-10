class BinObserver extends Observer {
    public BinObserver(Subject s) {
        subj = s;
        subj.attach(this);
    }
    
    public void update() {
        System.out.println("BinObserver saw " + Integer.toBinaryString(subj.getState()));
    } 
}