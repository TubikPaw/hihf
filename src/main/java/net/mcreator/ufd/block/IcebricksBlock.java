
package net.mcreator.ufd.block;

public class IcebricksBlock extends Block {
	public IcebricksBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(0.5f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
