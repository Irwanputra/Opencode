package ads_mobile_sdk;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import dev.epro.r0.H9390398899829886498;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W5797197595347441198;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class qk extends dr {
    public final Context l;
    public final ri m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(Context context, jr0 jr0Var, ri riVar, W5797197595347441198 w5797197595347441198, O16637889491137121389 o16637889491137121389, kz2 kz2Var, g0 g0Var) {
        super(o16637889491137121389, w5797197595347441198, kz2Var, jr0Var, g0Var);
        context.getClass();
        jr0Var.getClass();
        riVar.getClass();
        w5797197595347441198.getClass();
        o16637889491137121389.getClass();
        kz2Var.getClass();
        g0Var.getClass();
        this.l = context;
        this.m = riVar;
    }

    @Override // dev.epro.r0.K4548097313143615345
    /* renamed from: a */
    public final cw0 mo19a() {
        return cw0.AUDIO;
    }

    @Override // dev.epro.r0.K4548097313143615345
    public final Object d(R4833348786910499294 r4833348786910499294) {
        H9390398899829886498 h9390398899829886498;
        Double d;
        Double d2;
        AudioManager audioManager = (AudioManager) this.l.getSystemService(AudioManager.class);
        int streamVolume = audioManager.getStreamVolume(3);
        jr0 jr0Var = this.f;
        jr0Var.getClass();
        if (((Boolean) jr0Var.a("gads:normalized_device_volume:enabled", Boolean.FALSE, ao.a$11)).booleanValue()) {
            int streamMinVolume = Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0;
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            if (streamMinVolume > streamVolume || streamVolume > streamMaxVolume) {
                d2 = new Double(-2.0d);
            } else {
                d2 = new Double(streamMinVolume == streamMaxVolume ? 1.0d : ((int) (((streamVolume - streamMinVolume) / (streamMaxVolume - streamMinVolume)) * 100.0d)) / 100.0d);
            }
            h9390398899829886498 = new H9390398899829886498(new Integer(streamMinVolume), new Integer(streamMaxVolume));
            d = d2;
        } else {
            h9390398899829886498 = null;
            d = null;
        }
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int ringerMode = audioManager.getRingerMode();
        int streamVolume2 = audioManager.getStreamVolume(2);
        ri riVar = this.m;
        return new xu0(new pk(mode, isMusicActive, isSpeakerphoneOn, streamVolume, h9390398899829886498, ringerMode, streamVolume2, riVar.c, riVar.d, d));
    }
}
