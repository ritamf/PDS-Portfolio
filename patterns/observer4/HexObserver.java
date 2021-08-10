class HexObserver extends Observer {
    public HexObserver(Subject s) {
      subj = s;
      subj.attach(this); // Observers register themselves
    }
    public void update() {
      System.out.println("HexObserver saw " +
        Integer.toHexString(subj.getState()));
    }
    // Observers "pull" information
  }