
package net.mcreator.ufd.entity;

import net.mcreator.ufd.init.HotaModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class SparklingswordProjectileEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(Blocks.AIR);

	public SparklingswordProjectileEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(HotaModEntities.SPARKLINGSWORD_PROJECTILE.get(), world);
	}

	public SparklingswordProjectileEntity(EntityType<? extends SparklingswordProjectileEntity> type, Level world) {
		super(type, world);
	}

	public SparklingswordProjectileEntity(EntityType<? extends SparklingswordProjectileEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public SparklingswordProjectileEntity(EntityType<? extends SparklingswordProjectileEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getPickupItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static SparklingswordProjectileEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 1.5f, 6, 0);
	}

	public static SparklingswordProjectileEntity shoot(Level world, LivingEntity entity, RandomSource source, float pullingPower) {
		return shoot(world, entity, source, pullingPower * 1.5f, 6, 0);
	}

	public static SparklingswordProjectileEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		SparklingswordProjectileEntity entityarrow = new SparklingswordProjectileEntity(HotaModEntities.SPARKLINGSWORD_PROJECTILE.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		entityarrow.setSecondsOnFire(100);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.shoot")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static SparklingswordProjectileEntity shoot(LivingEntity entity, LivingEntity target) {
		SparklingswordProjectileEntity entityarrow = new SparklingswordProjectileEntity(HotaModEntities.SPARKLINGSWORD_PROJECTILE.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1.5f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(6);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(true);
		entityarrow.setSecondsOnFire(100);
		entity.level().addFreshEntity(entityarrow);
		entity.level().playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.shoot")), SoundSource.PLAYERS, 1,
				1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
