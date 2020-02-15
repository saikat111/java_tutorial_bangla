public class Demo2 {
    String name1,name2;
    int a,b;
    float num1,num2;
    Demo2(String name1, String name2,int a,int b){
        this.name1 = name1;
        this.name2 = name2;
        this.a = a;
        this.b = b;
    }
    Demo2(){
         a= 5;
         b= 10;
    }
    Demo2(float num1,float num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    void name(){
        System.out.println(name1 + " " + name2 + " " + a + " "+ b);
    }
    void floatD(){
        System.out.println(num1 + " " + num2);
    }
    void ab(){
        System.out.println(a + " " + b);
    }
}
