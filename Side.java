package com.company;

public class Side {

    private int max_height;
    private int difference3;
    private int length;

    public void setMax_height(int max_height) {
        this.max_height = max_height;
    }


    public void setDifference3 (int difference3) {
        if (difference3 < max_height) {
            this.difference3 = difference3;
        } else {
            this.difference3 = max_height;
        }
    }

    public void setLength(int length) {
        if (length > 3) {
            this.length = length;
        } else {
            System.out.println("Путь не может быть меньше трех вершин");
        }
    }

    public void printWay() {
        int[] route = new int[length];

        int max;
        int min;

        int difference = 0;


        System.out.println(difference3);
        route[0] = difference3 / 2 + (int) (Math.random() * difference3 / 2);
        route[1] = (int) (Math.random() * difference3);

        if (route[0] > route[1]) {
            max = route[0];
            min = route[1];
        } else {
            max = route[1];
            min = route[0];
        }

        System.out.print(route[0] + " ");
        System.out.print(route[1] + " ");

        difference = Math.abs(max - min);

        for (int i = 2; i < length; i++) {

            int a = negative(min, difference3 - difference);
            int b = positive(max, difference3 - difference);


            route[i] = Math.round((float) Math.random() * (b - a) + a);


            if (route[i - 1] > route[i]) {
                max = route[i - 1];
                min = route[i];
            } else {
                max = route[i];
                min = route[i - 1];
            }

            difference = Math.abs(max - min);

            System.out.print(route[i] + " ");

        }


    }


    private int positive(int max_f, int diff) {
        if (max_f + diff > max_height) {
            return max_height;
        }
        else
            return max_f + diff;
    }


    private int negative(int min_f, int diff) {
        if (min_f - diff < 0) {
            return 0;
        } else
            return min_f - diff;
    }


}