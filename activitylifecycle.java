packagecom.example.activity;
import 
androidx.appcompat.app.AppCompatActivity;import
android.os.Bundle;
importandroid.util.Log;
publicclassMainActivityextendsAppCompatActivity{@
Override
protectedvoidonCreate(BundlesavedInstanceState){su
per.onCreate(savedInstanceState);setContentView(
R.layout.activity_main);Log.d("lifecycle","onCreat
einvoked");
}
protected void 
onStart(){super.onStart();Log.d("life
cycle","onStartinvoked");
}
protected void onResume() 
{super.onResume();
Log.d("lifecycle","onResumeinvoked");
}
protected void 
onPause(){super.onPause();Log.d("lif
ecycle","onPauseinvoked");
}
protected void 
onStop(){super.onStop();Log.d("life
cycle","onStopinvoked");
}
protected void 
onRestart(){super.onRestart();Log.d("li
fecycle","onRestartinvoked");
}
protected void 
onDestroy(){super.onDestroy();Log.d("life
cycle","onDestroyinvoked");}}
