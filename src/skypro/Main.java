package skypro;

public class Main {
    public static void main(String[] args) {
        int i = 1; // задание 1
        while (i <= 10) {
            System.out.print(i++);
        }
        System.out.println();
        for (i=10;i>0;i--){
            System.out.print(i);
        }

        for(int fd=5;fd<31;fd=fd+7){   //   2 задача
            System.out.println("сегодня пятница "+fd+" число.Необходимо подготовить отчёт");
        }
        int year=2022;    //   задача 3
        int yearBefore=year-200;
        int yearAfter=year+100;
        for(year=yearBefore;year<yearAfter;year++){
            if (year%79==0){
                System.out.println(year);
            }
        }

    }
}