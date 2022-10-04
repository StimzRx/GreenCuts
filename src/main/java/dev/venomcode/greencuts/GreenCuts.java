package dev.venomcode.greencuts;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.tinyremapper.extension.mixin.common.Logger;

public class GreenCuts implements ModInitializer {
    public static final String MODID = "greencuts";

    private static GreenCutsConfig config;
    private static Logger logger;

    @Override
    public void onInitialize( )
    {
        logger = new Logger(Logger.Level.INFO);
        config = new GreenCutsConfig();
    }

    public static GreenCutsConfig getConfig()
    {
        return config;
    }
    public static void debugLog(String msg)
    {
        logger.info( "[" + MODID + "]" + msg);
    }
}
