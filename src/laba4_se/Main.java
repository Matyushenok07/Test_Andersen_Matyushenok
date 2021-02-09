package laba4_se;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        String str1 = "Вячеслав";
        System.out.print("-------------Задание №1------------\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        if (num > 7) {
            System.out.println("Привет");
        }
        System.out.print("-------------Задание №2------------\n");
        System.out.print("Введите Имя: ");
        String name = in.next();
        if(str1.equals(name) )
        {
            System.out.print(" Привет,Вячеслав ");
        }
        else
        {
            System.out.print( "Нет такого имени");
        }
        System.out.print("\n-------------Задание №3------------\n");
        int[] yourArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for (int i : yourArray)
        {
            if (i % 3 == 0)
            {
                System.out.println(i);
            }
        }

    }
}
