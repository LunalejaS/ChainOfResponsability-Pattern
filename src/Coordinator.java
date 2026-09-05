// Coordinator is the responsible for medium complexity requests.
public class Coordinator extends BaseHandler {
    // Method to handle the student request
    @Override
    public void handle(StudentRequest studentRequest) {
        // Check if the request can be handled by the Coordinator: Complexity <= 6 and type is "Coordinator"
        if (studentRequest.getComplexity() <= 6 && studentRequest.getType().equalsIgnoreCase("Coordinator")) {
            System.out.println("+ Coordinator is handling the request: " + studentRequest.getDescription());
        } else {
            handleNext(studentRequest);
        }
    }
    
}
