package com.delta.layouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SelctionActiviy extends Activity {
    private Button but1=null;
    private Spinner spin1=null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        Bundle extra = this.getIntent().getExtras();
        if(extra != null){
            String str =extra.getString("Switch");
            Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
        }
        but1=(Button)findViewById(R.id.bb2);
        spin1=(Spinner)findViewById(R.id.sb1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str2 = spin1.getSelectedItem().toString();
                Intent ret = new Intent();
                ret.putExtra("Done",str2);
                setResult(RESULT_OK,ret);
                finish();
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.layout, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}

