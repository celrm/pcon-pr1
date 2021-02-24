


public class Incrementar extends Thread {
    WrapInt n;
    int N;
    Incrementar(WrapInt n,int N) {
    	this.n = n;
        this.N = N;
    }

    public void run() {
        for (int i = 0; i < N; ++i){
        	++n.value;
        }
    }


}
