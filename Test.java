public class Test {
    public static void main(String[] args) {
        Mattoncino m1 = new Mattoncino(255, 0, 0, 10, 10, 20, 5);
        Mattoncino m2 = new Mattoncino(0, 255, 0, 8, 10, 10, 5);
        Mattoncino m3 = new Mattoncino(0, 0, 255, 12, 8, 16, 5);
        Mattoncino m4 = new Mattoncino(0, 255, 0, 10, 10, 20, 5);
        Mattoncino m5 = new Mattoncino(255, 0, 0, 10, 8, 10, 5);

        Prodotto p1 = new Prodotto("Dinosauro");
        Prodotto p2 = new Prodotto("Macchina");

        System.out.println("Mattoncini aggiungibili al prodotto " + p1.getNome());
        p1.aggiungiMattoncino(m2);
        p1.aggiungiMattoncino(m4);
        p1.aggiungiMattoncino(m5);
        System.out.println();

        System.out.println("Mattoncini aggiungibili al prodotto " + p2.getNome());
        p2.aggiungiMattoncino(m1);
        p2.aggiungiMattoncino(m3);
        p2.aggiungiMattoncino(m5);
        p2.aggiungiMattoncino(m2);
        p2.aggiungiMattoncino(m4);
        p2.aggiungiMattoncino(m5);
        p2.aggiungiMattoncino(m1);
        p2.aggiungiMattoncino(m2);
        System.out.println();

        System.out.println("Le caratteristiche di " + p1.getNome() + " sono: " + p1);
        System.out.println("Le caratteristiche di " + p2.getNome() + " sono: " + p2);
        System.out.println();

        System.out.println("Specifiche dettagliate dei " + p1.getCounter() + " prodotti sono: ");
        System.out.println("Numero totale di mattoncini in " + p1.getNome() + " è: " + p1.getNumeroMattoncini());
        System.out.println("Peso totale del prodotto " + p1.getNome() + " è: " + p1.getPesoTotale() + " g");
        System.out.println("Numero totale di mattoncini in " + p2.getNome() + " è: " + p2.getNumeroMattoncini());
        System.out.println("Peso totale del prodotto " + p2.getNome() + " è: " + p2.getPesoTotale() + " g");
        System.out.println();

        p1.stampaMattonciniColore(255, 0, 0);
        System.out.println();
        p2.stampaMattonciniColore(0, 255, 0);
        System.out.println();

        System.out.println("Numero di mattoncini con codice 0 nel prodotto " + p1.getNome() + " sono: " + p1.getNumeroMattonciniCodice(0));
        System.out.println("Numero di mattoncini con codice 0 nel prodotto " + p2.getNome() + " sono: " + p2.getNumeroMattonciniCodice(4));
    }
}
