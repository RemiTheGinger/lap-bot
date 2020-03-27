package org.hopto.pcrhome.managers;

import net.dv8tion.jda.api.entities.Category;
import net.dv8tion.jda.api.entities.Guild;
import org.hopto.pcrhome.GroupePedagogique;

import java.util.ArrayList;

public class GPManager {

    private ArrayList<GroupePedagogique> gp_list;

    private Guild guild;
    private Category gp_category;

    /*
    * Create a GP with a name in the GP Manager guild.
    * The created GP is stored in the gp_list.
    * returns the created GP
     */
    public GroupePedagogique createGP(String name){

        //Create a GP object
        GroupePedagogique gp = new GroupePedagogique(name, guild, gp_category);

        //Store GP in gp_list
        gp_list.add(gp);

        return gp;
    }

    /*
    * Find GP in gp_list by name.
    * If no GP is found with the same name it returns null.
     */
    public GroupePedagogique getGP(String name){
        GroupePedagogique gp = null;

        for(GroupePedagogique _gp : gp_list){
            if(_gp.getName().equalsIgnoreCase(name)){
                gp = _gp;
            }
        }

        return gp;
    }
}
