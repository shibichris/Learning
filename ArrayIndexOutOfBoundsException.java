public class Main {
  public static void main(String[] args) {
    int[] numbers = new int[5];
    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;
    numbers[3] = 4;
    numbers[4] = 5;

    // This will cause an ArrayIndexOutOfBoundsException
    System.out.println(numbers[6]);
  }
}
