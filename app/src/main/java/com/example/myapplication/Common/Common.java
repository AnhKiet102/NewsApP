package com.example.myapplication.Common;

import com.example.myapplication.Interface.IconBetterIdeaService;
import com.example.myapplication.Interface.NewsService;
import com.example.myapplication.Model.IconBetterIdea;
import com.example.myapplication.Remote.IconBetterIdeaClient;
import com.example.myapplication.Remote.RetrofitClient;

public class Common {
    private  static  final String BASE_URL="https://newsapi.org/";
    public static final String API_KEY="17075b0e768b4cb0aaabf74d419139d8";
    public static NewsService getNewsService()
    {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }
    public static IconBetterIdeaService getIconService()
    {
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }
}
