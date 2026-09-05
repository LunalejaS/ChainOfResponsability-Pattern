// Professor is the responsible for requests with less complexity.
public class Professor extends BaseHandler {
    // Method to handle the student request
    @Override
    public void handle(StudentRequest studentRequest) {
        // Check if the request can be handled by the Professor: Complexity <= 5 and type is "Professor"
        if (studentRequest.getComplexity() <= 5 && studentRequest.getType().equalsIgnoreCase("Professor")) {
            System.out.println("+ Professor is handling the request: " + studentRequest.getDescription());
        } else {
            handleNext(studentRequest);
        }
    }
}