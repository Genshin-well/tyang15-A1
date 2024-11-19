import java.util.ArrayList;
/**
 * main class for the assignment.
 * tyang15  24274449
 */
public class AssignmentOne {
    // arraylist for appointments
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    /**
     * creates a new appointment and adds it to the appointments list.
     */
    public static void createAppointment(String patientName, String timeSlot, String mobilePhone, HealthProfessional doctor) {
        if (patientName == null || mobilePhone == null || timeSlot == null || doctor == null) {
            System.out.println("some information is missing.Phone number is required");
            return;
        }
        appointments.add(new Appointment(patientName, mobilePhone, timeSlot, doctor));
    }

    /**
     * prints the details of all existing appointments.
     */
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }

        appointments.forEach(appointment -> {
            System.out.println("------------------------------");
            appointment.printDetails();
        });
    }

    /**
     * cancel booking by the phone number.
     */
    public static void cancelBooking(String mobilePhone) {
        boolean removed = appointments.removeIf(appointment -> appointment.getMobilePhone().equals(mobilePhone));

        if (removed) {
            System.out.println("Appointment canceled for mobile: " + mobilePhone);
        } else {
            System.out.println("No related record with: " + mobilePhone);
        }
    }


    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("// Part 3 – Using classes and objects");

        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. James", "Pediatrics", "Health Clinic A");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Olivia", "General Medicine", "Family Health Clinic");
        Dentist dt1 = new Dentist(3, "Dr. Emily", "Orthodontics", "Smile Dental Clinic");
        Dentist dt2 = new Dentist(4, "Dr. Lucas", "Periodontics", "Bright Smiles Dental");

        gp1.printDetails();
        gp2.printDetails();
        dt1.printDetails();
        dt2.printDetails();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        System.out.println("// Part 5 – Collection of appointments");

        createAppointment("Sophia", "1234567890", "10:30", gp1);
        createAppointment("Liam", "9876543210", "12:00", gp2);
        createAppointment("Mason", "5555555555", "14:15", dt1);
        createAppointment("Isabella", "5556667778", "16:00", dt2);

        System.out.println("Existing Appointments:");
        printExistingAppointments();

        cancelBooking("1234567890");
        cancelBooking("0000");
        System.out.println("Updated Appointments:");
        printExistingAppointments();
        System.out.println("------------------------------");
    }
}
