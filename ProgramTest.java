package solidPrincipleDesign;

public class ProgramTest {
    public static void main(String[] args) {
        Student student = new Student("Charles Erwin Gonzaga");

        Book book = new Book("Programming Tutorial");
        Journal journal = new Journal("The Reporter's Journals of Mike Enqriquez");
        Library thesis = new Thesis("Role of General AI to Society");

        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(thesis);

        System.out.println();

        student.returnResource(book);
        student.returnResource(journal);
        student.returnResource(thesis);

    }
}