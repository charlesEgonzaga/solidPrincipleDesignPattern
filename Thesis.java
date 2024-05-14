package solidPrincipleDesign;

public class Thesis implements Library {
    private String title;

    public Thesis(String title) {
        this.title = title;
    }

    public void borrow(Student student) {
        System.out.println(student.getName() + " borrowed the thesis: " + getTitle());
    }

    public void returnResource(Student student) {
        System.out.println(student.getName() + " returned the thesis: " + getTitle());
    }

    public String getTitle() {
        return title;
    }
}