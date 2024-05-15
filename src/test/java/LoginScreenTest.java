import org.junit.Test;

import com.qa.LoginScreen;

import static org.junit.Assert.*;

public class LoginScreenTest {
    @Test
    public void testSuccessfulLogin() {
        LoginScreen loginScreen = new LoginScreen();
        assertTrue(loginScreen.login("admin", "admin"));
    }

    @Test
    public void testFailedLogin() {
        LoginScreen loginScreen = new LoginScreen();
        assertFalse(loginScreen.login("admin", "wrongpassword"));
    }

    @Test
    public void testAddUser() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.addUser("newuser", "password");
    }
}
