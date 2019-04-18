package net.thederpgamer.factionworks.faction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import com.google.common.collect.ArrayListMultimap;
import net.distortsm.api.player.Player;
import net.distortsm.api.player.Faction;

public class Organization {

		public static ArrayList<Faction> memberFactions = new ArrayList<Faction>();
		public static Multimap<Faction, Player> members = ArrayListMultimap.create();
		public static ArrayList<Faction> enemyFactions = new ArrayList<Faction>();
		public static OrganizationInfo organizationInfo = new OrganizationInfo();
		public static UUID orgUUID = UUID.randomUUID();
	
	public static OrganizationInfo getOrganizationInfo() {
		return organizationInfo;
	}
}
