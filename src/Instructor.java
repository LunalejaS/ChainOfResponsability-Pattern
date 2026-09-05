// Instructor is the responsable of minimum complexity requests.
public class Instructor extends BaseHandler {
    // Method to handle the student request
    @Override
    public void handle(StudentRequest studentRequest) {
        // Check if the request can be handled by the Instructor: Complexity <= 3 and type is "Instructor"
        if (studentRequest.getComplexity() <= 3 && studentRequest.getType().equalsIgnoreCase("Instructor")) {
            System.out.println("+ Instructor is handling the request: " + studentRequest.getDescription());
        } else {
            handleNext(studentRequest);
        }
    }
}