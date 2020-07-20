package nl.thedutchmc.customrecipes.recipes;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class RecipeObsidianFromBuckets {

	public ShapedRecipe getRecipe() {
		ItemStack stack = new ItemStack(Material.OBSIDIAN);
		
		ShapedRecipe recipe = new ShapedRecipe(stack);
		recipe.shape("lw");
		recipe.setIngredient('l', Material.LAVA_BUCKET);
		recipe.setIngredient('w', Material.WATER_BUCKET);
		
		return recipe;
	}
}
