// Student Request defines the basic structure of a acceptable student request.
public class StudentRequest {

    // Definition of the attributes of a common student request
    private int complexity;
    private String type;
    private String description;

    //Constructor
    public StudentRequest(int complexity, String type, String description) {
        this.complexity = complexity;
        this.type = type;
        this.description = description;
    }

    // Getters
    public int getComplexity() {
        return complexity;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}