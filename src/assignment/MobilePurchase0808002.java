package assignment;

		// 08.08.2022-Q2.-- Mobile phone purchase -
		// 10,000 & less than 10,000 --- will be purchase Red-Mi mobile
		// 10,001 to 20,000 -- will be purchase Samsung mobile
		// 21,000 to 30,000 -- will be purchase One Plus mobile
		// 31,000 to 50,000 -- will be purchase One Plus Note mobile

public class MobilePurchase0808002 {

	public static void main(String[] args) {
		
		System.out.println("Mobile Phone Purchase");
		
		//Local Variable
		int price = 41500;
		
		if (price<=10000) {
			
			System.out.println("I want to purchase Red-Mi mobile");
		}
		else if (price>=10001 & price<=20000) {
			
			System.out.println("I want to purchase Samsung mobile");
		}
		else if (price>=21000 & price<=30000) {
			
			System.out.println("I want to purchase One Plus mobile");
		}
		else if (price>=31000 & price<=50000) {
			System.out.println("I want to purchase One Plue Note mobile");
		}
	}

}
