package com.sainttx.holograms.api;

import com.sainttx.holograms.api.line.HologramLine;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public abstract class HologramPlugin extends JavaPlugin {

    // Holds all registered line parsers
    private Set<HologramLine.Parser> parsers = new HashSet<>();

    public HologramLine parseLine(String text) {
        Optional<HologramLine.Parser> parser = parsers.stream()
                .filter(p -> p.canParse(text))
                .findFirst();
        return parser.isPresent() ? parser.get().parse(text) : null;
    }

    public boolean addLineParser(HologramLine.Parser parser) {
        return parsers.add(parser);
    }

    /**
     * Returns the current active {@link HologramManager} implementation.
     *
     * @return the manager
     */
    public abstract HologramManager getHologramManager();

    /**
     * Returns the entity controller instance for the currently active
     * version of CraftBukkit software.
     *
     * @return the entity controller
     */
    public abstract HologramEntityController getEntityController();
}
