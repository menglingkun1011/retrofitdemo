package com.meng.retrofitdemo;

import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.meng.retrofitdemo.api.LocationApi;
import com.meng.retrofitdemo.api.RetrofitApi;
import com.meng.retrofitdemo.bean.LocationBean;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textview);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Retrofit retrofit = RetrofitApi.getInstance();
                LocationApi locationApi = retrofit.create(LocationApi.class);
//                http://apis.juhe.cn/mobile/get?phone=13812345678&key=daf8fa858c330b22e342c882bcbac622
                Call<LocationBean> call = locationApi.getLocation("13812345678", "daf8fa858c330b22e342c882bcbac622");

//                call.execute(); 同步方法 可以在子线程中运行
                call.enqueue(new Callback<LocationBean>() {
                    @Override
                    public void onResponse(Call<LocationBean> call, Response<LocationBean> response) {
                        LocationBean bean = response.body();
                        String city = bean.getResult().getCity();
                        tv.setText(city);
                        Toast.makeText(MainActivity.this, "city:"+city, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<LocationBean> call, Throwable t) {
                        Toast.makeText(MainActivity.this, "onFailure:", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}
