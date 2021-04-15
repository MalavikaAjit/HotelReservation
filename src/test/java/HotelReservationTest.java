import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    HotelReservation hotelReservation = new HotelReservation();
    @Test
    public void given_Hotel_Details_AreAdded_True() {
        boolean result = hotelReservation.addHotel("Lakewood",110.0,3);
        Assertions.assertTrue(result);
    }
}