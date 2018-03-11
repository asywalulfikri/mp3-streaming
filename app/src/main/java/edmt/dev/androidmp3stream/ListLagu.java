package edmt.dev.androidmp3stream;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by 8villages on 3/11/2018.
 */

public class ListLagu extends AppCompatActivity {
    private TextView lagu1,lagu2,lagu3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_lagu);

        AdView mAdView = (AdView)findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest);

        lagu1 = findViewById(R.id.lagu1);
        lagu2 = findViewById(R.id.lagu2);
        lagu3 = findViewById(R.id.lagu3);

        lagu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListLagu.this,Detail_Lagu.class);
                intent.putExtra("link","http://mic.duytan.edu.vn:86/ncs.mp3");
                intent.putExtra("lirik",getString(R.string.lirik_satu));
                startActivity(intent);
            }
        });

        lagu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListLagu.this,Detail_Lagu.class);
                intent.putExtra("link","http://mic.duytan.edu.vn:86/ncs.mp3");
                intent.putExtra("lirik",getString(R.string.lirik_dua));
                startActivity(intent);
            }
        });

        lagu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListLagu.this,Detail_Lagu.class);
                intent.putExtra("link","http://mic.duytan.edu.vn:86/ncs.mp3");
                intent.putExtra("lirik",getString(R.string.lirik_tiga));
                startActivity(intent);
            }
        });
    }
}
