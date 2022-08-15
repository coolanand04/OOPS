class abc{
    int a  = 10;
    int b = 20;
}
class xyz extends abc{

}
class pqr extends abc{

    void add()
    {
        int ans = a + b;
        System.out.println(ans);
    }
}
public class Main {
    
    public static void main(String[] args) {
        pqr q = new pqr();
        q.add();
    }
}
