import static java.lang.Math.*;

public class ShapeCalculator {

    double squareArea(Square square){

        double wynik=square.sideOfSquare*square.sideOfSquare;
        return wynik;
        }


    double circleArea(Circle circle){
        double wynik=circle.radius*circle.radius*Math.PI;
        return wynik;
         }

    double trianglePerimeter(Triangle triangle){
        double wynik=triangle.sideOfTriangle_A+triangle.sideOfTriangle_B+triangle.sideOfTriangle_C;
        return wynik;
        }

    double rectPerimeter(Rectangle rectangle){
        double wynik=(rectangle.sideOfRectangle_A+rectangle.sideOfRectangle_B)*2;
        return wynik;
       }

}
