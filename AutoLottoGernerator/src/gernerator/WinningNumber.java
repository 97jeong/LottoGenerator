package gernerator;

public class WinningNumber {
	
	static final int RANGE = 45;
	int[] numbers = new int[6];
	int bonusNumber = 0;
	int temp = 0;
	
	public WinningNumber() {
		// 당첨번호 6개 랜덤 생성
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * RANGE) + 1;
			for(int j = 0; j < i; j++) {
				if(numbers[i] == numbers[j]) {
					i--;
				}
			}
		}
		
		// 보너스번호 1개 랜덤 생성
		boolean isChecked = true;
		while(isChecked) {
			bonusNumber = (int)(Math.random() * RANGE) + 1;
			for(int i = 0; i < numbers.length; i++) {
				if(bonusNumber == numbers[i]) {
					isChecked = true;
					break;
				}
				else {
					isChecked = false;
				}
			}
		}
		SortASC();
	}
	
	public int[] getNumbers() {
		return numbers;
	}
	
	public int getBonusNumber() {
		return bonusNumber;
	}
	
	// 당첨번호 오름차순 정렬
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
