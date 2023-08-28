package HW4;

import java.time.LocalDateTime;

class Ticket {
    private long rootNumber;
    private double price;
    private Integer place;
    private LocalDateTime date;
    private boolean isValid;

    public Ticket(long rootNumber, double price, Integer place, LocalDateTime date) {
        this.rootNumber = rootNumber;
        this.price = price;
        this.place = place;
        this.date = date;
        this.isValid = true;
    }

    public long getRootNumber() {
        return rootNumber;
    }

    public double getPrice() {
        return price;
    }

    public Integer getPlace() {
        return place;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "rootNumber=" + rootNumber +
                ", price=" + price +
                ", place=" + place +
                ", date=" + date +
                ", isValid=" + isValid +
                '}';
    }

    public boolean isValid() {
        return isValid;
    }

    public void cancel() {
        isValid = false;
    }
}
