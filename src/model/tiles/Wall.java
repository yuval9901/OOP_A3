package model.tiles;

import model.tiles.units.Unit;

public class Wall extends Tile {
    public static final char WALL_TILE = '#';

    public Wall() {
        super(WALL_TILE);
    }

    @Override
    public void accept(Unit unit) {
        unit.visit(this);
    }
}
