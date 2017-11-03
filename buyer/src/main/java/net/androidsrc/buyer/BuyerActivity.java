package net.androidsrc.buyer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import net.androidsrc.common.CommonClass;

public class BuyerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer);
        TextView tvBuyer= findViewById(R.id.tvBuyer);
        tvBuyer.setText(CommonClass.MESSAGE+" to buyer Activity");
    }
}
