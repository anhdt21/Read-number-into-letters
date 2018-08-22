import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so can doc: ");
        int number = sc.nextInt();

        int value = number;
        int count = 0;
        while (value > 0) {
            value/=10;
            count++;
        }
        switch (count){
            case 1:
                isADigit(number);
                break;
            case 2:
                isTwoDigits(number);
                break;
            case 3:
                isThreeDigits(number);
                break;
            case 4:
                System.out.println("Out of ability");
        }
    }

    private static void isADigit(int number) {
        switch (number){
            case 0:
                System.out.print("zero");
                break;
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.print("four");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print("seven");
                break;
            case 8:
                System.out.print("eight");
                break;
            case 9:
                System.out.print("nine");
                break;
        }
    }

    private static void isTwoDigits(int number) {
        int dozensDigit = number/10;
        int unitDigit = number%10;
        if (dozensDigit == 1) {
            switch (unitDigit){
                case 0:
                    System.out.print("ten");
                    break;
                case 1:
                    System.out.print("eleven");
                    break;
                case 2:
                    System.out.print("twelve");
                    break;
                case 3:
                    System.out.print("thirteen");
                    break;
                case 4:
                    System.out.print("fourteen");
                    break;
                case 5:
                    System.out.print("fifteen");
                    break;
                case 6:
                    System.out.print("sixteen");
                    break;
                case 7:
                    System.out.print("seventeen");
                    break;
                case 8:
                    System.out.print("eighteen");
                    break;
                case 9:
                    System.out.print("nineteen");
                    break;
            }
        } else if (unitDigit == 0) {
            switch (dozensDigit) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }
        } else {
            switch (dozensDigit) {
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("forty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                case 9:
                    System.out.print("ninety ");
                    break;
            }
            isADigit(unitDigit);
        }
    }

    private static void isThreeDigits(int number){
        int hundreDigit = number/100;
        int dozensDigit = number%100;
        if (dozensDigit == 0) {
            switch (hundreDigit){
                case 1:
                    System.out.print("one hundred");
                    break;
                case 2:
                    System.out.print("two hundred");
                    break;
                case 3:
                    System.out.print("three hundred");
                    break;
                case 4:
                    System.out.print("four hundred");
                    break;
                case 5:
                    System.out.print("five hundred");
                    break;
                case 6:
                    System.out.print("six hundred");
                    break;
                case 7:
                    System.out.print("seven hundred");
                    break;
                case 8:
                    System.out.print("eight hundred");
                    break;
                case 9:
                    System.out.print("nine hundred");
                    break;
            }
        } else {
            switch (hundreDigit){
                case 1:
                    System.out.print("one hundred and ");
                    break;
                case 2:
                    System.out.print("two hundred and ");
                    break;
                case 3:
                    System.out.print("three hundred and ");
                    break;
                case 4:
                    System.out.print("four hundred and ");
                    break;
                case 5:
                    System.out.print("five hundred and ");
                    break;
                case 6:
                    System.out.print("six hundred and ");
                    break;
                case 7:
                    System.out.print("seven hundred and ");
                    break;
                case 8:
                    System.out.print("eight hundred and ");
                    break;
                case 9:
                    System.out.print("nine hundred and ");
                    break;
            }
            if (dozensDigit < 10)
                isADigit(dozensDigit);
            else
                isTwoDigits(dozensDigit);
        }

    }
}
