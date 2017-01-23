package pl.sda;

import java.util.Date;
import java.util.List;

/**
 * Created by RENT on 2017-01-23.
 */
public class Rental {
    Customer customer;
    Date startDate;
    Date endDate;

    List<Movie> movie;



    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Movie> getMovie() {
        return movie;
    }

    public void setMovie(List<Movie> movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "customer=" + customer +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", movie=" + movie +
                '}';
    }

    public Rental(Customer customer, Date startDate, Date endDate, List<Movie> movie) {
        this.customer = customer;
        this.startDate = startDate;
        this.endDate = endDate;
        this.movie = movie;
    }
}
