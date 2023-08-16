package com.example.hidden;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class KulinerDetailActivity extends AppCompatActivity {

    ImageView bg_kuliner_detail;
    View btn_kembali_kuliner;
    TextView nama_tempat, alamat, harga_menu, jam_buka_tempat, rating_kuliner;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner_detail);

        nama_tempat = findViewById(R.id.nama_tempat);
        alamat = findViewById(R.id.alamat);
        rating_kuliner = findViewById(R.id.rating_kuliner);
        harga_menu = findViewById(R.id.harga_menu);
        jam_buka_tempat = findViewById(R.id.jam_buka_tempat);
        bg_kuliner_detail = findViewById(R.id.bg_kuliner_detail);

        // mengambil data dari intent
        Bundle bundle = getIntent().getExtras();
        String nama_tempatkulinerbaru = bundle.getString("nama_tempat");

        // mengambil data dari firebase berdasarkan Intent
        reference = FirebaseDatabase.getInstance().getReference().child("Kuliner").child(nama_tempatkulinerbaru);
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                // Menimpa data yang ada dengan data yang baru (firebase)
                nama_tempat.setText(snapshot.child("nama_tempat").getValue().toString());
                alamat.setText(snapshot.child("alamat").getValue().toString());
                rating_kuliner.setText(snapshot.child("rating_kuliner").getValue().toString());
                harga_menu.setText(snapshot.child("harga_menu").getValue().toString());
                jam_buka_tempat.setText(snapshot.child("jam_buka_tempat").getValue().toString());

                Picasso.with(KulinerDetailActivity.this)
                        .load(snapshot.child("url_kuliner")
                                .getValue().toString()).centerCrop().fit()
                        .into(bg_kuliner_detail);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        btn_kembali_kuliner = findViewById(R.id.btn_kembali_kuliner);
        btn_kembali_kuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backtohome_kuliner = new Intent(KulinerDetailActivity.this,HomeActivity.class);
                startActivity(backtohome_kuliner);
            }
        });

    }
}