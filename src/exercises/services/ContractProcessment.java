package exercises.services;

import java.util.Calendar;
import java.util.Date;

import exercises.entities.Contract;
import exercises.entities.Installment;

public class ContractProcessment {
	
	private Integer months;
	private IOnlinePayment service;
	
	public ContractProcessment(Integer months, IOnlinePayment paymentMethod) {
		this.months = months;
		this.service = paymentMethod;
	}

	public void processContract(Contract contract) {
		for(int i = 0; i < months; i++) {
			Double value = service.paymentFee(service.interest(contract.getTotalValue() / months, (i + 1)));

			Calendar cal = Calendar.getInstance();
			cal.setTime(contract.getDate());
			cal.add(Calendar.MONDAY, i + 1);
			Date newDate = cal.getTime();
			
			contract.getList().add(new Installment(value, newDate));
		}
	}
}
