package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean isNumberChoseMode = true;
        Triangle[] triangle = new Triangle[4];
        Triangle[] rightTriangles = new Triangle[4];

        triangle[0] = new Triangle(new double[]{3, 3, 5}, false);
        triangle[1] = new Triangle(new double[]{8, 6, 5}, false);
        triangle[2] = new Triangle(new double[]{10, 8, 11}, false);
        triangle[3] = new Triangle(new double[]{5, 5, 5}, false);

        rightTriangles[0] = new Triangle(new double[]{3, 4, 5}, true);
        rightTriangles[2] = new Triangle(new double[]{5, 12, 13}, true);
        rightTriangles[1] = new Triangle(new double[]{7, 24, 25}, true);
        rightTriangles[3] = new Triangle(new double[]{20, 21, 29}, true);

        System.out.print("Добро пожаловать в базу данных треугольников. Выберите действие:\n" +
                         " Треугольники:\n" +
                         "  1. Добавить\n" +
                         "  2. Просмотреть\n" +
                         " Прямоугольные треугольники:\n" +
                         "  3. Добавить\n" +
                         "  4. Просмотреть\n\n" +
                         "5. Просмотреть все треугольники (треугольники и прям. треугольники)\n\n" +
                         "Ваш выбор: ");

        do {
                String choseMode = IMethods.CheckNumber(scanner.nextLine());

                switch (choseMode)
                {
                    case "1":
                        triangle = IMethods.AddTriangles(triangle, false);
                        IMethods.ShowTriangles(triangle);
                        break;
                    case "2":
                        IMethods.ShowTriangles(triangle);
                        break;
                    case "3":
                        rightTriangles = IMethods.AddTriangles(rightTriangles, true);
                        IMethods.ShowTriangles(rightTriangles);
                        break;
                    case "4":
                        IMethods.ShowTriangles(rightTriangles);
                        break;
                    case "5":
                        IMethods.ShowSpecialTriangles(triangle, rightTriangles);
                        break;
                    default:
                        System.out.print("Такой функции нет. Попробуйте еще раз: ");
                        isNumberChoseMode = false;
                        break;
                }
            } while(!isNumberChoseMode);
    }

}
