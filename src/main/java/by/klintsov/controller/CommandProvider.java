package by.klintsov.controller;

import by.klintsov.controller.command.Command;
import by.klintsov.controller.command.CommandName;
import by.klintsov.controller.command.impl.AddDevice;
import by.klintsov.controller.command.impl.FindDevice;

import java.util.HashMap;
import java.util.Map;

final class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider() {
        //repository.put(CommandName.ADD_DEVICE, new AddDevice());
        //repository.put(CommandName.FIND_DEVICE, new FindDevice());
    }

    Command getCommand(String name){
        CommandName commandName = null;
        Command command = null;
        try{
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        }catch(IllegalArgumentException | NullPointerException e){
            //command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
