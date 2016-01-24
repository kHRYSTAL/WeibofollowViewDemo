package me.khrystal.weibofollowviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import me.khrystal.view.FollowView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    FollowView followView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        followView = (FollowView)findViewById(R.id.follow_view);
        followView.mfollow.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.follow:
                //TODO 发起网络请求 成功后启动动画飞出 同时设置请求返回的对象到FollowView里 再启动动画飞入
                Animation out = AnimationUtils.loadAnimation(this, R.anim.follow_out);
                OutAnimationListener outAnimationListener = new OutAnimationListener();
                out.setAnimationListener(outAnimationListener);
                followView.mfollowLayout.startAnimation(out);
                break;
        }
    }

    private class OutAnimationListener implements Animation.AnimationListener{
        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {
            followView.setNewFollow("khrystal");
            followView.mfollowLayout.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.follow_in));
        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    }
}
