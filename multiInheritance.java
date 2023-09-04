interface Practical {

    void printPracticalExaminationTime();
}

interface  Viva {

    void printVivaTime();
}

class Examination implements Practical, Viva{

    void printMarks(){
        System.out.println("10 Marks");
    }

    @Override
    public void printPracticalExaminationTime() {
        System.out.println("Practical examination will be at 9 AM");
    }

    @Override
    public void printVivaTime() {
        System.out.println("Viva examination will be at 12 PM");

    }

    public static void main(String[] args) {
        Examination obj = new Examination();
        obj.printPracticalExaminationTime();
        obj.printVivaTime();
        obj.printMarks();
    }
}
