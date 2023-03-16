package me.fallenbreath.conditionalmixin;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ConditionalMixinMod.MOD_ID)
public class ConditionalMixinMod {
	public static final String MOD_ID = "conditional_mixin";

	public static final Logger LOGGER = LogManager.getLogger(ConditionalMixinMod.class);

	public ConditionalMixinMod() {
		IEventBus MOD_BUS = FMLJavaModLoadingContext.get().getModEventBus();

		MOD_BUS.addListener(this::onInitialize);

		MinecraftForge.EVENT_BUS.register(this);
	}

	public void onInitialize(final FMLCommonSetupEvent event) {
	}
}
