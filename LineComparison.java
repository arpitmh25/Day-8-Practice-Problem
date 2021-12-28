import java.util.Scanner;

class LineLengthComparison {
    public void lineComparisonUc1() {

        Scanner t = new Scanner(System.in);
        System.out.println("Enter Coordinate of X1, Y1");
        int x1 = t.nextInt();
        int y1 = t.nextInt();
        System.out.println("Enter Coordinate of X2, Y2");
        int x2 = t.nextInt();
        int y2 = t.nextInt();
        double lengthof = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("lengthof line" + lengthof);
    }

    public void lineComparisonUc2() {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter Coordinate of First Line");
        System.out.println("Enter Coordinate of X1, Y1");
        int x1 = t.nextInt();
        int y1 = t.nextInt();
        System.out.println("Enter Coordinate of X2, Y2");
        int x2 = t.nextInt();
        int y2 = t.nextInt();
        double length1 = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("lengthof line" + length1);
        System.out.println("Enter Coordinate of Second Line");
        System.out.println("Enter Coordinate of X3, Y3");
        int x3 = t.nextInt();
        int y3 = t.nextInt();
        System.out.println("Enter Coordinate of X4, Y4");
        int x4 = t.nextInt();
        int y4 = t.nextInt();
        double length2 = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("lengthof line" + length2);
        if (length1 == (length2))
            System.out.println("Two Lines Are Equal");
        else
            System.out.println("Two Line Are Not Equal");
    }

    public void lineComparisonUc3() {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the Co-ordinates of 1st line ");
        System.out.println("Enter the Co-ordinates of x1 and y1 : ");
        int x1 = t.nextInt();
        int y1 = t.nextInt();
        System.out.println("Enter the Co-ordinates of x2 and y2 : ");
        int x2 = t.nextInt();
        int y2 = t.nextInt();
        Double length1 = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println();
        System.out.println("Enter the Co-ordinates of 2nd line ");
        System.out.println("Enter the Co-ordinates of x3 and y3 : ");
        int x3 = t.nextInt();
        int y3 = t.nextInt();
        System.out.println("Enter the Co-ordinates of x4 and y4 : ");
        int x4 = t.nextInt();
        int y4 = t.nextInt();
        Double length2 = Math.sqrt((x4 - x3) ^ 2 + (y4 - y3) ^ 2);
        System.out.println("Length of the first Line is : " + length1 + " units");
        System.out.println("Length of the second Line is : " + length2 + " units");
        System.out.println();
        if (length1.compareTo(length2) == 1)
            System.out.println("Length of Line 1 is greater than Line 2 ");
        else if (length1.compareTo(length2) == -1)
            System.out.println("Length of Line 1 is less than Line 2 ");
        else
            System.out.println("Both lines are equal in length");

    }

    public static void main(String[] args) {
        LineLengthComparison measure = new LineLengthComparison();
        measure.lineComparisonUc1();
        measure.lineComparisonUc2();
        measure.lineComparisonUc3();
    }
}
