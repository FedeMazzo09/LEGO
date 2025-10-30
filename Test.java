public class Test {
    public static void main(String[] args) {
        Mattoncino m1 = new Mattoncino(255, 0, 0, 10, 10, 20, 5);
        Mattoncino m2 = new Mattoncino(0, 255, 0, 8, 10, 10, 5);
        Mattoncino m3 = new Mattoncino(0, 0, 255, 12, 8, 16, 5);
        Mattoncino m4 = new Mattoncino(255, 0, 0, 10, 10, 20, 5);

        Prodotto p = new Prodotto("Dinosauro");

        p.aggiungiMattoncino(m1);
        p.aggiungiMattoncino(m2);
        p.aggiungiMattoncino(m3);
        p.aggiungiMattoncino(m4);

        System.out.println(p);

        System.out.println("Numero totale di mattoncini: " + p.getNumeroMattoncini());
        System.out.println("Peso totale del prodotto: " + p.getPesoTotale() + " g");

        p.stampaMattonciniColore(255, 0, 0);

        System.out.println("Numero di mattoncini con codice 0: " + p.getNumeroMattonciniCodice(0));
    }
}
