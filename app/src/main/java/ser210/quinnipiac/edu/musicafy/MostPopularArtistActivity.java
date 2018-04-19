package ser210.quinnipiac.edu.musicafy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MostPopularArtistActivity extends Activity {

    dbHelper myHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_most_popular_artist);

        //get passed intent
        Intent intent1 = getIntent();

        myHelper = new dbHelper(this);
        myHelper.addArtist("Kendrick", "Lamar", "Belleville", "QU", "name " +
                "alskdjfas kasdflj");
       // myHelper.addArtist();

    }
}
