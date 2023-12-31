package com.example.e7m5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;

import com.example.e7m5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements ViewPresentador {
    private Presentador presentador;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        presentador = new Presentador(this);
        binding.passwordText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                presentador.evaluatePassword(s.toString());

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public void showWeak() {
        Toast.makeText(this, "Weak password", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showMedium() {
        Toast.makeText(this, "Medium password", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showStrong() {
        Toast.makeText(this, "Strong password", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showError() {

    }
}