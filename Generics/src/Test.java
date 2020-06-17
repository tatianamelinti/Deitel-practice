public class Test {
    public static void main(String[] args) {
       // !!!IF GENERIC CLASS IS ABSTRACT IT CAN NOT BE INSTANTIETED!!!
        Field f1= new Field(2,5);
        Field f2 = new Field(4,5);
        System.out.println(f1.getValue1()+" " +f1.getValue2());
        System.out.println(f2.getValue1()+" "+f2.getValue2());
    }
}
