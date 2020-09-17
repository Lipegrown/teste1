package entities;



public class Contribuente {
	
	protected  Long cpf;
	protected String name;
	protected Integer nuberContriuente;
	protected Double salary;
	
	
	
	


	public Contribuente(Long cpf, String name, Integer nuberContriuente, Double salary) {
		this.cpf = cpf;
		this.name = name;
		this.nuberContriuente = nuberContriuente;
		this.salary = salary;
		
		
	}


	public Long  getCpf() {
		return cpf;
	}


	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getNuberContriuente() {
		return nuberContriuente;
	}


	public void setNuberContriuente(Integer nuberContriuente) {
		this.nuberContriuente = nuberContriuente;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	
	public String toString() {
		return name + " " + String.format("%.2f", salary);
	}
	
	

	
	
	
	

}
