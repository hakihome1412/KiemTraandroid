package com.example.student.hph_cau2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_KetQua extends AppCompatActivity{
    private Button btnCallThongTin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ketqua_layout);

        btnCallThongTin = (Button) findViewById(R.id.btn_goinhapthongtin);
        btnCallThongTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_KetQua.this ,Activity_ThongTin.class );
                startActivity(intent);
            }
        });
    }
}
