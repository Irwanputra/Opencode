package com.google.android.gms.internal;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzkb {
    private static final Object sLock;
    private static zzkb zzbfi;
    private final zzajr zzbfj = new zzajr();
    private final zzjr zzbfk = new zzjr(new zzji(), new zzjh(), new zzmb(), new zzri(), new zzadt(), new zzxd(), new zzrj());
    private final String mSessionId = zzajr.zzra();
    private final zznd zzbfl = new zznd();
    private final zzne zzbfm = new zzne();
    private final zznf zzbfn = new zznf();

    static {
        Object obj = new Object();
        sLock = obj;
        zzkb zzkbVar = new zzkb();
        synchronized (obj) {
            zzbfi = zzkbVar;
        }
    }

    private static zzkb zzhz() {
        zzkb zzkbVar;
        synchronized (sLock) {
            zzkbVar = zzbfi;
        }
        return zzkbVar;
    }

    public static zzajr zzia() {
        return zzhz().zzbfj;
    }

    public static zzjr zzib() {
        return zzhz().zzbfk;
    }

    public static String zzic() {
        return zzhz().mSessionId;
    }

    public static zzne zzid() {
        return zzhz().zzbfm;
    }

    public static zznd zzie() {
        return zzhz().zzbfl;
    }

    public static zznf zzif() {
        return zzhz().zzbfn;
    }
}
