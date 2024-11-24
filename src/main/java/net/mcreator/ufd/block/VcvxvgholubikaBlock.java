
package net.mcreator.ufd.block;

import net.mcreator.ufd.procedures.FdsfdsgholubikaProcedure;
import net.mcreator.ufd.procedures.DfsfgolubikaProcedure;
import net.mcreator.ufd.init.HotaModItems;

public class VcvxvgholubikaBlock extends Block {
	public VcvxvgholubikaBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRASS).strength(0.1f, 0.5f).noCollission().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
		return new ItemStack(HotaModItems.BLUEBERRIES.get());
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 40);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		FdsfdsgholubikaProcedure.execute(world, x, y, z);
		world.scheduleTick(pos, this, 40);
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		DfsfgolubikaProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		return retval;
	}
}
