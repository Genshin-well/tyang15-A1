/**
 * Appointment class for releasing the booking made by a patient with a health professional.
 * tyang15  24274449
 */

public class Appointment {
    private String patientName;
    private String mobilePhone;
    private String timeSlot;
    private HealthProfessional doctor;

    /**
     * Default constructor initializing default values for an appointment.
     */
    public Appointment() {
        this.patientName = "undefined";
        this.mobilePhone = "0000000000";
        this.timeSlot = "00:00";
        this.doctor = null;
    }

    /**
     * constructor with parameters for creating a new appointment with specific details.
     */
    public Appointment(String patientName, String timeSlot, String mobilePhone, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    /**
     * Gets the mobile phone number of the patient for the appointment.
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Prints the details of the appointment.
     */
    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Doctor Details:");
        if (doctor != null)
            doctor.printDetails();
        else
            System.out.println("No doctor was found.");
    }
}
