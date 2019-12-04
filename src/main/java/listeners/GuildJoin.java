package listeners;

import net.dv8tion.jda.api.events.guild.GuildJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * Listens for the onGuildJoin event
 *
 * @author Patrity | https://github.com/Patrity
 * @since 12/3/2019
 */

public class GuildJoin extends ListenerAdapter {

    @Override
    public void onGuildJoin (GuildJoinEvent e) {

        //Sends a message to the guilds default channel once the bot joins
        e.getGuild().getDefaultChannel().sendMessage("Thanks for the invite!").queue();

    }

}
