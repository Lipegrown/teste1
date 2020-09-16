package entities;



public class Contribuente {
	
	protected  Integer cpf;
	protected String name;
	protected Integer nuberContriuente;
	protected Double salary;
	
	
	


	public Contribuente(Integer cpf, String name, Integer nuberContriuente, Double salary) {
		this.cpf = cpf;
		this.name = name;
		this.nuberContriuente = nuberContriuente;
		this.salary = salary;
		
	}


	public Integer  getCpf() {
		return cpf;
	}


	public void setCpf(Integer cpf) {
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
	

	
	
	
	

}
