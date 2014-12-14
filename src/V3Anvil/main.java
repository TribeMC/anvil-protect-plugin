package V3Anvil;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		// TODO Auto-generated method stub
		getServer().getPluginManager().registerEvents(this, this);
		getServer().getConsoleSender().sendMessage(
				"§8[§eAnvil§cProtect§8] §aErfolgreich geladen!");
		super.onEnable();
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onAnvilClick(PlayerInteractEvent e) {
		if (e.getAction() == org.bukkit.event.block.Action.RIGHT_CLICK_BLOCK
				&& e.getClickedBlock().getType() == Material.ANVIL) {

			e.getClickedBlock().setData((byte) 0);

		}
	}
}
