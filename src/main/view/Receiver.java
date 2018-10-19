package main.view;

import main.view.command.Command;
import main.view.command.WelcomeMessageCommand;

import java.util.EnumMap;

public class Receiver {

    private static EnumMap <CommandsEnum, Command> commandsEnumMap = new EnumMap<CommandsEnum, Command>(CommandsEnum.class);

    {
        commandsEnumMap.put(CommandsEnum.WELCOME, new WelcomeMessageCommand());
    }



    public void setMessage (CommandsEnum commandsEnum){
        commandsEnumMap.get(commandsEnum).execute();




             //   getOrDefault(commandsEnum, () -> new WelcomeMessageCommand())
              //  .execute();

    }

}
