package comsci.teenoyzz.myfristapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class  Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView titleTextView = (TextView) findViewById(R.id.txtTitleDetail);
        TextView detailTextView = (TextView) findViewById(R.id.txtDetailScroll);
        ImageView detailImageView = (ImageView) findViewById(R.id.imvImageDetail);
        Button button = (Button) findViewById(R.id.btnBack);

        titleTextView.setText(getIntent().getStringExtra("Title"));
        detailTextView.setText(getIntent().getStringExtra("Detail"));
        detailImageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.traffic_01));


    }
    public void  clickBack(View view){
        finish();
    }
}
