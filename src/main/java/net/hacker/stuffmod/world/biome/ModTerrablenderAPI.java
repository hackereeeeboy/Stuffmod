package net.hacker.stuffmod.world.biome;

import net.hacker.stuffmod.StuffMod;
import net.hacker.stuffmod.world.biome.surface.ModMaterialRules;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import terrablender.api.*;

public class ModTerrablenderAPI implements TerraBlenderApi {

    @Override
    public void onTerraBlenderInitialized() {

        Regions.register(new ModOverworldRegion(new Identifier(StuffMod.MOD_ID, "overworld"), 200));
        EndBiomeRegistry.registerMidlandsBiome(ModBiomes.END_PLANES_BIOME, 300);
        EndBiomeRegistry.registerHighlandsBiome(ModBiomes.END_PLANES_BIOME, 50);
        EndBiomeRegistry.registerEdgeBiome(ModBiomes.END_PLANES_BIOME, 50);

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, StuffMod.MOD_ID, ModMaterialRules.makeRules());
        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.END, StuffMod.MOD_ID, ModMaterialRules.makeRulesendplaines());

    }
}
