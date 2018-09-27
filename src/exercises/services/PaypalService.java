package exercises.services;

public class PaypalService implements IOnlinePayment {

	@Override
	public double paymentFee(double amount) {
		return amount * 1.02;
	}

	@Override
	public double interest(double amount, int months) {
		return amount * (1 + (months * 0.01));
	}

}
