package com.lightzeg.mypathmenu.pathmenu;

import android.animation.*;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.LinkedList;
import java.util.List;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private ImageView btnMenu;

    private boolean isPused = false;
    private ValueAnimator menuAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMenu = (ImageView) findViewById(R.id.btn_menu);
        menuAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(this, R.animator.animator_rotation);
        menuAnimator.setTarget(btnMenu);

        ImageView btnA = (ImageView) findViewById(R.id.btn_action_a);
        ImageView btnB = (ImageView) findViewById(R.id.btn_action_b);
        ImageView btnC = (ImageView) findViewById(R.id.btn_action_c);
        ImageView btnD = (ImageView) findViewById(R.id.btn_action_d);
        ImageView btnE = (ImageView) findViewById(R.id.btn_action_e);
        ImageView btnF = (ImageView) findViewById(R.id.btn_action_f);

        btnA.setOnClickListener(this);
        btnB.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnD.setOnClickListener(this);
        btnE.setOnClickListener(this);
        btnF.setOnClickListener(this);

    }

    public void btnMenu(View view) {
//        long currentPlayTime = menuAnimator.getCurrentPlayTime();
//        long duration = menuAnimator.getDuration();
//        if(currentPlayTime == 0) {
//            menuAnimator.start();
//        }else if(currentPlayTime == duration){
//            menuAnimator.resume();
//        }
        menuAnimator.start();
    }

    private List<Position> getPostion(float radius, int maxAngel, int count){
        List<Position> positions = new LinkedList<Position>();
        for(int i=0;i<count;i++){

        }


        return null;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        long duration = valueAnimator.getDuration();
        long currentPlayTime = valueAnimator.getCurrentPlayTime();

        if (currentPlayTime == duration && !isPused){
            valueAnimator.pause();
            isPused = true;
        }
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
    }
}


class Position{
    private float x;
    private float y;

    public void Postion(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }
}
