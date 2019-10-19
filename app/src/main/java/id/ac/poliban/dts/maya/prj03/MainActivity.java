package id.ac.poliban.dts.maya.prj03;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {


    //mendeklararasikan listview var dan menginisialasi array tipe data string
    private String[] namanegara = new String[]{
            "Indonesia", "Malaysia", "Singapore",
            "Italia", "Inggris", "Belanda",
            "Argentina", "Chile",
            "Mesir", "Uganda"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar()!=null) getSupportActionBar().setTitle("ListView Sederhana");//tampil judul

        //Membinding atau memformat data
        ListView lvItem = findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, namanegara);

        //menset data di dalam listview
        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener((parent, view, position, id) -> Toast.makeText(MainActivity.this, "Memilih :" + namanegara[position], Toast.LENGTH_LONG).show());
    }
}