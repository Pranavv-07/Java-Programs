class Demo1{
    static int x=10;
    int y=20;
    void show()
    {
        int z=30;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

class TypesofVariables {
    public static void main(String[] args) {
        Demo1 obj1=new Demo1();
        obj1.show();
        Demo1 obj2=new Demo1();
        obj2.y=40;
        obj2.show();
    }
    
}
