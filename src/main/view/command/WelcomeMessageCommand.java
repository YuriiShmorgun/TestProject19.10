package main.view.command;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WelcomeMessageCommand implements Command{

    @Override
    public void execute() {
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream("message.properties"));
            System.out.println(properties.getProperty("welcome"));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
