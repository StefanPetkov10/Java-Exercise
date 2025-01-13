package task2;

public class Website {
    String url;
    int visits;

    public Website(String url) {
        this.url = url;
        this.visits = 0;
    }

    public void incrementVisits() {
        visits++;
    }
}
