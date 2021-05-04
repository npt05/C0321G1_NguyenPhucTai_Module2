

import java.util.Scanner;

public class Ung_dung_doc_so_thanh_chu {
    static String checkOnes(String num) {
        String result = "";
        switch (num) {
            case "1":
                result += "One";
                break;
            case "2":
                result += "Two";
                break;
            case "3":
                result += "Three";
                break;
            case "4":
                result += "Four";
                break;
            case "5":
                result += "Five";
                break;
            case "6":
                result += "Six";
                break;
            case "7":
                result += "Seven";
                break;
            case "8":
                result += "Eight";
                break;
            case "9":
                result += "Nine";
                break;
        }
        return result;
    }

    static String checkDones(String num) {
        String result = "";
        switch (num) {
            case "0":
                result += "";
                break;
            case "2":
                result += "Twenty";
                break;
            case "3":
                result += "Thirty";
                break;
            case "4":
                result += "Fourty";
                break;
            case "5":
                result += "Fifty";
                break;
            case "6":
                result += "Sixty";
                break;
            case "7":
                result += "Seventy";
                break;
            case "8":
                result += "Eightty";
                break;
            case "9":
                result += "Ninety";
                break;
        }
        if (num == "1") {

        }
        return result;
    }

    static String check(String num) {
        String result = "";
        switch (num) {
            case "10":
                result += "Ten";
                break;
            case "11":
                result += "Eleven";
                break;
            case "12":
                result += "Twelve";
                break;
            case "13":
                result += "Thirteen";
                break;
            case "14":
                result += "Fourteen";
                break;
            case "15":
                result += "Fifteen";
                break;
            case "16":
                result += "Sixteen";
                break;
            case "17":
                result += "Seventeen";
                break;
            case "18":
                result += "Eightteen";
                break;
            case "19":
                result += "Nineteen";
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        String number = scanner.nextLine();
        if (number.length() <= 0) {
            System.out.println("Out of ability.");
        } else if (number.length() < 2) {
            if (number.charAt(0) == '0') {
                System.out.println("Zero");
            }else {
                System.out.println(checkOnes(number));
            }
        } else if (number.length() < 3) {
            if (number.charAt(0) == '1') {
                String str = number.substring(0, 2);
                System.out.println(check(str));
            } else {
                String str = number.substring(0, 1);
                String str1 = number.substring(1, 2);
                System.out.println(checkDones(str) + " " + checkOnes(str1));
            }
        } else if (number.length() == 3) {
            String str = number.substring(0, 1);
            String str1 = number.substring(1, 2);
            String str2 = number.substring(2, 3);
            String str12 = number.substring(1, 3);

            switch (str1) {
                case "1":
                    System.out.println(checkOnes(str) + " hundred " + check(str12));
                    break;
                default:
                    System.out.println(checkOnes(str) + " hundred " + checkDones(str1) + " " + checkOnes(str2));
                    break;
            }

        }
    }
}
