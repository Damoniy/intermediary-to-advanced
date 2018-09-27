package exercises.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercises.entities.Contract;
import exercises.entities.Installment;
import exercises.services.ContractProcessment;
import exercises.services.PaypalService;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat datef = new SimpleDateFormat("dd/MM/yyyy");
				
		try {
			System.out.println("Enter the contract data: ");
			
			System.out.println("Date: ");
			Date contractDate = datef.parse(scan.nextLine());
			
			System.out.println("Number: ");
			int number = scan.nextInt();
			
			System.out.println("Total value: ");
			double value = scan.nextDouble();
			
			Contract c = new Contract(contractDate, number, value);

			System.out.println("Number of installments: ");
			int installments = scan.nextInt();
						
			ContractProcessment cp = new ContractProcessment(installments, new PaypalService());
			
			cp.processContract(c);
			
			System.out.println("Installments:");
			
			for(Installment i : c.getList()) {
				System.out.println(i.toString());
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		scan.close();
	}
}
