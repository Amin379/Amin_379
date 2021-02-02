import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

public class Ccommands extends ListenerAdapter {
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		
		 
		if(event.getMessage().getContentRaw().equals("amir")) {
			event.getMessage().delete().queue();
			event.getChannel().sendMessage("asddewf").queue();
		}
	}

}
