package co.zsly;

import android.os.Bundle;
//import android.view.KeyEvent;
//import android.app.Activity;
//import android.app.AlertDialog;
//import android.content.DialogInterface;
//import android.content.DialogInterface.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import org.apache.cordova.*;

public class MainActivity extends DroidGap{
	
	  public void onCreate(Bundle savedInstanceState)
	  {
	    super.onCreate(savedInstanceState);
	    super.setIntegerProperty("splashscreen", R.drawable.splash);
	    
	    super.loadUrl("http://218.5.76.176/mobile/fenlei", 5000);
	  }
	    
	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	            menu.add(0,1,1,R.string.about);
	            menu.add(0,2,2,R.string.navigation);
	            menu.add(0,3,3,R.string.returnPage);
	            menu.add(0,4,4,R.string.exit);
	            // TODO Auto-generated method stub
	            return super.onCreateOptionsMenu(menu);
	    }

	    @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	            if(item.getItemId()==4){
	            	super.loadUrl("javascript:showconfirmexit()");
	                    //finish();
	            }
	            if(item.getItemId()==3){
	            	//Ë¢ÐÂ
	            	//onBackPressed();
	            	//super.goBack();
	            	super.loadUrl("javascript:location.reload()");
	            	//super.loadUrl("javascript:window.history.forward()");
                    //super.loadUrl("javascript:window.history.forward()");
	            }
	            if(item.getItemId()==1){
                    super.loadUrl("http://218.5.76.176/mobile/about");
	            }
	            if(item.getItemId()==2){
	                    super.loadUrl("http://218.5.76.176/mobile/fenlei");
	            }
	            return super.onOptionsItemSelected(item);
	    }}
