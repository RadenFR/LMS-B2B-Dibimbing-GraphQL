package tests;

import org.testng.annotations.BeforeSuite;
import service.AuthService;

public abstract class BaseAuthenticatedTest {

    @BeforeSuite
    public void authenticate() {
        AuthService.postLogin();
    }
}
