package com.example.android.newsapp;

import com.example.android.newsapp.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse>
{
    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);
}
