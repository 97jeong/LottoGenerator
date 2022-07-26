package gernerator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SelectNumber {

	int[] numbers = new int[6];
	
	@SuppressWarnings("resource")
	public SelectNumber() {
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < numbers.length; i++) {
			
			// 6개 번호 선택
			while(true) {
				try{
					System.out.print( (i+1) + "번째 번호> ");
					numbers[i] = sc.nextInt();
					while((numbers[i] < 1 || numbers[i] > 45)) {
						System.out.println("1 ~ 45의 숫자를 입력하세요.");
						System.out.print( (i+1) + "번째 번호> ");
						numbers[i] = sc.nextInt();
						}
					break;
					}catch(InputMismatchException e) {
						sc.nextLine();
						System.out.println("숫자를 입력해주세요.");
					}
			}
			
			// 중복 검사 및 선택 범위 검사
			for(int j = 0; j < i; j++) {
				if(numbers[i] == numbers[j]) {
					System.out.println("이미 선택한 숫자입니다.");
					i--;
				}
					
				if(numbers[i] < 1 || numbers[i] > 45) {
					System.out.println("1 ~ 45의 숫자를 입력하세요.");
					i--;
				}
			}

		}
		SortASC();	
	}
	
	public int[] getNumbers() {
		return numbers;
	}
	
	
	// 오름차순 정렬
	public void SortASC() {
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < i; j++) {
				if(numbers[i] < numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}
}