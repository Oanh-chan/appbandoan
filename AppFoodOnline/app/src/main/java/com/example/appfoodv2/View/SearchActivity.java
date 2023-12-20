package com.example.appfoodv2.View;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appfoodv2.Adapter.SanPhamXTAdapter;
import com.example.appfoodv2.Model.SanPhamModels;
import com.example.appfoodv2.Presenter.ISanPham;
import com.example.appfoodv2.R;
import com.example.appfoodv2.View.Admin.ProductActivity;
import com.example.appfoodv2.View.Admin.ProductAdapter;
import com.example.appfoodv2.dangsanphamActivity;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class SearchActivity  extends AppCompatActivity {
    SanPhamXTAdapter adapter;
    RecyclerView rcv;
    private SanPhamModels sanPhamModels;
    private ArrayList<SanPhamModels> arr_sp = new ArrayList<>();
    ProgressDialog dialog;
    private FirebaseFirestore db;
    private Toolbar toolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        rcv = findViewById(R.id.rcv);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        dialog = new ProgressDialog(this); // this = YourActivity
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.setTitle("Loading");
        dialog.setIndeterminate(true);
        dialog.setCanceledOnTouchOutside(false);


        sanPhamModels = new SanPhamModels(new ISanPham() {
            @Override
            public void getDataSanPham(String id, String tensp, Long giatien, String hinhanh, String loaisp, String mota, Long soluong, String nhasanxuat, Long type, String trongluong) {
                arr_sp.add(new SanPhamModels(id, tensp, giatien, hinhanh, loaisp, mota, soluong, nhasanxuat, type, trongluong));
                adapter = new SanPhamXTAdapter(SearchActivity.this, arr_sp);
                rcv.setAdapter(adapter);
                dialog.dismiss();
            }

            @Override
            public void OnEmptyList() {
                dialog.dismiss();
            }

            @Override
            public void getDataSanPhamNB(String id, String tensp, Long giatien, String hinhanh, String loaisp, String mota, Long soluong, String nhasanxuat, Long type, String trongluong) {
                arr_sp.add(new SanPhamModels(id, tensp, giatien, hinhanh, loaisp, mota, soluong, nhasanxuat, type, trongluong));
                adapter = new SanPhamXTAdapter(SearchActivity.this, arr_sp);
                rcv.setAdapter(adapter);
                dialog.dismiss();
            }


            @Override
            public void getDataSanPhamTU(String id, String tensp, Long giatien, String hinhanh, String loaisp, String mota, Long soluong, String nhasanxuat, Long type, String trongluong) {
                arr_sp.add(new SanPhamModels(id, tensp, giatien, hinhanh, loaisp, mota, soluong, nhasanxuat, type, trongluong));
                adapter = new SanPhamXTAdapter(SearchActivity.this, arr_sp);
                rcv.setAdapter(adapter);
                dialog.dismiss();
            }

            @Override
            public void getDataSanPhamHQ(String id, String tensp, Long giatien, String hinhanh, String loaisp, String mota, Long soluong, String nhasanxuat, Long type, String trongluong) {
                arr_sp.add(new SanPhamModels(id, tensp, giatien, hinhanh, loaisp, mota, soluong, nhasanxuat, type, trongluong));
                adapter = new SanPhamXTAdapter(SearchActivity.this, arr_sp);
                rcv.setAdapter(adapter);
                dialog.dismiss();
            }

            @Override
            public void getDataSanPhamMC(String id, String tensp, Long giatien, String hinhanh, String loaisp, String mota, Long soluong, String nhasanxuat, Long type, String trongluong) {
                arr_sp.add(new SanPhamModels(id, tensp, giatien, hinhanh, loaisp, mota, soluong, nhasanxuat, type, trongluong));
                adapter = new SanPhamXTAdapter(SearchActivity.this, arr_sp);
                rcv.setAdapter(adapter);
                dialog.dismiss();
            }

            @Override
            public void getDataSanPhamYT(String id, String tensp, Long giatien, String hinhanh, String loaisp, String mota, Long soluong, String nhasanxuat, Long type, String trongluong) {
                arr_sp.add(new SanPhamModels(id, tensp, giatien, hinhanh, loaisp, mota, soluong, nhasanxuat, type, trongluong));
                adapter = new SanPhamXTAdapter(SearchActivity.this, arr_sp);
                rcv.setAdapter(adapter);
                dialog.dismiss();
            }

            @Override
            public void getDataSanPhamLau(String id, String tensp, Long giatien, String hinhanh, String loaisp, String mota, Long soluong, String nhasanxuat, Long type, String trongluong) {
                arr_sp.add(new SanPhamModels(id, tensp, giatien, hinhanh, loaisp, mota, soluong, nhasanxuat, type, trongluong));
                adapter = new SanPhamXTAdapter(SearchActivity.this, arr_sp);
                rcv.setAdapter(adapter);
                dialog.dismiss();
            }

            @Override
            public void getDataSanPhamGY(String id, String tensp, Long giatien, String hinhanh, String loaisp, String mota, Long soluong, String nhasanxuat, Long type, String trongluong) {
                arr_sp.add(new SanPhamModels(id, tensp, giatien, hinhanh, loaisp, mota, soluong, nhasanxuat, type, trongluong));
                adapter = new SanPhamXTAdapter(SearchActivity.this, arr_sp);
                rcv.setAdapter(adapter);
                dialog.dismiss();
            }
        });
        dialog.show();
        sanPhamModels.HandlegetDataSanPhamAll();

    }

}
