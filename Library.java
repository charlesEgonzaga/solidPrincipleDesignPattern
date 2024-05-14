package solidPrincipleDesign;

interface Library {
    void borrow(Student student);
    void returnResource(Student student);
    String getTitle();
}