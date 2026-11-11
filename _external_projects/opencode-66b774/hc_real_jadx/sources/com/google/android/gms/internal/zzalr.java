package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.zzbs;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p131.p161.p162.p193.p205.p209.C2510;

@zzzv
@TargetApi(14)
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzalr extends zzamb implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {
    private static final Map<Integer, String> zzdfu;
    private final zzamq zzdfv;
    private final boolean zzdfw;
    private int zzdfx;
    private int zzdfy;
    private MediaPlayer zzdfz;
    private Uri zzdga;
    private int zzdgb;
    private int zzdgc;
    private int zzdgd;
    private int zzdge;
    private int zzdgf;
    private zzamn zzdgg;
    private boolean zzdgh;
    private int zzdgi;
    private zzama zzdgj;

    static {
        HashMap hashMap = new HashMap();
        zzdfu = hashMap;
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            hashMap.put(-1004, "MEDIA_ERROR_IO");
            hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
            hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
            hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (i >= 19) {
            hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public zzalr(Context context, boolean z, boolean z2, zzamo zzamoVar, zzamq zzamqVar) {
        super(context);
        this.zzdfx = 0;
        this.zzdfy = 0;
        setSurfaceTextureListener(this);
        this.zzdfv = zzamqVar;
        this.zzdgh = z;
        this.zzdfw = z2;
        zzamqVar.zza(this);
    }

    private final void zza(float f) {
        MediaPlayer mediaPlayer = this.zzdfz;
        if (mediaPlayer == null) {
            zzakb.zzcu("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        }
    }

    private final void zzab(boolean z) {
        zzagf.v("AdMediaPlayerView release");
        zzamn zzamnVar = this.zzdgg;
        if (zzamnVar != null) {
            zzamnVar.zzsb();
            this.zzdgg = null;
        }
        MediaPlayer mediaPlayer = this.zzdfz;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzdfz.release();
            this.zzdfz = null;
            zzaf(0);
            if (z) {
                this.zzdfy = 0;
                this.zzdfy = 0;
            }
        }
    }

    private final void zzaf(int i) {
        if (i == 3) {
            this.zzdfv.zzsn();
            this.zzdgq.zzsn();
        } else if (this.zzdfx == 3) {
            this.zzdfv.zzso();
            this.zzdgq.zzso();
        }
        this.zzdfx = i;
    }

    private final void zzrj() {
        zzagf.v("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzdga == null || surfaceTexture == null) {
            return;
        }
        zzab(false);
        try {
            zzbs.zzex();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.zzdfz = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zzdfz.setOnCompletionListener(this);
            this.zzdfz.setOnErrorListener(this);
            this.zzdfz.setOnInfoListener(this);
            this.zzdfz.setOnPreparedListener(this);
            this.zzdfz.setOnVideoSizeChangedListener(this);
            this.zzdgd = 0;
            if (this.zzdgh) {
                zzamn zzamnVar = new zzamn(getContext());
                this.zzdgg = zzamnVar;
                zzamnVar.zza(surfaceTexture, getWidth(), getHeight());
                this.zzdgg.start();
                SurfaceTexture zzsc = this.zzdgg.zzsc();
                if (zzsc != null) {
                    surfaceTexture = zzsc;
                } else {
                    this.zzdgg.zzsb();
                    this.zzdgg = null;
                }
            }
            this.zzdfz.setDataSource(getContext(), this.zzdga);
            zzbs.zzey();
            this.zzdfz.setSurface(new Surface(surfaceTexture));
            this.zzdfz.setAudioStreamType(3);
            this.zzdfz.setScreenOnWhilePlaying(true);
            this.zzdfz.prepareAsync();
            zzaf(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            String valueOf = String.valueOf(this.zzdga);
            StringBuilder sb = new StringBuilder(valueOf.length() + 36);
            sb.append("Failed to initialize MediaPlayer at ");
            sb.append(valueOf);
            zzakb.zzc(sb.toString(), e);
            onError(this.zzdfz, 1, 0);
        }
    }

    private final void zzrk() {
        if (this.zzdfw && zzrl() && this.zzdfz.getCurrentPosition() > 0 && this.zzdfy != 3) {
            zzagf.v("AdMediaPlayerView nudging MediaPlayer");
            zza(0.0f);
            this.zzdfz.start();
            int currentPosition = this.zzdfz.getCurrentPosition();
            ((C2510) zzbs.zzeo()).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            while (zzrl() && this.zzdfz.getCurrentPosition() == currentPosition) {
                ((C2510) zzbs.zzeo()).getClass();
                if (System.currentTimeMillis() - currentTimeMillis > 250) {
                    break;
                }
            }
            this.zzdfz.pause();
            zzrm();
        }
    }

    private final boolean zzrl() {
        int i;
        return (this.zzdfz == null || (i = this.zzdfx) == -1 || i == 0 || i == 1) ? false : true;
    }

    @Override // com.google.android.gms.internal.zzamb
    public final int getCurrentPosition() {
        if (zzrl()) {
            return this.zzdfz.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.zzamb
    public final int getDuration() {
        if (zzrl()) {
            return this.zzdfz.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.zzamb
    public final int getVideoHeight() {
        MediaPlayer mediaPlayer = this.zzdfz;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.zzamb
    public final int getVideoWidth() {
        MediaPlayer mediaPlayer = this.zzdfz;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.zzdgd = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        zzagf.v("AdMediaPlayerView completion");
        zzaf(5);
        this.zzdfy = 5;
        zzahn.zzdaw.post(new zzalt(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Map<Integer, String> map = zzdfu;
        String str = map.get(Integer.valueOf(i));
        String str2 = map.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str).length() + 38);
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzakb.zzcu(sb.toString());
        zzaf(-1);
        this.zzdfy = -1;
        zzahn.zzdaw.post(new zzalu(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Map<Integer, String> map = zzdfu;
        String str = map.get(Integer.valueOf(i));
        String str2 = map.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str).length() + 37);
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzagf.v(sb.toString());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r1 > r6) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.zzdgb
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)
            int r1 = r5.zzdgc
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)
            int r2 = r5.zzdgb
            if (r2 <= 0) goto L83
            int r2 = r5.zzdgc
            if (r2 <= 0) goto L83
            com.google.android.gms.internal.zzamn r2 = r5.zzdgg
            if (r2 != 0) goto L83
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L47
            if (r1 != r2) goto L47
            int r0 = r5.zzdgb
            int r1 = r0 * r7
            int r2 = r5.zzdgc
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r0 * r7
            int r0 = r0 / r2
            goto L6a
        L3c:
            int r1 = r0 * r7
            int r3 = r6 * r2
            if (r1 <= r3) goto L67
            int r2 = r2 * r6
            int r1 = r2 / r0
            goto L58
        L47:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L5a
            int r0 = r5.zzdgc
            int r0 = r0 * r6
            int r2 = r5.zzdgb
            int r0 = r0 / r2
            if (r1 != r3) goto L57
            if (r0 <= r7) goto L57
            goto L67
        L57:
            r1 = r0
        L58:
            r0 = r6
            goto L83
        L5a:
            if (r1 != r2) goto L6c
            int r1 = r5.zzdgb
            int r1 = r1 * r7
            int r2 = r5.zzdgc
            int r1 = r1 / r2
            if (r0 != r3) goto L69
            if (r1 <= r6) goto L69
        L67:
            r0 = r6
            goto L6a
        L69:
            r0 = r1
        L6a:
            r1 = r7
            goto L83
        L6c:
            int r2 = r5.zzdgb
            int r4 = r5.zzdgc
            if (r1 != r3) goto L78
            if (r4 <= r7) goto L78
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L7a
        L78:
            r1 = r2
            r7 = r4
        L7a:
            if (r0 != r3) goto L69
            if (r1 <= r6) goto L69
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L58
        L83:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.zzamn r6 = r5.zzdgg
            if (r6 == 0) goto L8d
            r6.zzh(r0, r1)
        L8d:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 16
            if (r6 != r7) goto La6
            int r6 = r5.zzdge
            if (r6 <= 0) goto L99
            if (r6 != r0) goto L9f
        L99:
            int r6 = r5.zzdgf
            if (r6 <= 0) goto La2
            if (r6 == r1) goto La2
        L9f:
            r5.zzrk()
        La2:
            r5.zzdge = r0
            r5.zzdgf = r1
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzalr.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        zzagf.v("AdMediaPlayerView prepared");
        zzaf(2);
        this.zzdfv.zzro();
        zzahn.zzdaw.post(new zzals(this));
        this.zzdgb = mediaPlayer.getVideoWidth();
        this.zzdgc = mediaPlayer.getVideoHeight();
        int i = this.zzdgi;
        if (i != 0) {
            seekTo(i);
        }
        zzrk();
        int i2 = this.zzdgb;
        int i3 = this.zzdgc;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        zzakb.zzct(sb.toString());
        if (this.zzdfy == 3) {
            play();
        }
        zzrm();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzagf.v("AdMediaPlayerView surface created");
        zzrj();
        zzahn.zzdaw.post(new zzalv(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzagf.v("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzdfz;
        if (mediaPlayer != null && this.zzdgi == 0) {
            this.zzdgi = mediaPlayer.getCurrentPosition();
        }
        zzamn zzamnVar = this.zzdgg;
        if (zzamnVar != null) {
            zzamnVar.zzsb();
        }
        zzahn.zzdaw.post(new zzalx(this));
        zzab(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzagf.v("AdMediaPlayerView surface changed");
        boolean z = this.zzdfy == 3;
        boolean z2 = this.zzdgb == i && this.zzdgc == i2;
        if (this.zzdfz != null && z && z2) {
            int i3 = this.zzdgi;
            if (i3 != 0) {
                seekTo(i3);
            }
            play();
        }
        zzamn zzamnVar = this.zzdgg;
        if (zzamnVar != null) {
            zzamnVar.zzh(i, i2);
        }
        zzahn.zzdaw.post(new zzalw(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzdfv.zzb(this);
        this.zzdgp.zza(surfaceTexture, this.zzdgj);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        zzagf.v(sb.toString());
        this.zzdgb = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzdgc = videoHeight;
        if (this.zzdgb == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // com.google.android.gms.internal.zzamb
    public final void pause() {
        zzagf.v("AdMediaPlayerView pause");
        if (zzrl() && this.zzdfz.isPlaying()) {
            this.zzdfz.pause();
            zzaf(4);
            zzahn.zzdaw.post(new zzalz(this));
        }
        this.zzdfy = 4;
    }

    @Override // com.google.android.gms.internal.zzamb
    public final void play() {
        zzagf.v("AdMediaPlayerView play");
        if (zzrl()) {
            this.zzdfz.start();
            zzaf(3);
            this.zzdgp.zzrp();
            zzahn.zzdaw.post(new zzaly(this));
        }
        this.zzdfy = 3;
    }

    @Override // com.google.android.gms.internal.zzamb
    public final void seekTo(int i) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        zzagf.v(sb.toString());
        if (!zzrl()) {
            this.zzdgi = i;
        } else {
            this.zzdfz.seekTo(i);
            this.zzdgi = 0;
        }
    }

    @Override // com.google.android.gms.internal.zzamb
    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zzil zzd = zzil.zzd(parse);
        if (zzd != null) {
            parse = Uri.parse(zzd.url);
        }
        this.zzdga = parse;
        this.zzdgi = 0;
        zzrj();
        requestLayout();
        invalidate();
    }

    @Override // com.google.android.gms.internal.zzamb
    public final void stop() {
        zzagf.v("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzdfz;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzdfz.release();
            this.zzdfz = null;
            zzaf(0);
            this.zzdfy = 0;
        }
        this.zzdfv.onStop();
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzalr.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.zzamb
    public final void zza(float f, float f2) {
        zzamn zzamnVar = this.zzdgg;
        if (zzamnVar != null) {
            zzamnVar.zzb(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.zzamb
    public final void zza(zzama zzamaVar) {
        this.zzdgj = zzamaVar;
    }

    @Override // com.google.android.gms.internal.zzamb
    public final String zzri() {
        String str = this.zzdgh ? " spherical" : "";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    @Override // com.google.android.gms.internal.zzamb, com.google.android.gms.internal.zzamt
    public final void zzrm() {
        zza(this.zzdgq.getVolume());
    }
}
