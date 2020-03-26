package org.hopto.pcrhome.events;

import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class ReadyEvent extends ListenerAdapter {

    @Override
    public void onReady(@Nonnull net.dv8tion.jda.api.events.ReadyEvent event) {
        System.out.println("API ready to use");
    }
}
