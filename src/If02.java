
public class If02 {
	public static void main(String[] args) {
		int number = 7;

		if (number < 5) {
			System.out.println(number + "は5未満です");
		} else if (number < 10) {
			System.out.println(number + "は5以上10未満です");
		} else {
			System.out.println(number + "は15未満では無いです");
		}
	}
}
