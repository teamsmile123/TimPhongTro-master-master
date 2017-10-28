package example.com.timtro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private DatabaseReference databaseReference;
    private DatabaseReference mDatabase;
    private ArrayList<TimNguoiOGhep> mlist;
    private ListView listView;
    private CustomListItemAdapterActivity2 adapter=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mDatabase =  FirebaseDatabase.getInstance().getReference();
        databaseReference = mDatabase.child("nguoioghep");
        addInitialDataToFirebase();
        listView = (ListView)findViewById(R.id.lv1);
        mlist =new ArrayList<TimNguoiOGhep>();
        adapter=new CustomListItemAdapterActivity2(this,R.layout.custom_listview_activity2,mlist);
        /*ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,subject)*/;
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent = new Intent(MainActivity2.this, MainActivity1.class);
                        startActivity(intent);
                    }
                }
        );

        //tao chu tren thanh toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //tao thanh menu va su kien khi click no
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void addInitialDataToFirebase() {

        List<TimNguoiOGhep> listTimNguoiOGheps = SampleData.getSample();
        for (TimNguoiOGhep timNguoiOGhep: listTimNguoiOGheps){
           // String key = journalCloudEndPoint.push().getKey();
            databaseReference.child("nguoioghep").setValue(timNguoiOGhep);
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
   //ham xu li mục setting
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.search_view) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.tim_phong) {
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(intent);

        } else if (id == R.id.tim_ghep) {

        } else if (id == R.id.dang_cho_thue) {
            Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
            startActivity(intent);


        } else if (id == R.id.dang_tim_ghep) {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(intent);

        } else if (id == R.id.tro_giup) {

        } else if (id == R.id.bao_cao) {
            Intent intent = new Intent(MainActivity2.this, MainActivityBaoCao.class);
            startActivity(intent);
        }
        //cau lenh de quay ve man hinh chinh
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
