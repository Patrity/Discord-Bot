package listeners;

import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * TL
 *
 * @author Patrity | https://github.com/Patrity
 * @since 12/3/2019
 */

public class PrivateMessage extends ListenerAdapter {

    @Override
    public void onPrivateMessageReceived(PrivateMessageReceivedEvent e) {

        //Replies to private messages
        e.getMessage().getPrivateChannel().sendMessage("Thanks for messaging me!").queue();

    }

}
