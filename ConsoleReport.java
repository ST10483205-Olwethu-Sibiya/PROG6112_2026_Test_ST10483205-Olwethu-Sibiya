/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.consolereport;

import java.util.Scanner;

/**
 *
 * @author emeris
 */
public class ConsoleReport {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int PS5sales = 0;
        int XBOXsales = 0;
        int SWITCHsales = 0;

        System.out.println(" What is the number of sales for PS5s");
        int PS5 = scanner.nextInt();

        System.out.println(" What is the number of sales for Xboxs");
        int Xbox = scanner.nextInt();

        System.out.println(" What is the number of sales for the Switch ");
        int Switch = scanner.nextInt();

        int[][][] sales = new int[PS5][Xbox][Switch];

        for (int i = 0; i < PS5; i++) {

            System.out.println(" \nEnter the number of sales for the PS5 " + (i + 1));

            for (int a = 0; a < Xbox; a++);
            int a = 0;
            System.out.println(" \nEnter the number of sales for Xbox " + (a + 1));

            for (int b = 0; b < Switch; b++);
            int b = 0;
            System.out.println(" \nEnter sales for the Switch " + (b + 1));
            sales[i][a][b] = scanner.nextInt();
        }
    }
}
