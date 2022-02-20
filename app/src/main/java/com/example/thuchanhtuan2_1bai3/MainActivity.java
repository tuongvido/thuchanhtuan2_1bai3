package com.example.thuchanhtuan2_1bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String can, chi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtNamDuongLich=findViewById(R.id.edtnamduonglich);
        EditText edtNamAmLich=findViewById(R.id.edtnamamlich);
        Button btnChuyenDoi=findViewById(R.id.buttonChuyenDoi);
        btnChuyenDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namDL=edtNamDuongLich.getText().toString();
//                if(namDL.matches("")){
//                    Toast.makeText(MainActivity.this, "Bạn chưa nhập năm dương lịch", Toast.LENGTH_SHORT).show();
//
//                }
                int namDuongLich=Integer.valueOf(namDL);
                if( namDuongLich<1900){
                    Toast.makeText(MainActivity.this, "Năm phải lớn hơn hoặc bằng 1900", Toast.LENGTH_SHORT).show();
                    edtNamDuongLich.setText("");
                    return;
                }

                switch (namDuongLich%10){
                    case 0:{
                        can="Canh";
                        break;
                    }
                    case 1:{
                        can="Tân";
                        break;
                    }
                    case 2:{
                        can="Nhâm";
                        break;
                    }case 3:{
                        can="Quý";
                        break;
                    }
                    case 4:{
                        can="Giáp";
                        break;
                    }
                    case 5:{
                        can="Ất";
                        break;
                    }
                    case 6:{
                        can="Bính";
                        break;
                    }case 7:{
                        can="Đinh";
                        break;
                    }
                    case 8:{
                        can="Mậu";
                        break;
                    }
                    case 9:{
                        can="Kỷ";
                        break;
                    }
                }
                switch (namDuongLich%12){
                    case 0:{
                        chi="Thân";
                        break;
                    }
                    case 1:{
                        chi="Dậu";
                        break;
                    }
                    case 2:{
                        chi="Tuất";
                        break;
                    }
                    case 3:{
                        chi="Hợi";
                        break;
                    } case 4:{
                        chi="Tý";
                        break;
                    } case 5:{
                        chi="Sửu";
                        break;
                    } case 6:{
                        chi="Dần";
                        break;
                    }
                    case 7:{
                        chi="Mẹo";
                        break;
                    }
                    case 8:{ chi="Thìn";
                        break;

                    } case 9:{
                        chi="Tỵ";
                        break;
                    } case 10:{
                        chi="Ngọ";
                        break;
                    } case 11:{
                        chi="Mùi";
                        break;
                    }

                }

                edtNamAmLich.setText(can+" "+chi);
            }
        });
    }
}