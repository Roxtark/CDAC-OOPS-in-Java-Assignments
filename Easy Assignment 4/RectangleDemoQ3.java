public class RectangleDemoQ3 {

    public static void main(String[] args) {

        System.out.print("Enter length of rectangle: ");
        float length = ConsoleInput.getFloat();

        System.out.print("Enter breadth of rectangle: ");
        float breadth = ConsoleInput.getFloat();

        RectangleQ3 rectangle = new RectangleQ3(length, breadth);

        System.out.println("Rectangle");
        rectangle.printArea();
        rectangle.printPerimeter();

        System.out.print("Enter side of square: ");
        float side = ConsoleInput.getFloat();

        SquareQ3 square = new SquareQ3(side);

        System.out.println("Square");
        square.printArea();
        square.printPerimeter();
    }
}
