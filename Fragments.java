package com.example.neodaily;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;


public class Fragments extends AppCompatActivity {

    ImageButton firstFragment, secondFragment, thirdFragment, fourthFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);
// get the reference of Button's

        firstFragment = findViewById(R.id.profile_button);
        secondFragment = findViewById(R.id.weekly_button);
        thirdFragment = findViewById(R.id.monthly_button);
        fourthFragment = findViewById(R.id.notes_button);


// perform setOnClickListener event on First Button
        firstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load First Fragment
                loadFragment(new FirstFragment());
                changeImageButton(firstFragment);

            }
        });
// perform setOnClickListener event on Second Button
        secondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new SecondFragment());
                changeImageButton(secondFragment);
            }

        });

        thirdFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new ThirdFragment());
                changeImageButton(thirdFragment);
            }
        });

        fourthFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new FourthFragment());
                changeImageButton(fourthFragment);
            }
        });

    }


    private void loadFragment(Fragment fragment) {
// create a FragmentManager
        FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }


    private void changeImageButton(ImageButton btn) {

        if (btn == firstFragment) {
            firstFragment.setBackgroundResource(R.drawable.clicked_profile_button);
            secondFragment.setBackgroundResource(R.drawable.unclicked_week_button);
            thirdFragment.setBackgroundResource(R.drawable.unclicked_month_button);
            fourthFragment.setBackgroundResource(R.drawable.unclicked_notes_button);
        }

        if (btn == secondFragment) {
            firstFragment.setBackgroundResource(R.drawable.unclicked_profile_button);
            secondFragment.setBackgroundResource(R.drawable.clicked_weekly_button);
            thirdFragment.setBackgroundResource(R.drawable.unclicked_month_button);
            fourthFragment.setBackgroundResource(R.drawable.unclicked_notes_button);
        }

        if (btn == thirdFragment) {
            firstFragment.setBackgroundResource(R.drawable.unclicked_profile_button);
            secondFragment.setBackgroundResource(R.drawable.unclicked_week_button);
            thirdFragment.setBackgroundResource(R.drawable.clicked_monthly_button);
            fourthFragment.setBackgroundResource(R.drawable.unclicked_notes_button);
        }

        if (btn == fourthFragment) {
            firstFragment.setBackgroundResource(R.drawable.unclicked_profile_button);
            secondFragment.setBackgroundResource(R.drawable.unclicked_week_button);
            thirdFragment.setBackgroundResource(R.drawable.unclicked_month_button);
            fourthFragment.setBackgroundResource(R.drawable.clicked_notes_button);
        }


    }
}