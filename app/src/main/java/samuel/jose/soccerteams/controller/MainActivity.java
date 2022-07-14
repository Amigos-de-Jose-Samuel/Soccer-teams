package samuel.jose.soccerteams.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import samuel.jose.soccerteams.R;
import samuel.jose.soccerteams.RecyclerItemClickListener;
import samuel.jose.soccerteams.adapter.AdapterTeams;
import samuel.jose.soccerteams.model.SoccerTeam;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewTeams;
    private List<SoccerTeam> listTeams = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewTeams = findViewById(R.id.recyclerViewTeams);

        this.createTeam();
        AdapterTeams adapter = new AdapterTeams(listTeams);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewTeams.setLayoutManager(layoutManager);
        recyclerViewTeams.setHasFixedSize(true);
        recyclerViewTeams.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerViewTeams.setAdapter(adapter);
        recyclerViewTeams.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerViewTeams,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                SoccerTeam obj = listTeams.get(position);
                                // Go to details page
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                )
        );
    }

    public void createTeam() {
        SoccerTeam obj = new SoccerTeam("PSG", "Paris", "Île-de-France", "O PSG venceu sete vezes o campeonato francês (1985–86, 1993–94, 2012–13, 2013–14, 2014–15, 2015–16, 2017–18) e 12 vezes a Taça de França. Internacionalmente, o PSG conquistou uma Taça dos Clubes Vencedores de Taças em 1995-96. Como principal rival, o Paris Saint-Germain tem o Olympique de Marseille.", R.drawable.psg);
        listTeams.add(obj);
        obj = new SoccerTeam("Atlético Paranaense", "Curitiba", "Paraná", "Taça Campeonato Brasileiro 1 título 2001.\n" +
                "Taça Campeonato Brasileiro - Série B 1 título 1995.\n" +
                "Taça Supercampeonato Paranaense 1 título 2002.\n" +
                "Taça Campeonato Paranaense 21 títulos 1925, 1929, 1930, 1934, 1936, 1940, 1943 1945, 1949, 1958, 1970, 1982, 1983, 1985 1988, 1990, 1998, 2000, 2001, 2005 e 2009.", R.drawable.cap);
        listTeams.add(obj);
        obj = new SoccerTeam("Paraná Clube", "Curitiba", "Paraná", "O Paraná Clube nasceu da fusão do Colorado Esporte Clube e do Esporte Clube Pinheiros em 1989 e o resultado dela foi o sucesso do clube que nos primeiros dez anos de vida, pois venceu seis vezes o Campeonato Paranaense de Futebol.", R.drawable.cap);
        listTeams.add(obj);
        obj = new SoccerTeam("Coritiba F.C.", "Curitiba", "Paraná", "Foi o primeiro clube do futebol paranaense a conquistar o Campeonato Brasileiro, em 1985, quebrando a hegemonia de equipes de São Paulo, Rio de Janeiro, Rio Grande do Sul e Minas Gerais que perdurava desde 1960. Além desse título, o Coritiba soma 39 campeonatos paranaenses, sendo o atual recordista de taças na história da principal competição estadual e o detentor de um hexacampeonato no estado, sequência de 1971 até 1976, vice-campeão em 1977, seria campeão de novo em 1978 e 1979, conquistando também nesse período de nove anos o Torneio do Povo de 1973, um total de nove títulos. Possui também 2 vice-campeonatos na Copa do Brasil, em 2011 e 2012, além de 2 Campeonatos Brasileiros da série B, conquistados em 2007 e 2010.", R.drawable.cap);
        listTeams.add(obj);
    }
}