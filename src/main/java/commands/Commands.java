package commands;

import bot.Config;
import commands.impl.Ping;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * Enum which contains all commands to be listened for
 *
 * @author Patrity | https://github.com/Patrity
 * @since 12/3/2019
 */

public enum Commands {

    PING("ping", "Returns pong!", new Ping());

    private String command, description;
    private ListenerAdapter adapter;

    public static Commands[] VALUES = Commands.values();

    Commands(String command, String description, ListenerAdapter adapter) {
        this.command = command;
        this.description = description;
        this.adapter = adapter;
    }

    //getters to return values as needed
    public String getCommand() {
        return command;
    }
    public ListenerAdapter getAdapter() {
        return adapter;
    }

    //Method to check if a message contains a command
    public static Commands isCommand(String message) {
        for (Commands command : Commands.VALUES) {
            if(message.startsWith(Config.PREFIX + command.getCommand())) {
                return command;
            }
        }
        return null;
    }

}
