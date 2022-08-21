class Call_me {
   synchronized void call(String msg) {    // Synchronized Function
        System.out.print("["+msg);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable{
    String msg;
    Call_me target;
    Thread t;

    public Caller(Call_me targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
    }

    public void run(){
        target.call(msg);
    }
}

public class Synchronization {
    public static void main(String[] args) {
        Call_me target = new Call_me();
        Caller obj1 = new Caller(target,"Hello");
        Caller obj2 = new Caller(target,"Synchronized");
        Caller obj3 = new Caller(target,"World");

        // Start the Threads

        obj1.t.start();
        obj2.t.start();
        obj3.t.start();

        // Wait for Thread to end
        try{
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("Main Thread Ended");
    }
}
