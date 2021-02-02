import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.cache.CacheFlag;


public class MyBot {
	public static JDABuilder builder;
	public static void main(String[] args) throws LoginException {
		builder = JDABuilder.createDefault("ODA0OTEzMDY4MTMxMDkwNDcy.YBTPtg.h4_Ye2qGdG37gMEZgC2sb9J86pc");
		
		builder.disableCache(CacheFlag.MEMBER_OVERRIDES,CacheFlag.VOICE_STATE);
		
		builder.setBulkDeleteSplittingEnabled(false);
		
		builder.setCompression(Compression.NONE);
		
		builder.setActivity(Activity.listening("aera"));
		
		builder.enableIntents(GatewayIntent.GUILD_MEMBERS);
		
		builder.addEventListeners(new Ccommands());
		
		builder.build();
	}

}