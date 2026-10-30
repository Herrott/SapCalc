package com.SapCalc;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class SapCalcPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(SapCalcPlugin.class);
		RuneLite.main(args);
	}
}