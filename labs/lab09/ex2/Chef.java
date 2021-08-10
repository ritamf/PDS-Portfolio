public abstract class Chef {
    private Chef nextHandler = null;

    public void handle(String request) {
        if (nextHandler != null)
            nextHandler.handle(request);
        else
            System.out.println("We're sorry but that request can't be satisfied by our service!");
    }

    protected boolean canHandleRequest(String request, String keyword) {
        return (request == null) || (request.contains(keyword));
    }

    public Chef setNextHandler(Chef nextHandler) {
        this.nextHandler = nextHandler;
        return this;
    }

}
