package task2;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        WebsiteStatistics statistics = new WebsiteStatistics();

        String filePath = "website_visits.txt";
        List<WebsiteVisit> visits = statistics.loadVisits(filePath);

        Map<LocalDate, Map<String, Website>> visitStatistics = statistics.analyzeVisits(visits);

        statistics.displayStatistics(visitStatistics);
    }
}
