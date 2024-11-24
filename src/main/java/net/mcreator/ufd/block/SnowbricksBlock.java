
package net.mcreator.ufd.block;

public class SnowbricksBlock extends Block {
	public SnowbricksBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.SNOW).strength(0.4f, 0.8f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
