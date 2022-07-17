package samuel.jose.soccerteams;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
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
        Bundle params = it.getExtras();
        if (it != null) {
            String nome = params.getString("nome");
            int media = params.getInt("image");
            String cidade = params.getString("cidade");
            String historia = params.getString("historia");
            String estado = params.getString("estado");
            name.setText(nome);
            city.setText(cidade);
            state.setText(estado);
            history.setText(historia);
            image.setImageResource(media);

        }

    }
}