package net.thederpgamer.factionworks.gui;

import java.lang.reflect.InvocationTargetException;
import java.util.Observable;
import java.util.Observer;

import org.schema.game.client.controller.manager.ingame.faction.FactionControlManager;
import org.schema.game.client.data.GameClientState;
import org.schema.game.common.data.player.faction.FactionRelation.RType;
import org.schema.schine.graphicsengine.core.Controller;
import org.schema.schine.graphicsengine.forms.gui.GUIElement;
import org.schema.schine.graphicsengine.forms.gui.GUIOverlay;
import org.schema.schine.input.InputState;

import net.thederpgamer.factionworks.faction.FactionInfo;
import net.thederpgamer.factionworks.faction.Government;
import net.thederpgamer.factionworks.faction.Organization;
import net.thederpgamer.factionworks.main.Reflectors;

public class FactionInfoGUI extends GUIElement implements Observer{
		
	public FactionInfoGUI(InputState var1) {
		super(var1);
	}

	public long player;
	public String factionName;
	public Organization org;
	public RType relation;
	public long factionLeader;
	public String factionLeaderName;
	public Government government;
	public String governmentString;
	public String factionDetails;
	public GUIOverlay background;
	public FactionLogoPanel factionLogoPanel;
	public FactionNameTextBox factionNameTextBox;
	public FactionOrganizationTextBox factionOrganizationTextBox;
	public CurrentRelationTextBox currentRelationTextBox;
	public LeaderTextBox leaderTextBox;
	
	
	public void loadInfo(FactionInfo info, long player) throws NumberFormatException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		this.factionName = info.getName();
		this.org = info.getOrganization();
		this.governmentString = getGovernmentString(government);
		this.relation = info.getRelationshipWithFactionOrPlayer(player);
		this.factionLeaderName = Reflectors.getPlayerNameFromID(factionLeader);
		this.factionDetails = info.getFactionDetails();
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
		} else if(gov == Government.NOT_SET) {
			governmentString = "No Government";
		}
		
		return governmentString;
	}
	
	public FactionControlManager getFactionManager() {
		return ((GameClientState) this.getState()).getGlobalGameControlManager().getIngameControlManager().getPlayerGameControlManager().getFactionControlManager();
	}

	@Override
	public void cleanUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onInit() {
		this.background = new GUIOverlay(Controller.getResLoader().getSprite("faction-info-backround"), this.getState());
		this.getFactionManager().addObserver(this);
		this.factionLogoPanel = new FactionLogoPanel(this.getState());
		this.factionNameTextBox = new FactionNameTextBox(this.getState());
		this.factionOrganizationTextBox = new FactionOrganizationTextBox(this.getState());
		this.currentRelationTextBox = new CurrentRelationTextBox(this.getState());
		this.leaderTextBox = new LeaderTextBox(this.getState());
	}

	@Override
	public float getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
