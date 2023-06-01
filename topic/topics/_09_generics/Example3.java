package topics._09_generics;

class Example3 {
    <T> void print(T data) {
     System.out.println(data);
    }

 public static void main(String[] args) {
  Example3 printData = new Example3();
  printData.print("name");
  printData.print(4);
  printData.print(5.6);
 }
}
