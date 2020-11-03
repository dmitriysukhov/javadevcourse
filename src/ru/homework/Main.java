package ru.homework;

public class Main {
    public static void main(String[] args) {
        System.out.println("sum(1,10) = " + sum((byte)1,(short)10));
        System.out.println("mul(1,10) = " + mul(1, 10L));
        System.out.println("getMaxNumber(1,10) = " + getMaxNumber(1,10));
        System.out.println("isCharA('A') = " + isCharA('A'));
        System.out.println("isCharNumber('4')) = " + isCharNumber('4'));
        System.out.println("BinaryView started!");
        binaryView();
        System.out.println("BinaryView finished!");
        binaryViewOfMaxValues();
        System.out.println("charToInt('5') = " + charToInt('5'));
        System.out.println("intToChar(53) = " + intToChar(53));
    }

    public static byte sum(byte a, short b) {
        return (byte) (a + b);
    }

    public static int mul(int a, long b) {
        return (int) (a * b);
    }

    public static int getMaxNumber(int a, int b) {
        return a > b ? a : b;
    }

    public static boolean isCharA(char a) {
        return a == 'A';
    }

    public static boolean isCharNumber(char a) {
        return Character.isDigit(a);
    }

    public static void binaryView() {
        for (int i = 0; i <= 30; ++i) {
            System.out.println(Integer.toBinaryString(i));
        }
    }

    public static void binaryViewOfMaxValues() {
        System.out.println("Integer.MAX_VALUE = " + Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println("Integer.MAX_VALUE + 1 = " + Integer.toBinaryString(Integer.MAX_VALUE + 1));
    }

    public static int charToInt(char a) {
        return a;
    }

    public static char intToChar(int a) {
        return (char) a;
    }
}
