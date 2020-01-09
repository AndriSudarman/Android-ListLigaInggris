    package id.ac.poliban.mi.andri.listligainggris;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Club> clubs = new ArrayList<>();
    private ListView lvClubs;
    private BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvClubs = findViewById(R.id.listview);

        clubs.addAll(ClubData.getAllClubs());

        adapter = new ClubAdapter(clubs);

        lvClubs.setAdapter(adapter);

        lvClubs.setOnItemClickListener((parent, view, position, id) -> {
            new AlertDialog.Builder(this)
                    .setTitle("info")
                    .setMessage(clubs.get(position).toString())
                    .setPositiveButton("OK", null).show();
        });
    }
}
