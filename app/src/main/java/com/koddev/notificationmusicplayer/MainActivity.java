
package com.koddev.notificationmusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.koddev.notificationmusicplayer.Services.OnClearFromRecentService;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Playable {

    ImageButton play;
    TextView title;

    NotificationManager notificationManager;

    List<Track> tracks;