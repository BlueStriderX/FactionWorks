package net.thederpgamer.factionworks.gui;

import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import org.schema.game.client.data.GameClientState;
import org.schema.schine.graphicsengine.core.Controller;
import org.schema.schine.graphicsengine.core.GlUtil;
import org.schema.schine.graphicsengine.forms.gui.GUIElement;
import org.schema.schine.input.InputState;

@SuppressWarnings("deprecation")
public class FactionLogoPanel extends GUIElement implements Observer {

	public float width;
	public float height;
	public boolean updateNeeded;
	public String factionLogoPath = "..\\";
	
	public FactionLogoPanel(InputState var1, float inputWidth, float inputHeight) {
		super(var1);
		this.width = inputWidth;
		this.height = inputHeight;
		((GameClientState) this.getState()).getFactionManager().addObserver(this);
	}

	@Override
	public void cleanUp() {
		((GameClientState) this.getState()).getFactionManager().deleteObserver(this);		
	}

	@Override
	public void draw() {
		if (this.needsReOrientation()) {
			this.doOrientation();
		}

		GlUtil.glPushMatrix();
		this.transform();
		this.draw();
		GlUtil.glPopMatrix();
	}

	@Override
	public void onInit() {
		try {
			Controller.getResLoader().getImageLoader().loadImage(factionLogoPath,"faction_logo.png");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void update(Observable var1, Object var2) {
		this.updateNeeded = true;
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
	
}
