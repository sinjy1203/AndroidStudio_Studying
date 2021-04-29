package org.techtown.doitmission03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;
    ScrollView scrollView;
    ScrollView scrollView2;
    BitmapDrawable bitmap;
    BitmapDrawable bitmap2;

    int imagePosition = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        scrollView = findViewById(R.id.scrollView);
        scrollView.setHorizontalScrollBarEnabled(true);
        imageView2 = findViewById(R.id.imageView2);
        scrollView2 = findViewById(R.id.scrollView2);
        scrollView2.setHorizontalScrollBarEnabled(true);

        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.beach);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;

        imageView2.setImageDrawable(bitmap);
        imageView2.getLayoutParams().width = bitmapWidth;
        imageView2.getLayoutParams().height = bitmapHeight;
    }

    public void onButton1Clicked(View v){
        changePosition();
    }

    private void changePosition(){
        if (imagePosition == 0) {
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);

            imagePosition = 1;
        }else if (imagePosition == 1){
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);

            imagePosition = 0;
        }
    }
}