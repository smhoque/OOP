package Polymorphism;

public class DiscountProgramCost extends ProgramCost{

	@Override
	public int installment(int a, int b, int c, int d) {
		int total = a+b+c-d;
		return total;
	}

}
