
public class Student {

		private String nume;
		private int varsta;
		
		public Student(String nume, int varsta)
		{
			this.nume = nume;
			this.varsta = varsta;
		}
		
		public String getNume()
		{
			return this.nume;
		}
		
		public int getVarsta()
		{
			return this.varsta;
		}
		
		public static void main(String[] args) {
		
			Student ana = new Student("Ana" , 20);
			System.out.println(ana.getNume());
			System.out.println(ana.getVarsta());

		}
			

}
