
public class main {

	public static void main(String[] args) {
		int N = 3;
		int[][] A = new int [N][N];
		int[][] B = new int [N][N];
		int[][] C = new int [N][N];

		for (int i = 0; i< N; ++i){
			for (int j = 0; j < N; ++j){
				if (i == j) {A[i][j] = 1; B[i][j] = 1;}
				else {A[i][j] = 0; B[i][j] = 0;}
			}
		}
		
		A[0][0] = 2;
		Proceso[] threads = new Proceso[N];
		for (int i = 0; i < N; ++i){
			threads[i] = new Proceso(i,N,A[i],B,C[i]);
			threads[i].start();
		}
		for (int i = 0; i < N; ++i){
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (int i = 0; i < N; ++i){
			for (int j = 0; j < N; ++j){
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
	}
}
