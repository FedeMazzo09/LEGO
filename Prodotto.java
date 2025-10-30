public class Prodotto {
    private int codice;
    private String nome;
    private Mattoncino[] mattonciniProduct;

    public Prodotto (int codice, String nome){
        this.codice=codice;
        this.nome=nome;
        mattonciniProduct = new Mattoncino[20];
    }

    public void aggingiMattoncino (){
        for (int i=0; i< mattonciniProduct.length; i++){
            mattonciniProduct[i] =
        }
    }
}