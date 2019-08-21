package net.thederpgamer.factionworks.faction;

import java.io.File;

import org.schema.game.common.data.player.faction.Faction;
import org.schema.game.common.data.player.faction.FactionRelation.RType;
import org.schema.schine.network.StateInterface;

public class FactionInfo extends Faction {
	
	public FactionInfo(StateInterface var1) {
		super(var1);
	}
	
	public Organization factionOrg;
	public RType relation;
	public String leaderName;
	public PlayerRank rank;
	public String shipTag;
	public Government government;
	public String details;
	public File logo;
	
	public Government getGovernment() {
		return this.government;
	}
}
