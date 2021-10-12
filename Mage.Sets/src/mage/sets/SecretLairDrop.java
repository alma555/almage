package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * https://scryfall.com/sets/sld
 */
public class SecretLairDrop extends ExpansionSet {

    private static final SecretLairDrop instance = new SecretLairDrop();

    public static SecretLairDrop getInstance() {
        return instance;
    }

    private SecretLairDrop() {
        super("Secret Lair Drop", "SLD", ExpansionSet.buildDate(2020, 3, 12), SetType.PROMOTIONAL);
        this.hasBoosters = false;
        this.hasBasicLands = true;

        cards.add(new SetCardInfo("Snow-Covered Plains", 1, Rarity.LAND, mage.cards.s.SnowCoveredPlains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Snow-Covered Island", 2, Rarity.LAND, mage.cards.s.SnowCoveredIsland.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Snow-Covered Swamp", 3, Rarity.LAND, mage.cards.s.SnowCoveredSwamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Snow-Covered Mountain", 4, Rarity.LAND, mage.cards.s.SnowCoveredMountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Snow-Covered Forest", 5, Rarity.LAND, mage.cards.s.SnowCoveredForest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bloodghast", 6, Rarity.RARE, mage.cards.b.Bloodghast.class));
        cards.add(new SetCardInfo("Golgari Thug", 7, Rarity.RARE, mage.cards.g.GolgariThug.class));
        cards.add(new SetCardInfo("Life from the Loam", 8, Rarity.RARE, mage.cards.l.LifeFromTheLoam.class));
        cards.add(new SetCardInfo("Reaper King", 9, Rarity.MYTHIC, mage.cards.r.ReaperKing.class));
        cards.add(new SetCardInfo("Sliver Overlord", 10, Rarity.MYTHIC, mage.cards.s.SliverOverlord.class));
        cards.add(new SetCardInfo("The Ur-Dragon", 11, Rarity.MYTHIC, mage.cards.t.TheUrDragon.class));
        cards.add(new SetCardInfo("Bitterblossom", 12, Rarity.MYTHIC, mage.cards.b.Bitterblossom.class));
        cards.add(new SetCardInfo("Goblin Bushwhacker", 17, Rarity.RARE, mage.cards.g.GoblinBushwhacker.class));
        cards.add(new SetCardInfo("Goblin Sharpshooter", 18, Rarity.RARE, mage.cards.g.GoblinSharpshooter.class));
        cards.add(new SetCardInfo("Goblin King", 19, Rarity.RARE, mage.cards.g.GoblinKing.class));
        cards.add(new SetCardInfo("Goblin Lackey", 20, Rarity.RARE, mage.cards.g.GoblinLackey.class));
        cards.add(new SetCardInfo("Goblin Piledriver", 21, Rarity.RARE, mage.cards.g.GoblinPiledriver.class));
        cards.add(new SetCardInfo("Leonin Warleader", 22, Rarity.RARE, mage.cards.l.LeoninWarleader.class));
        cards.add(new SetCardInfo("Regal Caracal", 23, Rarity.RARE, mage.cards.r.RegalCaracal.class));
        cards.add(new SetCardInfo("Qasali Slingers", 24, Rarity.RARE, mage.cards.q.QasaliSlingers.class));
        cards.add(new SetCardInfo("Arahbo, Roar of the World", 25, Rarity.MYTHIC, mage.cards.a.ArahboRoarOfTheWorld.class));
        cards.add(new SetCardInfo("Mirri, Weatherlight Duelist", 26, Rarity.MYTHIC, mage.cards.m.MirriWeatherlightDuelist.class));
        cards.add(new SetCardInfo("Serum Visions", 29, Rarity.RARE, mage.cards.s.SerumVisions.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Serum Visions", 30, Rarity.RARE, mage.cards.s.SerumVisions.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Serum Visions", 31, Rarity.RARE, mage.cards.s.SerumVisions.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Serum Visions", 32, Rarity.RARE, mage.cards.s.SerumVisions.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ink-Eyes, Servant of Oni", 33, Rarity.RARE, mage.cards.i.InkEyesServantOfOni.class));
        cards.add(new SetCardInfo("Marrow-Gnawer", 34, Rarity.RARE, mage.cards.m.MarrowGnawer.class));
        cards.add(new SetCardInfo("Pack Rat", 35, Rarity.RARE, mage.cards.p.PackRat.class));
        cards.add(new SetCardInfo("Rat Colony", 36, Rarity.RARE, mage.cards.r.RatColony.class));
        cards.add(new SetCardInfo("Thalia, Guardian of Thraben", 37, Rarity.RARE, mage.cards.t.ThaliaGuardianOfThraben.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thalia, Guardian of Thraben", 38, Rarity.RARE, mage.cards.t.ThaliaGuardianOfThraben.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thalia, Guardian of Thraben", 39, Rarity.RARE, mage.cards.t.ThaliaGuardianOfThraben.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thalia, Guardian of Thraben", 40, Rarity.RARE, mage.cards.t.ThaliaGuardianOfThraben.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Spell Pierce", 41, Rarity.RARE, mage.cards.s.SpellPierce.class));
        cards.add(new SetCardInfo("Blood Artist", 42, Rarity.RARE, mage.cards.b.BloodArtist.class));
        cards.add(new SetCardInfo("Eternal Witness", 43, Rarity.RARE, mage.cards.e.EternalWitness.class));
        cards.add(new SetCardInfo("Pithing Needle", 44, Rarity.RARE, mage.cards.p.PithingNeedle.class));
        cards.add(new SetCardInfo("Inkmoth Nexus", 45, Rarity.RARE, mage.cards.i.InkmothNexus.class));
        cards.add(new SetCardInfo("Captain Sisay", 51, Rarity.MYTHIC, mage.cards.c.CaptainSisay.class));
        cards.add(new SetCardInfo("Meren of Clan Nel Toth", 52, Rarity.MYTHIC, mage.cards.m.MerenOfClanNelToth.class));
        cards.add(new SetCardInfo("Narset, Enlightened Master", 53, Rarity.MYTHIC, mage.cards.n.NarsetEnlightenedMaster.class));
        cards.add(new SetCardInfo("Oona, Queen of the Fae", 54, Rarity.MYTHIC, mage.cards.o.OonaQueenOfTheFae.class));
        cards.add(new SetCardInfo("Saskia the Unyielding", 55, Rarity.MYTHIC, mage.cards.s.SaskiaTheUnyielding.class));
        cards.add(new SetCardInfo("Arcbound Ravager", 56, Rarity.RARE, mage.cards.a.ArcboundRavager.class));
        cards.add(new SetCardInfo("Darksteel Colossus", 57, Rarity.MYTHIC, mage.cards.d.DarksteelColossus.class));
        cards.add(new SetCardInfo("Walking Ballista", 58, Rarity.RARE, mage.cards.w.WalkingBallista.class));
        cards.add(new SetCardInfo("Storm Crow", 60, Rarity.RARE, mage.cards.s.StormCrow.class));
        cards.add(new SetCardInfo("Goblin Snowman", 61, Rarity.RARE, mage.cards.g.GoblinSnowman.class));
        cards.add(new SetCardInfo("Mudhole", 62, Rarity.RARE, mage.cards.m.Mudhole.class));
        cards.add(new SetCardInfo("Plains", 63, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Island", 64, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 65, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 66, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Forest", 67, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Heliod, God of the Sun", 68, Rarity.MYTHIC, mage.cards.h.HeliodGodOfTheSun.class));
        cards.add(new SetCardInfo("Karametra, God of Harvests", 69, Rarity.MYTHIC, mage.cards.k.KarametraGodOfHarvests.class));
        cards.add(new SetCardInfo("Iroas, God of Victory", 70, Rarity.MYTHIC, mage.cards.i.IroasGodOfVictory.class));
        cards.add(new SetCardInfo("Thassa, God of the Sea", 71, Rarity.MYTHIC, mage.cards.t.ThassaGodOfTheSea.class));
        cards.add(new SetCardInfo("Ephara, God of the Polis", 72, Rarity.MYTHIC, mage.cards.e.EpharaGodOfThePolis.class));
        cards.add(new SetCardInfo("Kruphix, God of Horizons", 73, Rarity.MYTHIC, mage.cards.k.KruphixGodOfHorizons.class));
        cards.add(new SetCardInfo("Erebos, God of the Dead", 74, Rarity.MYTHIC, mage.cards.e.ErebosGodOfTheDead.class));
        cards.add(new SetCardInfo("Phenax, God of Deception", 75, Rarity.MYTHIC, mage.cards.p.PhenaxGodOfDeception.class));
        cards.add(new SetCardInfo("Athreos, God of Passage", 76, Rarity.MYTHIC, mage.cards.a.AthreosGodOfPassage.class));
        cards.add(new SetCardInfo("Purphoros, God of the Forge", 77, Rarity.MYTHIC, mage.cards.p.PurphorosGodOfTheForge.class));
        cards.add(new SetCardInfo("Mogis, God of Slaughter", 78, Rarity.MYTHIC, mage.cards.m.MogisGodOfSlaughter.class));
        cards.add(new SetCardInfo("Keranos, God of Storms", 79, Rarity.MYTHIC, mage.cards.k.KeranosGodOfStorms.class));
        cards.add(new SetCardInfo("Nylea, God of the Hunt", 80, Rarity.MYTHIC, mage.cards.n.NyleaGodOfTheHunt.class));
        cards.add(new SetCardInfo("Xenagos, God of Revels", 81, Rarity.MYTHIC, mage.cards.x.XenagosGodOfRevels.class));
        cards.add(new SetCardInfo("Pharika, God of Affliction", 82, Rarity.MYTHIC, mage.cards.p.PharikaGodOfAffliction.class));
        cards.add(new SetCardInfo("Lightning Bolt", 83, Rarity.RARE, mage.cards.l.LightningBolt.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Lightning Bolt", 84, Rarity.RARE, mage.cards.l.LightningBolt.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Lightning Bolt", 85, Rarity.RARE, mage.cards.l.LightningBolt.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Lightning Bolt", 86, Rarity.RARE, mage.cards.l.LightningBolt.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ajani Steadfast", 87, Rarity.MYTHIC, mage.cards.a.AjaniSteadfast.class));
        cards.add(new SetCardInfo("Domri Rade", 88, Rarity.MYTHIC, mage.cards.d.DomriRade.class));
        cards.add(new SetCardInfo("Tamiyo, Field Researcher", 89, Rarity.MYTHIC, mage.cards.t.TamiyoFieldResearcher.class));
        cards.add(new SetCardInfo("Vraska, Golgari Queen", 90, Rarity.MYTHIC, mage.cards.v.VraskaGolgariQueen.class));
        cards.add(new SetCardInfo("Swan Song", 91, Rarity.RARE, mage.cards.s.SwanSong.class));
        cards.add(new SetCardInfo("Birds of Paradise", 92, Rarity.RARE, mage.cards.b.BirdsOfParadise.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Gilded Goose", 93, Rarity.RARE, mage.cards.g.GildedGoose.class));
        cards.add(new SetCardInfo("Baleful Strix", 94, Rarity.RARE, mage.cards.b.BalefulStrix.class));
        cards.add(new SetCardInfo("Dovescape", 95, Rarity.RARE, mage.cards.d.Dovescape.class));
        cards.add(new SetCardInfo("Rest in Peace", 96, Rarity.RARE, mage.cards.r.RestInPeace.class));
        cards.add(new SetCardInfo("Dig Through Time", 97, Rarity.RARE, mage.cards.d.DigThroughTime.class));
        cards.add(new SetCardInfo("Ancient Grudge", 98, Rarity.RARE, mage.cards.a.AncientGrudge.class));
        cards.add(new SetCardInfo("Lightning Greaves", 99, Rarity.RARE, mage.cards.l.LightningGreaves.class));
        cards.add(new SetCardInfo("Plains", 100, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 101, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 102, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 103, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 104, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 105, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 106, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 107, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 108, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 109, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swords to Plowshares", 110, Rarity.RARE, mage.cards.s.SwordsToPlowshares.class));
        cards.add(new SetCardInfo("Opt", 111, Rarity.RARE, mage.cards.o.Opt.class));
        cards.add(new SetCardInfo("Fatal Push", 112, Rarity.RARE, mage.cards.f.FatalPush.class));
        cards.add(new SetCardInfo("Anger of the Gods", 113, Rarity.RARE, mage.cards.a.AngerOfTheGods.class));
        cards.add(new SetCardInfo("Explore", 114, Rarity.RARE, mage.cards.e.Explore.class));
        cards.add(new SetCardInfo("Glen Elendra Archmage", 115, Rarity.RARE, mage.cards.g.GlenElendraArchmage.class));
        cards.add(new SetCardInfo("Mistbind Clique", 116, Rarity.RARE, mage.cards.m.MistbindClique.class));
        cards.add(new SetCardInfo("Spellstutter Sprite", 117, Rarity.RARE, mage.cards.s.SpellstutterSprite.class));
        cards.add(new SetCardInfo("Vendilion Clique", 118, Rarity.RARE, mage.cards.v.VendilionClique.class));
        cards.add(new SetCardInfo("Swamp", 119, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Sower of Temptation", 120, Rarity.RARE, mage.cards.s.SowerOfTemptation.class));
        cards.add(new SetCardInfo("Damnation", 121, Rarity.RARE, mage.cards.d.Damnation.class));
        cards.add(new SetCardInfo("Enchanted Evening", 122, Rarity.RARE, mage.cards.e.EnchantedEvening.class));
        cards.add(new SetCardInfo("Hallowed Fountain", 123, Rarity.RARE, mage.cards.h.HallowedFountain.class));
        cards.add(new SetCardInfo("Watery Grave", 124, Rarity.RARE, mage.cards.w.WateryGrave.class));
        cards.add(new SetCardInfo("Blood Crypt", 125, Rarity.RARE, mage.cards.b.BloodCrypt.class));
        cards.add(new SetCardInfo("Stomping Ground", 126, Rarity.RARE, mage.cards.s.StompingGround.class));
        cards.add(new SetCardInfo("Temple Garden", 127, Rarity.RARE, mage.cards.t.TempleGarden.class));
        cards.add(new SetCardInfo("Godless Shrine", 128, Rarity.RARE, mage.cards.g.GodlessShrine.class));
        cards.add(new SetCardInfo("Steam Vents", 129, Rarity.RARE, mage.cards.s.SteamVents.class));
        cards.add(new SetCardInfo("Overgrown Tomb", 130, Rarity.RARE, mage.cards.o.OvergrownTomb.class));
        cards.add(new SetCardInfo("Sacred Foundry", 131, Rarity.RARE, mage.cards.s.SacredFoundry.class));
        cards.add(new SetCardInfo("Breeding Pool", 132, Rarity.RARE, mage.cards.b.BreedingPool.class));
        cards.add(new SetCardInfo("Necrotic Ooze", 133, Rarity.RARE, mage.cards.n.NecroticOoze.class));
        cards.add(new SetCardInfo("Acidic Slime", 134, Rarity.RARE, mage.cards.a.AcidicSlime.class));
        cards.add(new SetCardInfo("Scavenging Ooze", 135, Rarity.RARE, mage.cards.s.ScavengingOoze.class));
        cards.add(new SetCardInfo("The Mimeoplasm", 136, Rarity.MYTHIC, mage.cards.t.TheMimeoplasm.class));
        cards.add(new SetCardInfo("Voidslime", 137, Rarity.RARE, mage.cards.v.Voidslime.class));
        cards.add(new SetCardInfo("Anguished Unmaking", 138, Rarity.RARE, mage.cards.a.AnguishedUnmaking.class));
        cards.add(new SetCardInfo("Assassin's Trophy", 139, Rarity.RARE, mage.cards.a.AssassinsTrophy.class));
        cards.add(new SetCardInfo("Decimate", 140, Rarity.RARE, mage.cards.d.Decimate.class));
        cards.add(new SetCardInfo("Dreadbore", 141, Rarity.RARE, mage.cards.d.Dreadbore.class));
        cards.add(new SetCardInfo("Thraximundar", 142, Rarity.RARE, mage.cards.t.Thraximundar.class));
        cards.add(new SetCardInfo("Rick, Steadfast Leader", 143, Rarity.MYTHIC, mage.cards.r.RickSteadfastLeader.class));
        cards.add(new SetCardInfo("Daryl, Hunter of Walkers", 144, Rarity.MYTHIC, mage.cards.d.DarylHunterOfWalkers.class));
        cards.add(new SetCardInfo("Glenn, the Voice of Calm", 145, Rarity.MYTHIC, mage.cards.g.GlennTheVoiceOfCalm.class));
        cards.add(new SetCardInfo("Michonne, Ruthless Survivor", 146, Rarity.MYTHIC, mage.cards.m.MichonneRuthlessSurvivor.class));
        cards.add(new SetCardInfo("Negan, the Cold-Blooded", 147, Rarity.MYTHIC, mage.cards.n.NeganTheColdBlooded.class));
        cards.add(new SetCardInfo("Admonition Angel", 154, Rarity.MYTHIC, mage.cards.a.AdmonitionAngel.class));
        cards.add(new SetCardInfo("Roil Elemental", 155, Rarity.RARE, mage.cards.r.RoilElemental.class));
        cards.add(new SetCardInfo("Zulaport Cutthroat", 156, Rarity.RARE, mage.cards.z.ZulaportCutthroat.class));
        cards.add(new SetCardInfo("Warren Instigator", 157, Rarity.MYTHIC, mage.cards.w.WarrenInstigator.class));
        cards.add(new SetCardInfo("Avenger of Zendikar", 158, Rarity.MYTHIC, mage.cards.a.AvengerOfZendikar.class));
        cards.add(new SetCardInfo("Teferi's Protection", 164, Rarity.RARE, mage.cards.t.TeferisProtection.class));
        cards.add(new SetCardInfo("Consecrated Sphinx", 165, Rarity.RARE, mage.cards.c.ConsecratedSphinx.class));
        cards.add(new SetCardInfo("Collected Company", 166, Rarity.RARE, mage.cards.c.CollectedCompany.class));
        cards.add(new SetCardInfo("Amulet of Vigor", 167, Rarity.RARE, mage.cards.a.AmuletOfVigor.class));
        cards.add(new SetCardInfo("Balance", 173, Rarity.MYTHIC, mage.cards.b.Balance.class));
        cards.add(new SetCardInfo("Brainstorm", 174, Rarity.RARE, mage.cards.b.Brainstorm.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Counterspell", 175, Rarity.RARE, mage.cards.c.Counterspell.class));
        cards.add(new SetCardInfo("Birds of Paradise", 176, Rarity.RARE, mage.cards.b.BirdsOfParadise.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Howling Mine", 177, Rarity.RARE, mage.cards.h.HowlingMine.class));
        cards.add(new SetCardInfo("Wasteland", 178, Rarity.RARE, mage.cards.w.Wasteland.class));
        cards.add(new SetCardInfo("Wrath of God", 185, Rarity.RARE, mage.cards.w.WrathOfGod.class));
        cards.add(new SetCardInfo("Preordain", 186, Rarity.RARE, mage.cards.p.Preordain.class));
        cards.add(new SetCardInfo("Decree of Pain", 187, Rarity.RARE, mage.cards.d.DecreeOfPain.class));
        cards.add(new SetCardInfo("Gamble", 188, Rarity.RARE, mage.cards.g.Gamble.class));
        cards.add(new SetCardInfo("Nature's Lore", 189, Rarity.RARE, mage.cards.n.NaturesLore.class));
        cards.add(new SetCardInfo("Soul-Scar Mage", 190, Rarity.RARE, mage.cards.s.SoulScarMage.class));
        cards.add(new SetCardInfo("Dryad of the Ilysian Grove", 191, Rarity.RARE, mage.cards.d.DryadOfTheIlysianGrove.class));
        cards.add(new SetCardInfo("Sakura-Tribe Elder", 192, Rarity.RARE, mage.cards.s.SakuraTribeElder.class));
        cards.add(new SetCardInfo("Spell Queller", 193, Rarity.RARE, mage.cards.s.SpellQueller.class));
        cards.add(new SetCardInfo("Metallic Mimic", 194, Rarity.RARE, mage.cards.m.MetallicMimic.class));
        cards.add(new SetCardInfo("Chatter of the Squirrel", 195, Rarity.RARE, mage.cards.c.ChatterOfTheSquirrel.class));
        cards.add(new SetCardInfo("Krosan Beast", 196, Rarity.RARE, mage.cards.k.KrosanBeast.class));
        cards.add(new SetCardInfo("Squirrel Mob", 197, Rarity.RARE, mage.cards.s.SquirrelMob.class));
        cards.add(new SetCardInfo("Squirrel Wrangler", 198, Rarity.RARE, mage.cards.s.SquirrelWrangler.class));
        cards.add(new SetCardInfo("Swarmyard", 199, Rarity.RARE, mage.cards.s.Swarmyard.class));
        cards.add(new SetCardInfo("Arcane Signet", 201, Rarity.RARE, mage.cards.a.ArcaneSignet.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Chromatic Lantern", 202, Rarity.RARE, mage.cards.c.ChromaticLantern.class));
        cards.add(new SetCardInfo("Commander's Sphere", 203, Rarity.RARE, mage.cards.c.CommandersSphere.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Darksteel Ingot", 204, Rarity.RARE, mage.cards.d.DarksteelIngot.class));
        cards.add(new SetCardInfo("Gilded Lotus", 205, Rarity.RARE, mage.cards.g.GildedLotus.class));
        cards.add(new SetCardInfo("Elesh Norn, Grand Cenobite", 209, Rarity.MYTHIC, mage.cards.e.EleshNornGrandCenobite.class));
        cards.add(new SetCardInfo("Jin-Gitaxias, Core Augur", 210, Rarity.MYTHIC, mage.cards.j.JinGitaxiasCoreAugur.class));
        cards.add(new SetCardInfo("Sheoldred, Whispering One", 211, Rarity.MYTHIC, mage.cards.s.SheoldredWhisperingOne.class));
        cards.add(new SetCardInfo("Urabrask the Hidden", 212, Rarity.MYTHIC, mage.cards.u.UrabraskTheHidden.class));
        cards.add(new SetCardInfo("Vorinclex, Voice of Hunger", 213, Rarity.MYTHIC, mage.cards.v.VorinclexVoiceOfHunger.class));
        cards.add(new SetCardInfo("Heliod, Sun-Crowned", 214, Rarity.MYTHIC, mage.cards.h.HeliodSunCrowned.class));
        cards.add(new SetCardInfo("Goblin Rabblemaster", 215, Rarity.RARE, mage.cards.g.GoblinRabblemaster.class));
        cards.add(new SetCardInfo("Monastery Swiftspear", 216, Rarity.RARE, mage.cards.m.MonasterySwiftspear.class));
        cards.add(new SetCardInfo("Boros Charm", 217, Rarity.RARE, mage.cards.b.BorosCharm.class));
        cards.add(new SetCardInfo("Gisela, Blade of Goldnight", 218, Rarity.MYTHIC, mage.cards.g.GiselaBladeOfGoldnight.class));
        cards.add(new SetCardInfo("Frost Titan", 220, Rarity.MYTHIC, mage.cards.f.FrostTitan.class));
        cards.add(new SetCardInfo("Primeval Titan", 221, Rarity.MYTHIC, mage.cards.p.PrimevalTitan.class));
        cards.add(new SetCardInfo("Uro, Titan of Nature's Wrath", 222, Rarity.MYTHIC, mage.cards.u.UroTitanOfNaturesWrath.class));
        cards.add(new SetCardInfo("Grave Titan", 223, Rarity.MYTHIC, mage.cards.g.GraveTitan.class));
        cards.add(new SetCardInfo("Inferno Titan", 224, Rarity.MYTHIC, mage.cards.i.InfernoTitan.class));
        cards.add(new SetCardInfo("Kroxa, Titan of Death's Hunger", 225, Rarity.MYTHIC, mage.cards.k.KroxaTitanOfDeathsHunger.class));
        cards.add(new SetCardInfo("Brazen Borrower", 234, Rarity.MYTHIC, mage.cards.b.BrazenBorrower.class));
        cards.add(new SetCardInfo("Vindictive Lich", 235, Rarity.RARE, mage.cards.v.VindictiveLich.class));
        cards.add(new SetCardInfo("Meandering Towershell", 236, Rarity.RARE, mage.cards.m.MeanderingTowershell.class));
        cards.add(new SetCardInfo("Ohran Frostfang", 237, Rarity.RARE, mage.cards.o.OhranFrostfang.class));
        cards.add(new SetCardInfo("Thragtusk", 238, Rarity.RARE, mage.cards.t.Thragtusk.class));
        cards.add(new SetCardInfo("Plains", 239, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Island", 240, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 241, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 242, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Forest", 243, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Shalai, Voice of Plenty", 244, Rarity.RARE, mage.cards.s.ShalaiVoiceOfPlenty.class));
        cards.add(new SetCardInfo("Ponder", 245, Rarity.RARE, mage.cards.p.Ponder.class));
        cards.add(new SetCardInfo("Cultivate", 246, Rarity.RARE, mage.cards.c.Cultivate.class));
        cards.add(new SetCardInfo("Kaya, Ghost Assassin", 247, Rarity.RARE, mage.cards.k.KayaGhostAssassin.class));
        cards.add(new SetCardInfo("Teferi, Hero of Dominaria", 248, Rarity.MYTHIC, mage.cards.t.TeferiHeroOfDominaria.class));
        cards.add(new SetCardInfo("Sol Ring", 249, Rarity.RARE, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Path of Ancestry", 250, Rarity.RARE, mage.cards.p.PathOfAncestry.class));
        cards.add(new SetCardInfo("Dack Fayden", 251, Rarity.MYTHIC, mage.cards.d.DackFayden.class));
        cards.add(new SetCardInfo("Teferi, Time Raveler", 252, Rarity.RARE, mage.cards.t.TeferiTimeRaveler.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Karn, the Great Creator", 253, Rarity.RARE, mage.cards.k.KarnTheGreatCreator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 254, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 255, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 256, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 257, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 258, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Michiko Konda, Truth Seeker", 259, Rarity.RARE, mage.cards.m.MichikoKondaTruthSeeker.class));
        cards.add(new SetCardInfo("Kami of the Crescent Moon", 260, Rarity.RARE, mage.cards.k.KamiOfTheCrescentMoon.class));
        cards.add(new SetCardInfo("Toshiro Umezawa", 261, Rarity.RARE, mage.cards.t.ToshiroUmezawa.class));
        cards.add(new SetCardInfo("Heartless Hidetsugu", 262, Rarity.RARE, mage.cards.h.HeartlessHidetsugu.class));
        cards.add(new SetCardInfo("Reki, the History of Kamigawa", 263, Rarity.RARE, mage.cards.r.RekiTheHistoryOfKamigawa.class));
        cards.add(new SetCardInfo("All Is Dust", 268, Rarity.RARE, mage.cards.a.AllIsDust.class));
        cards.add(new SetCardInfo("Artifact Mutation", 269, Rarity.RARE, mage.cards.a.ArtifactMutation.class));
        cards.add(new SetCardInfo("Drown in the Loch", 270, Rarity.RARE, mage.cards.d.DrownInTheLoch.class));
        cards.add(new SetCardInfo("Fire Covenant", 271, Rarity.RARE, mage.cards.f.FireCovenant.class));
        cards.add(new SetCardInfo("Fractured Identity", 272, Rarity.RARE, mage.cards.f.FracturedIdentity.class));
        cards.add(new SetCardInfo("Fracturing Gust", 273, Rarity.RARE, mage.cards.f.FracturingGust.class));
        cards.add(new SetCardInfo("Ob Nixilis Reignited", 274, Rarity.MYTHIC, mage.cards.o.ObNixilisReignited.class));
        cards.add(new SetCardInfo("Sire of Insanity", 275, Rarity.RARE, mage.cards.s.SireOfInsanity.class));
        cards.add(new SetCardInfo("Sliver Hivelord", 276, Rarity.MYTHIC, mage.cards.s.SliverHivelord.class));
        cards.add(new SetCardInfo("Spellskite", 277, Rarity.RARE, mage.cards.s.Spellskite.class));
        cards.add(new SetCardInfo("Sanctum Prelate", 278, Rarity.MYTHIC, mage.cards.s.SanctumPrelate.class));
        cards.add(new SetCardInfo("Carpet of Flowers", 279, Rarity.RARE, mage.cards.c.CarpetOfFlowers.class));
        cards.add(new SetCardInfo("Sphere of Safety", 280, Rarity.RARE, mage.cards.s.SphereOfSafety.class));
        cards.add(new SetCardInfo("Karmic Guide", 281, Rarity.RARE, mage.cards.k.KarmicGuide.class));
        cards.add(new SetCardInfo("Mesa Enchantress", 282, Rarity.RARE, mage.cards.m.MesaEnchantress.class));
        cards.add(new SetCardInfo("Archaeomancer", 283, Rarity.RARE, mage.cards.a.Archaeomancer.class));
        cards.add(new SetCardInfo("Bloom Tender", 284, Rarity.RARE, mage.cards.b.BloomTender.class));
        cards.add(new SetCardInfo("Meteor Golem", 285, Rarity.RARE, mage.cards.m.MeteorGolem.class));
        cards.add(new SetCardInfo("Azorius Signet", 286, Rarity.RARE, mage.cards.a.AzoriusSignet.class));
        cards.add(new SetCardInfo("Dimir Signet", 287, Rarity.RARE, mage.cards.d.DimirSignet.class));
        cards.add(new SetCardInfo("Gruul Signet", 288, Rarity.RARE, mage.cards.g.GruulSignet.class));
        cards.add(new SetCardInfo("Rakdos Signet", 289, Rarity.RARE, mage.cards.r.RakdosSignet.class));
        cards.add(new SetCardInfo("Selesnya Signet", 290, Rarity.RARE, mage.cards.s.SelesnyaSignet.class));
        cards.add(new SetCardInfo("Boros Signet", 291, Rarity.RARE, mage.cards.b.BorosSignet.class));
        cards.add(new SetCardInfo("Golgari Signet", 292, Rarity.RARE, mage.cards.g.GolgariSignet.class));
        cards.add(new SetCardInfo("Izzet Signet", 293, Rarity.RARE, mage.cards.i.IzzetSignet.class));
        cards.add(new SetCardInfo("Orzhov Signet", 294, Rarity.RARE, mage.cards.o.OrzhovSignet.class));
        cards.add(new SetCardInfo("Simic Signet", 295, Rarity.RARE, mage.cards.s.SimicSignet.class));
        cards.add(new SetCardInfo("Mother of Runes", 296, Rarity.RARE, mage.cards.m.MotherOfRunes.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mother of Runes", 297, Rarity.RARE, mage.cards.m.MotherOfRunes.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mother of Runes", 298, Rarity.RARE, mage.cards.m.MotherOfRunes.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mother of Runes", 299, Rarity.RARE, mage.cards.m.MotherOfRunes.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Unbreakable Formation", 310, Rarity.RARE, mage.cards.u.UnbreakableFormation.class));
        cards.add(new SetCardInfo("Whir of Invention", 311, Rarity.RARE, mage.cards.w.WhirOfInvention.class));
        cards.add(new SetCardInfo("Hero's Downfall", 312, Rarity.RARE, mage.cards.h.HerosDownfall.class));
        cards.add(new SetCardInfo("Impact Tremors", 313, Rarity.RARE, mage.cards.i.ImpactTremors.class));
        cards.add(new SetCardInfo("Primal Vigor", 314, Rarity.RARE, mage.cards.p.PrimalVigor.class));
        cards.add(new SetCardInfo("Commander's Sphere", 315, Rarity.RARE, mage.cards.c.CommandersSphere.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Generous Gift", 369, Rarity.RARE, mage.cards.g.GenerousGift.class));
        cards.add(new SetCardInfo("Chain Lightning", 370, Rarity.RARE, mage.cards.c.ChainLightning.class));
        cards.add(new SetCardInfo("Kodama's Reach", 371, Rarity.RARE, mage.cards.k.KodamasReach.class));
        cards.add(new SetCardInfo("Heirloom Blade", 372, Rarity.RARE, mage.cards.h.HeirloomBlade.class));
        cards.add(new SetCardInfo("Karn, the Great Creator", 501, Rarity.RARE, mage.cards.k.KarnTheGreatCreator.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ugin, the Ineffable", 502, Rarity.RARE, mage.cards.u.UginTheIneffable.class));
        cards.add(new SetCardInfo("Gideon Blackblade", 503, Rarity.MYTHIC, mage.cards.g.GideonBlackblade.class));
        cards.add(new SetCardInfo("Teyo, the Shieldmage", 504, Rarity.UNCOMMON, mage.cards.t.TeyoTheShieldmage.class));
        cards.add(new SetCardInfo("The Wanderer", 505, Rarity.UNCOMMON, mage.cards.t.TheWanderer.class));
        cards.add(new SetCardInfo("Jace, Wielder of Mysteries", 506, Rarity.RARE, mage.cards.j.JaceWielderOfMysteries.class));
        cards.add(new SetCardInfo("Kasmina, Enigmatic Mentor", 507, Rarity.UNCOMMON, mage.cards.k.KasminaEnigmaticMentor.class));
        cards.add(new SetCardInfo("Narset, Parter of Veils", 508, Rarity.UNCOMMON, mage.cards.n.NarsetParterOfVeils.class));
        cards.add(new SetCardInfo("Davriel, Rogue Shadowmage", 509, Rarity.UNCOMMON, mage.cards.d.DavrielRogueShadowmage.class));
        cards.add(new SetCardInfo("Liliana, Dreadhorde General", 510, Rarity.MYTHIC, mage.cards.l.LilianaDreadhordeGeneral.class));
        cards.add(new SetCardInfo("Ob Nixilis, the Hate-Twisted", 511, Rarity.UNCOMMON, mage.cards.o.ObNixilisTheHateTwisted.class));
        cards.add(new SetCardInfo("Chandra, Fire Artisan", 512, Rarity.RARE, mage.cards.c.ChandraFireArtisan.class));
        cards.add(new SetCardInfo("Jaya, Venerated Firemage", 513, Rarity.UNCOMMON, mage.cards.j.JayaVeneratedFiremage.class));
        cards.add(new SetCardInfo("Sarkhan the Masterless", 514, Rarity.RARE, mage.cards.s.SarkhanTheMasterless.class));
        cards.add(new SetCardInfo("Tibalt, Rakish Instigator", 515, Rarity.UNCOMMON, mage.cards.t.TibaltRakishInstigator.class));
        cards.add(new SetCardInfo("Arlinn, Voice of the Pack", 516, Rarity.UNCOMMON, mage.cards.a.ArlinnVoiceOfThePack.class));
        cards.add(new SetCardInfo("Jiang Yanggu, Wildcrafter", 517, Rarity.UNCOMMON, mage.cards.j.JiangYangguWildcrafter.class));
        cards.add(new SetCardInfo("Nissa, Who Shakes the World", 518, Rarity.RARE, mage.cards.n.NissaWhoShakesTheWorld.class));
        cards.add(new SetCardInfo("Vivien, Champion of the Wilds", 519, Rarity.RARE, mage.cards.v.VivienChampionOfTheWilds.class));
        cards.add(new SetCardInfo("Ajani, the Greathearted", 520, Rarity.RARE, mage.cards.a.AjaniTheGreathearted.class));
        cards.add(new SetCardInfo("Domri, Anarch of Bolas", 521, Rarity.RARE, mage.cards.d.DomriAnarchOfBolas.class));
        cards.add(new SetCardInfo("Nicol Bolas, Dragon-God", 522, Rarity.MYTHIC, mage.cards.n.NicolBolasDragonGod.class));
        cards.add(new SetCardInfo("Ral, Storm Conduit", 523, Rarity.RARE, mage.cards.r.RalStormConduit.class));
        cards.add(new SetCardInfo("Sorin, Vengeful Bloodlord", 524, Rarity.RARE, mage.cards.s.SorinVengefulBloodlord.class));
        cards.add(new SetCardInfo("Tamiyo, Collector of Tales", 525, Rarity.RARE, mage.cards.t.TamiyoCollectorOfTales.class));
        cards.add(new SetCardInfo("Teferi, Time Raveler", 526, Rarity.RARE, mage.cards.t.TeferiTimeRaveler.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Angrath, Captain of Chaos", 527, Rarity.UNCOMMON, mage.cards.a.AngrathCaptainOfChaos.class));
        cards.add(new SetCardInfo("Ashiok, Dream Render", 528, Rarity.UNCOMMON, mage.cards.a.AshiokDreamRender.class));
        cards.add(new SetCardInfo("Dovin, Hand of Control", 529, Rarity.UNCOMMON, mage.cards.d.DovinHandOfControl.class));
        cards.add(new SetCardInfo("Huatli, the Sun's Heart", 530, Rarity.UNCOMMON, mage.cards.h.HuatliTheSunsHeart.class));
        cards.add(new SetCardInfo("Kaya, Bane of the Dead", 531, Rarity.UNCOMMON, mage.cards.k.KayaBaneOfTheDead.class));
        cards.add(new SetCardInfo("Kiora, Behemoth Beckoner", 532, Rarity.UNCOMMON, mage.cards.k.KioraBehemothBeckoner.class));
        cards.add(new SetCardInfo("Nahiri, Storm of Stone", 533, Rarity.UNCOMMON, mage.cards.n.NahiriStormOfStone.class));
        cards.add(new SetCardInfo("Saheeli, Sublime Artificer", 534, Rarity.UNCOMMON, mage.cards.s.SaheeliSublimeArtificer.class));
        cards.add(new SetCardInfo("Samut, Tyrant Smasher", 535, Rarity.UNCOMMON, mage.cards.s.SamutTyrantSmasher.class));
        cards.add(new SetCardInfo("Vraska, Swarm's Eminence", 536, Rarity.UNCOMMON, mage.cards.v.VraskaSwarmsEminence.class));
        cards.add(new SetCardInfo("Tibalt, the Fiend-Blooded", 537, Rarity.MYTHIC, mage.cards.t.TibaltTheFiendBlooded.class));
        cards.add(new SetCardInfo("Evolving Wilds", 538, Rarity.RARE, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Swamp", 539, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Island", 551, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 552, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 555, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 557, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 558, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 560, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 561, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 563, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 566, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 572, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 573, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Lucille", 581, Rarity.MYTHIC, mage.cards.l.Lucille.class));
        cards.add(new SetCardInfo("Brainstorm", 582, Rarity.RARE, mage.cards.b.Brainstorm.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Terramorphic Expanse", 585, Rarity.RARE, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("Arcane Signet", 589, Rarity.RARE, mage.cards.a.ArcaneSignet.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Crash Through", 591, Rarity.RARE, mage.cards.c.CrashThrough.class));
        cards.add(new SetCardInfo("Eldrazi Monument", 603, Rarity.MYTHIC, mage.cards.e.EldraziMonument.class));
        cards.add(new SetCardInfo("Ornithopter", 604, Rarity.RARE, mage.cards.o.Ornithopter.class));
        cards.add(new SetCardInfo("Panharmonicon", 605, Rarity.RARE, mage.cards.p.Panharmonicon.class));
        cards.add(new SetCardInfo("Swiftfoot Boots", 606, Rarity.RARE, mage.cards.s.SwiftfootBoots.class));
        cards.add(new SetCardInfo("Rogue's Passage", 607, Rarity.RARE, mage.cards.r.RoguesPassage.class));
    }
}
