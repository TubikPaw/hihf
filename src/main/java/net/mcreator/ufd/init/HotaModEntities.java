
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ufd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.ufd.entity.VampireEntity;
import net.mcreator.ufd.entity.TruewoodenswordProjectileEntity;
import net.mcreator.ufd.entity.ThedarkmonkEntity;
import net.mcreator.ufd.entity.SwarmoffirefliesEntity;
import net.mcreator.ufd.entity.SparklingswordProjectileEntity;
import net.mcreator.ufd.entity.ProjectileiceologerEntity;
import net.mcreator.ufd.entity.PharaohEntity;
import net.mcreator.ufd.entity.MossypigEntity;
import net.mcreator.ufd.entity.MossyHorrorEntity;
import net.mcreator.ufd.entity.MechanicaleyeEntity;
import net.mcreator.ufd.entity.IceologerEntity;
import net.mcreator.ufd.entity.EyeEntity;
import net.mcreator.ufd.entity.EntEntity;
import net.mcreator.ufd.entity.CarnivorousflowerEntity;
import net.mcreator.ufd.HotaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HotaModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HotaMod.MODID);
	public static final RegistryObject<EntityType<EyeEntity>> EYE = register("eye",
			EntityType.Builder.<EyeEntity>of(EyeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EyeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ThedarkmonkEntity>> THEDARKMONK = register("thedarkmonk",
			EntityType.Builder.<ThedarkmonkEntity>of(ThedarkmonkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ThedarkmonkEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MechanicaleyeEntity>> MECHANICALEYE = register("mechanicaleye",
			EntityType.Builder.<MechanicaleyeEntity>of(MechanicaleyeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MechanicaleyeEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<VampireEntity>> VAMPIRE = register("vampire",
			EntityType.Builder.<VampireEntity>of(VampireEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VampireEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EntEntity>> ENT = register("ent",
			EntityType.Builder.<EntEntity>of(EntEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EntEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PharaohEntity>> PHARAOH = register("pharaoh",
			EntityType.Builder.<PharaohEntity>of(PharaohEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PharaohEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CarnivorousflowerEntity>> CARNIVOROUSFLOWER = register("carnivorousflower",
			EntityType.Builder.<CarnivorousflowerEntity>of(CarnivorousflowerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CarnivorousflowerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MossypigEntity>> MOSSYPIG = register("mossypig",
			EntityType.Builder.<MossypigEntity>of(MossypigEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MossypigEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<SwarmoffirefliesEntity>> SWARMOFFIREFLIES = register("swarmoffireflies",
			EntityType.Builder.<SwarmoffirefliesEntity>of(SwarmoffirefliesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SwarmoffirefliesEntity::new)

					.sized(1.4f, 0.9f));
	public static final RegistryObject<EntityType<IceologerEntity>> ICEOLOGER = register("iceologer", EntityType.Builder.<IceologerEntity>of(IceologerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(IceologerEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ProjectileiceologerEntity>> PROJECTILEICEOLOGER = register("projectileiceologer",
			EntityType.Builder.<ProjectileiceologerEntity>of(ProjectileiceologerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(ProjectileiceologerEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<SparklingswordProjectileEntity>> SPARKLINGSWORD_PROJECTILE = register("projectile_sparklingsword_projectile",
			EntityType.Builder.<SparklingswordProjectileEntity>of(SparklingswordProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(SparklingswordProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TruewoodenswordProjectileEntity>> TRUEWOODENSWORD_PROJECTILE = register("projectile_truewoodensword_projectile",
			EntityType.Builder.<TruewoodenswordProjectileEntity>of(TruewoodenswordProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(TruewoodenswordProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MossyHorrorEntity>> MOSSY_HORROR = register("mossy_horror",
			EntityType.Builder.<MossyHorrorEntity>of(MossyHorrorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MossyHorrorEntity::new)

					.sized(0.6f, 2.3f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			EyeEntity.init();
			ThedarkmonkEntity.init();
			MechanicaleyeEntity.init();
			VampireEntity.init();
			EntEntity.init();
			PharaohEntity.init();
			CarnivorousflowerEntity.init();
			MossypigEntity.init();
			SwarmoffirefliesEntity.init();
			IceologerEntity.init();
			ProjectileiceologerEntity.init();
			MossyHorrorEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(EYE.get(), EyeEntity.createAttributes().build());
		event.put(THEDARKMONK.get(), ThedarkmonkEntity.createAttributes().build());
		event.put(MECHANICALEYE.get(), MechanicaleyeEntity.createAttributes().build());
		event.put(VAMPIRE.get(), VampireEntity.createAttributes().build());
		event.put(ENT.get(), EntEntity.createAttributes().build());
		event.put(PHARAOH.get(), PharaohEntity.createAttributes().build());
		event.put(CARNIVOROUSFLOWER.get(), CarnivorousflowerEntity.createAttributes().build());
		event.put(MOSSYPIG.get(), MossypigEntity.createAttributes().build());
		event.put(SWARMOFFIREFLIES.get(), SwarmoffirefliesEntity.createAttributes().build());
		event.put(ICEOLOGER.get(), IceologerEntity.createAttributes().build());
		event.put(PROJECTILEICEOLOGER.get(), ProjectileiceologerEntity.createAttributes().build());
		event.put(MOSSY_HORROR.get(), MossyHorrorEntity.createAttributes().build());
	}
}
