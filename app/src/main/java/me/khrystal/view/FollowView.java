package me.khrystal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import me.khrystal.weibofollowviewdemo.R;

/**
 * Created by ASUS on 2015/12/16.
 */
public class FollowView extends LinearLayout {
    public ImageView mAvatar;
    public TextView mNickname;
    public TextView mDesc;
    public TextView mfollow;
    public LinearLayout mfollowLayout;



    int number;
    public FollowView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public FollowView(Context context) {
        super(context);
        initView(context);
    }


    public FollowView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        View.inflate(context, R.layout.follow_view,this);
        mAvatar = (ImageView)findViewById(R.id.avatar);
        mDesc = (TextView)findViewById(R.id.desc);
        mfollow = (TextView)findViewById(R.id.follow);
        mNickname = (TextView)findViewById(R.id.nick);
        mfollowLayout = (LinearLayout)findViewById(R.id.follow_layout);
    }



    public void setNewFollow(String str){
        mNickname.setText(str+number);
        mDesc.setText(str+number);
        number++;
    }


}
