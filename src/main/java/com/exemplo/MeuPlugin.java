package com.exemplo;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerLoadEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class MeuPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("AutoCommand foi habilitado!");
    }

    @EventHandler
    public void onServerLoad(ServerLoadEvent event) {
        // Comando a ser executado após a inicialização do servidor
        String comando = "val resourcepack enable";
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), comando);
        getLogger().info("Comando '" + comando + "' executado após a inicialização.");
    }

    @Override
    public void onDisable() {
        getLogger().info("MeuPlugin foi desabilitado!");
    }
}
