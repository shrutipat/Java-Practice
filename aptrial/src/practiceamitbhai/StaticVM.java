package practiceamitbhai;

public class StaticVM {
    static int a=10;
    static int b=5;
    static int c;
    static String str="Archita";
    public static void main(String[] args)
    {
        System.out.println(a);
        System.out.println(str);
        StaticVM svm = new StaticVM();
        svm.add();
    }

    void add()
    {
        StaticVM.c=StaticVM.a+StaticVM.b;
        System.out.println(StaticVM.c);
    }

}
