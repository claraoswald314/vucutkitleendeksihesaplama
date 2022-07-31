package com.org.nyp;

import java.util.Scanner;

public class main {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Boyunuzu girin(cm) : ");
            double b = scanner.nextDouble();

            System.out.print("Kilonuzu girin : ");
            double k = scanner.nextDouble();
            b=b/100;

            double endeks  = k/(b*b);
            System.out.println(endeks);


            }
        }



