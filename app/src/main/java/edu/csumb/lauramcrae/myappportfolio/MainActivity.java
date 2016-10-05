package edu.csumb.lauramcrae.myappportfolio;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    Button mPopularMovies, mStockHawk, mBuildItBigger, mMakeYourAppMaterial, mGoUbiquitous, mCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPopularMovies = (Button) findViewById(R.id.popular_movies);
        mPopularMovies.setOnClickListener(this);

        mStockHawk = (Button) findViewById(R.id.stock_hawk);
        mStockHawk.setOnClickListener(this);

        mBuildItBigger = (Button) findViewById(R.id.build_it_bigger);
        mBuildItBigger.setOnClickListener(this);

        mMakeYourAppMaterial = (Button) findViewById(R.id.make_your_app_material);
        mMakeYourAppMaterial.setOnClickListener(this);

        mGoUbiquitous = (Button) findViewById(R.id.go_ubiquitous);
        mGoUbiquitous.setOnClickListener(this);

        mCapstone = (Button) findViewById(R.id.capstone);
        mCapstone.setOnClickListener(this);

    }

    public void onClick(View v){

        //Popular Movies Button Implementation
        if(v.getId() == R.id.popular_movies){
            toast("This button will launch my Popular Movies app!");
        }

        //Stock Hawk Button Implementation
        else if(v.getId() == R.id.stock_hawk){
            toast("This button will launch my Stock Hawk app!");
        }

        //Build It Bigger Button Implementation
        else if(v.getId() == R.id.build_it_bigger){
            toast("This button will launch my Build It Bigger app!");
        }

        //Make Your App Material Button Implementation
        else if(v.getId() == R.id.make_your_app_material){
            toast("This button will launch my Make Your App Material app!");
        }

        //Go Ubiquitous Button Implementation
        else if(v.getId() == R.id.go_ubiquitous){
            toast("This button will launch my Go Ubiquitous app!");
        }

        //Capstone Button Implementation
        else if(v.getId() == R.id.capstone){
            toast("This button will launch my Capstone app!");
        }
    }

    public void toast(String s){
        Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
    }
}
