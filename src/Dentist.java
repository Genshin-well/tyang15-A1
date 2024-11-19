/**
 * dentist class for the assignment.
 * tyang15  24274449
 */
public class Dentist extends HealthProfessional {
    private String clinic;

    public Dentist() {
        super();
        this.clinic = "Default Dental Clinic";
    }

    public Dentist(int id, String name, String specialization, String clinic) {
        super(id, name, specialization);
        this.clinic = clinic;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Type: Dentist");
        System.out.println("Clinic: " + clinic);
    }

    public String getTreatmentType() {
        return "Offering general dentistry, teeth whitening, and orthodontic services.";
    }
}
