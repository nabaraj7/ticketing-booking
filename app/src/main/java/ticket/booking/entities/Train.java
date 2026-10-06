package ticket.booking.entities;

import java.util.List;
import java.util.Map;

public class Train {
    private String trainId;
    private String trainNo;
    private List<List<Integer>> seats;
    private Map<String, String> stationTimes;
    private List<String> stations;

    public Train() {
    }

    public Train(String trainId, String trainNo, List<List<Integer>> seats, Map<String, String> stationTimes, List<String> stations) {
        this.trainId = trainId;
        this.trainNo = trainNo;
        this.seats = seats;
        this.stationTimes = stationTimes;
        this.stations = stations;
    }

    // Get Train Info
    public String getTrainInfo() {
        return String.format("Train ID: %s, Train No: %s", trainId, trainNo);
    }

    // Train ID
    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    // Train No
    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo() {
        this.trainNo = trainNo;
    }

    // Stations
    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }

    // Seats
    public List<List<Integer>> getSeats() {
        return seats;
    }

    public void setSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }

    // Station Times
    public Map<String, String> getStationTimes() {
        return stationTimes;
    }

    public void setStationTimes(Map<String, String> stationTimes) {
        this.stationTimes = stationTimes;
    }
}
