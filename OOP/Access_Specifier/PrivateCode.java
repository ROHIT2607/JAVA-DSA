package OOP.Access_Specifier;

public class PrivateCode {

    protected int num =10;
    String name;
    int[] arr;

    // protected PrivateCode() {
    //     System.out.println("Im from Private Code");
    //     this.num = 10;
    // }

    // PrivateCode(int num, String name) {
    //     this.num = num;
    //     this.name = name;
    //     this.arr = new int[num];
    // }

    public int getNum() {
        return num;
    }
}
