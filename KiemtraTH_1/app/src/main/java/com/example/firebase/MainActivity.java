package com.example.firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv_CongAn;
    private CongAnAdapter congAnAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_CongAn =  findViewById(R.id.rcv_CA);
        congAnAdapter = new CongAnAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rv_CongAn.setLayoutManager(linearLayoutManager);
        congAnAdapter.SetData(getListCategory());
        rv_CongAn.setAdapter(congAnAdapter);
    }
    @NonNull
    private List<CongAn> getListCategory() {
        List<CongAn> congAnList=new ArrayList<>();
        congAnList.add(new CongAn(R.drawable.congan_1, "Công An 1","Binh bét","Tỉnh Tuyên Quang","0"));
        congAnList.add(new CongAn(R.drawable.cong_2, "Công An 2","Đại Tá","Sóc Trăng","5"));
        congAnList.add(new CongAn(R.drawable.congan_3, "Công An 3","Trung Tá","Tỉnh Tuyên Quang","3"));


        return congAnList;
    }
}