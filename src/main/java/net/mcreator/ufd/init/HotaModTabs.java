
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ufd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.ufd.HotaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HotaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HotaMod.MODID);
	public static final RegistryObject<CreativeModeTab> UPGRADEMOD = REGISTRY.register("upgrademod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hota.upgrademod")).icon(() -> new ItemStack(HotaModItems.DARKMETALINGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HotaModItems.DARKMETALINGOT.get());
				tabData.accept(HotaModItems.DARKMETALSWORD.get());
				tabData.accept(HotaModItems.DARKMETALSHOVEL.get());
				tabData.accept(HotaModItems.DARKMETALHAMER.get());
				tabData.accept(HotaModItems.OLDREDSTOUN.get());
				tabData.accept(HotaModItems.OLDREDSTOUNSWORLD.get());
				tabData.accept(HotaModItems.OLDREDSTOUNSHOVEL.get());
				tabData.accept(HotaModItems.OLDREDSTOUNHAMMER.get());
				tabData.accept(HotaModItems.BLUESTRENGHT.get());
				tabData.accept(HotaModItems.BLUESTRENGTHSWORD.get());
				tabData.accept(HotaModItems.BLUESTRENGTHSHOVEL.get());
				tabData.accept(HotaModItems.BLUESTRENGTHHAMMER.get());
				tabData.accept(HotaModItems.STONEGTH.get());
				tabData.accept(HotaModItems.STICKSTONEGTH.get());
				tabData.accept(HotaModItems.STONEGTHHAMMER.get());
				tabData.accept(HotaModItems.STONEGTHSWORD.get());
				tabData.accept(HotaModItems.STONEGTHSHOVEL.get());
				tabData.accept(HotaModItems.HEAVENLYMETAL.get());
				tabData.accept(HotaModItems.HEAVENLYSWORD.get());
				tabData.accept(HotaModItems.HEAVENLYHAMMER.get());
				tabData.accept(HotaModItems.INFERNALMETAL.get());
				tabData.accept(HotaModItems.INFERNALSWORD.get());
				tabData.accept(HotaModItems.INFERNALHAMMER.get());
				tabData.accept(HotaModItems.FLOWERSWORD.get());
				tabData.accept(HotaModItems.FLOWERSHOVEL.get());
				tabData.accept(HotaModItems.FLOWERPICKAXE.get());
				tabData.accept(HotaModItems.FLOWERAXE.get());
				tabData.accept(HotaModItems.DUHAT.get());
				tabData.accept(HotaModBlocks.CHERRYFOLIAGE.get().asItem());
				tabData.accept(HotaModItems.SPLINTERLOSFOLITE.get());
				tabData.accept(HotaModBlocks.CRYSTALLOSFOLITE.get().asItem());
				tabData.accept(HotaModItems.LOSFOLITEINGOT.get());
				tabData.accept(HotaModItems.LOSFOLITESWORD.get());
				tabData.accept(HotaModItems.LOSFOLITEPICKAXE.get());
				tabData.accept(HotaModItems.LOSFOLITESHOVEL.get());
				tabData.accept(HotaModBlocks.SANDBRICKS.get().asItem());
				tabData.accept(HotaModItems.THUNDERTRIDENT.get());
				tabData.accept(HotaModBlocks.CRYSTAL_LOG.get().asItem());
				tabData.accept(HotaModBlocks.CRYSTAL_PLANKS.get().asItem());
				tabData.accept(HotaModBlocks.CRYSTAL_STAIRS.get().asItem());
				tabData.accept(HotaModBlocks.CRYSTAL_SLAB.get().asItem());
				tabData.accept(HotaModBlocks.CRYSTAL_FENCE.get().asItem());
				tabData.accept(HotaModBlocks.CRYSTAL_BUTTON.get().asItem());
				tabData.accept(HotaModBlocks.HOLY_WOOD.get().asItem());
				tabData.accept(HotaModBlocks.HOLY_LOG.get().asItem());
				tabData.accept(HotaModBlocks.HOLY_PLANKS.get().asItem());
				tabData.accept(HotaModBlocks.HOLY_STAIRS.get().asItem());
				tabData.accept(HotaModBlocks.HOLY_SLAB.get().asItem());
				tabData.accept(HotaModBlocks.HOLY_BUTTON.get().asItem());
				tabData.accept(HotaModBlocks.SNOWBRICKS.get().asItem());
				tabData.accept(HotaModBlocks.ICEBRICKS.get().asItem());
				tabData.accept(HotaModBlocks.MOSSCOBBLESTONE.get().asItem());
				tabData.accept(HotaModItems.LAVASTONE.get());
				tabData.accept(HotaModItems.THUNDERSTONE.get());
				tabData.accept(HotaModBlocks.MOSSPLANT.get().asItem());
				tabData.accept(HotaModBlocks.TEST.get().asItem());
				tabData.accept(HotaModItems.TRUEWOODENSWORD.get());
				tabData.accept(HotaModItems.SPARKLINGSWORD.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> RELICS = REGISTRY.register("relics",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hota.relics")).icon(() -> new ItemStack(HotaModItems.CONCERTOFTHEANCIENTS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HotaModItems.CONCERTOFTHEANCIENTS.get());
				tabData.accept(HotaModBlocks.RUSTYMETAL.get().asItem());
				tabData.accept(HotaModBlocks.RUSTYMETAL_2.get().asItem());
				tabData.accept(HotaModItems.VAMPIREBLADE.get());
				tabData.accept(HotaModItems.KATANAOF_DEATH.get());
				tabData.accept(HotaModItems.METALOFTHEANCIENTS.get());
				tabData.accept(HotaModItems.CHARGEDMETALOFTHEANCIENTS.get());
				tabData.accept(HotaModItems.FANOFCELESTIALSTARS.get());
				tabData.accept(HotaModItems.THECOREOFADYINGSTAR.get());
				tabData.accept(HotaModItems.THESTAROFINFINITESPACE.get());
				tabData.accept(HotaModItems.REDSTONESTICK.get());
				tabData.accept(HotaModItems.HEARTENT.get());
				tabData.accept(HotaModItems.BLOODYFRAGMENT.get());
				tabData.accept(HotaModItems.THEDESTROYEROFNATURE.get());
				tabData.accept(HotaModItems.ABYSS.get());
				tabData.accept(HotaModItems.TRASHER.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> FEED = REGISTRY.register("feed",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hota.feed")).icon(() -> new ItemStack(HotaModItems.BERRYSALAD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HotaModItems.STRAWBERRY.get());
				tabData.accept(HotaModItems.RASPBERRY.get());
				tabData.accept(HotaModItems.BLACKBERRY.get());
				tabData.accept(HotaModItems.CHERRY.get());
				tabData.accept(HotaModItems.BLUEBERRIES.get());
				tabData.accept(HotaModItems.CURRANT.get());
				tabData.accept(HotaModItems.BERRYSALAD.get());
				tabData.accept(HotaModItems.LOSFOLITEBERRY.get());
				tabData.accept(HotaModItems.SANDWICH.get());
				tabData.accept(HotaModItems.EDIBLEROOTS.get());
				tabData.accept(HotaModItems.BOILEDEDIBLEROOTS.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(HotaModBlocks.CRYSTAL_FENCE_GATE.get().asItem());
			tabData.accept(HotaModBlocks.CRYSTAL_PRESSURE_PLATE.get().asItem());
			tabData.accept(HotaModBlocks.HOLY_FENCE_GATE.get().asItem());
			tabData.accept(HotaModBlocks.HOLY_PRESSURE_PLATE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(HotaModItems.EYE_SPAWN_EGG.get());
			tabData.accept(HotaModItems.THEDARKMONK_SPAWN_EGG.get());
			tabData.accept(HotaModItems.MECHANICALEYE_SPAWN_EGG.get());
			tabData.accept(HotaModItems.VAMPIRE_SPAWN_EGG.get());
			tabData.accept(HotaModItems.ENT_SPAWN_EGG.get());
			tabData.accept(HotaModItems.PHARAOH_SPAWN_EGG.get());
			tabData.accept(HotaModItems.CARNIVOROUSFLOWER_SPAWN_EGG.get());
			tabData.accept(HotaModItems.MOSSYPIG_SPAWN_EGG.get());
			tabData.accept(HotaModItems.SWARMOFFIREFLIES_SPAWN_EGG.get());
			tabData.accept(HotaModItems.ICEOLOGER_SPAWN_EGG.get());
			tabData.accept(HotaModItems.MOSSY_HORROR_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(HotaModItems.ANCIENTWORLD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(HotaModBlocks.HOLY_LEAVES.get().asItem());
			tabData.accept(HotaModBlocks.HOLY_FENCE.get().asItem());
		}
	}
}
