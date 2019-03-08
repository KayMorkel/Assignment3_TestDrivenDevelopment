package za.ca.cput.kaylinmorkelassignment3tdd.Part2;

//Kaylin Morkel - 215062175

import javax.swing.*;
import java.awt.*;

public class StudentMain
{

    public static void main(String[] args)
    {
        String name;
        String surname;
        int yearborn;
        int currentYear;
        int totalOfTest;
        int totalAchieved;

        name = JOptionPane.showInputDialog("Enter your name: ");
        surname = JOptionPane.showInputDialog("Enter your surname: ");
        yearborn = Integer.parseInt(JOptionPane.showInputDialog("Enter the year you were born: "));
        currentYear = Integer.parseInt(JOptionPane.showInputDialog("Enter the current year: "));
        totalOfTest = Integer.parseInt(JOptionPane.showInputDialog("Enter the total amount of the test: "));
        totalAchieved = Integer.parseInt(JOptionPane.showInputDialog("Enter the total amount you achieved for the exam: "));

        AgeCalculator ageDet = new AgeCalculator();
        int age = ageDet.determineAge(yearborn, currentYear);

        ExamPercentageCalculator markPerc = new ExamPercentageCalculator();
        int mark = markPerc.percentageCalc(totalOfTest, totalAchieved);

        PassOrFailDeterminator pfDet = new PassOrFailDeterminator();
        String pOrF = pfDet.passOrFail(mark);

        JOptionPane.showMessageDialog(null, "Student name: "
                + name + "\nStudent surname: " + surname+ "\nStudent age: " + age +"\nStudent exam percentage: "
                + mark +"%"+ "\nStudent exam status: " + pOrF);

    }

}
