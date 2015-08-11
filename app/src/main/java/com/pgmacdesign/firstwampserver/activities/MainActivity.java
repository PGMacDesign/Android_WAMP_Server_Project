package com.pgmacdesign.firstwampserver.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.pgmacdesign.firstwampserver.R;
import com.pgmacdesign.firstwampserver.misc.L;
import com.pgmacdesign.firstwampserver.pojo.Employee;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        L.m(2);
        L.m("222");
        L.m(true);

        L.toast(this, "Stuff!");
        L.Toast(this, 222);
        Employee employee = new Employee();
        employee.setName("bob");
        employee.setSalary(121222);
        L.Toast(this, employee);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
