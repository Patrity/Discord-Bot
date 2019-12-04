package bot;

import listeners.CommandListener;
import listeners.GuildJoin;
import listeners.PrivateMessage;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import javax.security.auth.login.LoginException;

/**
 * This is the main class for the Discord bot.
 * It handles the build (logging in) action and all listeners.
 *
 * @author Patrity | https://github.com/Patrity
 * @since 12/3/2019
 */

public class Bot {

    public static void main(String[] args) throws LoginException {
        //Create the JDA object
        JDABuilder jda = new JDABuilder();

        //Sets the bot's token which is configured in Config.Java
        jda.setToken(Config.TOKEN);

        //Sets the bot's rich presence
        jda.setActivity(Activity.playing("with my new bot!"));

        //Listen for various events
        jda.addEventListeners(new GuildJoin());
        jda.addEventListeners(new CommandListener());
        jda.addEventListeners(new PrivateMessage());

        //Finally, we build the bot with the above information
        jda.build();



    }

}
