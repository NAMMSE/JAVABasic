
public class B16_Array2 {

	public static void main(String[] args) {
		/*
		 * 배열 안에도 배열을 넣을 수 있다. (배열로 이루어진 배열을 만들 수 있다.)
		 */
		int[] numbers = { 1, 2, 3, 4, 5 };
		int[][] numbers2 = {numbers, {6, 7, 8, 9, 0}, numbers, numbers};
		
		System.out.println(numbers[3]);
		System.out.println(numbers2[0]); 	//0번째 위치의 int[]을 가리킴
		System.out.println(numbers2[0][0]);	//0번째 위치 int[]의 0번째 요소를 가리킴
		
		numbers2[0][2] = 33;
		
		System.out.println(numbers2[0][2]); // [0][2]를 33으로 바꿨는데
		System.out.println(numbers2[3][2]); // [3][2]도 33으로 나오는 현상
		System.out.println(numbers2[1][2]); // numbers가 아닌 12345로 다시 지정한 배열은 다른 주소값을 가지고 있어서 다른 곳을 가리킴
		System.out.println(numbers2[2][2]);
		
		System.out.println(numbers2[0]);
		System.out.println(numbers2[1]);
		System.out.println(numbers2[2]);
		System.out.println(numbers2[3]);
		
		
		
		/*
		  n차원 배열은 n중 반복문으로 모두 탐색할 수 있다.
		 */
		
		char[][] chs = {
				{'a', 'b', 'c' ,'d'},
				"Hello, world!".toCharArray(),
				"I have a dream".toCharArray()	,
				{'x','y'}
				};
		
		System.out.println(chs[2][3]);
		
//		char[][][] today_char_log= { 이런식으로 n차원 배열 가능
//				chs,
//				chs2,
//				chs3,
//		};
		
		for(int i=0;i<chs.length;i++) {
			char[] arr = chs[i];
			
			//System.out.println(arr);
			
			for(int j=0;j<chs[i].length;j++) {
				System.out.printf("chs[%d][%d] : %c\n",i,j,chs[i][j]);
			}
			}
		
	}
}
