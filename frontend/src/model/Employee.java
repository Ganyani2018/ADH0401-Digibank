package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="employee")
@SessionScoped
public class Employee {
	
	private String firstName;
	private String sourcePassport;
	private String destinationPassport;
	private String destinationBank;
	private String destationCountry;
	private String accountNumber;
	private String amount;
	private String transactionCode;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSourcePassport() {
		return sourcePassport;
	}

	public void setSourcePassport(String sourcePassport) {
		this.sourcePassport = sourcePassport;
	}

	public String getDestinationPassport() {
		return destinationPassport;
	}

	public void setDestinationPassport(String destinationPassport) {
		this.destinationPassport = destinationPassport;
	}

	public String getDestinationBank() {
		return destinationBank;
	}

	public void setDestinationBank(String destinationBank) {
		this.destinationBank = destinationBank;
	}

	public String getDestationCountry() {
		return destationCountry;
	}

	public void setDestationCountry(String destationCountry) {
		this.destationCountry = destationCountry;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	public EmployeeEntity getEntity()
	{
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setFirstName(firstName);
		employeeEntity.setSourcePassport(sourcePassport);
		employeeEntity.setDestinationPassport(destinationPassport);
		employeeEntity.setDestinationBank(destinationBank);
		employeeEntity.setDestationCountry(destationCountry);
		employeeEntity.setAccountNumber(accountNumber);
		employeeEntity.setAmount(amount);
		employeeEntity.setTransactionCode(transactionCode);
		return employeeEntity;
	}

}
