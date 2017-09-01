package com.ashley.idek;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import screens.MainMenuScreen;


public class SpaceGame extends Game {
    
    public static final int WIDTH = 480;
    public static final int HEIGHT = 720;

    public SpriteBatch batch;

    @Override
    public void create() {
        batch = new SpriteBatch();
        this.setScreen(new MainMenuScreen(this));
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
            //batch.dispose();
            //img.dispose();
    }
}
