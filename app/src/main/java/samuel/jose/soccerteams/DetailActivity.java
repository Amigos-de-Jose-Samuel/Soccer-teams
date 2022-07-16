package samuel.jose.soccerteams;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import samuel.jose.soccerteams.model.SoccerTeam;

public class DetailActivity extends AppCompatActivity {

    ImageView image;
    TextView name;
    TextView city;
    TextView state;
    TextView history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        image = findViewById(R.id.image);
        name = findViewById(R.id.name);
        city = findViewById(R.id.city);
        state = findViewById(R.id.state);
        history = findViewById(R.id.history);

        Intent it = getIntent();

        SoccerTeam team = (SoccerTeam)it.getSerializableExtra("team");

        name.setText(team.getName());
        city.setText(team.getCity());
        state.setText(team.getState());
        history.setText(team.getHistory());

    }
}