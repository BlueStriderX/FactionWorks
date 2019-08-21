package net.thederpgamer.factionworks.faction;

import java.util.ArrayList;
import java.util.UUID;
import org.schema.game.common.data.player.PlayerState;
import org.schema.game.common.data.player.faction.Faction;
import com.google.common.collect.Multimap;

public class Organization {

	public ArrayList<Faction> memberFactions;
	public Multimap<Faction, PlayerState> members;
	public ArrayList<Faction> enemyFactions;
	public OrganizationInfo organizationInfo;
	public UUID orgUUID;
	public ArrayList<PlayerState> organizationMods;
	
	public void createOrg(String name, PlayerState creator, Faction creatorFaction) {
		
		this.memberFactions.add(creatorFaction);
		this.members.put(creatorFaction, creator);
		this.organizationMods.add(creator);
	}
}
