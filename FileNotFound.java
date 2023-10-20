public class Main {
  public static void main(String[] args) {
    try {
      FileReader reader = new FileReader("does-not-exist.txt");
    } catch (FileNotFoundException e) {
      System.out.println("The file does not exist.");
    }
  }
}
