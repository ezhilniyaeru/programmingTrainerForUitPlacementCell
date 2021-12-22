import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class ProgrammingTrainerForUitPlacementCell {
    static int calculateAmountForWeekDays(int hour) {
        int amount, bonus, bonusRate;
        if (hour <= 8) {
            amount = hour * 100;
        } else {
            bonus = hour - 8;
            bonusRate = bonus * 115;
            amount = bonusRate + 800;
        }
        return amount;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sundayAmount = 0, saturdayAmount = 0, salary;
        int sundayHour = scan.nextInt();
        int mondayHour = scan.nextInt();
        int tuesdayHour = scan.nextInt();
        int wednesdayHour = scan.nextInt();
        int thursdayHour = scan.nextInt();
        int fridayHour = scan.nextInt();
        int saturdayHour = scan.nextInt();
        int totalHour, bonus, bonusRate = 0, extraHour, extraBonusRate = 0;
        totalHour = mondayHour + tuesdayHour + wednesdayHour + thursdayHour + fridayHour;
        if (totalHour > 40) {
            extraHour = totalHour - 40;
            bonusRate = extraHour * 25;
        }
        sundayAmount = sundayHour * 150;
        saturdayAmount = saturdayHour * 125;
        salary = sundayAmount + saturdayAmount + calculateAmountForWeekDays(mondayHour) + calculateAmountForWeekDays(tuesdayHour) + calculateAmountForWeekDays(wednesdayHour) + calculateAmountForWeekDays(thursdayHour) + calculateAmountForWeekDays(fridayHour);
        System.out.println(salary);

    }

}
