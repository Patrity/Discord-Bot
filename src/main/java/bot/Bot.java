package bot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import javax.security.auth.login.LoginException;

/*
 * @author Patrity | https://github.com/Patrity
 */

public class Bot {

    public static void main(String[] args) throws LoginException {
        //Create the JDA object
        JDABuilder jda = new JDABuilder();

        //Sets the bot's token which is configured in Config.Java
        jda.setToken("");

        //Sets the bot's rich presence
        jda.setActivity(Activity.playing("with my new bot!"));

        //Finally, we build the bot with the above information
        jda.build();



    }

}
