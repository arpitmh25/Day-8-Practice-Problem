import java.util.Scanner;

class EmployeeWage {
    public static final int IsFullTime = 1;
    public static final int IsPartTime = 2;
    public static final int EmployeRatePerHour = 20;
    public static final int NoWorkingDays = 20;
    public static final int HourInMonth = 100;
    public void employeWageuc1() {
        int IsFullTime = 1;
        double EmpCheck = Math.floor(Math.random() * 10) % 2;
        if (EmpCheck == IsFullTime)
        {
            System.out.println("Employee is Present");
        }
        else
        {
            System.out.println("Employee is Not Present");
        }
    }
    public void employeWageuc2() {
        int IsFullTime = 1;
        int EmployeRatePerHour = 20;
        int EmployeWages = 0;
        int EmployeHour = 0;
        double EmpCheck = Math.floor(Math.random() * 10) % 2;
        if (EmpCheck == IsFullTime)
        {
            EmployeHour = 8;
        }
        else
        {
            EmployeHour = 0;
        }
        EmployeWages = EmployeHour * EmployeRatePerHour;
        System.out.println("Employewage: " + EmployeWages );
    }
    public void employeWageuc3() {
        int IsFullTime = 1;
        int IsPartTime = 2;
        int EmployeRatePerHour = 20;
        int EmployeWages = 0;
        int EmployeHour = 0;
        double EmpCheck = Math.floor(Math.random() * 10) % 3;
        if (EmpCheck == IsFullTime)
        {
            EmployeHour = 8;
        }
        else if (EmpCheck == IsPartTime)
        {
            EmployeHour = 8;
        }
        else
        {
            EmployeHour = 0;
        }
        EmployeWages = EmployeHour * EmployeRatePerHour;
        System.out.println("Employewage: " + EmployeWages );
    }
    public void employeWageuc4() {
        int EmployeWages = 0;
        int EmployeHour = 0;
        int EmployeCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (EmployeCheck) {
            case IsFullTime:
                EmployeHour = 8;
                break;
            case IsPartTime:
                EmployeHour = 4;
                break;
            default:
                EmployeHour = 0;
        }
        EmployeWages = EmployeHour * EmployeRatePerHour;
        System.out.println("Employewage: " + EmployeWages );
    }
    public void employeWageuc5() {
        int EmployeWages = 0;
        int EmployeHour = 0;
        int TotalEmployeWage = 0;
        for ( int day = 0; day < NoWorkingDays ; day++) {
            int EmployeCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (EmployeCheck) {
                case IsFullTime:
                    EmployeHour = 8;
                    break;
                case IsPartTime:
                    EmployeHour = 4;
                    break;
                default:
                    EmployeHour = 0;
            }
            EmployeWages = EmployeHour * EmployeRatePerHour;
            TotalEmployeWage += EmployeWages;
            System.out.println("Employewage: " + EmployeWages );
        }
        System.out.println("TotalEmployewage: " + TotalEmployeWage );
    }
    public void employeWageuc6() {
        int EmployeWages = 0;
        int TotalEmployeHour = 0;
        int TotalEmployeWage = 0;
        int TotalWorkingDays = 0;
        while (TotalWorkingDays < NoWorkingDays && TotalEmployeHour <= HourInMonth) {
            int EmployeHour = 0;
            TotalWorkingDays++;
            int EmployeCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (EmployeCheck) {
                case IsFullTime:
                    EmployeHour = 8;
                    break;
                case IsPartTime:
                    EmployeHour = 4;
                    break;
                default:
                    EmployeHour = 0;
            }
            TotalEmployeHour += EmployeHour;
            EmployeWages = EmployeHour * EmployeRatePerHour;
            TotalEmployeWage += EmployeWages;
            System.out.println("Employewage: " + EmployeWages );
        }
        System.out.println("TotalEmployewage: " + TotalEmployeWage );
    }
    //uc 7
    public static void main(String[] args){
        EmployeeWage  worker = new EmployeeWage();
        System.out.println("Enter the number of use case to be checked");
        Scanner sc = new Scanner(System.in);
        int employeWageuc = sc.nextInt();
        switch (employeWageuc) {
            case 1:
                worker.employeWageuc1();
                break;
            case 2:
                worker.employeWageuc2();
                break;
            case 3:
                worker.employeWageuc3();
                break;
            case 4:
                worker.employeWageuc4();
                break;
            case 5:
                worker.employeWageuc5();
                break;
            case 6:
                worker.employeWageuc6();
                break;
        }

    }
}