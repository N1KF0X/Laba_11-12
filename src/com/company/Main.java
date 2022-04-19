package com.company;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Main {
    public static void findIP(Matcher matcher)
    {
        if(matcher.find()) {
            System.out.println(matcher.group());
        }
        else {
            System.out.println("Не найдено");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "iui 95.152.73.142 енкенек";
        Pattern pattern = Pattern.compile("\\b([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\b");
        Matcher matcher = pattern.matcher(input);

        findIP(matcher);

        String input1 = scanner.nextLine();
        matcher = pattern.matcher(input1);

        findIP(matcher);
    }
}
