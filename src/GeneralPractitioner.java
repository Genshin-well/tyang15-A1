/**
 * GeneralPractitioner class for the assignment.
 * tyang15  24274449
 */
public class GeneralPractitioner extends HealthProfessional {
    private String clinic;

    /**
     * Default constructor that initializes the GeneralPractitioner with default values.
     */
    public GeneralPractitioner() {
        super();
        this.clinic = "Default Clinic";
    }

    /**
     * Constructor that initializes the GeneralPractitioner with specified values.
     */
    public GeneralPractitioner(int id, String name, String specialization, String clinic) {
        super(id, name, specialization);
        this.clinic = clinic;
    }

    /**
     * Overrides the printDetails method to print the details of the GeneralPractitioner.
     */
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Type ------ General Practitioner");
        System.out.println("Clinic ------ " + clinic);
    }

    /**
     * return the availability of the GeneralPractitioner.
     */
    public String getAvailability() {
        return "Available from Monday to Friday, 9:00 AM to 5:00 PM";
    }
}
