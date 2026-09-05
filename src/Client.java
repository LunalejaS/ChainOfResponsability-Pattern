// Provide the implementation of the chain of responsibility pattern for handling student requests
public class Client {
    public static void main(String[] args) {
        // Create the handlers
        Instructor instructor = new Instructor();
        Professor professor = new Professor();
        Coordinator coordinator = new Coordinator();
        Secretariat secretariat = new Secretariat();
        DansOffice dansOffice = new DansOffice();
        

        // Set the chain of responsibility
        instructor.setNext(professor);
        professor.setNext(coordinator);
        coordinator.setNext(secretariat);
        secretariat.setNext(dansOffice);

        // Cases: (Requests with different complexity and types)
        // Case 1: Request for Instructor
        StudentRequest request1 = new StudentRequest(1, "Instructor", "I need a explanation of a variable in the class project example.");
        // Case 2: Request for Professor
        StudentRequest request2 = new StudentRequest(4, "Professor", "I need a recommendation letter for my master's application.");
        // Case 3: Request for Coordinator
        StudentRequest request3 = new StudentRequest(6, "Coordinator", "I need to change my class schedule.");
        // Case 4: Request for Secretariat
        StudentRequest request4 = new StudentRequest(7, "Secretariat", "I need to request a transcript of my grades.");
        // Case 5: Request for DansOffice
        StudentRequest request5 = new StudentRequest(9, "Dan's Office", "I need to submit my thesis for review.");
        // Case 6: Nobody can handle this request
        StudentRequest request6 = new StudentRequest(12, "Unknown", "I need to medical excuse.");
        
        // Handle the requests
        // Note: All the request start in the same point (Instructor) and will be passed through the chain of responsibility until one of the handlers can handle it.
        System.out.println("*** HANDLING REQUEST 1:");
        instructor.handle(request1);
        System.out.println("\n*** HANDLING REQUEST 2:");
        instructor.handle(request2);
        System.out.println("\n*** HANDLING REQUEST 3:");
        instructor.handle(request3);
        System.out.println("\n*** HANDLING REQUEST 4:");
        instructor.handle(request4);
        System.out.println("\n*** HANDLING REQUEST 5:");
        instructor.handle(request5);
        System.out.println("\n*** HANDLING REQUEST 6:");
        instructor.handle(request6);
    }
}
