package org.hopto.pcrhome;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.ReadyEvent;

import javax.security.auth.login.LoginException;
import java.util.EventListener;

public class Main implements EventListener {

    //MAIN FUNCTION
    public static void main(String[] args) {

        /*
        * Bot connection to Discord API
        * @throws LoginException
        */
        try
        {
            //Main bot object
            JDA jda = JDABuilder.createDefault(args[0])
                    .addEventListeners(new Main())
                    .build();
        } catch (LoginException e){
            System.out.println("Problem occurred while login in to Discord API");
            e.printStackTrace();
        }
    }

    public void onEvent(GenericEvent event){
        if(event instanceof ReadyEvent){
            System.out.println("API is ready to use");
        }
    }
}
