package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class qk extends ads_mobile_sdk.dr {
    public final android.content.Context l;
    public final ads_mobile_sdk.ri m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(android.content.Context context, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.ri riVar, dev.epro.r0.W5797197595347441198 w5797197595347441198, dev.epro.r0.O16637889491137121389 o16637889491137121389, ads_mobile_sdk.kz2 kz2Var, ads_mobile_sdk.g0 g0Var) {
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

    public final ads_mobile_sdk.cw0 a() {
        return ads_mobile_sdk.cw0.AUDIO;
    }

    public final java.lang.Object d(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        dev.epro.r0.H9390398899829886498 h9390398899829886498;
        java.lang.Double d;
        java.lang.Double d2;
        android.media.AudioManager audioManager = (android.media.AudioManager) this.l.getSystemService(android.media.AudioManager.class);
        int streamVolume = audioManager.getStreamVolume(3);
        ads_mobile_sdk.jr0 jr0Var = this.f;
        jr0Var.getClass();
        if (((java.lang.Boolean) jr0Var.a("gads:normalized_device_volume:enabled", java.lang.Boolean.FALSE, ads_mobile_sdk.ao.a$11)).booleanValue()) {
            int iA = android.os.Build.VERSION.SDK_INT >= 28 ? dev.epro.r0.U14881866531452519068.a(audioManager) : 0;
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            if (iA > streamVolume || streamVolume > streamMaxVolume) {
                d2 = new java.lang.Double(-2.0d);
            } else {
                d2 = new java.lang.Double(iA == streamMaxVolume ? 1.0d : ((double) ((int) ((((double) (streamVolume - iA)) / ((double) (streamMaxVolume - iA))) * 100.0d))) / 100.0d);
            }
            h9390398899829886498 = new dev.epro.r0.H9390398899829886498(new java.lang.Integer(iA), new java.lang.Integer(streamMaxVolume));
            d = d2;
        } else {
            h9390398899829886498 = null;
            d = null;
        }
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int ringerMode = audioManager.getRingerMode();
        int streamVolume2 = audioManager.getStreamVolume(2);
        ads_mobile_sdk.ri riVar = this.m;
        return new ads_mobile_sdk.xu0(new ads_mobile_sdk.pk(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, h9390398899829886498, ringerMode, streamVolume2, riVar.c, riVar.d, d));
    }
}
