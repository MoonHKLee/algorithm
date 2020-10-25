package Ex;

public class Main {
    public static void main(String[] args)
    {
        print(1,2,3,4);
    }
    private static void print(int a, int ...v) {
        for(int x : v)
            System.out.println(x);
    }
}
