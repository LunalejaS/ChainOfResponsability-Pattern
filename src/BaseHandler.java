// BaseHandler is an optional abstract class, but in this case we use it for more clean implementation.
// It implements the Handler interface and provides a default implementation for setting the next handler in the chain.
public abstract class BaseHandler implements Handler {
    // Reference to the next handler in the chain
    protected Handler nextHandler;

    // Method to set the next handler in the chain
    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    // Method to handle the student request
    protected void handleNext(StudentRequest studentRequest) {
        if (nextHandler != null) {
            // Shows to the user the current handler and the next handler in the chain -> The complete flow of the request can be seen in the console.
            System.out.println("-> " + getClass().getSimpleName() + " cannot handle the request; passing responsibility to " + nextHandler.getClass().getSimpleName() + "...");
            nextHandler.handle(studentRequest);
        } else {
            // If there is no next handler, it means that the request cannot be handled by any of the handlers in the chain.
            System.out.println(" X No handler available to process the request.");
        }
    }
}