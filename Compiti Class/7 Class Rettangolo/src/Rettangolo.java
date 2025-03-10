

/**
*Class Rettangolo viene usato per calcolare il perimetro, l'area, il diagonale del rettangolo
*
* @author Huynh Anh Nguyen
* @version 10.03.2025
* */

public class Rettangolo {
    private int latoMaggiore;
    private int latoMinore;


    public Rettangolo(int latoMaggiore, int latoMinore) {
        if ((latoMaggiore > latoMinore)&&((latoMaggiore!=0)&&(latoMinore!=0))) {
            this.latoMaggiore = latoMaggiore;
            this.latoMinore = latoMinore;
        }
        else {System.out.println("Invalide values");}
    }

    public int getLatoMaggiore() {
        return latoMaggiore;
    }

    public void setLatoMaggiore(int latoMaggiore) {
        this.latoMaggiore = latoMaggiore;
    }

    public int getLatoMinore() {
        return latoMinore;
    }

    public void setLatoMinore(int latoMinore) {
        this.latoMinore = latoMinore;
    }

    /**
    * Calcola l'area
    *
    * @return la motiplica dell'operazione
    * */
    public int getArea(){
        return latoMaggiore*latoMinore;
    }
    /**
     * Calcola il perimetro
     *
     * @return il perimetro del rettangolo
     * */
    public int getPerimter(){
        return 4*(latoMaggiore+latoMinore);
    }
    /**
     * Calcola il diagonale
     *
     * @return la lunghezza del rettangolo
     * */
    public int getDiagonal(){
        return (int)Math.sqrt((latoMaggiore*latoMaggiore+latoMinore*latoMinore));
    }

    @Override
    public String toString() {
        return "Dimensione:" + latoMaggiore+"x"+latoMinore;
    }
}
