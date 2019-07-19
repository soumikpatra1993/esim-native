package com.albums;


import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.IllegalViewOperationException;


public class HelloWorldModule extends ReactContextBaseJavaModule {

    public HelloWorldModule(ReactApplicationContext reactContext) {
        super(reactContext); //required by React Native
    }

    @Override
    //getName is required to define the name of the module represented in JavaScript
    public String getName() {
        return "HelloWorld";
    }
  
    @ReactMethod
    public void sayHi(Callback errorCallback, Callback successCallback) {
        try {
            System.out.println("Greetings from Java");
            successCallback.invoke("Callback : Greetings from Java");
        } catch (IllegalViewOperationException e) {
            errorCallback.invoke(e.getMessage());
        }
    }
    //   public EuiccManager(Context context , Callback errorCallback, Callback successCallback) {
    //     mContext = context;
    //     TelephonyManager tm = (TelephonyManager)
    //             context.getSystemService(Context.TELEPHONY_SERVICE);
    //     mCardId = tm.getCardIdForDefaultEuicc();
    //        EuiccManager mgr = (EuiccManager) context.getSystemService(Context.EUICC_SERVICE);
    // boolean isEnabled = mgr.isEnabled();
    //  if(isEnabled){
    //         successCallback.invoke(isEnabled);
    //  }
    //   errorCallback.invoke(isEnabled)
    // }
 
}