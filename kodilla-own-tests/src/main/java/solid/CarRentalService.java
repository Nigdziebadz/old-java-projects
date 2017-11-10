package solid;

import java.time.LocalDateTime;

public class CarRentalService implements RentalService{
    public boolean createRental(User user, LocalDateTime from, LocalDateTime to) {

            System.out.println("Renting car for: " + user.getName() + " " + user.getSurName()
                    + " from " + from.toString() + " to " + to.toString());
            return true;
    }
}
