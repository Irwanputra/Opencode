package dev.epro.r0;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C4270155929442575666 extends R502132765509599220 {
    public final /* synthetic */ E1636901823844057514 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4270155929442575666(E1636901823844057514 e1636901823844057514, Looper looper) {
        super(looper);
        this.a = e1636901823844057514;
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        J17338357039098224162 j17338357039098224162;
        E1636901823844057514 e1636901823844057514 = this.a;
        int i = e1636901823844057514.zzd.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (j17338357039098224162 = (J17338357039098224162) message.obj) != null) {
                synchronized (j17338357039098224162) {
                    j17338357039098224162.a = null;
                }
                E1636901823844057514 e16369018238440575142 = j17338357039098224162.c;
                synchronized (e16369018238440575142.zzj()) {
                    e16369018238440575142.zzj().remove(j17338357039098224162);
                }
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !e1636901823844057514.isConnecting()) {
            J17338357039098224162 j173383570390982241622 = (J17338357039098224162) message.obj;
            if (j173383570390982241622 != null) {
                synchronized (j173383570390982241622) {
                    j173383570390982241622.a = null;
                }
                E1636901823844057514 e16369018238440575143 = j173383570390982241622.c;
                synchronized (e16369018238440575143.zzj()) {
                    e16369018238440575143.zzj().remove(j173383570390982241622);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            e1636901823844057514.zzn(new B6867906687934285025(message.arg2, null, null));
            if (e1636901823844057514.zzg() && !e1636901823844057514.zzo()) {
                e1636901823844057514.e(3, null);
                return;
            }
            B6867906687934285025 zzm = e1636901823844057514.zzm() != null ? e1636901823844057514.zzm() : new B6867906687934285025(8, null, null);
            e1636901823844057514.zzc.i(zzm);
            int i5 = zzm.e;
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            B6867906687934285025 zzm2 = e1636901823844057514.zzm() != null ? e1636901823844057514.zzm() : new B6867906687934285025(8, null, null);
            e1636901823844057514.zzc.i(zzm2);
            int i6 = zzm2.e;
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            e1636901823844057514.zzc.i(new B6867906687934285025(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            e1636901823844057514.e(5, null);
            if (e1636901823844057514.zzk() != null) {
                e1636901823844057514.zzk().onConnectionSuspended(message.arg2);
            }
            System.currentTimeMillis();
            e1636901823844057514.zze(5, 1, null);
            return;
        }
        if (i4 == 2 && !e1636901823844057514.isConnected()) {
            J17338357039098224162 j173383570390982241623 = (J17338357039098224162) message.obj;
            if (j173383570390982241623 != null) {
                synchronized (j173383570390982241623) {
                    j173383570390982241623.a = null;
                }
                E1636901823844057514 e16369018238440575144 = j173383570390982241623.c;
                synchronized (e16369018238440575144.zzj()) {
                    e16369018238440575144.zzj().remove(j173383570390982241623);
                }
                return;
            }
            return;
        }
        int i7 = message.what;
        if (i7 != 2 && i7 != 1 && i7 != 7) {
            new StringBuilder(String.valueOf(i7).length() + 34);
            new Exception();
            return;
        }
        J17338357039098224162 j173383570390982241624 = (J17338357039098224162) message.obj;
        synchronized (j173383570390982241624) {
            try {
                bool = j173383570390982241624.a;
                if (j173383570390982241624.b) {
                    new StringBuilder(j173383570390982241624.toString().length() + 47);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            E1636901823844057514 e16369018238440575145 = j173383570390982241624.f;
            int i8 = j173383570390982241624.d;
            if (i8 != 0) {
                e16369018238440575145.e(1, null);
                Bundle bundle = j173383570390982241624.e;
                j173383570390982241624.b(new B6867906687934285025(i8, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!j173383570390982241624.a()) {
                e16369018238440575145.e(1, null);
                j173383570390982241624.b(new B6867906687934285025(8, null, null));
            }
        }
        synchronized (j173383570390982241624) {
            j173383570390982241624.b = true;
        }
        synchronized (j173383570390982241624) {
            j173383570390982241624.a = null;
        }
        E1636901823844057514 e16369018238440575146 = j173383570390982241624.c;
        synchronized (e16369018238440575146.zzj()) {
            e16369018238440575146.zzj().remove(j173383570390982241624);
        }
    }
}
