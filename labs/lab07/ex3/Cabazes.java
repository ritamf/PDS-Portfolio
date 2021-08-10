public class Cabazes {
    public static void main(String[] args) {
        Caixa principal = new Caixa("Principal", 4.0);
        Caixa top = new Caixa("Topo", 2.0);
        Caixa bot = new Caixa("Especialidades", 2.0);
        top.add(new Bebida("Vinho Reserva UA 2017", 6.0));
        top.add(new Bebida("Vinho Reserva UA 2018", 6.0));
        principal.add(top);
        principal.add(bot);
        bot.add(new Conserva("Atum à Algarvia", 3.0));
        bot.add(new Doce("Morango", 2.0));
        top.add(new Caixa("Interior", 1.0));
        top.add(new Conserva("Sardinhas em Azeite", 5.0));
        principal.draw();

    }
}