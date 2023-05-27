public class Main {


    public Main() {
    }
    public static void main(String args[])
    {

        DynTurn t2=new DynTurn(1);
        t2.place(100);
        t2.place(99);
        t2.place(200);
        t2.place(199);
        t2.place(300);
        t2.place(299);
        t2.place(400);
        t2.place(1000);
        System.out.print(t2.goOut()+" ");
        System.out.print(t2.goOut()+" ");
        System.out.print(t2.goOut()+" ");
        System.out.print(t2.goOut()+" ");
    }}
