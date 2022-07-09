public class PayrollSystemTest
{
	public static void main(String[] args)
	{
		SalariedEmployee salariedEmployee=new SalariedEmployee("John","Smith","111-11-111",800.00);
		HourlyEmployee hourlyEmployee=new HourlyEmployee("Karen","Price","222-22-222",16.75,40);
		ComissionEmployee comissionEmployee=new ComissionEmployee("Sue","Jones","333-33-333",10000,.06);
		BasePlusComissionEmployee basePlusComissionEmployee=new BasePlusComissionEmployee("Bob","Lewis","444-44-444",5000,.04,300);
		System.out.println("Employees processed individually:");
		System.out.printf("%n%s%n%s: $%,.2f%n%n",salariedEmployee,"earned",salariedEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n",hourlyEmployee,"earned",hourlyEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n",comissionEmployee,"earned",comissionEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n",basePlusComissionEmployee,"earned",basePlusComissionEmployee.earnings());
		
		Employee[] employees=new Employee[4];
		
		employees[0]=salariedEmployee;
		employees[1]=hourlyEmployee;
		employees[2]=comissionEmployee;
		employees[3]=basePlusComissionEmployee;
		
		System.out.printf("Employees processed polymorphically:%n%n");
		
		for (Employee currentEmployee:employees) {
			System.out.println(currentEmployee);
			if (currentEmployee instanceof BasePlusComissionEmployee) {
				BasePlusComissionEmployee employee=(BasePlusComissionEmployee) currentEmployee;
				employee.setBaseSalary(1.10*employee.getBaseSalary());
				System.out.printf("new base salary with 10%% increase is: $%,.2f",employee.getBaseSalary());
			}
			System.out.printf("earned $%,.2f%n%n",currentEmployee.earnings());
		}
		for (int j=0;j<employees.length;j++)
			System.out.printf("Employee %d is a %s%n",j,employees[j].getClass().getName());
	}
}