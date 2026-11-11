package com.example;

public class GradeC {
	public static boolean isPass(double marks) {
        return marks >= 40.0;
    }
    public static String Grade(double marks) {
        if (marks >= 90) {
            return "Grade:O";
        } else if (marks >= 80) {
            return "Grade:A+";
        } else if (marks >= 70) {
            return "Grade:A";
        } else if (marks >= 60) {
            return "Grade:B+";
        } else if (marks >= 50) {
            return "Grade:B";
        } else if (marks >= 40) {
            return "Grade:C";
        } else {
            return "Grade:F";
        }
    }
}
