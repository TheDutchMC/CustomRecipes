package nl.thedutchmc.customrecipes.recipes;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class RecipeLightAnvil {

	public ShapedRecipe getRecipe() {
		ItemStack stack = new ItemStack(Material.ANVIL);
		ItemMeta meta = stack.getItemMeta();
		
		meta.setDisplayName(ChatColor.AQUA + "Light Anvil");
		
		stack.setItemMeta(meta);
		
		ShapedRecipe recipe = new ShapedRecipe(stack);
		
		recipe.shape("iii", " b ", "iii");
		recipe.setIngredient('i', Material.IRON_INGOT);
		recipe.setIngredient('b', Material.IRON_BLOCK);
		
		return recipe;
	}
}
