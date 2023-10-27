//Выполнить 4 (это количество, а не номера) задания

import ru.mirea.lab2.Author;

//TestAuthor
public class Main {
    public static void main(String[] args) {

        // Task 1
        Author edgarPoe = new Author("Edgar Allan Poe", "ravenAllan@gmail.com", 'm');
        System.out.println("Author's name is " + edgarPoe.getName());
        System.out.println("Author's email is " + edgarPoe.getEmail());
        edgarPoe.setEmail("Nevermore@mail.ru");
        System.out.println("Author's new email is " + edgarPoe.getEmail());
        System.out.println(edgarPoe.toString());

        // Task 5

    }
}
