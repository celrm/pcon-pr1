


public class Decrementar extends Thread {
    WrapInt n;
    int N;
    Decrementar(WrapInt n,int N) {
        this.n =n;
        this.N = N;
    }

    public void run() {
        for (int i = 0; i < N; ++i){
        	--n.value;
        }
    }
}
