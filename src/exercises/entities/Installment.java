package exercises.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

	private Double value;
	private Date currentMonth;
	private SimpleDateFormat datef = new SimpleDateFormat("dd/MM/yyyy");

	public Installment(Double value, Date currentMonth) {
		this.value = value;
		this.currentMonth = currentMonth;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Date getPaymentMonth() {
		return currentMonth;
	}

	public void setPaymentMonth(Date currentMonth) {
		this.currentMonth = currentMonth;
	}
	
	public String toString() {
		return String.format("%s, %.2f", datef.format(getPaymentMonth()), getValue());
	}
}
