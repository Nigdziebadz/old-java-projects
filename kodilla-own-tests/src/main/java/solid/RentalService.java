package solid;

import java.time.LocalDateTime;

public interface RentalService {
    boolean createRental(User user, LocalDateTime from, LocalDateTime to);
}
