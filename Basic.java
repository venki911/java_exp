
class A{
    String i = "hi"
    A(){
       System.out.println("contructor A");
         System.out.println(i);
    }
     void show(){
        System.out.println("show A");
     }
     
     void test(){
        System.out.println("test");
     }
}

class B extends A{
    B(){
       System.out.println("contructor B");
    }
    
    @Override
     void show(){
        System.out.println("show B");
    }
    
     void test1(){
      System.out.println("test1");    
     }
}


public class Basic{

     public static void main(String args[]){
       A a = new B();
       a.show();
       a.test();
     }
}
