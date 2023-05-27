interface OneFunc

{

    double func(int n,int m);

}

public class MyLambda

{

    public static void main(String args[])

    {

        OneFunc statement=(  )->Math.pow(n,m);

        System.out.println(statement.func(2,-3));

    }

