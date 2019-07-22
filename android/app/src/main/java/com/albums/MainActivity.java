package com.albums;

import com.facebook.react.ReactActivity;
import android.Manifest;
// import android.annotation.IntDef;
// import android.annotation.NonNull;
// import android.annotation.Nullable;
// import android.annotation.RequiresPermission;
// import android.annotation.SystemApi;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import com.facebook.react.modules.core.DeviceEventManagerModule;
// import android.os.ServiceManager;
import android.telephony.TelephonyManager;
import android.telephony.euicc.EuiccManager;
// import android.telephony.euicc.IEuiccController;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import android.util.Log;

import static android.content.Context.*;


public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "albums";
    }
    protected void sendInfo(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);

       WritableMap params = Arguments.createMap(); // add here the data you want to send
        params.putString("event", "test");

        getReactInstanceManager().getCurrentReactContext()
                .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
                .emit("check", params);
    }

    //   void testFunction(Context context ){
    //     EuiccManager mgr = (EuiccManager) context.getSystemService(Context.EUICC_SERVICE);
    // Boolean isEnabled = mgr.isEnabled();
       
    // }
    //  protected class Test {
         
    // private final Context mContext;
    //        private Test(Context context ) {
    //             super(context);
    //     EuiccManager mgr = (EuiccManager) context.getSystemService(Context.EUICC_SERVICE);
    // Boolean isEnabled = mgr.isEnabled();
    //       mContext = context;
    //       WritableMap map = Arguments.createMap();
    //         map.putString("esimCheck", isEnabled.toString());
    //          try {
    //        getReactInstanceManager().getCurrentReactContext()   
    //       .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
    //       .emit("customEventName", map);

    //         } catch (Exception e){
    //           Log.e("ReactNative", "Caught Exception: " + e.getMessage());
    //         }
    // }
    //  }
}
