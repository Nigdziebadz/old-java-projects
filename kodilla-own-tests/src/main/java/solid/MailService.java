package solid;

public class MailService implements InformationService {

    public void inform(User user) {
        System.out.println("Car is rented, message sent to "
                + user.getName() + " " + user.getSurName());
    }
}
