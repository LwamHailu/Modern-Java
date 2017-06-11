package lesson1;

public class Course {
	private int coarsecode;
	private String coarseName;
	private String coarseProfessor;
	public int getCoarsecode() {
		return coarsecode;
	}
	public void setCoarsecode(int coarsecode) {
		this.coarsecode = coarsecode;
	}
	public String getCoarseName() {
		return coarseName;
	}
	public void setCoarseName(String coarseName) {
		this.coarseName = coarseName;
	}
	public String getCoarseProfessor() {
		return coarseProfessor;
	}
	@Override
	public String toString() {
		return "Course [coarsecode=" + coarsecode + ", coarseName=" + coarseName + ", coarseProfessor="
				+ coarseProfessor + "]";
	}
	public void setCoarseProfessor(String coarseProfessor) {
		this.coarseProfessor = coarseProfessor;
	}
	
	



}
