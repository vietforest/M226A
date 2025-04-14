public class Program {
    public static void main(String[] args) {
        /**
         * Content:Creare un magazzino che mostra gli articoli
         * @authur huynh anh nguye
         * @version 14.04.2025
         * */

        try {
            Produttore produttore1 =  new Produttore("Banana Repulic", "via something 12364");
            Articolo articolo1 =  new Articolo("Banana", produttore1, 2000, "sadas", 10);
            Articolo articolo2 =  new Articolo("Racchetta", produttore1, 2000, "sadas", 10);
            Articolo articolo3 =  new Articolo("Something", produttore1, 2000, "sadas", 10);
            Magazzino magazzino1 = new Magazzino();
            magazzino1.addArticolo(articolo1);
            magazzino1.addArticolo(articolo2);
            magazzino1.addArticolo(articolo3);
            magazzino1.removeArticolo(articolo3);
            System.out.println(magazzino1.getArticoloList());
            magazzino1.ricercaIdentificatore("BB2000");
            magazzino1.modificareQuantitta(articolo2, 10);
            System.out.println(articolo2.getQuantita());
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}