package com.example.student.hph_cau2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_ThongTin extends AppCompatActivity{
    private Button btnCallKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nhapthongtin_layout);

        btnCallKetQua = (Button) findViewById(R.id.btn_giai);
        btnCallKetQua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_ThongTin.this ,Activity_KetQua.class );
                startActivity(intent);
            }
        });
    }
}
