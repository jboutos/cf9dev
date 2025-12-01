package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class Revision {
    public static void main(String[] args) {
      int die1 = 0;
      int die2 = 0;

      die1 = (int) (Math.random() * 6) + 1;
      die2 = (int) (Math.random() * 6) + 1;

        System.out.printf("Die 1 is %d and die2 is %d%n", die1, die2);

    }
}
