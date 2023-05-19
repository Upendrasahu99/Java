package topics._10_data_structure.a_05_strings;

public class StringExample {
    public static void main(String[] args) {
//        String s = "ram";
//        System.out.println(s.charAt(1));
//        System.out.println(s.toUpperCase());
        String sentence="ram is going";
        String sentence2=sentence.replaceAll(""," ");//  "\\s"is use for space, tab space , long space etc. but only for single space we can use " ".
        System.out.println(sentence2);
////        String originalString = "ram is going";
////        String replacedString = originalString.replaceFirst("^(\\S+\\s+\\S+)\\s", "$1_");
////
////        System.out.println(replacedString);

    }
}
