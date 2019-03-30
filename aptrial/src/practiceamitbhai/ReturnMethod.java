package practiceamitbhai;

public class ReturnMethod {

    public static void main(String[] args){

        System.out.println(add());
        System.out.println(sub());
        System.out.println(strprint());
        System.out.println(answer());
    }

    static int add(){
        int a=10;
        int b=5;
        return(a+b);
    }
    static int sub(){
        int x=500;
        int y=400;
        int ans;
        ans=x-y;
        return(ans);
    }
    static String strprint(){
        return("Archita Patel");
    }

    static boolean answer(){
        boolean abc=true;
        return(abc);
    }
}
