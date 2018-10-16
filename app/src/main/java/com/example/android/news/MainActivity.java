package com.example.android.news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
//todo progress bar
public class MainActivity extends AppCompatActivity {

    /** TextView that is displayed when the list is empty */
    private TextView mEmptyStateTextView;

    private static final String REQUEST_URL =
            "http://content.guardianapis.com/search?q=debates&api-key=test&show-tags=contributor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView newsListView = findViewById(R.id.list);

        mEmptyStateTextView = (TextView) findViewById(R.id.empty_view);
    }
}
