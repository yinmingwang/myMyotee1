package com.example.ymw.mymyotee;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by ymw on 2016/6/29.
 */
public class ManActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.man);
        final ImageButton manimagebutton1 = (ImageButton) findViewById(R.id.manimageButton1);
        manimagebutton1.setImageResource(R.drawable.img_return);
        manimagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        final ImageButton manimagebutton2 = (ImageButton) findViewById(R.id.manimageButton2);
        manimagebutton2.setImageResource(R.drawable.bt_save_up);
        manimagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Toast.makeText(ManActivity.this, "已保存", Toast.LENGTH_SHORT).show();
            }
        });
        final ImageButton manimagebuton3 = (ImageButton) findViewById(R.id.manimageButton3);
        manimagebuton3.setImageResource(R.drawable.bt_share_up);
        manimagebuton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ManActivity.this, "已分享", Toast.LENGTH_SHORT).show();
            }
        });
        final ImageView manimageview1 = (ImageView) findViewById(R.id.manimageView1);
        manimageview1.setImageResource(R.drawable.demo_pic);
    }
}
