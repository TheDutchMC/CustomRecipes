package nl.thedutchmc.customrecipes.recipes;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class RecipeLightGoldenApple {

	public ShapedRecipe getRecipe() {
		ItemStack stack = new ItemStack(Material.GOLDEN_APPLE);
		ItemMeta meta = stack.getItemMeta();
		
		meta.setDisplayName(ChatColor.AQUA + "Light Golden Apple");
		
		stack.setItemMeta(meta);
		
		ShapedRecipe recipe = new ShapedRecipe(stack);
		recipe.shape(" i ", "iai", " i ");
		recipe.setIngredient('i', Material.GOLD_INGOT);
		recipe.setIngredient('a', Material.APPLE);
		
		return recipe;
	}
}
