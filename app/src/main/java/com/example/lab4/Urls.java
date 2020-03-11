package com.example.marss;

import com.orm.SugarRecord;

public class Urls extends SugarRecord<Urls> {
    public String RssUrl;

    public Urls(String rssUrl) {
        this.RssUrl = rssUrl;
    }

    public Urls()
    {}
}