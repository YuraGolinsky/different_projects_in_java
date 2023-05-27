class A
{
    synchronized  void foo(B b)
    {
        String name=Thread.currentThread().getName();
        System.out.println(name +" вошел а Wylsacom ()");
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("A прерван");
        }
        System.out.println(name+" пытается вызвать Rozetked ()");
        b.last();
    }
    void last()
    {
        System.out.println(" внутри A.last()");
    }
}

class B
{
    synchronized  void bar(A a)
    {
        String name=Thread.currentThread().getName();
        System.out.println(name +" вошел в Jove ()");
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println("B прервано");
        }
        System.out.println(name+" пытается вызвать Т7()");
        a.last();
    }
    void last()
    {
        System.out.println(" внутри B.last()");
    }
}
public class Deadlock implements Runnable
{

    A a=new A();
    B b=new B();
    Deadlock()
    {
        Thread.currentThread().setName("MainThread");
        Thread t=new Thread(this, "RacingThread");
        t.start();
        a.foo(b);
        System.out.println("Назад в главный поток");
    }
    public void run()
    {
        b.bar(a);
        System.out.println("Назад в другой поток");
    }

    public static void main(String[] args)
    {
        new Deadlock();
    }
}
