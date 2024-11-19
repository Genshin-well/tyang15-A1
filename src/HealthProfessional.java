/**
 * GeneralPractitioner class for the assignment.
 * tyang15  24274449
 */
public class HealthProfessional {
    private int id;
    private String name;
    private String specialization;

    /**
     * Default constructor
     */
    public HealthProfessional() {
        this.id = 0;
        this.name = "undefined";
        this.specialization = "general";
    }

    /**
     * Prints the details of the HealthProfessional
     */
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
    }


    /**
     * Constructor that initializes a HealthProfessional with specified values.
     */
    public HealthProfessional(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }


    /**
     * Gets the ID of the HealthProfessional.
     * return The id of the health professional.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the name of the HealthProfessional and return the name
     * */
    public String getName() {
        return name;
    }
}
