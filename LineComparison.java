import java.util.Scanner;

class CalculateLength {
    public static int x1, x2, y1, y2, x3, x4, y3, y4;

    public void lengthValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("For given line");
        System.out.println("Enter co-ordinates of x1 and y1");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter co-ordinates of x2 and y2");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.println("For second line");
        System.out.println("Enter co-ordinates of x3 and y3");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        System.out.println("Enter co-ordinates of x4 and y4");
        x4 = sc.nextInt();
        y4 = sc.nextInt();
    }
}

class CheckIfEqual {
    static Double length1, length2;

    public void lengthCalculation() {
        length1 = Math.sqrt((CalculateLength.x2 - CalculateLength.x1) * (CalculateLength.x2 - CalculateLength.x1) + (CalculateLength.y2 - CalculateLength.y1) * (CalculateLength.y2 - CalculateLength.y1));
        System.out.println("Length of first line = " + length1 + " units");
        length2 = Math.sqrt((CalculateLength.x4 - CalculateLength.x3) * (CalculateLength.x4 - CalculateLength.x3) + (CalculateLength.y4 - CalculateLength.y3) * (CalculateLength.y4 - CalculateLength.y3));
        System.out.println("Length of second line = " + length2 + " units");
    }
}

class CompareLength {
    public void checkRelation() {
        if (CheckIfEqual.length1.compareTo(CheckIfEqual.length2) == 1) {
            System.out.println("Line 1 is greater than Line 2 in length");
        } else if (CheckIfEqual.length1.compareTo(CheckIfEqual.length2) == -1) {
            System.out.println("Line 1 is less than Line 2 in length");
        } else {
            System.out.println("Both lines are EQUAL in length");
        }
    }
}

public class LineLengthComparison {
    public static void main(String[] args) {
        CalculateLength input = new CalculateLength();
        input.lengthValue();
        CheckIfEqual cal = new CheckIfEqual();
        cal.lengthCalculation();
        CompareLength compare = new CompareLength();
        compare.checkRelation();
    }
}

