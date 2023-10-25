public class Example {
  public void processArray() {
    List names = new ArrayList<>();
    names.add("Eric");
    names.add("Sydney");

    Iterator iterator = names.iterator();

    while (iterator.hasNext()) {
      iterator.remove();
    }
  }
}
