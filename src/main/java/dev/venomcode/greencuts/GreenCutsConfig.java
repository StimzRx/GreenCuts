package dev.venomcode.greencuts;

import org.spongepowered.configurate.CommentedConfigurationNode;
import org.spongepowered.configurate.ConfigurateException;
import org.spongepowered.configurate.hocon.HoconConfigurationLoader;
import org.spongepowered.configurate.objectmapping.ConfigSerializable;
import org.spongepowered.configurate.objectmapping.meta.Comment;
import org.spongepowered.configurate.objectmapping.meta.Setting;
import org.spongepowered.configurate.serialize.SerializationException;

import java.io.IOException;
import java.nio.file.Path;

@ConfigSerializable
public class GreenCutsConfig
{
    public boolean getEnabled() { return enabled; }

    public int getAutoPlantTicks() { return autoPlantTicks; }
    public int getAutoPlantChance() { return autoPlantChance; }


    @Setting("mod_enabled")
    @Comment("Toggles the entire mod on/off")
    private boolean enabled = true;

    @Setting("auto_plant_ticks_delay")
    @Comment("Delay before attempting to auto-plant the sapling.")
    private int autoPlantTicks = 40;

    @Setting("auto_plant_chance")
    @Comment("Chance for that sapling to be automatically planted. In percentage between 1 and 100")
    private int autoPlantChance = 30;

}
