
package net.mcreator.ufd.block;

import net.mcreator.ufd.procedures.RewrewrProcedure;
import net.mcreator.ufd.init.HotaModItems;

public class GfdfdgiezhievikaBlock extends Block {
	public GfdfdgiezhievikaBlock() {
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
		return new ItemStack(HotaModItems.BLACKBERRY.get());
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
		RewrewrProcedure.execute(world, x, y, z);
		world.scheduleTick(pos, this, 40);
	}
}
