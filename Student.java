package solidPrincipleDesign;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void borrowResource(Library resource) {
        resource.borrow(this);
    }

    public void returnResource(Library resource) {
        resource.returnResource(this);
    }

    public String getName() {
        return name;
    }
}