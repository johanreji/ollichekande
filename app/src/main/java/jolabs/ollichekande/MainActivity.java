package jolabs.ollichekande;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;



import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView image=null;
    MediaPlayer mp1,mp2=null;

    Random r=null;
    //    Drawable drawable=null;
    int flag=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        image=(ImageView)findViewById(R.id.img);
        r= new Random();
        mp1=MediaPlayer.create(MainActivity.this,R.raw.oliche);
        mp2=MediaPlayer.create(MainActivity.this,R.raw.kandee);
        mp1.start();
        image.setImageResource(R.drawable.oliche);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                set();

            }
        });

    }

    public void set()
    {
        if(flag==0)
        {
            mp2.start();
            image.setImageResource(R.drawable.kande);


        }
        else
        {
            mp1.start();
            image.setImageResource(R.drawable.oliche);
        }
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag==0)
                {flag=1;
                    set();}
                else
                {  flag=0;
                    set();}

            }
        });

    }
}
