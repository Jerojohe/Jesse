package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.Screens.MySplash;
import com.mygdx.game.Screens.MyMainMenu;
import com.mygdx.game.Screens.MyOptionsScreen;
import com.mygdx.game.Screens.MyPlayScreen;


public class Jesse extends Game {

    public MySplash splashScreen;
    public MyMainMenu menuScreen;
    public MyPlayScreen playScreen;
    public MyOptionsScreen optionsScreen;

    public Jesse() {
        super();
    }

    @Override
    public void create() {
        splashScreen = new MySplash(this);
        menuScreen = new MyMainMenu(this);
        playScreen = new MyPlayScreen(this);
        optionsScreen = new MyOptionsScreen(this);
        setScreen(splashScreen);

    }

    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }


}