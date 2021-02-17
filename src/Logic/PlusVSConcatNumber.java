package Logic;

// ANSWER  -->72 7 34 foo34 7foo

public class PlusVSConcatNumber 
{
    public static void main(String args[]) 
    {
        PlusVSConcatNumber s = new PlusVSConcatNumber();
        s.start();
    }

    void start() 
    {
        int a = 3;
        int b = 4;
        System.out.print(" " + 7 + 2 + " ");
        System.out.print(a + b);
        System.out.print(" " + a + b + " ");
        System.out.print(foo() + a + b + " ");
        System.out.println(a + b + foo());
    }

    String foo() 
    {
        return "foo";
    }
}
