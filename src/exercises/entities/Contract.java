package exercises.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	
	private Date dateOf;

	private Integer number;
	private Double totalValue;
	
	private List<Installment> installments = new ArrayList<>();
		
	public Contract(Date date, Integer number, Double totalValue) {
		this.dateOf = date;
		this.number = number;
		this.totalValue = totalValue;
	}
	
	public Date getDate() {
		return dateOf;
	}
	
	public void setDate(Date date) {
		this.dateOf = date;
	}

	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	
	public List<Installment> getList() {
		return installments;
	}
}
