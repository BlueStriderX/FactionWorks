package net.thederpgamer.factionworks.faction;

import java.io.File;
import org.schema.game.common.data.player.faction.Faction;
import org.schema.schine.network.StateInterface;

public class FactionInfo extends Faction {
	
	public FactionInfo(StateInterface var1) {
		super(var1);
	}
	public static String name;
	public static String tag;
	public static String government;
	public static String description;
	public static String wikiPage;
	public static File logo;
}
