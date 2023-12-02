package observer;

public interface Observer {
    void update();

    //Method used by Subject to update Observer for state change
    void update(String message);

    //Attach the observer to a subject
    void setSubject(Subject subject);
}
