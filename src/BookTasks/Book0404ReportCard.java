package BookTasks;

/**
 * Created by Gerka on 27-May-17.
 */
public class Book0404ReportCard {

    static public char convertGrades(int testResult) {
        char grade;
        if (testResult >= 90) {
            grade = 'A';
        }
        else if (testResult >=80 && testResult < 90) {
            grade = 'B';
        }
        else if (testResult >=70 && testResult < 80) {
            grade = 'C';
        }
        else {
            grade = 'D';
        }
        return grade;
    }
}
