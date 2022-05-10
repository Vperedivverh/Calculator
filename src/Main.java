import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vvod = sc.nextLine();
        vvod = vvod.replaceAll("\\s+", "");//удал€ю все пробелы

        String[] arab = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] rome = new String[]{"I", "II", "III", "IV", "V",
                "VI", "VII", "VIII", "IX", "X"};
        //4 блока дл€ вычислени€ арабских цифр
        if (vvod.contains("*")) {
            String[] examp = vvod.split("\\*");

            boolean f1 = false;
            boolean f2 = false;
            for (int i = 0; i < 10; i++) {
                if (examp[0].equals(arab[i]) && examp.length == 2) {
                    f1 = true;
                }
            }
            for (int i = 0; i < 10; i++) {
                if (examp[1].equals(arab[i])) {
                    f2 = true;
                }
            }

            if (f1 == true && f2 == true) {
                int a = Integer.parseInt(examp[0]);
                int b = Integer.parseInt(examp[1]);
                System.out.println(a * b);
            }
        }
        if (vvod.contains("/")) {
            String[] examp = vvod.split("/");

            boolean f1 = false;
            boolean f2 = false;
            for (int i = 0; i < 10; i++) {
                if (examp[0].equals(arab[i]) && examp.length == 2) {
                    f1 = true;
                }
            }
            for (int i = 0; i < 10; i++) {
                if (examp[1].equals(arab[i])) {
                    f2 = true;
                }
            }

            if (f1 == true && f2 == true) {
                int a = Integer.parseInt(examp[0]);
                int b = Integer.parseInt(examp[1]);
                System.out.println(a / b);
            }
        }
        if (vvod.contains("+")) {
            String[] examp = vvod.split("\\+");

            boolean f1 = false;
            boolean f2 = false;
            for (int i = 0; i < 10; i++) {
                if (examp[0].equals(arab[i]) && examp.length == 2) {
                    f1 = true;
                }
            }
            for (int i = 0; i < 10; i++) {
                if (examp[1].equals(arab[i])) {
                    f2 = true;
                }
            }

            if (f1 == true && f2 == true) {
                int a = Integer.parseInt(examp[0]);
                int b = Integer.parseInt(examp[1]);
                System.out.println(a + b);
            }
        }
        if (vvod.contains("-")) {
            String[] examp = vvod.split("-");

            boolean f1 = false;
            boolean f2 = false;
            for (int i = 0; i < 10; i++) {
                if (examp[0].equals(arab[i]) && examp.length == 2) {
                    f1 = true;
                }
            }
            for (int i = 0; i < 10; i++) {
                if (examp[1].equals(arab[i])) {
                    f2 = true;
                }
            }

            if (f1 == true && f2 == true) {
                int a = Integer.parseInt(examp[0]);
                int b = Integer.parseInt(examp[1]);
                System.out.println(a - b);
            }
        }
        //4 блока дл€ римских цифр
        if (vvod.contains("*")) {
            String[] examp = vvod.split("\\*");

            boolean f1 = false;
            boolean f2 = false;
            for (int i = 0; i < 10; i++) {
                if (examp[0].equals(rome[i]) && examp.length == 2) {
                    f1 = true;
                }
            }
            for (int i = 0; i < 10; i++) {
                if (examp[1].equals(rome[i])) {
                    f2 = true;
                }
            }

            if (f1 == true && f2 == true) {
                int a = Arrays.asList(rome).indexOf(examp[0]) +1;
                int b = Arrays.asList(rome).indexOf(examp[1]) +1;
                int result = a*b;

                String resultat = convertToRoman(result);
                System.out.println(resultat);
            }
        }
        if (vvod.contains("/")) {
            String[] examp = vvod.split("/");

            boolean f1 = false;
            boolean f2 = false;
            for (int i = 0; i < 10; i++) {
                if (examp[0].equals(rome[i]) && examp.length == 2) {
                    f1 = true;
                }
            }
            for (int i = 0; i < 10; i++) {
                if (examp[1].equals(rome[i])) {
                    f2 = true;
                }
            }

            if (f1 == true && f2 == true) {
                int a = Arrays.asList(rome).indexOf(examp[0]) +1;
                int b = Arrays.asList(rome).indexOf(examp[1]) +1;
                int result = a/b;
                String resultat = convertToRoman(result);
                System.out.println(resultat);
            }
        }
        if (vvod.contains("+")) {
            String[] examp = vvod.split("\\+");

            boolean f1 = false;
            boolean f2 = false;
            for (int i = 0; i < 10; i++) {
                if (examp[0].equals(rome[i]) && examp.length == 2) {
                    f1 = true;
                }
            }
            for (int i = 0; i < 10; i++) {
                if (examp[1].equals(rome[i])) {
                    f2 = true;
                }
            }

            if (f1 == true && f2 == true) {
                int a = Arrays.asList(rome).indexOf(examp[0]) +1;
                int b = Arrays.asList(rome).indexOf(examp[1]) +1;
                int result = a+b;
                String resultat = convertToRoman(result);
                System.out.println(resultat);
            }
        }
        if (vvod.contains("-")) {
            String[] examp = vvod.split("-");

            boolean f1 = false;
            boolean f2 = false;
            for (int i = 0; i < 10; i++) {
                if (examp[0].equals(rome[i]) && examp.length == 2) {
                    f1 = true;
                }
            }
            for (int i = 0; i < 10; i++) {
                if (examp[1].equals(rome[i])) {
                    f2 = true;
                }
            }

            if (f1 == true && f2 == true) {
                int a = Arrays.asList(rome).indexOf(examp[0]) +1;
                int b = Arrays.asList(rome).indexOf(examp[1]) +1;
                int result = a-b;
                if (result < 1){
                    return;
                }
                String resultat = convertToRoman(result);
                System.out.println(resultat);
            }
        }

    }
    //метод дл€ конвертировани€ арабских в римские
    static String convertToRoman (int result) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
                "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX",
                "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII",
                "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI",
                "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII",
                "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII",
                "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII",
                "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII",
                "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII",
                "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII",
                "XCIX", "C"
        };
        String s = roman[result];
        return s;
    }
}

