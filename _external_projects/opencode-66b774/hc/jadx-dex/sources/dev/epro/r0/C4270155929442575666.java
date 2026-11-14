package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C4270155929442575666 extends dev.epro.r0.R502132765509599220 {
    public final /* synthetic */ dev.epro.r0.E1636901823844057514 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4270155929442575666(dev.epro.r0.E1636901823844057514 e1636901823844057514, android.os.Looper looper) {
        super(looper);
        this.a = e1636901823844057514;
        android.os.Looper.getMainLooper();
    }

    public final void handleMessage(android.os.Message message) {
        java.lang.Boolean bool;
        dev.epro.r0.J17338357039098224162 j17338357039098224162;
        dev.epro.r0.E1636901823844057514 e1636901823844057514 = this.a;
        int i = e1636901823844057514.zzd.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (j17338357039098224162 = (dev.epro.r0.J17338357039098224162) message.obj) != null) {
                synchronized (j17338357039098224162) {
                    j17338357039098224162.a = null;
                }
                dev.epro.r0.E1636901823844057514 e16369018238440575142 = j17338357039098224162.c;
                synchronized (e16369018238440575142.zzj()) {
                    e16369018238440575142.zzj().remove(j17338357039098224162);
                }
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !e1636901823844057514.isConnecting()) {
            dev.epro.r0.J17338357039098224162 j173383570390982241622 = (dev.epro.r0.J17338357039098224162) message.obj;
            if (j173383570390982241622 != null) {
                synchronized (j173383570390982241622) {
                    j173383570390982241622.a = null;
                }
                dev.epro.r0.E1636901823844057514 e16369018238440575143 = j173383570390982241622.c;
                synchronized (e16369018238440575143.zzj()) {
                    e16369018238440575143.zzj().remove(j173383570390982241622);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            e1636901823844057514.zzn(new dev.epro.r0.B6867906687934285025(message.arg2, null, null));
            if (e1636901823844057514.zzg() && !e1636901823844057514.zzo()) {
                e1636901823844057514.e(3, null);
                return;
            }
            dev.epro.r0.B6867906687934285025 b6867906687934285025Zzm = e1636901823844057514.zzm() != null ? e1636901823844057514.zzm() : new dev.epro.r0.B6867906687934285025(8, null, null);
            e1636901823844057514.zzc.i(b6867906687934285025Zzm);
            int i5 = b6867906687934285025Zzm.e;
            java.lang.System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            dev.epro.r0.B6867906687934285025 b6867906687934285025Zzm2 = e1636901823844057514.zzm() != null ? e1636901823844057514.zzm() : new dev.epro.r0.B6867906687934285025(8, null, null);
            e1636901823844057514.zzc.i(b6867906687934285025Zzm2);
            int i6 = b6867906687934285025Zzm2.e;
            java.lang.System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            java.lang.Object obj = message.obj;
            e1636901823844057514.zzc.i(new dev.epro.r0.B6867906687934285025(message.arg2, obj instanceof android.app.PendingIntent ? (android.app.PendingIntent) obj : null, null));
            java.lang.System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            e1636901823844057514.e(5, null);
            if (e1636901823844057514.zzk() != null) {
                e1636901823844057514.zzk().onConnectionSuspended(message.arg2);
            }
            java.lang.System.currentTimeMillis();
            e1636901823844057514.zze(5, 1, null);
            return;
        }
        if (i4 == 2 && !e1636901823844057514.isConnected()) {
            dev.epro.r0.J17338357039098224162 j173383570390982241623 = (dev.epro.r0.J17338357039098224162) message.obj;
            if (j173383570390982241623 != null) {
                synchronized (j173383570390982241623) {
                    j173383570390982241623.a = null;
                }
                dev.epro.r0.E1636901823844057514 e16369018238440575144 = j173383570390982241623.c;
                synchronized (e16369018238440575144.zzj()) {
                    e16369018238440575144.zzj().remove(j173383570390982241623);
                }
                return;
            }
            return;
        }
        int i7 = message.what;
        if (i7 != 2 && i7 != 1 && i7 != 7) {
            new java.lang.StringBuilder(java.lang.String.valueOf(i7).length() + 34);
            new java.lang.Exception();
            return;
        }
        dev.epro.r0.J17338357039098224162 j173383570390982241624 = (dev.epro.r0.J17338357039098224162) message.obj;
        synchronized (j173383570390982241624) {
            try {
                bool = j173383570390982241624.a;
                if (j173383570390982241624.b) {
                    new java.lang.StringBuilder(j173383570390982241624.toString().length() + 47);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            dev.epro.r0.E1636901823844057514 e16369018238440575145 = j173383570390982241624.f;
            int i8 = j173383570390982241624.d;
            if (i8 != 0) {
                e16369018238440575145.e(1, null);
                android.os.Bundle bundle = j173383570390982241624.e;
                j173383570390982241624.b(new dev.epro.r0.B6867906687934285025(i8, bundle != null ? (android.app.PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!j173383570390982241624.a()) {
                e16369018238440575145.e(1, null);
                j173383570390982241624.b(new dev.epro.r0.B6867906687934285025(8, null, null));
            }
        }
        synchronized (j173383570390982241624) {
            j173383570390982241624.b = true;
        }
        synchronized (j173383570390982241624) {
            j173383570390982241624.a = null;
        }
        dev.epro.r0.E1636901823844057514 e16369018238440575146 = j173383570390982241624.c;
        synchronized (e16369018238440575146.zzj()) {
            e16369018238440575146.zzj().remove(j173383570390982241624);
        }
    }
}
