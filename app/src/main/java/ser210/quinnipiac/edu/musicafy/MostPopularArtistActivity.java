package ser210.quinnipiac.edu.musicafy;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MostPopularArtistActivity extends AppCompatActivity {

    dbHelper myHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_most_popular_artist);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Top 10 Popular Artist");
        //get passed intent
        Intent intent1 = getIntent();

        myHelper = new dbHelper(this);

        myHelper.addArtist("Kendrick", "Lamar",
                "Compton, CA", "Top Dawg Entertainment", "DAMN. " +
                "To Pimp A Butterfly and good kid, m.A.A.d city");

       // myHelper.addArtist();

    }

}
