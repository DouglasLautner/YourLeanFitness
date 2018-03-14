package com.leanfitness.leanfitness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

/**
 * Created by ndabhi on 3/13/2018.
 */

public class ExcerciseDetailActivity extends YouTubeBaseActivity
        implements YouTubePlayer.OnInitializedListener {
    private static final int RECOVERY_REQUEST = 1;
    private YouTubePlayerView mPlayerView;
    private ExerciseInfo mInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.excercise_detail);
        mInfo = (ExerciseInfo)getIntent().getSerializableExtra("Data");
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if(mInfo != null) {
            updateData();
        }
        mPlayerView = (YouTubePlayerView)findViewById(R.id.youtube_view);
        mPlayerView.initialize(Config.YOUTUBE_API_KEY, this);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private void updateData() {
        ((TextView)findViewById(R.id.item_name)).setText(mInfo.getName());
        ((TextView)findViewById(R.id.item_desc)).setText(mInfo.getDesc());
        ((TextView)findViewById(R.id.item_summary)).setText(mInfo.getSummary());
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        if(!b) {
            youTubePlayer.cueVideo(mInfo.getVideo());
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult reason) {
        if(reason.isUserRecoverableError()) {
            reason.getErrorDialog(this, RECOVERY_REQUEST).show();
        }else {
            String error = String.format(getString(R.string.player_error), reason.toString());
            Toast.makeText(this, error, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == RECOVERY_REQUEST) {
            mPlayerView.initialize(Config.YOUTUBE_API_KEY, this);
        }
    }
}
