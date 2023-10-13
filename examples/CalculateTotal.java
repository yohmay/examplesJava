public class CalculateTotal {

  private static double total = 0;
  private static int prod = 10;
  private static int quantity = 15;
  private static int age = 31;
  private static String name = "Alex Fernando";

  public static void main(String[] args) {
    total = (prod * quantity) * 5;
    System.out.println(total);
    if (age == 31) {
      System.out.println(name);
    }
    age = 33;
    if (age == 33) {
      name += " Egidio";
      System.out.println(name);
    }
  }
}
