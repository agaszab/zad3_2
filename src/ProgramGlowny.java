

class ProgramGlowny {

  public static void main (String[] args) {

      double wynik;

      Square square= new Square(25);
      Circle circle=new Circle(49);
      Rectangle rectangle=new Rectangle(25,12);
      Triangle triangle=new Triangle(10,24,14);

      ShapeCalculator calculator = new ShapeCalculator();

      wynik=calculator.circleArea(circle);
      System.out.println("Pole koła o promieniu "+circle.radius+" wynosi: "+wynik);
      wynik=calculator.rectPerimeter(rectangle);
      System.out.println("Obwód prostokąta o bokach "+rectangle.sideOfRectangle_A+" i "+rectangle.sideOfRectangle_B+" wynosi: "+wynik);
      wynik=calculator.squareArea(square);
      System.out.println("Pole kwadratu o boku "+square.sideOfSquare+" wynosi: "+wynik);
      wynik=calculator.trianglePerimeter(triangle);
      System.out.println("Obwód trójkąta o bokach "+triangle.sideOfTriangle_A+", "+triangle.sideOfTriangle_B+" i "+triangle.sideOfTriangle_C+" wynosi: "+wynik);
  }


}