package nl.thedutchmc.customrecipes;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import nl.thedutchmc.customrecipes.recipes.RecipeLightAnvil;
import nl.thedutchmc.customrecipes.recipes.RecipeLightEnchantmentTable;
import nl.thedutchmc.customrecipes.recipes.RecipeLightGoldenApple;
import nl.thedutchmc.customrecipes.recipes.RecipeObsidianFromBuckets;

public class CustomRecipes extends JavaPlugin {

	@Override
	public void onEnable() {
		System.out.println("[CustomRecipes] Welcome to CustomRecipes by TheDutchMC");
		
		Bukkit.addRecipe(new RecipeLightAnvil().getRecipe());
		Bukkit.addRecipe(new RecipeLightGoldenApple().getRecipe());
		Bukkit.addRecipe(new RecipeLightEnchantmentTable().getRecipe());
		Bukkit.addRecipe(new RecipeObsidianFromBuckets().getRecipe());
	}
}
