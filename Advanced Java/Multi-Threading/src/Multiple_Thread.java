public class Multiple_Thread {
    public static void main(String[] args) {
        MulNewThread nt1 = new MulNewThread("One");
        MulNewThread nt2 = new MulNewThread("Two");
        MulNewThread nt3 = new MulNewThread("Three");

        // Start the Threads
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        try{
            // Wait for other threads to end
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread Exiting.");
    }
}

class MulNewThread implements Runnable{
    String name;   // Name of the Thread
    Thread t;

    MulNewThread(String threadName){
        this.name = threadName;
        t = new Thread(this,name);
        System.out.println("New Thread : "+t);
    }

    // Entry Point for Thread

    @Override
    public void run(){
        try{
            for(int i=5; i>0; i--){
                System.out.println(name+" : "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name+" Interrupted");
        }
        System.out.println(name+" Exiting.");
    }
}
