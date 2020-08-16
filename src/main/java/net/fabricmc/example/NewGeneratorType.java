package net.fabricmc.example;

import net.minecraft.client.world.GeneratorType;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.chunk.ChunkGeneratorSettings;

public class NewGeneratorType extends GeneratorType {
  
  // Super (GeneratorType) constructor method is now accessible with the access widener. Thus, 
  // new classes can now extend it.
  public NewGeneratorType(String translationKey) {
    super(translationKey);
  }

  // Required to implement since we're extending GeneratorType.
  @Override
  protected ChunkGenerator getChunkGenerator(Registry<Biome> biomeRegistry,
                                             Registry<ChunkGeneratorSettings> chunkGeneratorSettingsRegistry,
                                             long seed) {
    return null;
  }
}
