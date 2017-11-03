package net.androidsrc.seller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import net.androidsrc.common.CommonClass;

public class SellerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller);
        TextView tvSeller = findViewById(R.id.tvSeller);
        tvSeller.setText(CommonClass.MESSAGE + " to Seller");
    }
}
