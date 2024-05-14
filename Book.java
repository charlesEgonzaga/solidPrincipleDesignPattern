package solidPrincipleDesign;

 class Book implements Library {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void borrow(Student student) {
        System.out.println(student.getName() + " borrowed the book: " + getTitle());
    }
    
    public void returnResource(Student student) {
        System.out.println(student.getName() + " returned the book: " + getTitle());
    }

    public String getTitle() {
        return title;
    }
}