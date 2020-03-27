package org.hopto.pcrhome;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.hopto.pcrhome.events.ReadyEvent;

import javax.security.auth.login.LoginException;

public class Main {

    //MAIN FUNCTION
    public static void main(String[] args) {

        String token = args[0];

        //Check if token is given
        if(token == null){
            System.out.println("You have not given a token");
        } else {
            /*
             * Bot connection to Discord API
             * @throws LoginException
             */
            try {
                //Main API connection object
                JDA jda = JDABuilder.createDefault(args[0])
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
