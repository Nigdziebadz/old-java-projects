package solid;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {

    public boolean createRental(User user, LocalDateTime from, LocalDateTime to) {
        return true;
    }
}
