package org.wintrisstech.teamhawk.irobot2013;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class Dashboard extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_dashboard, menu);
        return true;
    }

    
}
