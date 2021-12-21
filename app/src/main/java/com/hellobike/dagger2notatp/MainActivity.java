package com.hellobike.dagger2notatp;

import androidx.appcompat.app.AppCompatActivity;
import com.hellobike.dagger2.annation.Inject;
import com.hellobike.dagger2notatp.dagger2Create.component.DaggerPeopleComponent;
import com.hellobike.dagger2notatp.object.People;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * 注入目标，第四处注解
     */
    @Inject
    public People peopleFirst;

    @Inject
    public People peopleSecond;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerPeopleComponent.create().inject(this);

        TextView textViewFirst = findViewById(R.id.people_first);
        TextView textViewSecond = findViewById(R.id.people_second);
        textViewFirst.setText("peopleFirst:" +  peopleFirst.getName() + ",     " + peopleFirst.hashCode());
        textViewSecond.setText("peopleSecond:" + peopleSecond.getName() + ",     " + peopleSecond.hashCode());

    }
}