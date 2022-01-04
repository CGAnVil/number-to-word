package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần đọc:");
        int number = sc.nextInt();
        String readedNumber = "";
        switch (number){
            case 0: {
                readedNumber = "Zero";
                break;
            }
            case 1: {
                readedNumber = "One";
                break;
            }
            case 2: {
                readedNumber = "Two";
                break;
            }
            case 3: {
                readedNumber = "Three";
                break;
            }
            case 4: {
                readedNumber = "Four";
                break;
            }
            case 5: {
                readedNumber = "five";
                break;
            }
            case 6: {
                readedNumber = "Six";
                break;
            }
            case 7: {
                readedNumber = "Seven";
                break;
            }
            case 8: {
                readedNumber = "Eight";
                break;
            }
            case 9: {
                readedNumber = "Nine";
                break;
            }
            case 10: {
                readedNumber = "Ten";
                break;
            }
            case 11: {
                readedNumber = "Eleven";
                break;
            }
            case 12: {
                readedNumber = "Twelve";
                break;
            }
            case 13: {
                readedNumber = "Thirteen";
                break;
            }
            case 14: {
                readedNumber = "Fourteen";
                break;
            }
            case 15: {
                readedNumber = "Fifthteen";
                break;
            }
            case 16: {
                readedNumber = "Sixteen";
                break;
            }
            case 17: {
                readedNumber = "Seventeen";
                break;
            }
            case 18: {
                readedNumber = "Eighteen";
                break;
            }
            case 19: {
                readedNumber = "Nineteen";
                break;
            }
            case 20: {
                readedNumber = "Twenty";
                break;
            }
        }
        System.out.printf("Đọc là : %s",readedNumber);
    }
}
