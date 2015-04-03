package com.mygdx.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.mygdx.game.Jesse;


import java.awt.Menu;


/**
 * Created by a368270 on 04/01/2015.
 */
public class MySplash implements Screen{

    Jesse game;
    private Texture texture = new Texture(Gdx.files.internal("android/assets/badlogic.jpg"));
    private Stage myStage = new Stage();
    private Image SplashImage = new Image(texture);


    public MySplash(Jesse game){
        this.game = game;
    }

    @Override
    public void show() {

            myStage.addActor(SplashImage);
            SplashImage.setPosition((Gdx.graphics.getWidth()/2) - (SplashImage.getWidth()/2),(Gdx.graphics.getHeight()/2) - (SplashImage.getHeight())/2);
            SplashImage.addAction(Actions.sequence(Actions.alpha(0), Actions.fadeIn(1f), Actions.delay(2f), Actions.fadeOut(1f), Actions.run(new Runnable() {
                @Override
                public void run() {
                    game.setScreen(game.menuScreen);
                }
            })));

        }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        myStage.act();
        myStage.draw();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        myStage.dispose();
    }

}
