import ru.mirea.lab2.Dog;
import java.util.Scanner;
public class DogShelter {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        addDogs(dogs);

        System.out.println("Dog's name: " + dogs[2].getName());
        System.out.println("About the dog: " + dogs[2].toString());
        System.out.println("Its human age: ");
        dogs[2].toHumanAge(dogs[2].getAge());
    }

    public static void addDogs(Dog[] dogs){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < dogs.length; i++){
            System.out.print("Enter dog's name: ");
            String tmpname = in.nextLine();
            System.out.print("Enter dog's age: ");
            int tmpage = in.nextInt();
            dogs[i] = new Dog(tmpname, tmpage);
            in.nextLine();
        }
    }
}
