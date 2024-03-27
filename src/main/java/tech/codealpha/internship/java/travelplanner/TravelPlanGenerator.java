package tech.codealpha.internship.java.travelplanner;

import java.util.Random;

public class TravelPlanGenerator {

    // OpenWeather API
    private static final String API_KEY = "701d2ebcb83fb7030e4f7f1aaab33cd1\n";

    public void generatePlan(String destination, String date, String preferences) {
        WeatherInfo weatherInfo = fetchWeather(destination);

        System.out.println("Weather information for " + destination + " on " + date + ":");
        System.out.println("Temperature: " + weatherInfo.getTemperature() + "°C");
        System.out.println("Weather: " + weatherInfo.getDescription());

        int budget = calculateBudget(preferences);

        System.out.println("Estimated budget for the trip to " + destination + ": $" + budget);
    }

    private WeatherInfo fetchWeather(String destination) {
        Random rand = new Random();
        double temperature = rand.nextDouble() * 30; // Random temperature between 0 and 30°C
        String[] descriptions = {"Sunny", "Cloudy", "Rainy", "Snowy"};
        String description = descriptions[rand.nextInt(descriptions.length)]; // Random weather description
        return new WeatherInfo(temperature, description);
    }

    private int calculateBudget(String preferences) {
        Random rand = new Random();
        int minBudget = 1000;
        int maxBudget = 5000;
        int budget = rand.nextInt(maxBudget - minBudget + 1) + minBudget;
        if (preferences.toLowerCase().contains("luxury")) {
            budget += 1000;
        }
        return budget;
    }

    public static class WeatherInfo {
        private final double temperature;
        private final String description;

        public WeatherInfo(double temperature, String description) {
            this.temperature = temperature;
            this.description = description;
        }

        public double getTemperature() {
            return temperature;
        }

        public String getDescription() {
            return description;
        }
    }
}
