package com.example.alcm.marvel.characters;

import android.annotation.SuppressLint;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.alcm.marvel.R;
import com.example.alcm.marvel.characters.models.Character;
import com.example.alcm.marvel.characters.viewmodels.CharacterViewModel;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@SuppressLint("Registered")
@EActivity(R.layout.activity_character_detail)
public class CharacterDetailsActivity extends AppCompatActivity {

    @ViewById(R.id.character_details_name)
    protected TextView nameView;

    @ViewById(R.id.character_details_description)
    protected TextView descriptionView;

    private CharacterViewModel characterViewModel;

    @AfterViews
    protected void initialize() {
        characterViewModel = ViewModelProviders.of(this).get(CharacterViewModel.class);

        final Observer<String> nameObserver = new Observer<String>() {
            @Override
            public void onChanged(@Nullable final String newName) {
                nameView.setText(newName);
            }
        };

        characterViewModel.getCurrentName().observe(this, nameObserver);
    }
}
