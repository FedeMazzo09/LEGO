public class Prodotto {
    private static int counter = 0;
    private int codice;
    private String nome;
    private Mattoncino[] mattoncini;
    private int count;

    public Prodotto(String nome) {
        this.codice = counter++;
        this.nome = nome;
        this.mattoncini = new Mattoncino[100];
        this.count = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getCounter() {
        return counter;
    }

    public void aggiungiMattoncino(Mattoncino m) {
        if (m == null) return;

        if (count < mattoncini.length) {
            mattoncini[count++] = m;
            System.out.println("Il mattoncino è stato aggiunto al prodotto " + nome);
        } else {
            System.out.println("Limite massimo di mattoncini raggiunto");
        }
    }

    public int getNumeroMattoncini() {
        return count;
    }

    public int getPesoTotale() {
        int tot = 0;
        for (int i = 0; i < count; i++) {
            tot = tot + mattoncini[i].getPeso();
        }
        return tot;
    }

    public void stampaMattonciniColore(int r, int g, int b) {
        System.out.println("Mattoncini del colore (" + r + "," + g + "," + b + ") del prodotto " + nome + " sono:");
        for (int i = 0; i < count; i++) {
            Mattoncino m = mattoncini[i];
            if (m.getRed() == r && m.getGreen() == g && m.getBlue() == b) {
                System.out.println(m);
            }
        }
    }

    public int getNumeroMattonciniCodice(int codiceMattoncino) {
        int n = 0;
        for (int i = 0; i < count; i++) {
            if (mattoncini[i].getCodice() == codiceMattoncino) {
                n++;
            }
        }
        return n;
    }

    public String toString() {
        return "Prodotto LEGO [codice=" + codice + ", nome=" + nome + ", mattoncini=" + count + "]";
    }
}