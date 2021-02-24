


public class Proceso extends Thread {
    int id;
    int T;
    Proceso(int id,int T) {
        this.id =id;
        this.T = T;
    }

    public void run() {
        System.out.println(id);
        try {
			Thread.sleep(T);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(id);
    }
}
