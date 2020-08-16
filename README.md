# Example Mod Access Widener

Repo based on `FabricMC/fabric-example-mod` template to demonstrate how to use access wideners.

Files that have changed relative to the vanilla `fabric-example-mod` due to access widening:
- `build.gradle`
  - Added required access widener gradle task
- `src/main/resources/modid.accesswidener`
  - The access widener file. Describes what access is widened.
- `src/main/resources/fabric.mod.json`
  - Added the necessary key/value pair.
- `src/main/java/net/fabricmc/example/NewGeneratorType.java`
  - A child class that can extend the target of the access widening, `GeneratorType`.
  
Note, this works for 1.16.1.

# References
https://github.com/Hephaestus-Dev/Landmark/blob/master/src/main/resources/landmark.accesswidener
https://fabricmc.net/wiki/tutorial:accesswideners
