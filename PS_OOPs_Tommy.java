class TommyV{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

public class PS_OOPs_Tommy {
    public static void main(String[] args) {
        TommyV tm = new TommyV();
        tm.hit();
        tm.run();
        tm.fire();


    }
}
//OUTPUT
/*
Hitting the enemy
Running from the enemy
Firing on the enemy

 */