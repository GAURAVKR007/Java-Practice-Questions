// A correct Implementation of a Producer and consumer
class buffer{
    int n;
    boolean valueSet = false;

    synchronized void get(){
        while(!valueSet)
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("Interrupted Exception Occurred");
            }
        System.out.println("Got : "+n);
        valueSet =false;
        notify();
    }

    synchronized void put(int n){
        while(valueSet)
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("Interrupted Exception Occurred");
            }
        this.n = n;
        valueSet = true;
        System.out.println("Put : "+n);
        notify();
    }
}

class Producer implements Runnable{
    buffer b;
    Thread t;

    Producer(buffer b){
        this.b = b;
        t = new Thread(this,"Producer");
    }

    public void run(){
        int i=0;
            while (i<=10) {
                b.put(i++);
            }
    }
}

class Consumer implements Runnable{
    buffer b;
    Thread t;

    Consumer(buffer b){
        this.b = b;
        t = new Thread(this, "Consumer");
    }

    public void run(){
        int i = 0;
            while (i<=10) {
                b.get();
                i++;
            }
        }
    }


public class Producer_Consumer {
    public static void main(String[] args) {
        buffer b = new buffer();
        Producer p = new Producer(b);
        Consumer c = new Consumer(b);

        // Start The thread
        p.t.start();
        c.t.start();

    }
}
