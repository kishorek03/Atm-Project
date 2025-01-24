import java.io.IOException;

public class Atm extends OptionMenu {
    public static void main(String[] args) throws IOException {
        OptionMenu optionMenu = new OptionMenu();

        // Create Default Accounts
        optionMenu.createAccount(); // Uncomment to test account creation
        optionMenu.getLogin();
    }
}
