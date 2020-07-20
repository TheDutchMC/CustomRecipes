package nl.thedutchmc.customrecipes.recipes;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class RecipeLightEnchantmentTable {

	public ShapedRecipe getRecipe() {
		ItemStack stack = new ItemStack(Material.ENCHANTMENT_TABLE);
		ItemMeta meta = stack.getItemMeta();
		
		meta.setDisplayName(ChatColor.AQUA + "Light Enchantment Table");
		
		stack.setItemMeta(meta);
		
		ShapedRecipe recipe = new ShapedRecipe(stack);
		recipe.shape(" b ", " d ", "ooo");
		recipe.setIngredient('b', Material.BOOK);
		recipe.setIngredient('d', Material.DIAMOND);
		recipe.setIngredient('o', Material.OBSIDIAN);
		
		return recipe;
	}
}
