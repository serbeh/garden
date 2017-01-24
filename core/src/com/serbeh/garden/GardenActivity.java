package com.serbeh.garden;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.input.GestureDetector;

public class GardenActivity extends Game {
    float w, h, tw, th = 0;
    OrthographicCamera camera;
    SpriteBatch batch;
    Sprite img;


    // Define an interface for your various callbacks to the android launcher
    public interface MyGameCallback {
        public void onStartActivityA();

        public void onStartActivityB();

        public void onStartSomeActivity(int someParameter, String someOtherParameter);
    }

    // Local variable to hold the callback implementation
    private static MyGameCallback myGameCallback;

    // ** Additional **
    // Setter for the callback
    public void setMyGameCallback(MyGameCallback callback) {
        myGameCallback = callback;
    }

    @Override
    public void create() {
        batch = new SpriteBatch();
        img = new Sprite(new Texture("badlogic.jpg"));
        tw = img.getWidth();
        th = img.getHeight();
//        img.setBounds(camera.position.x - (tw / 2), camera.position.y - (th / 2), tw, th);
        Gdx.input.setInputProcessor(new GestureDetector(new MyGestureListener()));
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
		batch.draw(img, 0, 0);
//        img.draw(batch);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();

//		img.dispose();
    }

    private void someMethod() {

        // check the calling class has actually implemented MyGameCallback
        if (myGameCallback != null) {

            // initiate which ever callback method you need.
            if (true) {
                myGameCallback.onStartActivityA();
            } else if (false) {
                myGameCallback.onStartActivityB();
            } else {
                myGameCallback.onStartSomeActivity(1, "asdas");
            }

        } else {
//			Log("MyGame", "To use this class you must implement MyGameCallback!");
        }
    }
}
