package com.example.hidden;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class WisataDetailActivity extends AppCompatActivity {

    ImageView bg_wisata_detail;
    View btn_kembali_wisata;
    TextView nama_wisata, lokasi, rating, harga_tiket, spot_foto, jam_buka;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_detail);

        nama_wisata = findViewById(R.id.nama_wisata);
        lokasi = findViewById(R.id.lokasi);
        rating = findViewById(R.id.rating);
        harga_tiket = findViewById(R.id.harga_tiket);
        spot_foto = findViewById(R.id.spot_foto);
        jam_buka = findViewById(R.id.jam_buka);
        bg_wisata_detail = findViewById(R.id.bg_wisata_detail);

        // mengambil data dari intent
        Bundle bundle = getIntent().getExtras();
        String nama_tempatwisatabaru = bundle.getString("nama_wisata");

        // mengambil data dari firebase berdasarkan Intent
        reference = FirebaseDatabase.getInstance().getReference().child("Wisata").child(nama_tempatwisatabaru);
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                // Menimpa data yang ada dengan data yang baru (firebase)
                nama_wisata.setText(snapshot.child("nama_wisata").getValue().toString());
                lokasi.setText(snapshot.child("lokasi").getValue().toString());
                rating.setText(snapshot.child("rating").getValue().toString());
                harga_tiket.setText(snapshot.child("harga_tiket").getValue().toString());
                spot_foto.setText(snapshot.child("spot_foto").getValue().toString());
                jam_buka.setText(snapshot.child("jam_buka").getValue().toString());

                Picasso.with(WisataDetailActivity.this)
                        .load(snapshot.child("url_foto")
                                .getValue().toString()).centerCrop().fit()
                        .into(bg_wisata_detail);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        btn_kembali_wisata = findViewById(R.id.btn_kembali_wisata);
        btn_kembali_wisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backtohome_wisata = new Intent(WisataDetailActivity.this,HomeActivity.class);
                startActivity(backtohome_wisata);
            }
        });

    }



}