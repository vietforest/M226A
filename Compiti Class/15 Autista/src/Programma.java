public class Programma {
    Sede sede1 = new Sede(2551, "Venue 21", "7400000000455");
    Veicolo veicolo1 = new Veicolo("MX-7", "Mazda", "00005TI");
    Autista autista1 = new Autista("Luka", "Bianchi", veicolo1, sede1);


    @Override
    public String toString() {
        return "Programma:" + "\n" +
                "sede: " + autista1.getSede().toString() + "\n" +
                "Veicolo1:" + autista1.getVeicolo().toString() + "\n" +
                "Autista1:" + autista1.getNome() + " " + autista1.getCognome();
    }
}
