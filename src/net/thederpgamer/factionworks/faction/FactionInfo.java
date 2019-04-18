package net.thederpgamer.factionworks.faction;

import java.io.File;
import java.util.UUID;
import net.distortsm.api.player.Faction;

public class FactionInfo extends Faction {
	
	public static String name;
	public static String tag;
	public static String government;
	public static String description;
	public static String wikiPage;
	public static File logo;
	public static String id = Faction.getFactionID().toString();

	public String getWikiPage() {
		return wikiPage;
	}
}
