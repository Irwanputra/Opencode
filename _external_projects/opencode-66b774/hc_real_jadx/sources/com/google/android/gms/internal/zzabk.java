package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbs;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzabk implements Runnable {
    private /* synthetic */ OutputStream zzcqb;
    private /* synthetic */ byte[] zzcqc;

    public zzabk(zzabj zzabjVar, OutputStream outputStream, byte[] bArr) {
        this.zzcqb = outputStream;
        this.zzcqc = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable, java.io.DataOutputStream] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r1;
        Throwable th;
        IOException e;
        try {
            r1 = new DataOutputStream(this.zzcqb);
            try {
                try {
                    r1.writeInt(this.zzcqc.length);
                    r1.write(this.zzcqc);
                    try {
                        r1.close();
                    } catch (IOException unused) {
                    }
                } catch (IOException e2) {
                    e = e2;
                    zzakb.zzb("Error transporting the ad response", e);
                    zzbs.zzem().zza(e, "LargeParcelTeleporter.pipeData.1");
                    if (r1 != 0) {
                        try {
                            r1.close();
                            return;
                        } catch (IOException unused2) {
                            return;
                        }
                    }
                    OutputStream outputStream = this.zzcqb;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (r1 == 0 || (r1 = this.zzcqb) != 0) {
                    try {
                        r1.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            r1 = 0;
            e = e3;
        } catch (Throwable th3) {
            r1 = 0;
            th = th3;
            if (r1 == 0) {
            }
            r1.close();
            throw th;
        }
    }
}
