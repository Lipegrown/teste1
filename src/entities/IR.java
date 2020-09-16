package entities;

public class IR  {
	
	private Double minimoSalary;
	private Double ir;
	
	public Contribuente salary;
	
	
	
	public IR(Double minimoSalary, Double ir) {

		super();
		this.minimoSalary = minimoSalary;
		this.ir = ir;
	}
	public Double getMinimoSalary() {
		return minimoSalary;
	}
	public void setMinimoSalary(Double minimoSalary) {
		this.minimoSalary = minimoSalary;
	}
	public Double getIr() {
		return ir;
	}
	
	@SuppressWarnings("null")
	public double desconto() {
		if (minimoSalary <= 2 * minimoSalary) {
			System.out.println("Insento");	
		}
		else if (minimoSalary == 2 * minimoSalary && minimoSalary <= 4 * minimoSalary) {
			return  minimoSalary - (minimoSalary * 0.75);
		}
		else if (minimoSalary == 4 * minimoSalary && minimoSalary <= 5 * minimoSalary) {
			return  minimoSalary - (minimoSalary * 1.5);
		}
		else if (minimoSalary == 5 * minimoSalary && minimoSalary <= 7 * minimoSalary) {
			return  minimoSalary - (minimoSalary * 2.25);
		}
		else if (minimoSalary >= 7 * minimoSalary) {
			return  minimoSalary - (minimoSalary * 2.75);
		}
		return (Double) null;
	}
	

}
