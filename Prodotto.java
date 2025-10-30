public class Prodotto {
    private static int counter = 0;
    private int codice;
    private String nome;
    private Mattoncino[] mattonciniProduct;
    private int count;

    public Prodotto(String nome) {
        this.codice = counter++;
        this.nome = nome;
        this.mattonciniProduct = new Mattoncino[100];
        this.count = 0;
    }

    public void aggiungiMattoncino(Mattoncino m) {
        if (m == null) return;

        for (int i = 0; i < count; i++) {
            if (mattonciniProduct[i].equals(m)) {
                System.out.println("Il mattoncino è già presente");
                return;
            }
        }

        if (count < mattonciniProduct.length) {
            mattonciniProduct[count++] = m;
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
            tot = tot + mattonciniProduct[i].getPeso();
        }
        return tot;
    }

    public void stampaMattonciniColore(int r, int g, int b) {
        System.out.println("Mattoncini del colore (" + r + "," + g + "," + b + "):");
        for (int i = 0; i < count; i++) {
            Mattoncino m = mattonciniProduct[i];
            if (m.getRed() == r && m.getGreen() == g && m.getBlue() == b) {
                System.out.println(m);
            }
        }
    }

    public int getNumeroMattonciniCodice(int codiceMattoncino) {
        int n = 0;
        for (int i = 0; i < count; i++) {
            if (mattonciniProduct[i].getCodice() == codiceMattoncino) {
                n++;
            }
        }
        return n;
    }

    public String toString() {
        return "Prodotto LEGO [codice=" + codice + ", nome=" + nome + ", mattoncini=" + count + "]";
    }
}