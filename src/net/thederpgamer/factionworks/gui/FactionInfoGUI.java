package net.thederpgamer.factionworks.gui;

import net.thederpgamer.factionworks.faction.FactionInfo;
import net.thederpgamer.factionworks.faction.Government;

public class FactionInfoGUI {
		
	public String factionName;
	public Government government;
	public String governmentString;
	
	public void loadInfo(FactionInfo info) {
		this.factionName = info.getName();
		this.governmentString = getGovernmentString(government);
		
	}
	
	public String getGovernmentString(Government gov) {
		
		String governmentString = null;
		
		if(gov == Government.ANARCHIST) {
			governmentString = "Anarchist";
		} else if(gov == Government.COMMUNIST) {
			governmentString = "Communist";
		} else if(gov == Government.DICTATORSHIP) {
			governmentString = "Dictatorship";
		} else if(gov == Government.DIRECT_DEMOCRACY) {
			governmentString = "Direct Democracy";
		}  else if(gov == Government.LIBERTARIAN) {
			governmentString = "Libertarian";
		} else if(gov == Government.MILITARY_JUNTA) {
			governmentString = "Military Junta";
		} else if(gov == Government.MONARCHY) {
			governmentString = "Monarchy";
		}  else if(gov == Government.OLIGARCHY) {
			governmentString = "Oligarchy";
		} else if(gov == Government.REPUBLIC) {
			governmentString = "Republic";
		} else if(gov == Government.TECHNOCRACY) {
			governmentString = "Technocracy";
		} else if(gov == Government.THEOCRACY) {
			governmentString = "Theocracy";
		} else if(gov == Government.THEOCRATIC_MONARCHY) {
			governmentString = "Theocratic Monarchy";
		}
		
		return governmentString;
	}
}
