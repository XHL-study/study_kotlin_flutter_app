import 'dart:io';

import 'package:flutter/cupertino.dart';
import 'package:flutter/services.dart';

///
/// 安卓 - 返回手机桌面
///
class AndroidBackDesktop {
  static final String _channelName = "android.back.desktop";
  static final String _backEventName = "backDesktop";
  static final _platform = MethodChannel(_channelName);

  static Future<bool> backDeskTop() async {
    if (Platform.isFuchsia || Platform.isAndroid) {
      try {
        await _platform.invokeMethod(_backEventName);
        return false;
      } on PlatformException catch (e) {
        debugPrint("回到桌面失败：${e.toString()}");
      }
      return true;
    }
    return true;
  }
}
