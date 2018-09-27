package exercises.services;

public interface IOnlinePayment {

	double paymentFee(double amount);
	double interest(double amount, int months);
}
