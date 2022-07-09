public class PieceWorker extends Employee
{
	private double wage;
	private int pieces;
	public PieceWorker(String firstName,String lastName,String socialSecurityNumber,int birthDate,double wage,int pieces)
	{
		super(firstName,lastName,socialSecurityNumber,birthDate);
		this.wage=wage;
		this.pieces=pieces;
	}
	public double getWage()
	{
		return wage;
	}
	public int pieces()
	{
		return pieces;
	}
	@Override
	public double earnings()
	{
		return pieces*wage;
	}
}