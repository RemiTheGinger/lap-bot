package org.hopto.pcrhome;

import net.dv8tion.jda.api.entities.*;

import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.ArrayList;

public class GroupePedagogique {

    private String name;
    private ArrayList<Member> members;

    private Role gpRole;

    private TextChannel gpText;
    private VoiceChannel gpVoice;

    /*
    * Creation of the GP
    * This will create the gp Role, text and voice channels in a specific guild
    *
    * @param name
    * The name of the GP
    *
    * @param guild
    * The guild where the role, text & voice channel are created
    *
    * @param category
    * The specific category where the channels are created
     */

    public GroupePedagogique(@NotNull String name, @NotNull Guild guild, @NotNull Category category){
        this.name = name;

        //Creation of the Array list of the GPs member
        members = new ArrayList<Member>();

        //GP role creation in specific discord guild
        guild.createRole().setName(name).setMentionable(true).setColor(Color.MAGENTA)
                .queue((role) -> gpRole = role);

        //Creation of Voice and Text Channels
        category.createTextChannel(name).queue(channel -> gpText = channel);
        category.createVoiceChannel(name).queue(channel -> gpVoice = channel);
    }

}
