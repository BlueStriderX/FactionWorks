package net.thederpgamer.factionworks.main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.schema.game.server.data.GameServerState;

public class Reflectors {
	
	//Object Reflectors
	private static Object getPlayerNameFromIDObject(long player) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Method method = GameServerState.class.getDeclaredMethod("getPlayerNameFromDbIdLowerCase", long.class);
		method.setAccessible(true); 
		return method.invoke(getPlayerNameFromIDObject(player)); 
	}
		
	//Getters
	public static String getPlayerNameFromID(long player) throws NumberFormatException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchMethodException{
		return getPlayerNameFromIDObject(player).toString();
	}
}
