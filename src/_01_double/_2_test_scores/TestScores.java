package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
    public static void main(String[] args) {
        double testScore = Double.parseDouble(JOptionPane.showInputDialog("What is your test score?"));

        if(testScore >= 90) {
            JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
        } else if(testScore < 90 && testScore >= 80) {
            JOptionPane.showMessageDialog(null, "You did a great job!");
        } else if(testScore < 80 && testScore >= 70) {
            JOptionPane.showMessageDialog(null, "You did a pretty good job!");
        } else if(testScore < 70 && testScore >= 60) {
            JOptionPane.showMessageDialog(null, "You almost passed! D:");
        } else if(testScore < 60) {
            JOptionPane.showMessageDialog(null, "You failed it! I hope you can do better next time! :(");
        }
    }
}
