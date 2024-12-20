package net.mcreator.ufd;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.ufd.world.features.StructureFeature;
import net.mcreator.ufd.init.HotaModTabs;
import net.mcreator.ufd.init.HotaModSounds;
import net.mcreator.ufd.init.HotaModPotions;
import net.mcreator.ufd.init.HotaModPaintings;
import net.mcreator.ufd.init.HotaModMobEffects;
import net.mcreator.ufd.init.HotaModMenus;
import net.mcreator.ufd.init.HotaModItems;
import net.mcreator.ufd.init.HotaModEntities;
import net.mcreator.ufd.init.HotaModEnchantments;
import net.mcreator.ufd.init.HotaModBlocks;
import net.mcreator.ufd.init.HotaModBlockEntities;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.AbstractMap;

@Mod("hota")
public class HotaMod {
	public static final Logger LOGGER = LogManager.getLogger(HotaMod.class);
	public static final String MODID = "hota";

	public HotaMod() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		MinecraftForge.EVENT_BUS.register(this);
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		HotaModSounds.REGISTRY.register(bus);
		HotaModBlocks.REGISTRY.register(bus);
		HotaModBlockEntities.REGISTRY.register(bus);
		HotaModItems.REGISTRY.register(bus);
		HotaModEntities.REGISTRY.register(bus);
		HotaModEnchantments.REGISTRY.register(bus);
		HotaModTabs.REGISTRY.register(bus);

		StructureFeature.REGISTRY.register(bus);
		HotaModMobEffects.REGISTRY.register(bus);
		HotaModPotions.REGISTRY.register(bus);
		HotaModPaintings.REGISTRY.register(bus);

		HotaModMenus.REGISTRY.register(bus);
		// Start of user code block mod init
		// End of user code block mod init
	}

	// Start of user code block mod methods
	// End of user code block mod methods
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
			workQueue.add(new AbstractMap.SimpleEntry<>(action, tick));
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
			workQueue.forEach(work -> {
				work.setValue(work.getValue() - 1);
				if (work.getValue() == 0)
					actions.add(work);
			});
			actions.forEach(e -> e.getKey().run());
			workQueue.removeAll(actions);
		}
	}
}
