import java.util.*;

public class HotelReservation {
    public static ArrayList<Hotel> hotelList = new ArrayList();

    public boolean addHotel(String hotelName, Double rates, int rating) {
        Hotel hotel = new Hotel(hotelName, rates, rating);
        hotelList.add(hotel);
        System.out.println(hotel.toString());
        return false;
    }
    public static void main(String[] args)  {
        System.out.println("Welcome to Hotel Reservation program");
        HotelReservation hotelReservation=new HotelReservation();
        hotelReservation.addHotel("LakeWood",110.0,3);
        hotelReservation.addHotel("BridgeWood",160.0,4);
        hotelReservation.addHotel("RidgeWood",220.0,5);

        ///Hotel cheapestHotel = hotelList
        //  .stream()
        //  .min(Comparator.comparing(Hotel::getRates))
        // .orElse(null);
        //System.out.println("cheapest hotel  " + cheapestHotel);
    }
}
