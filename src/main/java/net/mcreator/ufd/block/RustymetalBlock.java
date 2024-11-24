
package net.mcreator.ufd.block;

public class RustymetalBlock extends Block {
	public RustymetalBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(3f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
