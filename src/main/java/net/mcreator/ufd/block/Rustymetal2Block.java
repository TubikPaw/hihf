
package net.mcreator.ufd.block;

public class Rustymetal2Block extends Block {
	public Rustymetal2Block() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(3f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
