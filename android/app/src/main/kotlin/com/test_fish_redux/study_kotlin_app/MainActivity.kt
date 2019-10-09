package com.test_fish_redux.study_kotlin_app

import android.os.Bundle
import custom.plugins.BackDesktop

import io.flutter.app.FlutterActivity
import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity: FlutterActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    GeneratedPluginRegistrant.registerWith(this)
    BackDesktop.registerWithBackDesktop(this)
  }
}
