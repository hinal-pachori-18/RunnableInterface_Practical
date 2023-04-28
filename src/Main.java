class myRunnable implements Runnable {
    @Override
    public void run() {
        //Displaying the threads
        System.out.println("Name of the thread is : "+ Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args){
        myRunnable runnable  = new myRunnable();
        for (int i = 0; i < 4; i++) {
            Thread threadObject = new Thread(runnable);
            threadObject.start();
        }
    }
}