package topics._10_data_structure.a_05_strings;

public class DifferentMethod {
    public static void main(String[] args) {
        String s1 = "   ss f    ";
        String s2 = "sfo";
        String s3 = "asc";
        String combine = s1.concat(s2).concat(s2).concat(s3);
        System.out.println(combine);
//        System.out.println(s1);
//        System.out.println(s1.trim());
        System.out.println(s1.toUpperCase());
    }
}
