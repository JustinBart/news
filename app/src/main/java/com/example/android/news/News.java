package com.example.android.news;

public class News {
    private String mTitle;
    private String mSection;
    private String mType;
    private String mAuthor;
    private String mDatePublished;
    private String mUrl;

    /**
     * Create a News object
     * @param title name of article
     * @param section section article was found in
     * @param type the type of article
     * @param date date the article was published
     * @param author the author of the article, can be null
     * @param url the url of the article
     */
    public News(String title, String section, String type, String date, String author, String url) {
        this.mTitle = title;
        this.mSection = section;
        this.mType = type;
        this.mDatePublished = date;
        this.mAuthor = author;
        this.mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getType() {
        return mType;
    }


    public String getAuthor() {
        return mAuthor;
    }

    public String getDatePublished() {
        return mDatePublished;
    }

    public String getUrl() {
        return mUrl;
    }
}
