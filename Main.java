package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Side test = new Side();

        System.out.print("Введите длину маршута: ");
        Scanner in = new Scanner(System.in);
        test.setLength(in.nextInt());

        System.out.print("Введите максимальную вершину: ");
        test.setMax_height(in.nextInt());

        System.out.print("Введите максимальный перепад трех ближайших вершин: ");
        test.setDifference3(in.nextInt());

        test.printWay();

        in.close();

    }
}
