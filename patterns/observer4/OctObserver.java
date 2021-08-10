class OctObserver extends Observer {
    public OctObserver(Subject s) {
        subj = s;
        subj.attach(this);
    }
    
    public void update() {
        System.out.println("OctObserver saw "
        + Integer.toOctalString(subj.getState()));
    } 
}