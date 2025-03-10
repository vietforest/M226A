public class Square {
    int side;
    public Square(int side){
        this.side = side;
    }

    public Square(){
        side = 5;
    }

    public int getArea(){
        return side*side;
    }

    public int getParameter(){
        return side*4;
    }

    public void draw() {
        int a;
        int b;
       for (a = 1; a <= side; a++){
           for (b = 1; b <= side; b++) {
               if (b == 1 || b == side || a == 1 || a == side) {
                   System.out.print("* ");
               }
               else {
                   System.out.print("  ");
               }
           }
           System.out.println();
       }
    }

    public String getDimension(){
        return "Quadarato " + side + " x " + side ;
    }
}
