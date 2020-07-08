package com.example.trypicasso;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_layout);
        setOnClicks();
    }

    private void setOnClicks() {
        final ImageView imageView1 = findViewById(R.id.fav_image_1);
        final ImageView imageView2 = findViewById(R.id.fav_image_2);
        final ImageView imageView3 = findViewById(R.id.fav_image_3);
        final ImageView imageView4 = findViewById(R.id.fav_image_4);
        final ImageView imageView5 = findViewById(R.id.fav_image_5);
        final ImageView imageView6 = findViewById(R.id.fav_image_6);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showUrlDialog(imageView1);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showUrlDialog(imageView2);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showUrlDialog(imageView3);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showUrlDialog(imageView4);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showUrlDialog(imageView5);
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showUrlDialog(imageView6);
            }
        });

    }

    private void showUrlDialog(final ImageView i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final View customLayout = getLayoutInflater().inflate(R.layout.dialog_seturl, null);
        builder.setView(customLayout);
        Button button = customLayout.findViewById(R.id.button);
        final EditText editText = customLayout.findViewById(R.id.urlInput);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get().load(editText.getText().toString()).resize(400,400).into(i);
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}