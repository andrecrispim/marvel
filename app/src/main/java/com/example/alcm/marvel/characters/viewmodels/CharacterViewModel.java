package com.example.alcm.marvel.characters.viewmodels;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.alcm.marvel.characters.models.Character;

public class CharacterViewModel extends ViewModel {

    private MutableLiveData<Character> character;

    public MutableLiveData<Character> getCharacter() {
        if (character == null) {
            character = new MutableLiveData<Character>();
        }

        return character;
    }
}
