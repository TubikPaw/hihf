
package net.mcreator.ufd.world.features.treedecorators;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MossycoverFruitDecorator extends CocoaDecorator {
	public static Codec<MossycoverFruitDecorator> CODEC = Codec.unit(MossycoverFruitDecorator::new);
	public static TreeDecoratorType<?> DECORATOR_TYPE = new TreeDecoratorType<>(CODEC);

	@SubscribeEvent
	public static void registerTreeDecorator(RegisterEvent event) {
		event.register(ForgeRegistries.Keys.TREE_DECORATOR_TYPES, registerHelper -> registerHelper.register("mossycover_tree_fruit_decorator", DECORATOR_TYPE));
	}

	public MossycoverFruitDecorator() {
		super(0.2f);
	}

	@Override
	protected TreeDecoratorType<?> type() {
		return DECORATOR_TYPE;
	}

	@Override /* failed to load code for net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator */
	private static BlockState oriented(BlockState blockstate, Direction direction) {
		return switch (direction) {
			case SOUTH -> blockstate.getBlock().rotate(blockstate, Rotation.CLOCKWISE_180);
			case EAST -> blockstate.getBlock().rotate(blockstate, Rotation.CLOCKWISE_90);
			case WEST -> blockstate.getBlock().rotate(blockstate, Rotation.COUNTERCLOCKWISE_90);
			default -> blockstate;
		};
	}
}
