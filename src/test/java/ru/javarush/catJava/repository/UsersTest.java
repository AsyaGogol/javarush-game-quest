package ru.javarush.catJava.repository;

import org.junit.jupiter.api.Test;
import ru.javarush.catJava.servlet.DispatcherServlet;

import static org.junit.jupiter.api.Assertions.*;

public class UsersTest {

    private final Users users = new Users(DispatcherServlet.class.
            getClassLoader().getResourceAsStream("users.json"));

    @Test
    void getUserExistingInJson() {
        String existingName = "Barsik";
        assertNotNull(users.getUser(existingName));
    }

    @Test
    void getCountUsers() {
        assertEquals(2, users.getCountUsers());
    }

    @Test
    void updateMapNewUser() {
        String name = "Igor";
        assertNull(users.getUser(name));
        users.update(name);
        assertNotNull(users.getUser(name));
    }

    @Test
    void incrementCountOfGamesPlayer(){
        String name = "Barsik";
        assertEquals(1, users.getUser(name).getCountOfGamesPlayed());
        users.incrementCountOfGamesPlayer(name);
        assertEquals(13, users.getUser(name).getCountOfGamesPlayed());
    }
}