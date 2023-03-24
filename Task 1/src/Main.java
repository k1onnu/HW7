import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )

        //todo реализовать ввод пользователем кол-ва ингредиентов.

        System.out.println("\nЕсть рецепты из этих ингредиентов:\n1. Жабьи глаза\n2. Слезы вурдалака\n3. Кости ворона\n4. ?Пельмени?");

        System.out.println("\nКакое у вас кол-во жабьих глаз?");
        toadEyesCount = new Scanner(System.in).nextInt();

        System.out.println("\nКакое у вас кол-во слёз вурдалака?");
        ghoulTearsCount = new Scanner(System.in).nextInt();

        System.out.println("\nКакое у вас кол-во костей ворона?");
        ravenBonesCount = new Scanner(System.in).nextInt();

        System.out.println("\nКакое у вас кол-во пельменей?");
        dumplingsCount = new Scanner(System.in).nextInt();

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир


        //todo дописать логику программы сюда
        String elixirVigilance = (toadEyesCount >= 3) && (ravenBonesCount >= 1) ? "Эликсир зоркости" : "Не хватает ингредиентов";
        System.out.println(elixirVigilance);

        String elixirStamina = (ravenBonesCount >= 2) && (dumplingsCount >= 4) ? "Эликсир стойкости" : "Не хватает ингредиентов";;
        System.out.println(elixirStamina);

        String elixirSecrecy = (ghoulTearsCount >= 7) && (dumplingsCount >= 1 && toadEyesCount >= 2 ) ? "Эликсир скрытности" : "Не хватает ингредиентов";;
        System.out.println(elixirSecrecy);

        String elixirTaboo = (ghoulTearsCount >= 5) && (dumplingsCount >= 10) && (toadEyesCount >= 4) && (ravenBonesCount >= 3) ? "Запретный эликсир" : "Не хватает ингредиентов";;
        System.out.println(elixirTaboo);




    }
}
