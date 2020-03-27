package org.hopto.pcrhome;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.hopto.pcrhome.events.ReadyEvent;

import javax.security.auth.login.LoginException;

public class Main {

    //MAIN FUNCTION
    public static void main(String[] args) {
        
        //Check if token is given
        if(args.length < 1){
            System.out.println("You have not given a token");
        } else {
            String token = args[0];

            /*
             * Bot connection to Discord API
             * @throws LoginException
             */
            try {
                //Main API connection object
                JDA jda = JDABuilder.createDefault(token)
                        .build();

                //API Ready event
                jda.addEventListener(new ReadyEvent());
            } catch (LoginException e){
                System.out.println("Problem occurred while login in to Discord API");
                e.printStackTrace();
            }
        }
    }
}
