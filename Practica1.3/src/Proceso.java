


public class Proceso extends Thread {
	int f;
	int N;
	int [] A;
	int [][]B;
	int []C;
    Proceso(int f,int N,int[] A, int [][] B, int [] C) {
        this.f =f;
        this.N = N;
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public void run() {
        for (int i = 0; i < N; ++i){
        	C[i] = A [i]* B[i][f];
        }
    }
}
