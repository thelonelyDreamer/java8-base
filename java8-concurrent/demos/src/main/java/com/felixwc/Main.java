package com.felixwc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showMenu();
        System.out.print("请选择运行的功能：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        Strategy strategy = obtainStrategy(choice);
        System.out.println(strategy.execute());
    }

    private static void showMenu() {

    }

    private static Strategy obtainStrategy(int i) {

        return new NullStrategy();
    }

    private interface Strategy {
        int execute();
    }

    private static class NullStrategy implements Strategy {

        @Override
        public int execute() {
            return 0;
        }
    }
}