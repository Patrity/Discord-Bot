package listeners;

import commands.Commands;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Objects;

/**
 * Listens for commands specified in the Commands enum.
 *
 * @author Patrity | https://github.com/Patrity
 * @since 12/3/2019
 */

public class CommandListener extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {

        //Checks if the original sender is a bot, if so, do nothing
        if(e.getAuthor().isBot())
            return;

        //translates message to lower case to easily compare with the Commands enum
        String message = e.getMessage().getContentRaw().toLowerCase();


        //Checks if the message sent is a command
        Commands command = Commands.isCommand(message);

        //if the message sent is not a command, do nothing
        if (Objects.isNull(command))
            return;

        //run the command
        command.getAdapter().onGuildMessageReceived(e);
    }

}
