/**
 * 
 */

/**
 * @author menaka anupriya
 *
 */
public class Payment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setFirstName("Menaka");
		person.setLastName("Palani");
		person.setHourlyRate(200);
		System.out.println(person.toString());
		System.out.println(person.getPayment(300));

	}

}
