package com.example.hsj.tabletest;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.opengl.Visibility;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.hsj.tabletest.ui.AutoSplitTextView;

public class MyGridTest extends AppCompatActivity {
    private LinearLayout linearLayout_11;
    private LinearLayout linearLayout_44;
    private LinearLayout linearLayout_55;
    private TextView textView_g_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mygrid);
//        setContentView(R.layout.mygrid_);

        linearLayout_11 = (LinearLayout)  findViewById(R.id.g_11);
        ViewGroup.LayoutParams lp= linearLayout_11.getLayoutParams();
        lp.height = 400;
        linearLayout_11.setLayoutParams(lp);
        for(int i = 0;i<7;i++){
            linearLayout_11.addView(createTextView("1.fdsghs国际公寓过高",75,0,0,0,0),i);
        }


        /*textView_g_2 = (TextView)findViewById(R.id.g_2);
        ViewGroup.LayoutParams p = new ViewGroup.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        p.setMargins(0, -300, 0, 0);
        p.height = 400;
        textView_g_2.setLayoutParams(p);*/

//        linearLayout_44 = (LinearLayout) findViewById(R.id.g_44);
//        linearLayout_44.setBackgroundColor(Color.parseColor("#ffffff") );
//        linearLayout_44.setPadding(0,200,0,0);
//        ViewGroup.LayoutParams lp_44= linearLayout_44.getLayoutParams();
//        lp_44.height = 800;
//        linearLayout_44.setLayoutParams(lp_44);
//        linearLayout_55 = (LinearLayout) findViewById(R.id.g_55);
//        linearLayout_55.setBackgroundColor(Color.parseColor("#ffffff") );
//        linearLayout_55.removeAllViews();
//        linearLayout_55.setPadding(0,-200,0,200);
        //不保留空间
//        linearLayout_55.setVisibility(View.INVISIBLE);

//        GridLayout gridLayout = (GridLayout)findViewById(R.id.root1);
//        gridLayout.addView(createTextView("1.fdsghs国际公寓过高",0,0,0,0,0,true),0);
    }

    /**
     * 动态创建-TextView
     * @param text
     * @return
     */
    private TextView createTextView(String text,int margin_left,int margin_top,int margin_right,int margin_buttom,int layout_height){
        TextView tv = new TextView(this);
        tv.setTextSize(12.0F);
        tv.setTextColor(this.getResources().getColor(R.color.colorAccent));
        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        p.setMargins(margin_left, margin_top, margin_right, margin_buttom);
        if(layout_height>0){
            p.height = layout_height;
        }
        tv.setLayoutParams(p);
        tv.setGravity(Gravity.LEFT);
        tv.setText(text);
        return tv;
    }



}
