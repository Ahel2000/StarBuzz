
package com.ahel.starbuzz;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;

import com.ahel.starbuzz.R;

public class DrinkCategoryActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);
        //Create an OnItemClickListener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    public void onItemClick(AdapterView<?> listView,
                                            View v,
                                            int position,
                                            long id) {
                        if (position == 1) {
                            Intent intent = new Intent(DrinkCategoryActivity.this,
                                    Drink1.class);
                            startActivity(intent);
                        }
                        if (position == 0) {
                            Intent intent = new Intent(DrinkCategoryActivity.this,
                                    Drink2.class);
                            startActivity(intent);
                        }
                        if (position == 2) {
                            Intent intent = new Intent(DrinkCategoryActivity.this,
                                    Drink3.class);
                            startActivity(intent);
                        }
                    }
                };
        //Add the listener to the list view
        ListView listView = (ListView) findViewById(R.id.list_option);
        listView.setOnItemClickListener(itemClickListener);
    }
}
