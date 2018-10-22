package com.example.android.news;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter {

    /**
     * LocationAdapter constructor
     * @param context the context
     * @param locations the location to build
     */
    public NewsAdapter(Context context, ArrayList<News> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // check if the existing view is being reused, otherwise inflate the view
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // get's the location at the given position
        News currentNews = (News) getItem(position);

        // get the title
        TextView title = convertView.findViewById(R.id.title);
        title.setText(currentNews.getTitle());

        // get the type/section
        TextView type = convertView.findViewById(R.id.type);
        type.setText(currentNews.getSection() + ": " + currentNews.getType());

        // get the date
        TextView dateView = convertView.findViewById(R.id.datePublished);
        dateView.setText(currentNews.getDatePublished());

        TextView authorView = convertView.findViewById(R.id.author);
        String author = currentNews.getAuthor();

        if (author != null) {
            authorView.setText(author);
            authorView.setVisibility(View.VISIBLE);
        } else {
            authorView.setVisibility(View.GONE);
        }

        return convertView;
    }
}
