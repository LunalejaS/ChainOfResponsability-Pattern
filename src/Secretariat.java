// Secretariat is the responsible for medium-hard complexity requests.
public class Secretariat extends BaseHandler {
    // Method to handle the student request
    @Override
    public void handle(StudentRequest studentRequest) {
        // Check if the request can be handled by the Secretariat: Complexity <= 8 and type is "Secretariat"
        if (studentRequest.getComplexity() <= 8 && studentRequest.getType().equalsIgnoreCase("Secretariat")) {
            System.out.println("+ Secretariat is handling the request: " + studentRequest.getDescription());
        } else {
            handleNext(studentRequest);
        }
    }
    
}