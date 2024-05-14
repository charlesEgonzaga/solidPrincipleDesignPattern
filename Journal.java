package solidPrincipleDesign;

 class Journal implements Library{
    private String title;

    public Journal(String title) {
        this.title = title;
    }
 
    public void borrow(Student student) {
        System.out.println(student.getName() + " borrowed the journal: " + getTitle());
    }

    public void returnResource(Student student) {
        System.out.println(student.getName() + " returned the journal: " + getTitle());
    }
    public String getTitle() {
        return title;
    }
}