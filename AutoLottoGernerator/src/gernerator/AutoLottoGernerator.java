package gernerator;

public class AutoLottoGernerator {
	static final int height = 5;
	static final int width = 10;
	
	public static void main(String[] args) {
	
		int[] selNumbers = new int[6];
		int[] winningNumbers = new int[6];
		
		
		printLottoNumbers();
		
		System.out.println("다음 번호 중 6개를 선택해 주세요.");
		
		SelectNumber sNumbers = new SelectNumber();
		
		// 당첨 번호 6개 출력
		System.out.println("------------------------------");
		System.out.println("        Winning Numbers       ");
		System.out.println("------------------------------");
		
		WinningNumber wNumbers = new WinningNumber();
		winningNumbers = wNumbers.getNumbers();
		printNumbers(winningNumbers);
		
		// 보너스 번호 출력
		int bonusNumber = wNumbers.getBonusNumber();
		System.out.print("+ ");
		printBonus(bonusNumber);
		
		// 선택한 번호 6개 출력
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("          selNumbers          ");
		System.out.println("------------------------------");
		
		selNumbers = sNumbers.getNumbers();
		printNumbers(selNumbers);
		
		// 당첨 결과 출력
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("            result            ");
		System.out.println("------------------------------");
		
		WinningResult wResult = new WinningResult(selNumbers, winningNumbers, bonusNumber);
		wResult.resultInfo();
		wResult.winningRank();
		
		
	}
	
	// 로또 번호지 시트 출력
	private static void printLottoNumbers() {
		int[] lottonumbers = new int[45];
		
		System.out.println("     AutoNumberGenerator      ");
		System.out.println("------------------------------");
		System.out.println("         LotteNumbers         ");
		System.out.println("------------------------------");
		
		for(int i = 0; i < lottonumbers.length; i++) {
			lottonumbers[i] = i + 1;
			if(lottonumbers[i] % 10 == 0) {
				System.out.print(lottonumbers[i] + " ");
				System.out.println();
			}
			else if(lottonumbers[i] < 10) {
				System.out.print("0" + lottonumbers[i] + " ");
			}
			else {
				System.out.print(lottonumbers[i] + " ");
			}
		}
		System.out.println();
		System.out.println("------------------------------");
	}
	
	private static void printNumbers(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < 10) {
				System.out.print("0" + numbers[i] + " ");
			}
			else {
				System.out.print(numbers[i] + " ");
			}
		}
	}
	
	private static void printBonus(int bonus) {
		if(bonus < 10) {
			System.out.print("0" + bonus);
		}
		else {
			System.out.print(bonus);
		}
	}
	/*private static void printLottonumbers() {
		int[][] lottonumbers = new int[height][width];
		
		System.out.println("     AutoNumberGenerator      ");
		System.out.println("------------------------------");
		System.out.println("         LotteNumbers         ");
		System.out.println("------------------------------");
		
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				lottonumbers[i][j] = i * width + j + 1;
				if(lottonumbers[i][j] >45) {
					break;
				}
				else if(lottonumbers[i][j] < 10){
					System.out.print("0" + lottonumbers[i][j] + " ");
				}
				else {
					System.out.print(lottonumbers[i][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------");
	}*/
}
