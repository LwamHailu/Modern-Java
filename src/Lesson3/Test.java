package Lesson3;

public class Test {

	public static void main(String[] args) {
		Landlord lord=new Landlord("lwam");
		Buildings buil=new Buildings(12,56.0);
		Appartment app=new Appartment(12,300);
		lord.addBuilding(buil);
		buil.addApartment(app);
	System.out.println(lord.getMonthlyBenefit()+""+lord.toString());
	}

}
