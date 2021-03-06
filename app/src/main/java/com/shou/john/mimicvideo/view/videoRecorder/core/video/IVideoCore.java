package com.shou.john.mimicvideo.view.videoRecorder.core.video;

import android.graphics.SurfaceTexture;

import com.shou.john.mimicvideo.view.videoRecorder.core.listener.IVideoChange;
import com.shou.john.mimicvideo.view.videoRecorder.encoder.MediaMuxerWrapper;
import com.shou.john.mimicvideo.view.videoRecorder.model.RecordConfig;

/**
 * Created by lake on 16-5-25.
 */
public interface IVideoCore {
    int OVERWATCH_TEXTURE_ID = 10;
    boolean prepare(RecordConfig resConfig);

    void updateCamTexture(SurfaceTexture camTex);

    void startPreview(SurfaceTexture surfaceTexture, int visualWidth, int visualHeight);

    void updatePreview(int visualWidth, int visualHeight);

    void stopPreview(boolean releaseTexture);

    boolean startRecording(MediaMuxerWrapper muxer);

    boolean stopRecording();

    boolean destroy();

    void setCurrentCamera(int cameraIndex);

    void setVideoChangeListener(IVideoChange listener);
}
