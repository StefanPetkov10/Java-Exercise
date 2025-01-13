package task2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WebsiteVisit implements Visit {
    LocalDate visitDate;
    private String url;

    public WebsiteVisit(LocalDate visitDate, String url) {
        this.visitDate = visitDate;
        this.url = url;
    }

    @Override
    public LocalDate getDate() {
        return visitDate;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
