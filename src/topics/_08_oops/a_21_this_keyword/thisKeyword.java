//show ,show2 and main method all are print same unique id of thisKeyword Class.

package topics._08_oops.a_21_this_keyword;

public class thisKeyword {
    void show(){
        System.out.println(this);
    }
    void  show2(){
        System.out.println(this);
    }
    public static void main(String[] args) {
        thisKeyword r=new thisKeyword();
        System.out.println(r);
        r.show();
        r.show2();

    }
}

