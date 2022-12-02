package ru.javarush.catJava.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.javarush.catJava.data.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Getter
public class Users {

    ObjectMapper objectMapper = new ObjectMapper();
    private static final Logger log = LogManager.getLogger(Users.class);
    private Map<String, User> nameAndCountUser;

    public Users(InputStream file) {
        this.nameAndCountUser = initUsers(file);
        log.info("parsing json users");
    }

    private Map<String, User> initUsers(InputStream file){
        Map<String, User> initUsersJson;
        try {
            initUsersJson = objectMapper.readValue(file, new TypeReference<HashMap<String, User>>() {
            });
        } catch (IOException e) {
            log.error("Error parsing json users");
            throw new RuntimeException(e);
        }

        return initUsersJson;
    }

    public User getUser(String name){
        return nameAndCountUser.get(name);
    }

    public Integer getCountUsers(){
        return nameAndCountUser.size();
    }

    public void update(String name){
        nameAndCountUser.put(name, new User(0));
    }

    public void incrementCountOfGamesPlayer(String name){
        int countOfGamesPlayedUser = nameAndCountUser.get(name).getCountOfGamesPlayed();
        nameAndCountUser.get(name).setCountOfGamesPlayed(countOfGamesPlayedUser + 1);
    }
}
