public class IsAlive_Join {
    public static void main(String[] args) {
        NewThread1 nt1 = new NewThread1("One");
        NewThread1 nt2 = new NewThread1("Two");
        NewThread1 nt3 = new NewThread1("Three");

        // Start the Threads
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        System.out.println("Thread One is Alive : "+nt1.t.isAlive());
        System.out.println("Thread Two is Alive : "+nt2.t.isAlive());
        System.out.println("Thread Three is Alive : "+nt3.t.isAlive());

        // Wait for Threads to Finish
        try{
            System.out.println("Waiting for Threads to Finish.");
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        }catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }

        System.out.println("Thread One is Alive : "+nt1.t.isAlive());
        System.out.println("Thread Two is Alive : "+nt2.t.isAlive());
        System.out.println("Thread Three is Alive : "+nt3.t.isAlive());

        System.out.println("Main Thread Exiting.");
    }
}


class NewThread1 implements Runnable{
    String name;   // Name of the Thread
    Thread t;

    NewThread1(String threadName){
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
