package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzll;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzzv;
import p034.p095.C1687;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public zzll f2536;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public VideoLifecycleCallbacks f2537;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Object f2538 = new Object();

    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public final float getAspectRatio() {
        synchronized (this.f2538) {
            zzll zzllVar = this.f2536;
            if (zzllVar == null) {
                return 0.0f;
            }
            try {
                return zzllVar.getAspectRatio();
            } catch (RemoteException e) {
                zzakb.zzb("Unable to call getAspectRatio on video controller.", e);
                return 0.0f;
            }
        }
    }

    public final int getPlaybackState() {
        synchronized (this.f2538) {
            zzll zzllVar = this.f2536;
            if (zzllVar == null) {
                return 0;
            }
            try {
                return zzllVar.getPlaybackState();
            } catch (RemoteException e) {
                zzakb.zzb("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    public final VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.f2538) {
            videoLifecycleCallbacks = this.f2537;
        }
        return videoLifecycleCallbacks;
    }

    public final boolean hasVideoContent() {
        boolean z;
        synchronized (this.f2538) {
            z = this.f2536 != null;
        }
        return z;
    }

    public final boolean isClickToExpandEnabled() {
        synchronized (this.f2538) {
            zzll zzllVar = this.f2536;
            if (zzllVar == null) {
                return false;
            }
            try {
                return zzllVar.isClickToExpandEnabled();
            } catch (RemoteException e) {
                zzakb.zzb("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public final boolean isCustomControlsEnabled() {
        synchronized (this.f2538) {
            zzll zzllVar = this.f2536;
            if (zzllVar == null) {
                return false;
            }
            try {
                return zzllVar.isCustomControlsEnabled();
            } catch (RemoteException e) {
                zzakb.zzb("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public final boolean isMuted() {
        synchronized (this.f2538) {
            zzll zzllVar = this.f2536;
            if (zzllVar == null) {
                return true;
            }
            try {
                return zzllVar.isMuted();
            } catch (RemoteException e) {
                zzakb.zzb("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    public final void mute(boolean z) {
        synchronized (this.f2538) {
            zzll zzllVar = this.f2536;
            if (zzllVar == null) {
                return;
            }
            try {
                zzllVar.mute(z);
            } catch (RemoteException e) {
                zzakb.zzb("Unable to call mute on video controller.", e);
            }
        }
    }

    public final void pause() {
        synchronized (this.f2538) {
            zzll zzllVar = this.f2536;
            if (zzllVar == null) {
                return;
            }
            try {
                zzllVar.pause();
            } catch (RemoteException e) {
                zzakb.zzb("Unable to call pause on video controller.", e);
            }
        }
    }

    public final void play() {
        synchronized (this.f2538) {
            zzll zzllVar = this.f2536;
            if (zzllVar == null) {
                return;
            }
            try {
                zzllVar.play();
            } catch (RemoteException e) {
                zzakb.zzb("Unable to call play on video controller.", e);
            }
        }
    }

    public final void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        C1687.m3726(videoLifecycleCallbacks, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.f2538) {
            this.f2537 = videoLifecycleCallbacks;
            zzll zzllVar = this.f2536;
            if (zzllVar == null) {
                return;
            }
            try {
                zzllVar.zza(new zzmq(videoLifecycleCallbacks));
            } catch (RemoteException e) {
                zzakb.zzb("Unable to call setVideoLifecycleCallbacks on video controller.", e);
            }
        }
    }

    public final void zza(zzll zzllVar) {
        synchronized (this.f2538) {
            this.f2536 = zzllVar;
            VideoLifecycleCallbacks videoLifecycleCallbacks = this.f2537;
            if (videoLifecycleCallbacks != null) {
                setVideoLifecycleCallbacks(videoLifecycleCallbacks);
            }
        }
    }

    public final zzll zzbj() {
        zzll zzllVar;
        synchronized (this.f2538) {
            zzllVar = this.f2536;
        }
        return zzllVar;
    }
}
