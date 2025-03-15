package ee.gagdev.flightapplication.FlightData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Seats {
    private List<Seat> seats;

    public Seats() {
        this.seats = generateSeats();
    }

    public List<Seat> getSeats() {
        return seats;
    }

    private List<Seat> generateSeats() {
        List<Seat> seatList = new ArrayList<>();
        String[] seatLetters = {"A", "B", "C", "D", "E", "F"};
        Random rand = new Random();

        int occupiedCount = 0;
        int maxOccupied = 17;

        for (int row = 1; row <= 10; row++) {
            String RowType;

            if (row <= 3) {
                RowType = "Business";
            } else if (row <= 5) {
                RowType = "Economy Plus";
            } else {
                RowType = "Economy";
            }

            for (int i = 0; i < seatLetters.length; i++) {
                boolean isOccupied = false;

                if (occupiedCount < maxOccupied && rand.nextBoolean()) {
                    isOccupied = true;
                    occupiedCount++;
                }

                seatList.add(new Seat(row + seatLetters[i], isOccupied, RowType));
            }
        }
        return seatList;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Seat {
        @JsonProperty("seat_number")
        private String seatNumber;

        @JsonProperty("occupied")
        private boolean occupied;

        @JsonProperty("row_type")
        private String rowType;

        public Seat() {
        }

        public Seat(String seatNumber, boolean occupied, String rowType) {
            this.seatNumber = seatNumber;
            this.occupied = occupied;
            this.rowType = rowType;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean isOccupied() {
            return occupied;
        }

        public void setOccupied(boolean occupied) {
            this.occupied = occupied;
        }

        public String getRowType() {
            return rowType;
        }
    }
}
