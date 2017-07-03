package com.example.ankitkumar.optionmenubycode;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(1, 1, 0, "Option1");

        menu.add(1, 2, 1, "Option2");

        menu.add(1, 3, 2, "Option3");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case 1:
                Toast.makeText(this, "Clicked on Option 1", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "Clicked on Option 2", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, "Clicked on Option 3", Toast.LENGTH_SHORT).show();
                break;

        }
        return true;
    }
}
