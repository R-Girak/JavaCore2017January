package BookTasks;

/**
 * Created by Gerka on 27-May-17.
 */
public class Book0403Grades {


    // Main Class, that will use the Grade Converter
    public static void main(String[] args) {
        Book0404ReportCard rc = new Book0404ReportCard();
        char yourGrade = rc.convertGrades(88);
        System.out.println("Your grade is " + yourGrade);
        yourGrade = rc.convertGrades(75);
        System.out.println("Your grade is " + yourGrade);
        switch (yourGrade) {
            case 'A':
                System.out.println("Excellent!!!");
                break;
            case 'B':
                System.out.println("Good");
                break;
        }
    }
}
