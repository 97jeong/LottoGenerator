package gernerator;

public class WinningResult {
	
	int cnt = 0;
	int[] winningResult = {0, 0, 0, 0, 0, 0};
	boolean isBonus = false;
	
	public WinningResult(int[] selNumbers, int[] winningNumbers, int bonusNumber) {
		
		for(int i = 0; i < winningNumbers.length; i++) {
			for(int j = 0; j < selNumbers.length; j++) {
				if(winningNumbers[i] == selNumbers[j]) {
					cnt++;
					winningResult[i] = winningNumbers[i];
				}
			}
		}
		
		for(int i = 0; i < selNumbers.length; i ++) {
			if(selNumbers[i] == bonusNumber) {
				isBonus = true;
			}
		}
	}
	
	public void resultInfo() {
		System.out.print("맞은 번호: ");
		for(int i = 0; i < winningResult.length; i++) {
			if(winningResult[i] != 0) {
				if(winningResult[i] < 10) {
					System.out.print("0" + winningResult[i] + " ");
				}
				else {
					System.out.print(winningResult[i] + " ");
				}
			}
		}
		System.out.println();
		System.out.print("맞은 개수: ");
		System.out.println(cnt);
		
		System.out.print("보너스 번호: ");
		if(isBonus == true) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
	}
	
	public void winningRank() {
		switch(cnt) {
		case 0: 
		case 1:
		case 2: 
			System.out.println("꽝! 다음 기회에");
			break;
		case 3:
			System.out.println("축하합니다. 5등에 당첨되었습니다.");
			break;
		case 4:
			System.out.println("축하합니다. 4등에 당첨되었습니다.");
			break;
		case 5:
			if(isBonus == true) {
				System.out.println("축하합니다. 2등에 당첨되었습니다.");
			}
			else {
				System.out.println("축하합니다. 3등에 당첨되었습니다.");
			}
			break;
		case 6:
			System.out.println("축하합니다. 1등에 당첨되었습니다.");
			break;
		}
	}
	
	public int[] getWinningResult() {
		return winningResult;
	}
	
	public int getCnt() {
		return cnt;
	}
}
