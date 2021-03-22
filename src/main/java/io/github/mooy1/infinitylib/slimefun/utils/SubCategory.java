package io.github.mooy1.infinitylib.slimefun.utils;

import me.mrCookieSlime.Slimefun.Objects.Category;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

/**
 * A category that is hidden from the main guide page
 */
public final class SubCategory extends Category {

    public SubCategory(NamespacedKey key, ItemStack item) {
        super(key, item);
    }

    public SubCategory(NamespacedKey key, ItemStack item, int tier) {
        super(key, item, tier);
    }

    @Override
    public boolean isHidden(@Nonnull Player p) {
        return true;
    }

}