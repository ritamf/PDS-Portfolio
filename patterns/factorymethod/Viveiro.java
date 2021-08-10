class Viveiro {
    public static Arvore factory(String pedido) {
        if (pedido.equalsIgnoreCase("Figueira")) {
            return new Figueira();
        }

        if (pedido.equalsIgnoreCase("Pessegueiro")) {
            return new Pessegueiro();
        }

        else
            throw new IllegalArgumentException(pedido + " não existente!");
    }

    // or with Java Reflection
    public static Arvore factory2(String pedido) {
        Arvore arv = null;
        try {
            arv = (Arvore) Class.forName("" + pedido).newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException(pedido + " nao existente !");
        }

        return arv;
    }

    public static void main(String[] args) {
        Arvore pomar[] = { Viveiro.factory2("Figueira"), Viveiro.factory2("Pessegueiro") };

        for (Arvore a : pomar)
            a.regar();

        for (Arvore a : pomar)
            a.colherFruta();
    }
}