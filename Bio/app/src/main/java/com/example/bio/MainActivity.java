package com.example.bio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bio.data.Bio;
import com.example.bio.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //Setting binding class for further usage
    private ActivityMainBinding binding;
    private Bio bio = new Bio();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        bio.setName("Chary Nepesov");

        binding.setBio(bio);
        binding.doneButton.setOnClickListener(view -> {
            bio.setHobbies(String.format("Hobbies: %s",
                    binding.enterHobbies.getText().toString().trim()));

            binding.invalidateAll();
            binding.hobbiesText.setVisibility(View.VISIBLE);

            //hide keyboard
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        });


    }

}