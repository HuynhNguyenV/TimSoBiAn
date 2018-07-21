import java.util.Scanner;

public class TimSoBiAn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 100;
		int min = 1;
		
		int range= (max - min) + 1;
		
		int randomNumber = (int)(Math.random() * range) - min;
		
		Scanner kb = new Scanner(System.in);
		
		int duDoan = 0;
		int score = 0;
		while(duDoan != randomNumber) {
			System.out.println("du doan con so tu 1 -> 100: ");
			duDoan = kb.nextInt();
			kb.nextLine();
			
			if(duDoan > randomNumber) {
				System.out.println("du doan > so can tim, moi ban nhap lai!");
			}else if(duDoan < randomNumber) {
				System.out.println("du doan < so can tim, moi ban nhap lai!");
			}else {
				System.out.println("ban da nhap dung so can tim la " + randomNumber);
			}
			score++;
		}
		System.out.println("so lan ban nhap " + score);
		kb.close();
		
	}

}
