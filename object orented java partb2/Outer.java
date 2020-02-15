public class Outer {
    int x = 10;
    void p(){
        Inner inn = new Inner();
        inn.pp();
        int iny = inn.y;
        System.out.println(iny);
    }
    class Inner{
        int y = 20;
        void pp(){
            System.out.println(x);
        }
    }
}
