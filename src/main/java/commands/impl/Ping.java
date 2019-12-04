package commands.impl;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * Example Ping command to return text
 *
 * @author Patrity | https://github.com/Patrity
 * @since 12/3/2019
 */

public class Ping extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {

        //Sends a message tagging the original user
        e.getChannel().sendMessage(e.getAuthor().getAsMention()+" Pong!\n" +
                "Ping: "+e.getJDA().getGatewayPing()+"ms").queue();

    }
}
