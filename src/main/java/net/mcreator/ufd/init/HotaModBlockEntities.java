
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ufd.init;

import net.mcreator.ufd.block.entity.TestBlockEntity;
import net.mcreator.ufd.HotaMod;

public class HotaModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, HotaMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> TEST = register("test", HotaModBlocks.TEST, TestBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
