package custom.plugins;

import io.flutter.app.FlutterActivity;
import io.flutter.plugin.common.MethodChannel;

public class BackDesktop {
    private static final String channelName = "android.back.desktop";
    private static final String backEventName = "backDesktop";

    public static void registerWithBackDesktop(FlutterActivity activity) {
        new MethodChannel(activity.getFlutterView(), channelName).setMethodCallHandler(
                (methodCall, result) -> {
                    if (methodCall.method.equals(backEventName)) {
                        activity.moveTaskToBack(false);
                        result.success(true);
                    }
                }
        );
    }
}
