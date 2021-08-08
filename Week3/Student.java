package student;

public class Student {
    /* Create any necessary variables here */
    private String studentName;
    private String studentAddress;
    private int studentPostCode;
    private double studentGpa;

    /**
     * Initialises the class information including student name, postcode,
     * address and gpa.
     * @param name The student's name.
     * @param address The student's current residential address.
     * @param postCode The student's current residential postcode.
     * @param gpa The student's current gpa.
     */
    public Student(String name, String address, int postCode, double gpa) {
        studentName = name;
        studentAddress = address;
        studentPostCode = postCode;
        studentGpa = gpa;
    }

    /**
     * Returns the student's name.
     * @return Student's name.
     */
    public String getName() {
        return studentName;
    }
    /**
     * Returns the student's address.
     * @return Student's address.
     */
    public String getAddress() {
        return studentAddress;
    }
    /**
     * Returns the student's postcode.
     * @return Student's postcode.
     */
    public int getPostCode() {
        return studentPostCode;
    }
    /**
     * Returns the student's gpa.
     * @return Student's gpa.
     */
    public double getGPA() {
        return studentGpa;
    }

    /**
     * Change the student's name.
     * @param name Student's new name.
     */
    public void setName(String name) {
        studentName = name;
    }
    /**
     * Change the student's address.
     * @param address Student's new address.
     */
    public void setAddress(String address) {
        studentAddress = address;
    }
    /**
     * Change the student's postcode.
     * @param postCode Student's new postcode.
     */
    public void setPostCode(int postCode) {
        studentPostCode = postCode;
    }
    /**
     * Change the student's gpa.
     * @param gpa Student's new gpa.
     */
    public void setGPA(double gpa) {
        studentGpa = gpa;
    }
}
