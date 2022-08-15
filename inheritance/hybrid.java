
interface ab{
    int a = 10;
    int b = 20;
}
interface bc{
    int x = 30;
    int y = 40;
}
interface cd{
    int p = 50;
    int q = 60;
}
class de implements ab, bc, cd{
    public static void main(String[] args){
        
    }
    
}
class xy extends de{
    int ans = b * y * q; 
}
class yz extends de{
    int ans = a * x * p;
}
