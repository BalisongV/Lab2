import ru.mirea.lab2.Author;
import ru.mirea.lab2.Circle;

public class CircleTest {
    public static void main(String[] args){

        Circle my_circle = new Circle(6);
        Circle circle2 = new Circle(23);

        System.out.println("Circle's radius " + my_circle.getRadius());
        System.out.println(my_circle.area());
        System.out.println(my_circle.compareCircles(circle2.getRadius()));

    }
}
