package com.mygdx.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.mygdx.game.Jesse;


/**
 * Created by a368270 on 04/01/2015.
 */
public class MyMainMenu implements Screen{
    Jesse game;
    private SpriteBatch batch;
    private Skin skin;
    private Stage stage;

    public MyMainMenu(Jesse game){
        this.game = game;
    }

    @Override
    public void show() {
        batch = new SpriteBatch();
        skin = new Skin(Gdx.files.internal("android/assets/uiskin.json"));
        stage = new Stage();

        final TextButton playButton = new TextButton("Play", skin, "default");
        final TextButton optionsButton = new TextButton("Options", skin, "default");

        playButton.setWidth(Gdx.graphics.getWidth()/3);
        playButton.setHeight(Gdx.graphics.getHeight()/20);
        playButton.setPosition(Gdx.graphics.getWidth() /2 - 100f, Gdx.graphics.getHeight()/2 - 10f);


        optionsButton.setWidth(Gdx.graphics.getWidth()/3);
        optionsButton.setHeight(Gdx.graphics.getHeight()/20);
        optionsButton.setPosition(Gdx.graphics.getWidth() /2 - 100f, Gdx.graphics.getHeight()/2 - playButton.getAlign()- 50f);


        playButton.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y){
                game.setScreen(game.playScreen);
            }
        });

        optionsButton.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y){
                game.setScreen(game.optionsScreen);
            }
        });

        stage.addActor(playButton);
        stage.addActor(optionsButton);

        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        stage.draw();
        batch.end();
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
        batch.dispose();
    }
}
