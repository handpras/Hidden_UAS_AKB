package com.example.hidden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.firebase.database.DatabaseReference;

public class HomeActivity extends AppCompatActivity {

    // Wisata
    LinearLayout btn_detail_paropo, btn_detail_rammang, btn_detail_wediombo,
            btn_detail_kei, btn_detail_kenawa, btn_detail_misool, btn_detail_weh,
            btn_detail_holb, btn_detail_baliem;

    // Kuliner
    LinearLayout btn_detail_rmpadangdicubo, btn_detail_igabakarsarwon, btn_detail_bakmifeng,
                btn_detail_milkcrumbs, btn_detail_miluna;

    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // -------- WISATA TERSEMBUNYI ------
        btn_detail_paropo = findViewById(R.id.btn_detail_paropo);
        btn_detail_rammang = findViewById(R.id.btn_detail_rammang);
        btn_detail_wediombo = findViewById(R.id.btn_detail_wediombo);
        btn_detail_kei = findViewById(R.id.btn_detail_kei);
        btn_detail_kenawa = findViewById(R.id.btn_detail_kenawa);
        btn_detail_misool= findViewById(R.id.btn_detail_misool);
        btn_detail_weh = findViewById(R.id.btn_detail_weh);
        btn_detail_holb = findViewById(R.id.btn_detail_holb);
        btn_detail_baliem = findViewById(R.id.btn_detail_baliem);

        btn_detail_paropo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetailparopo = new Intent(HomeActivity.this,WisataDetailActivity.class);
                //meletakkan data kepada intent
                gotodetailparopo.putExtra("nama_wisata", "Paropo");
                startActivity(gotodetailparopo);
            }
        });

        btn_detail_rammang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetailparopo = new Intent(HomeActivity.this,WisataDetailActivity.class);
                //meletakkan data kepada intent
                gotodetailparopo.putExtra("nama_wisata", "Rammang");
                startActivity(gotodetailparopo);
            }
        });

        btn_detail_wediombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetailparopo = new Intent(HomeActivity.this,WisataDetailActivity.class);
                //meletakkan data kepada intent
                gotodetailparopo.putExtra("nama_wisata", "Wediombo");
                startActivity(gotodetailparopo);
            }
        });

        btn_detail_kei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetailparopo = new Intent(HomeActivity.this,WisataDetailActivity.class);
                //meletakkan data kepada intent
                gotodetailparopo.putExtra("nama_wisata", "Kei");
                startActivity(gotodetailparopo);
            }
        });

        btn_detail_kenawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetailparopo = new Intent(HomeActivity.this,WisataDetailActivity.class);
                //meletakkan data kepada intent
                gotodetailparopo.putExtra("nama_wisata", "Kenawa");
                startActivity(gotodetailparopo);
            }
        });

        btn_detail_misool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetailparopo = new Intent(HomeActivity.this,WisataDetailActivity.class);
                //meletakkan data kepada intent
                gotodetailparopo.putExtra("nama_wisata", "Misool");
                startActivity(gotodetailparopo);
            }
        });

        btn_detail_weh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetailparopo = new Intent(HomeActivity.this,WisataDetailActivity.class);
                //meletakkan data kepada intent
                gotodetailparopo.putExtra("nama_wisata", "Weh");
                startActivity(gotodetailparopo);
            }
        });

        btn_detail_holb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetailparopo = new Intent(HomeActivity.this,WisataDetailActivity.class);
                //meletakkan data kepada intent
                gotodetailparopo.putExtra("nama_wisata", "Holbung");
                startActivity(gotodetailparopo);
            }
        });

        btn_detail_baliem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetailparopo = new Intent(HomeActivity.this,WisataDetailActivity.class);
                //meletakkan data kepada intent
                gotodetailparopo.putExtra("nama_wisata", "Baliem");
                startActivity(gotodetailparopo);
            }
        });





        // ------- KULINER TERSEMBUNYI ------
        btn_detail_rmpadangdicubo = findViewById(R.id.btn_detail_rmpadangdicubo);
        btn_detail_igabakarsarwon = findViewById(R.id.btn_detail_igabakarsarwon);
        btn_detail_bakmifeng = findViewById(R.id.btn_detail_bakmifeng);
        btn_detail_milkcrumbs = findViewById(R.id.btn_detail_milkcrumbs);
        btn_detail_miluna = findViewById(R.id.btn_detail_miluna);

        btn_detail_rmpadangdicubo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetailpadangdicubo = new Intent(HomeActivity.this,KulinerDetailActivity.class);
                //meletakkan data kepada intent
                gotodetailpadangdicubo.putExtra("nama_tempat", "RM_Padang_Dicubo");
                startActivity(gotodetailpadangdicubo);
            }
        });

        btn_detail_igabakarsarwon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetailpadangdicubo = new Intent(HomeActivity.this,KulinerDetailActivity.class);
                //meletakkan data kepada intent
                gotodetailpadangdicubo.putExtra("nama_tempat", "Iga_paksarwon");
                startActivity(gotodetailpadangdicubo);
            }
        });

        btn_detail_bakmifeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetailpadangdicubo = new Intent(HomeActivity.this,KulinerDetailActivity.class);
                //meletakkan data kepada intent
                gotodetailpadangdicubo.putExtra("nama_tempat", "Feng");
                startActivity(gotodetailpadangdicubo);
            }
        });

        btn_detail_milkcrumbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetailpadangdicubo = new Intent(HomeActivity.this,KulinerDetailActivity.class);
                //meletakkan data kepada intent
                gotodetailpadangdicubo.putExtra("nama_tempat", "Milk_Crumbs");
                startActivity(gotodetailpadangdicubo);
            }
        });

        btn_detail_miluna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotodetailpadangdicubo = new Intent(HomeActivity.this,KulinerDetailActivity.class);
                //meletakkan data kepada intent
                gotodetailpadangdicubo.putExtra("nama_tempat", "Miluna");
                startActivity(gotodetailpadangdicubo);
            }
        });

    }
}