package practiceamitbhai;

public class InstanceVM {
    int a=10;
    int b=5;
    int c;
    String str="Archita";
    public static void main(String[] args){
        InstanceVM ivm = new InstanceVM();
        System.out.println(ivm.a);
        System.out.println(ivm.str);
        ivm.add();
        System.out.println(ivm.c);
    }

    void add(){
        c=a+b;

    }

}
