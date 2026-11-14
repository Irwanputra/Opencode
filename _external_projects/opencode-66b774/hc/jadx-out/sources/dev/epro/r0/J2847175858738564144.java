package dev.epro.r0;

import ads_mobile_sdk.pd;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J2847175858738564144 implements P7827270438547540384 {
    public final X12014589167171900524 a;
    public final short b;
    public final H9807528374655572032 c;
    public final long d;
    public final long e;

    /* JADX WARN: Multi-variable type inference failed */
    public J2847175858738564144(X12014589167171900524 x12014589167171900524, int i, H9807528374655572032 h9807528374655572032, long j, long j2) {
        this.a = x12014589167171900524;
        this.b = i;
        this.c = h9807528374655572032;
        this.d = j;
        this.e = j2;
    }

    public static M3288231786426044629 a(Z102412548944701279 z102412548944701279, E1636901823844057514 e1636901823844057514, int i) {
        M3288231786426044629 telemetryConfiguration = e1636901823844057514.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.e) {
            return null;
        }
        int[] iArr = telemetryConfiguration.g;
        int i2 = 0;
        if (iArr != null) {
            while (i2 < iArr.length) {
                if (iArr[i2] != i) {
                    i2++;
                }
            }
            return null;
        }
        int[] iArr2 = telemetryConfiguration.i;
        if (iArr2 != null) {
            while (i2 < iArr2.length) {
                if (iArr2[i2] == i) {
                    return null;
                }
                i2++;
            }
        }
        if (z102412548944701279.l < telemetryConfiguration.h) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // dev.epro.r0.P7827270438547540384
    public final void onComplete(S14461012662136963693 s14461012662136963693) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        if (this.a.a()) {
            F5577235160184315757 f5577235160184315757 = (F5577235160184315757) H12843822278061842084.C().b;
            if (f5577235160184315757 == null || f5577235160184315757.e) {
                Z102412548944701279 z102412548944701279 = (Z102412548944701279) this.a.j.get(this.c);
                if (z102412548944701279 != null) {
                    Object obj = z102412548944701279.b;
                    if (obj instanceof E1636901823844057514) {
                        E1636901823844057514 e1636901823844057514 = (E1636901823844057514) obj;
                        int i6 = 0;
                        boolean z = this.d > 0;
                        int gCoreServiceId = e1636901823844057514.getGCoreServiceId();
                        if (f5577235160184315757 != null) {
                            z &= f5577235160184315757.f;
                            int i7 = f5577235160184315757.g;
                            int i8 = f5577235160184315757.h;
                            i = f5577235160184315757.d;
                            if (e1636901823844057514.hasConnectionInfo() && !e1636901823844057514.isConnecting()) {
                                M3288231786426044629 m3288231786426044629A = a(z102412548944701279, e1636901823844057514, this.b);
                                if (m3288231786426044629A == null) {
                                    return;
                                }
                                boolean z2 = m3288231786426044629A.f && this.d > 0;
                                i8 = m3288231786426044629A.h;
                                z = z2;
                            }
                            i3 = i7;
                            i2 = i8;
                        } else {
                            i = 0;
                            i2 = 100;
                            i3 = 5000;
                        }
                        X12014589167171900524 x12014589167171900524 = this.a;
                        int iElapsedRealtime = -1;
                        if (s14461012662136963693.d()) {
                            i4 = 0;
                        } else {
                            if (s14461012662136963693.d) {
                                i6 = 100;
                            } else {
                                Exception excB = s14461012662136963693.b();
                                if (excB instanceof X4906216915227203322) {
                                    Status status = ((X4906216915227203322) excB).a;
                                    int i9 = status.d;
                                    B6867906687934285025 b6867906687934285025 = status.g;
                                    i4 = b6867906687934285025 == null ? -1 : b6867906687934285025.e;
                                    i6 = i9;
                                } else {
                                    i6 = pd.T0;
                                }
                            }
                            i4 = -1;
                        }
                        if (z) {
                            long j3 = this.d;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            i5 = i2;
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.e);
                            j = j3;
                            j2 = jCurrentTimeMillis;
                        } else {
                            i5 = i2;
                            j = 0;
                            j2 = 0;
                        }
                        int i10 = iElapsedRealtime;
                        R502132765509599220 r502132765509599220 = x12014589167171900524.m;
                        r502132765509599220.sendMessage(r502132765509599220.obtainMessage(18, new U5037669543840875960(new K8261958701207187192(this.b, i6, i4, j, j2, null, null, gCoreServiceId, i10), i, i3, i5)));
                    }
                }
            }
        }
    }
}
