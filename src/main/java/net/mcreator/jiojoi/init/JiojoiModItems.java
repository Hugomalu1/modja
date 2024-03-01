
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jiojoi.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.jiojoi.item.ZiegelstabchenItem;
import net.mcreator.jiojoi.item.ZZzzzzaaaahTURTELItem;
import net.mcreator.jiojoi.item.UrolItem;
import net.mcreator.jiojoi.item.TurtelItem;
import net.mcreator.jiojoi.item.TaschenlampeItem;
import net.mcreator.jiojoi.item.SunglassesItem;
import net.mcreator.jiojoi.item.StoffItem;
import net.mcreator.jiojoi.item.SteelIngotItem;
import net.mcreator.jiojoi.item.ShrimpshellItem;
import net.mcreator.jiojoi.item.ShrimpItem;
import net.mcreator.jiojoi.item.RedmeltedmicroplastickItem;
import net.mcreator.jiojoi.item.PurlpelgulperItem;
import net.mcreator.jiojoi.item.ProfishingrodItem;
import net.mcreator.jiojoi.item.NamnamgekochterbarshItem;
import net.mcreator.jiojoi.item.MicroplastickfragmentItem;
import net.mcreator.jiojoi.item.KohlestabchenItem;
import net.mcreator.jiojoi.item.KnusperstabchenItem;
import net.mcreator.jiojoi.item.HechtItem;
import net.mcreator.jiojoi.item.HarpuneItem;
import net.mcreator.jiojoi.item.HalfefItem;
import net.mcreator.jiojoi.item.GrettneItem;
import net.mcreator.jiojoi.item.GeschmolzenesmicroplastickItem;
import net.mcreator.jiojoi.item.GeolterbackfischItem;
import net.mcreator.jiojoi.item.GekochterhechtItem;
import net.mcreator.jiojoi.item.FriedshrimpItem;
import net.mcreator.jiojoi.item.FriedpurpelgulperItem;
import net.mcreator.jiojoi.item.FischstabchenItem;
import net.mcreator.jiojoi.item.FeuerstabchenItem;
import net.mcreator.jiojoi.item.DwagItem;
import net.mcreator.jiojoi.item.DawdawItem;
import net.mcreator.jiojoi.item.BluemeltedmicroplastickItem;
import net.mcreator.jiojoi.item.BlackmeltedmicroplastickItem;
import net.mcreator.jiojoi.item.BarschItem;
import net.mcreator.jiojoi.item.BackfischItem;
import net.mcreator.jiojoi.JiojoiMod;

public class JiojoiModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, JiojoiMod.MODID);
	public static final RegistryObject<Item> UROL_BUCKET = REGISTRY.register("urol_bucket", () -> new UrolItem());
	public static final RegistryObject<Item> DWAG = REGISTRY.register("dwag", () -> new DwagItem());
	public static final RegistryObject<Item> BACKFISCH = REGISTRY.register("backfisch", () -> new BackfischItem());
	public static final RegistryObject<Item> GEOLTERBACKFISCH = REGISTRY.register("geolterbackfisch", () -> new GeolterbackfischItem());
	public static final RegistryObject<Item> FISCHSTABCHEN = REGISTRY.register("fischstabchen", () -> new FischstabchenItem());
	public static final RegistryObject<Item> KNUSPERSTABCHEN = REGISTRY.register("knusperstabchen", () -> new KnusperstabchenItem());
	public static final RegistryObject<Item> ZIEGELSTABCHEN = REGISTRY.register("ziegelstabchen", () -> new ZiegelstabchenItem());
	public static final RegistryObject<Item> KOHLESTABCHEN = REGISTRY.register("kohlestabchen", () -> new KohlestabchenItem());
	public static final RegistryObject<Item> FEUERSTABCHEN = REGISTRY.register("feuerstabchen", () -> new FeuerstabchenItem());
	public static final RegistryObject<Item> MICROPLASTICK = block(JiojoiModBlocks.MICROPLASTICK);
	public static final RegistryObject<Item> MICROPLASTICKFRAGMENT = REGISTRY.register("microplastickfragment", () -> new MicroplastickfragmentItem());
	public static final RegistryObject<Item> GESCHMOLZENESMICROPLASTICK = REGISTRY.register("geschmolzenesmicroplastick", () -> new GeschmolzenesmicroplastickItem());
	public static final RegistryObject<Item> BAUMWOLLE = block(JiojoiModBlocks.BAUMWOLLE);
	public static final RegistryObject<Item> STOFF = REGISTRY.register("stoff", () -> new StoffItem());
	public static final RegistryObject<Item> TASCHENLAMPE = REGISTRY.register("taschenlampe", () -> new TaschenlampeItem());
	public static final RegistryObject<Item> BARSCH = REGISTRY.register("barsch", () -> new BarschItem());
	public static final RegistryObject<Item> NAMNAMGEKOCHTERBARSH = REGISTRY.register("namnamgekochterbarsh", () -> new NamnamgekochterbarshItem());
	public static final RegistryObject<Item> HECHT = REGISTRY.register("hecht", () -> new HechtItem());
	public static final RegistryObject<Item> GEKOCHTERHECHT = REGISTRY.register("gekochterhecht", () -> new GekochterhechtItem());
	public static final RegistryObject<Item> HALFEF = REGISTRY.register("halfef", () -> new HalfefItem());
	public static final RegistryObject<Item> GRETTNE = REGISTRY.register("grettne", () -> new GrettneItem());
	public static final RegistryObject<Item> DAWDAW = REGISTRY.register("dawdaw", () -> new DawdawItem());
	public static final RegistryObject<Item> PROFISHINGROD = REGISTRY.register("profishingrod", () -> new ProfishingrodItem());
	public static final RegistryObject<Item> PURLPELGULPER = REGISTRY.register("purlpelgulper", () -> new PurlpelgulperItem());
	public static final RegistryObject<Item> FRIEDPURPELGULPER = REGISTRY.register("friedpurpelgulper", () -> new FriedpurpelgulperItem());
	public static final RegistryObject<Item> STEEL_ORE = block(JiojoiModBlocks.STEEL_ORE);
	public static final RegistryObject<Item> STEEL_BLOCK = block(JiojoiModBlocks.STEEL_BLOCK);
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> HARPUNE = REGISTRY.register("harpune", () -> new HarpuneItem());
	public static final RegistryObject<Item> SHRIMP = REGISTRY.register("shrimp", () -> new ShrimpItem());
	public static final RegistryObject<Item> FRIEDSHRIMP = REGISTRY.register("friedshrimp", () -> new FriedshrimpItem());
	public static final RegistryObject<Item> SHRIMPSHELL = REGISTRY.register("shrimpshell", () -> new ShrimpshellItem());
	public static final RegistryObject<Item> TURTEL = REGISTRY.register("turtel", () -> new TurtelItem());
	public static final RegistryObject<Item> Z_ZZZZZAAAAH_TURTEL = REGISTRY.register("z_zzzzzaaaah_turtel", () -> new ZZzzzzaaaahTURTELItem());
	public static final RegistryObject<Item> SUNGLASSES = REGISTRY.register("sunglasses", () -> new SunglassesItem());
	public static final RegistryObject<Item> BLACKMELTEDMICROPLASTICK = REGISTRY.register("blackmeltedmicroplastick", () -> new BlackmeltedmicroplastickItem());
	public static final RegistryObject<Item> BLUEMELTEDMICROPLASTICK = REGISTRY.register("bluemeltedmicroplastick", () -> new BluemeltedmicroplastickItem());
	public static final RegistryObject<Item> REDMELTEDMICROPLASTICK = REGISTRY.register("redmeltedmicroplastick", () -> new RedmeltedmicroplastickItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
