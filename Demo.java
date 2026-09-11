import java.lang.*;
class op{
void dis(){
int a=5;
int b=4;
System.out.println("increment=" + (a++));
System.out.println("decrement=" + (a--));
System.out.println("conditional a==b" + (a==b));
System.out.println("increment=" + (a!=b));
}
}
class Demo{
public static void main(String arr[]){
op o=new op();
o.dis();
}
}

