package com.albums;

import com.facebook.react.ReactActivity;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "albums";
    }
       @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            WritableMap map = Arguments.createMap();
            map.putString("key1", "Value1");

        try {
           getReactInstanceManager().getCurrentReactContext()   
          .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
          .emit("customEventName", map);

            } catch (Exception e){
              Log.e("ReactNative", "Caught Exception: " + e.getMessage());
            }
}
