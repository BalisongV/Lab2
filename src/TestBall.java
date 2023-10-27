import ru.mirea.lab2.Ball;
import java.util.Scanner;
public class TestBall {
    public static void main(String[] args) {

        /*
        Объявляется переменная ball типа Ball для хранения ссылки на создаваемый объект.
        Создается сам объект при помощи оператора new, который динамически выделяет для него память в куче
        и возвращает на него ссылку.
        Эта ссылка присваивается переменной ball.
        Имя класса, после оператора new, указывает на имя его конструктора,
        который определяет, что происходит при создании объекта.
         */

        Ball ball =new Ball(15, 15);
        System.out.println(ball);
        ball.move(20, 5);
        System.out.println(ball);

    }
}
