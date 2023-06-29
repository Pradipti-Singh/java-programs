//PROBLEM:Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.

class CellPhone{
    public void Ring(){
        System.out.println("Ringing....");
    }
    public void Vibrate(){
        System.out.println("Vibrating....");
    }
    public void Call(){
        System.out.println("Calling....");
    }
}

public class PS_OOPs_CellP {
    public static void main(String[] args) {
        CellPhone mobile = new CellPhone();
        mobile.Ring();
        mobile.Vibrate();
        mobile.Call();

    }
}

//OUTPUT
/*
Ringing....
Vibrating....
Calling....
 */
