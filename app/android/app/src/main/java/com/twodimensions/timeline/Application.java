package com.twodimensions.timeline;

import io.flutter.app.FlutterApplication;
import com.najva.najvaflutter.NajvaFlutterMessagingService;
import com.najva.najvaflutter.NajvaflutterPlugin;
import io.flutter.plugin.common.PluginRegistry.PluginRegistrantCallback;
import io.flutter.plugin.common.PluginRegistry;

public class Application extends FlutterApplication implements PluginRegistrantCallback {
    @Override
    public void onCreate() {
        super.onCreate();
        NajvaFlutterMessagingService.setPluginRegistrant(this);
    }

    @Override
    public void registerWith(PluginRegistry registry) {
        NajvaflutterPlugin.registerWith(registry.registrarFor("com.najva.najvaflutter.NajvaflutterPlugin"));
    }
}
