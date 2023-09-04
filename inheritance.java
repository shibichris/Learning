class Parent {
    public void print() {
        System.out.println("Parent class !");
    }
}

class Child extends Parent {
    public void display() {
        System.out.println("Child class !");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.print();
    }
}
