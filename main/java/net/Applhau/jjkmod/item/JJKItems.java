package net.Applhau.jjkmod.item;

import net.Applhau.jjkmod.JJKMod;
import net.Applhau.jjkmod.armor.JJKModMaterial;
import net.Applhau.jjkmod.armor.armorclass.Iori.IoriPants;
import net.Applhau.jjkmod.armor.armorclass.Iori.Iorijacket;
import net.Applhau.jjkmod.armor.armorclass.choso.ChosoJacket;
import net.Applhau.jjkmod.armor.armorclass.choso.ChosoPants;
import net.Applhau.jjkmod.armor.armorclass.choso.ChosoSHoes;
import net.Applhau.jjkmod.armor.armorclass.choso.ChosoScarf;
import net.Applhau.jjkmod.armor.armorclass.gakuganji.*;
import net.Applhau.jjkmod.armor.armorclass.gojo.GojoHeadband;
import net.Applhau.jjkmod.armor.armorclass.gojo.GojoJacket;
import net.Applhau.jjkmod.armor.armorclass.gojo.GojoPAnts;
import net.Applhau.jjkmod.armor.armorclass.gojo.GojoShoes;
import net.Applhau.jjkmod.armor.armorclass.jogo.JogoJacket;
import net.Applhau.jjkmod.armor.armorclass.kamo.KamoJacket;
import net.Applhau.jjkmod.armor.armorclass.kamo.KamoPants;
import net.Applhau.jjkmod.armor.armorclass.mahito.MahitoPants;
import net.Applhau.jjkmod.armor.armorclass.mahito.MahitoShirt;
import net.Applhau.jjkmod.armor.armorclass.mahito.MahitoShoes;
import net.Applhau.jjkmod.armor.armorclass.malesuit.FemaleTux;
import net.Applhau.jjkmod.armor.armorclass.malesuit.SuitPants;
import net.Applhau.jjkmod.armor.armorclass.malesuit.SuitShoes;
import net.Applhau.jjkmod.armor.armorclass.malesuit.Tux;
import net.Applhau.jjkmod.armor.armorclass.shoko.ShokoPants;
import net.Applhau.jjkmod.armor.armorclass.shoko.ShokoSandals;
import net.Applhau.jjkmod.armor.armorclass.shoko.ShokoTOp;
import net.Applhau.jjkmod.armor.armorclass.sukuna.SukunaFeet;
import net.Applhau.jjkmod.armor.armorclass.sukuna.SukunaPants;
import net.Applhau.jjkmod.armor.armorclass.sukuna.SukunaRobe;
import net.Applhau.jjkmod.armor.armorclass.sukuna.SukunaScarfs;
import net.Applhau.jjkmod.armor.armorclass.todo.TodoPants;
import net.Applhau.jjkmod.armor.armorclass.todo.TodoWaistband;
import net.Applhau.jjkmod.armor.armorclass.tokyooutfit.TokyoBodyLegs;
import net.Applhau.jjkmod.armor.armorclass.tokyooutfit.TokyoBoyOutfit;
import net.Applhau.jjkmod.armor.armorclass.tokyooutfit.TokyoFemaleJacket;
import net.Applhau.jjkmod.armor.armorclass.tokyooutfit.TokyoFemaleSkirt;
import net.Applhau.jjkmod.armor.armorclass.yuta.YutaJacket;
import net.Applhau.jjkmod.armor.armorclass.yuta.YutaPants;
import net.Applhau.jjkmod.armor.armorclass.yuta.YutaShoes;
import net.Applhau.jjkmod.item.Item.*;
import net.Applhau.jjkmod.item.projectile.BulletItem;
import net.Applhau.jjkmod.item.projectile.RootBallItem;
import net.Applhau.jjkmod.world.entities.ModEntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class JJKItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JJKMod.MOD_ID);

    //Items
    public static final RegistryObject<Item> CURSEDENERGY = ITEMS.register("cursedenergy", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> CURSEDSPEECHTOKEN = ITEMS.register("cursed_speech_token", () -> new CursedSpeechToken(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> BLOODMANIPULATIONTOKEN = ITEMS.register("blood_manipulation_token", () -> new BloodManipulationToken(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> CONSTRUCTIONTOKEN = ITEMS.register("construction_token", () -> new ConstructionToken(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> LIMITLESSTOKEN = ITEMS.register("limitless_token", () -> new LimitlessToken(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> DISASTERPLANTSTOKEN = ITEMS.register("disaster_plants_token", () -> new DisasterPlantsToken(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> RATIOTOKEN = ITEMS.register("ratio_token", () -> new RatioToken(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> STRAWDOLLTOKEN = ITEMS.register("straw_doll_token", () -> new StrawDollToken(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> TENSHADOWSTOKEN = ITEMS.register("ten_shadows_token", () -> new TenShadowsToken(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> STRAWDOLL = ITEMS.register("strawdoll", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));


    public static final RegistryObject<Item> BULLET = ITEMS.register("bullet", () -> new BulletItem(new Item.Properties().group(ItemGroup.MATERIALS), 15));
    public static final RegistryObject<Item> ROOTBALL = ITEMS.register("root_ball", () -> new RootBallItem(new Item.Properties().group(ItemGroup.MATERIALS)));


    public static final RegistryObject<ModSpawnEggItem> DIVINEDOGWHITESPAWNEGG = ITEMS.register("divine_dog_white_spawn_egg", () -> new ModSpawnEggItem(ModEntityType.DIVINEDOGWHITE, 0xCFD1D3, 0xE20B00, new Item.Properties().maxStackSize(1).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> DIVINEDOGBLACKSPAWNEGG = ITEMS.register("divine_dog_black_spawn_egg", () -> new ModSpawnEggItem(ModEntityType.DIVINEDOGBLACK, 0x020000, 0xE20B00, new Item.Properties().maxStackSize(1).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> DIVINEDOGTOTALITYSPAWNEGG = ITEMS.register("divine_dog_totality_spawn_egg", () -> new ModSpawnEggItem(ModEntityType.DIVINEDOGTOTALITY, 0x282828, 0xE20B00, new Item.Properties().maxStackSize(1).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> GREATSERPENTSPAWNEGG = ITEMS.register("great_serpent_spawn_egg", () -> new ModSpawnEggItem(ModEntityType.GREATSERPENT, 0xCFD1D3, 0xFFFF14, new Item.Properties().maxStackSize(1).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> NUESPAWNEGG = ITEMS.register("nue_spawn_egg", () -> new ModSpawnEggItem(ModEntityType.NUE, 0x0FF530F, 0xFF0022, new Item.Properties().maxStackSize(1).group(ItemGroup.MATERIALS)));
    public static final RegistryObject<ModSpawnEggItem> ROOTSPIKESPAWNEGG = ITEMS.register("root_spike_egg", () -> new ModSpawnEggItem(ModEntityType.ROOTSPIKE, 0x542D1D, 0x513A31, new Item.Properties().maxStackSize(1).group(ItemGroup.MATERIALS)));


    //Weapon
    public static final RegistryObject<Item> KENTOCLEAVER = ITEMS.register("kento_cleaver", () -> new SwordItem(JJKItemtier.KENTOCLEAVER, 3//multiply this number by str variable later during stats
            , 1.1f, new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> HAMMER = ITEMS.register("hammer", () -> new SwordItem(JJKItemtier.KENTOCLEAVER, 3//multiply this number by str variable later during stats
            , 1.1f, new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> WOODENTONFA = ITEMS.register("wooden_tonfa", () -> new SwordItem(JJKItemtier.WOODENTONFA, 2//multiply this number by str variable later during stats
            , 1.25f, new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> MEIMEIAXE = ITEMS.register("mei_mei_axe", () -> new SwordItem(JJKItemtier.MEIMEIAXE, 5//multiply this number by str variable later during stats
            , -3.25f, new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> HARUTOSWORD = ITEMS.register("haruto_sword", () -> new SwordItem(JJKItemtier.HARUTOSWORD, 3//multiply this number by str variable later during stats
            , -3.0f, new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> MAKISPEAR = ITEMS.register("maki_spear", () -> new SwordItem(JJKItemtier.MAKISPEAR, 5//multiply this number by str variable later during stats
            , -3.25f, new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> SLAUGHTERDEMON = ITEMS.register("slaughter_demon", () -> new SwordItem(JJKItemtier.SLAUGHTERDEMON, 3//multiply this number by str variable later during stats
            , -2.9f, new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> DRAGONBONE = ITEMS.register("dragon_bone", () -> new SwordItem(JJKItemtier.DRAGONBONE, 5//multiply this number by str variable later during stats
            , -3.25f, new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> JETBLACKSWORD = ITEMS.register("jet_black_sword", () -> new SwordItem(JJKItemtier.JETBLACKSWORD, 3//multiply this number by str variable later during stats
            , -3.0f, new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> INVERTEDSPEAROFHEAVEN = ITEMS.register("inverted_spear_of_heaven", () -> new SwordItem(JJKItemtier.WOODENTONFA, 4//multiply this number by str variable later during stats
            , -2.75f, new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> MIWAKATANA = ITEMS.register("miwa_katana", () -> new SwordItem(JJKItemtier.HARUTOSWORD, 6//multiply this number by str variable later during stats
            , -2.9f, new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> REVOLVER = ITEMS.register("revolver", () -> new CrossbowItem(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(1)));



    //Armor
    public static final RegistryObject<Item> TOKYOBOYBODY = ITEMS.register("tokyo_boy_chest", () -> new TokyoBoyOutfit(JJKModMaterial.TOKYOBOYOUTFIT, EquipmentSlotType.CHEST//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> TOKYOBOYPANTS = ITEMS.register("tokyo_boy_pants", () -> new TokyoBodyLegs(JJKModMaterial.TOKYOBOYOUTFIT, EquipmentSlotType.LEGS//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> TOKYOGIRLBODY = ITEMS.register("tokyo_girl_chest", () -> new TokyoFemaleJacket(JJKModMaterial.TOKYOBOYOUTFIT, EquipmentSlotType.CHEST//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> TOKYOGIRLPANTS = ITEMS.register("tokyo_girl_pants", () -> new TokyoFemaleSkirt(JJKModMaterial.TOKYOBOYOUTFIT, EquipmentSlotType.LEGS//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GOJOHEADBAND = ITEMS.register("gojo_headband", () -> new GojoHeadband(JJKModMaterial.GOJOOUTFIT, EquipmentSlotType.HEAD//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GOJOJACKET = ITEMS.register("gojo_jacket", () -> new GojoJacket(JJKModMaterial.GOJOOUTFIT, EquipmentSlotType.CHEST//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GOJOPANTS = ITEMS.register("gojo_pants", () -> new GojoPAnts(JJKModMaterial.GOJOOUTFIT, EquipmentSlotType.LEGS//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GOJOSHOES = ITEMS.register("gojo_shoes", () -> new GojoShoes(JJKModMaterial.GOJOOUTFIT, EquipmentSlotType.FEET//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> YUTAJACKET = ITEMS.register("yuta_jacket", () -> new YutaJacket(JJKModMaterial.GOJOOUTFIT, EquipmentSlotType.CHEST//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> YUTAPANTS = ITEMS.register("yuta_pants", () -> new YutaPants(JJKModMaterial.GOJOOUTFIT, EquipmentSlotType.LEGS//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> YUTASHOES = ITEMS.register("yuta_shoes", () -> new YutaShoes(JJKModMaterial.GOJOOUTFIT, EquipmentSlotType.FEET//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> SUKUNASCARF = ITEMS.register("sukuna_scarf", () -> new SukunaScarfs(JJKModMaterial.SUKUNAOUTFIT, EquipmentSlotType.HEAD//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> SUKUNAROBE = ITEMS.register("sukuna_robe", () -> new SukunaRobe(JJKModMaterial.SUKUNAOUTFIT, EquipmentSlotType.CHEST//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> SUKUNAPANTS = ITEMS.register("sukuna_pants", () -> new SukunaPants(JJKModMaterial.SUKUNAOUTFIT, EquipmentSlotType.LEGS//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> SUKUNASHOES = ITEMS.register("sukuna_shoes", () -> new SukunaFeet(JJKModMaterial.SUKUNAOUTFIT, EquipmentSlotType.FEET//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CHOSOSCARF = ITEMS.register("choso_scarf", () -> new ChosoScarf(JJKModMaterial.SUKUNAOUTFIT, EquipmentSlotType.HEAD//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CHOSOROBE = ITEMS.register("choso_robe", () -> new ChosoJacket(JJKModMaterial.SUKUNAOUTFIT, EquipmentSlotType.CHEST//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CHOSOPANTS = ITEMS.register("choso_pants", () -> new ChosoPants(JJKModMaterial.SUKUNAOUTFIT, EquipmentSlotType.LEGS//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CHOSOSHOES = ITEMS.register("choso_shoes", () -> new ChosoSHoes(JJKModMaterial.SUKUNAOUTFIT, EquipmentSlotType.FEET//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> JOGOJACKET = ITEMS.register("jogo_jacket", () -> new JogoJacket(JJKModMaterial.TOKYOBOYOUTFIT, EquipmentSlotType.CHEST//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> TODOWAIST = ITEMS.register("todo_waist", () -> new TodoWaistband(JJKModMaterial.TODOOUTFIT, EquipmentSlotType.CHEST//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> TODOPANTS = ITEMS.register("todo_pants", () -> new TodoPants(JJKModMaterial.TODOOUTFIT, EquipmentSlotType.LEGS//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> KAMOBODY = ITEMS.register("kamo_chest", () -> new KamoJacket(JJKModMaterial.KAMOOUTFIT, EquipmentSlotType.CHEST//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> KAMOPANTS = ITEMS.register("kamo_pants", () -> new KamoPants(JJKModMaterial.KAMOOUTFIT, EquipmentSlotType.LEGS//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> IORIBODY = ITEMS.register("iori_chest", () -> new Iorijacket(JJKModMaterial.KAMOOUTFIT, EquipmentSlotType.CHEST//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> IORIPANTS = ITEMS.register("iori_pants", () -> new IoriPants(JJKModMaterial.KAMOOUTFIT, EquipmentSlotType.LEGS//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> MAHITOSHIRT = ITEMS.register("mahito_robe", () -> new MahitoShirt(JJKModMaterial.KAMOOUTFIT, EquipmentSlotType.CHEST//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> MAHITOPANTS = ITEMS.register("mahito_pants", () -> new MahitoPants(JJKModMaterial.KAMOOUTFIT, EquipmentSlotType.LEGS//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> MAHITOSHOES = ITEMS.register("mahito_shoes", () -> new MahitoShoes(JJKModMaterial.KAMOOUTFIT, EquipmentSlotType.FEET//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> MALESUITTUX = ITEMS.register("male_suit_tux", () -> new Tux(JJKModMaterial.KAMOOUTFIT, EquipmentSlotType.CHEST//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> FEMALESUITTUX = ITEMS.register("female_suit_tux", () -> new FemaleTux(JJKModMaterial.KAMOOUTFIT, EquipmentSlotType.CHEST//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> MALESUITPANTS = ITEMS.register("male_suit_pants", () -> new SuitPants(JJKModMaterial.KAMOOUTFIT, EquipmentSlotType.LEGS//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> MALESUITSHOES = ITEMS.register("male_suit_shoes", () -> new SuitShoes(JJKModMaterial.KAMOOUTFIT, EquipmentSlotType.FEET//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> SHOKOJACKET = ITEMS.register("shoko_jacket", () -> new ShokoTOp(JJKModMaterial.TOKYOBOYOUTFIT, EquipmentSlotType.CHEST//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> SHOKOPANTS = ITEMS.register("shoko_pants", () -> new ShokoPants(JJKModMaterial.TOKYOBOYOUTFIT, EquipmentSlotType.LEGS//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> SHOKOSHOES = ITEMS.register("shoko_shoes", () -> new ShokoSandals(JJKModMaterial.TOKYOBOYOUTFIT, EquipmentSlotType.FEET//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GAKUGANJIJACKET = ITEMS.register("gakuganji_jacket", () -> new GakuganjiJacket(JJKModMaterial.GOJOOUTFIT, EquipmentSlotType.CHEST//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GAKUGANJIPANTS = ITEMS.register("gakuganji_pants", () -> new GakuganjiPants(JJKModMaterial.GOJOOUTFIT, EquipmentSlotType.LEGS//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GAKUGANJISHOES = ITEMS.register("gakuganji_shoes", () -> new GakuganjiSandals(JJKModMaterial.GOJOOUTFIT, EquipmentSlotType.FEET//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GAKUGANJISHIRT = ITEMS.register("gakuganji_shirt", () -> new GakuganjiShirt(JJKModMaterial.GOJOOUTFIT, EquipmentSlotType.CHEST//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GAKUGANJIJACKETPANTS = ITEMS.register("gakuganji_jacket_pants", () -> new GakuganjiPantsJacket(JJKModMaterial.GOJOOUTFIT, EquipmentSlotType.LEGS//multiply this number by str variable later during stats
            , new Item.Properties().group(ItemGroup.MATERIALS)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
