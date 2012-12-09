package com.example.tabhost_exemple;

import java.util.ArrayList;
import java.util.List;
import android.content.DialogInterface;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.AlertDialog.Builder;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toast;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import android.widget.TabHost;

public class MainActivity extends Activity  {
public static MainActivity instance;
private Dialog myDialog;
final Context context = this;
Intent intent;
@Override
public void onConfigurationChanged(Configuration newConfig) {


    super.onConfigurationChanged(newConfig);
}
@Override
protected void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    
}

@Override
protected void onRestoreInstanceState(Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main2);
//        Button a = (Button) findViewById(R.id.button1);
//        a.setText("Show TABS");
//        a.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				  getTabs();				
//				  
//			}
//		});
//        Button b = (Button) findViewById(R.id.button2);
//        b.setText("ViewPager");
//        b.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				setViewPager();				
//			}
//		});
//        
    
//      setViewPager();
//        Builder AD = new AlertDialog.Builder(this);
        findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
			

			@Override
			public void onClick(View v) {
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						context);
				alertDialogBuilder.setTitle(R.string.dialog1_title);
				View view = LayoutInflater.from(context).inflate(R.layout.custom_layout, null );
				alertDialogBuilder.setView(view);
				alertDialogBuilder.setCancelable(false)
				.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						// if this button is clicked, close
						// current activity
						MainActivity.this.finish();
					}
				  })
				.setNegativeButton("No",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						// if this button is clicked, just close
						// the dialog box and do nothing
						dialog.cancel();
					}
				})
				.setNeutralButton("%)", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
//						Toast.makeText(context, "ololo", Toast.LENGTH_LONG).show();
//						dialog.
						
					}
				});
//				alertDialogBuilder.setCancelable(true);
				 AlertDialog alertDialog = alertDialogBuilder.create();

				    alertDialog.show();
				
			}
		});
        
        findViewById(R.id.button2).setOnClickListener(new OnClickListener() {
			

			@Override
			public void onClick(View v) {
//				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
//						context);
//				alertDialogBuilder.setTitle(R.string.dialog1_title);
//				View view = LayoutInflater.from(context).inflate(R.layout.custom_layout, null );
//				alertDialogBuilder.setView(view);
////				alertDialogBuilder.setCancelable(true);
//				 AlertDialog alertDialog = alertDialogBuilder.create();
//				 
//
//				    alertDialog.show();
				
				intent = new Intent(MainActivity.this, Tab_Activity.class);
				startActivity(intent);
//				
			}
		});
        
    instance = this;
    }
    
    

    public static MainActivity getInstance() {
		return instance;
	}
    
    
    
    private void setViewPager() {
		// TODO Auto-generated method stub
    	 LayoutInflater inflater = LayoutInflater.from(this);
         List<View> pages = new ArrayList<View>();
         
         View page = inflater.inflate(R.layout.page, null);
         TextView textView = (TextView) page.findViewById(R.id.text_view);
         textView.setText("Страница 1");
         pages.add(page);
         
         page = inflater.inflate(R.layout.page, null);
         textView = (TextView) page.findViewById(R.id.text_view);
         textView.setText("Страница 2");
         pages.add(page);
         
         page = inflater.inflate(R.layout.page, null);
         textView = (TextView) page.findViewById(R.id.text_view);
         textView.setText("Страница 3");
         pages.add(page);
         textView.setText("!!!!!!!!!!");
         
         SamplePagerAdapter pagerAdapter = new SamplePagerAdapter(pages);
         ViewPager viewPager = new ViewPager(this);
         viewPager.setAdapter(pagerAdapter);
         viewPager.setCurrentItem(1);     
         
         setContentView(viewPager);
         
         
	}
//    public  void getTabs() {
//    	// TODO Auto-generated method stub
//    	
//        TabHost tabHost = getTabHost();	
//        
//        // Tab for Photos
//        TabSpec photospec = tabHost.newTabSpec("A");
//        // setting Title and Icon for the Tab
//        photospec.setIndicator("Photos", getResources().getDrawable(R.drawable.icon_photos_tab));
//        Intent photosIntent = new Intent(this, A_activity.class);
//        Log.d("LOG", "CurrentTab "+getTabHost().getCurrentTab());
//        photosIntent.putExtra("position", getTabHost().getTabWidget().getChildCount());
//        photospec.setContent(photosIntent);
//        
//        // Tab for Songs
//        TabSpec songspec = tabHost.newTabSpec("B");
//        songspec.setIndicator("Songs", getResources().getDrawable(R.drawable.icon_songs_tab));
//        Intent songsIntent = new Intent(this, B_activity.class);
//        songsIntent.putExtra("position", getTabHost().getCurrentTab());
//        Log.d("LOG", "CurrentTab "+getTabHost().getCurrentTab());
//        songspec.setContent(songsIntent);
//
//        // Tab for Videos
//        TabSpec videospec = tabHost.newTabSpec("C");
//        videospec.setIndicator("Videos", getResources().getDrawable(R.drawable.icon_videos_tab));
//        Intent videosIntent = new Intent(this, C_activity.class);
//        videosIntent.putExtra("position", getTabHost().getCurrentTab());
//        Log.d("LOG", "CurrentTab "+getTabHost().getCurrentTab());
//        videospec.setContent(videosIntent);
//
//        // Adding all TabSpec to TabHost
//        tabHost.addTab(photospec); // Adding photos tab
//        tabHost.addTab(songspec); // Adding songs tab
//        tabHost.addTab(videospec); // Adding videos tab
//    }
//    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
