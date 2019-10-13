package uczen;

public class ClassStudent extends SchoolStudent {

    private int classNr;

    public ClassStudent() {
    }

    public ClassStudent(int classNr, SchoolStudent schoolStudent) {
        super(schoolStudent);
        this.classNr = classNr;
    }

    public int getClassNr() {
        return classNr;
    }

    public void setClassNr(int classNr) {
        this.classNr = classNr;
    }
}