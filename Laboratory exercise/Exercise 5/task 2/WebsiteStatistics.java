package task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class WebsiteStatistics {
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public List<WebsiteVisit> loadVisits(String filePath) {
        List<WebsiteVisit> visits = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            for (String line : lines) {
                String[] parts = line.split(" ");
                if (parts.length < 2) {
                    System.out.println("Неправилен формат на реда: " + line);
                    continue;
                }

                LocalDate date = LocalDate.parse(parts[0], DATE_FORMAT);
                String url = parts[1];
                visits.add(new WebsiteVisit(date, url));
            }

        } catch (IOException e) {
            System.out.println("Грешка при четене на файла: " + e.getMessage());
        } catch (DateTimeParseException e) {
            System.out.println("Грешка при форматирането на датата.");
        }
        return visits;
    }

    public Map<LocalDate, Map<String, Website>> analyzeVisits(List<WebsiteVisit> visits) {
        Map<LocalDate, Map<String, Website>> dailyStatistics = new HashMap<>();

        for (WebsiteVisit visit : visits) {
            LocalDate date = visit.getDate();
            String url = visit.getUrl();

            dailyStatistics.putIfAbsent(date, new HashMap<>());
            Map<String, Website> websites = dailyStatistics.get(date);

            websites.putIfAbsent(url, new Website(url));
            websites.get(url).incrementVisits();
        }
        return dailyStatistics;
    }

    public void displayStatistics(Map<LocalDate, Map<String, Website>> statistics) {
        for (LocalDate date : statistics.keySet()) {
            System.out.println("Дата: " + date);
            Map<String, Website> websites = statistics.get(date);

            int totalVisits = websites.values().stream().mapToInt(site -> site.visits).sum();
            System.out.println("Общ брой посещения: " + totalVisits);

            Website leastVisited = Collections.min(websites.values(), Comparator.comparingInt(site -> site.visits));
            System.out.println("Най-малко посещаван сайт: " + leastVisited.url + " с " + leastVisited.visits + " посещения\n");
        }
    }
}