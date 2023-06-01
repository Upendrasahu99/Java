
package topics._08_oops.a_25_inheritance;

class SimpleInheritance {//Super class
    int n;
    String name; //Private value not be accessible in inheritance

    void input() {
        System.out.println("Enter tha value of n and name");
    }
}

class B extends SimpleInheritance {  //Subclass
    void disp() {
        n = 5;
        name = "tom";
        System.out.println(n + " " + name);
    }

    public static void main(String[] args) {
        B ref = new B(); //Create object of subclass and use feature of Super class
        ref.input();
        ref.disp();
    }
}

