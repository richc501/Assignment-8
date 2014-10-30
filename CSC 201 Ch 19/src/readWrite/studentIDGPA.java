package readWrite;

public class studentIDGPA {
	private int studentID;
	private double studentGPA;
	public studentIDGPA(int studentID, double studentGPA)
	{
		this.setStudentID(studentID);
		this.setStudentGPA(studentGPA);
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public double getStudentGPA() {
		return studentGPA;
	}
	public void setStudentGPA(double studentGPA) {
		this.studentGPA = studentGPA;
	}
	public String toString() {
		return "studentIDGPA [studentID=" + studentID + ", studentGPA="
				+ studentGPA + "]";
	}
}
