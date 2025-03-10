public class Punto {
    double latoX;
    double latoY;

    public Punto(double latoX, double latoY) {
        this.latoX = latoX;
        this.latoY = latoY;
    }

    public Punto(){
        this.latoX = 1;
        this.latoY = 1;
    }

    public int calcolaDistanza(){
        double result = Math.sqrt(Math.pow(latoX,2)+Math.pow(latoY,2));
        return (int)result;
    }

    public String determinarQuadrante(){
        String quadrante = "";
       if (latoX > 0 && latoY > 0){
           quadrante = "Quandrante 1";
       }
       else if (latoX < 0 && latoY > 0){
           quadrante = "Quandrante 2";
       }
       else if (latoX < 0 && latoY < 0){
           quadrante = "Quandrante 3";
       }
       else if (latoX > 0 && latoY < 0){
           quadrante = "Quandrante 4";
       }
       return quadrante;
    }

    @Override
    public String toString() {
       return "Coordinate: " + latoX + "; " + latoY
               + "\n" + "Distanza: " + calcolaDistanza()
               + "\n" + "Quadrante: " + determinarQuadrante()
               + "\n";
    }
}
