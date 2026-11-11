package com.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class TestC {
	@Test
    void testGrade() {
        assertEquals("Grade:A+", GradeC.Grade(80));
        assertEquals("Grade:A", GradeC.Grade(75));
    }
	@Test
    void testGrades() {
        assertEquals("Grade:A+", GradeC.Grade(80));
        assertEquals("Grade:A", GradeC.Grade(75));
    }
}
