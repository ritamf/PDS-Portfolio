public interface Mediator {
    public void saleOffer(String stock, int shares, int colCode);
    public void buyOffer(String stock, int shares, int colCode);
    public void addColleague(Colleague colleague);
}
