// Handler interface defines the basic structure of a handler in the chain of responsibility pattern
public interface Handler {
    // Method to set the next handler in the chain
    void setNext(Handler handler);
    // Method to handle the student request
    void handle(StudentRequest StudentRequest);
}