
public class main {
	
	public static void main(String[] args) {
		int N = 10;
		int T = 500;
		Proceso[] threads = new Proceso[N];
		for (int i = 0; i < N; ++i){
			threads[i] = new Proceso(i,T);
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
		System.out.println("Ha terminado la ejecución de todos los Threads");
	}
}
