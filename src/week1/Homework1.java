package week1;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args){

        Scanner maas = new Scanner(System.in);
        Scanner calismazamani = new Scanner(System.in);
        Scanner calismazamani2 = new Scanner(System.in);
        System.out.println("Enter employee's salary");
        System.out.println("How much time employee worked on weekdays ?");
        System.out.println("How much time employee worked on weekend ?");
        int workingtime = 0;
        int standardworkingtime = 40;
        double salary = 0;
        int weekendworkingtime = 0;
        int standardworkingtimeweekend = 0;
        salary = maas.nextInt();
        workingtime = calismazamani.nextInt();
        weekendworkingtime = calismazamani2.nextInt();
        System.out.println("Salary: " +salary);
        System.out.println("Working time:" +workingtime);
        System.out.println("Working time at weekend " +weekendworkingtime);

        int extratimeweek = workingtime-standardworkingtime;
        System.out.println("Extra time for weekdays " +extratimeweek);
        int extratimeweekend = weekendworkingtime-standardworkingtimeweekend;
        System.out.println("Extra time for weekened " +extratimeweekend);
        double hourlyunit = salary / workingtime;
        System.out.println("Hourly unit " +hourlyunit);
        double weekdaysalary = 0;
        double weekendsalary = 0;
        double reducesalary = 0;
        int bonus = 0;

        if (extratimeweek > 0){
            weekdaysalary = ((hourlyunit*1.5)*extratimeweek);
            System.out.println("Output for weekday " +weekdaysalary);
        }
        if (extratimeweekend >0) {
            weekendsalary = ((hourlyunit*2)*extratimeweekend);
            System.out.println("output for weekend " +weekendsalary);
        }
        if (extratimeweek > 0 && extratimeweekend > 0){
            bonus = bonus + 500;
        }
        if (workingtime<standardworkingtime){
            reducesalary =-((workingtime-standardworkingtime)*hourlyunit);
        }
        salary = salary+weekdaysalary+weekendsalary+bonus-reducesalary;
        System.out.println("Total salary: " +salary);
    }
}
