public class Main {
    public static void main(String[] args) {
        Square square = new Square(7);
        square.draw();
        System.out.println(square.getArea());
        System.out.println(square.getParameter());
        System.out.println(square.getDimension());
    }
}