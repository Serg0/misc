package com.example.tabhost_exemple;

import android.app.TabActivity;
import android.content.Intent;
import android.util.Log;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Tab_Activity extends TabActivity {
	
	protected void onCreate(android.os.Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
	TabHost tabHost = getTabHost();	
    
    // Tab for Photos
    TabSpec photospec = tabHost.newTabSpec("A");
    // setting Title and Icon for the Tab
    photospec.setIndicator("Photos", getResources().getDrawable(R.drawable.icon_photos_tab));
    Intent photosIntent = new Intent(this, A_activity.class);
    Log.d("LOG", "CurrentTab "+getTabHost().getCurrentTab());
    photosIntent.putExtra("position", getTabHost().getTabWidget().getChildCount());
    photospec.setContent(photosIntent);
    
    // Tab for Songs
    TabSpec songspec = tabHost.newTabSpec("B");
    songspec.setIndicator("Songs", getResources().getDrawable(R.drawable.icon_songs_tab));
    Intent songsIntent = new Intent(this, B_activity.class);
    songsIntent.putExtra("position", getTabHost().getCurrentTab());
    Log.d("LOG", "CurrentTab "+getTabHost().getCurrentTab());
    songspec.setContent(songsIntent);

    // Tab for Videos
    TabSpec videospec = tabHost.newTabSpec("C");
    videospec.setIndicator("Videos", getResources().getDrawable(R.drawable.icon_videos_tab));
    Intent videosIntent = new Intent(this, C_activity.class);
    videosIntent.putExtra("position", getTabHost().getCurrentTab());
    Log.d("LOG", "CurrentTab "+getTabHost().getCurrentTab());
    videospec.setContent(videosIntent);

    // Adding all TabSpec to TabHost
    tabHost.addTab(photospec); // Adding photos tab
    tabHost.addTab(songspec); // Adding songs tab
    tabHost.addTab(videospec); // Adding videos tab
	};

}
