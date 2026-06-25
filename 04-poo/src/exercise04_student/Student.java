package exercise04_student;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public String testResult() {
		if (finalGrade() > 60.00) {
			return "PASS";
		}
		else {
			return "FAILED";
		}
	}
	
	public String toString() {

	    double finalGrade = finalGrade();

	    if (finalGrade >= 60.0) {
	        return "FINAL GRADE = " + String.format("%.2f", finalGrade)
	                + "\nPASS";
	    }

	    return "FINAL GRADE = " + String.format("%.2f", finalGrade)
	            + "\nFAILED"
	            + "\nMISSING "
	            + String.format("%.2f", 60.0 - finalGrade)
	            + " POINTS";
	}
	
}
