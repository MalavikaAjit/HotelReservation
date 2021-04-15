public class Hotel {
    String hotelName;
    Double rates;
    int rating;

    public Hotel(String hotelName, Double rates, int rating){
        this.hotelName=hotelName;
        this.rates=rates;
        this.rating=rating;
        // this.hotelDate=hotelDate;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public Double getRates() {
        return rates;
    }
    public void setRates(Double rates) {
        this.rates = rates;
    }
    public String toString() {
        return  "Hotal name : " + hotelName +"\n"+ "rates : " + rates + "\n"+"rating : " + rating;
    }

}
