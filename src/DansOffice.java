// Dan's Office is the responsable for hard requests with complexity greater than 8.
public class DansOffice extends BaseHandler {
    // Method to handle the student request
    @Override
    public void handle(StudentRequest studentRequest) {
        // Check if the request can be handled by Dan's Office: Complexity > 8 and type is "Dan's Office"
        if (studentRequest.getComplexity() > 8 && studentRequest.getType().equalsIgnoreCase("Dan's Office")) {
            System.out.println("+ Dan's Office is handling the request: " + studentRequest.getDescription());
        } else {
            handleNext(studentRequest);
        }
    }
}