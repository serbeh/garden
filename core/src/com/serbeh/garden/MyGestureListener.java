package com.serbeh.garden;

import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Сергей on 24.01.2017.
 */

public class MyGestureListener implements GestureDetector.GestureListener {
    @Override
    public boolean touchDown(float x, float y, int pointer, int button) {
        System.out.println("touchDown");
        return true;
    }

    @Override
    public boolean tap(float x, float y, int count, int button) {
        System.out.println("tap");
        return true;
    }

    @Override
    public boolean longPress(float x, float y) {
        System.out.println("longPress");
        return true;
    }

    @Override
    public boolean fling(float velocityX, float velocityY, int button) {
        System.out.println("fling");
        return true;
    }

    @Override
    public boolean pan(float x, float y, float deltaX, float deltaY) {
        System.out.println("pan");

        return true;
    }

    @Override
    public boolean panStop(float x, float y, int pointer, int button) {
        System.out.println("panStop");
        return true;
    }

    @Override
    public boolean zoom(float initialDistance, float distance) {
        System.out.println("zoom");
        return true;
    }

    @Override
    public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2, Vector2 pointer1, Vector2 pointer2) {
        System.out.println("pinch");
        return true;
    }

    @Override
    public void pinchStop() {
        System.out.println("pinchStop");
    }
}
