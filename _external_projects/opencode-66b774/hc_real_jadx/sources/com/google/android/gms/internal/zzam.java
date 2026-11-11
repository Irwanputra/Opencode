package com.google.android.gms.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzam {
    public final String key;
    public final String zza;
    public final long zzb;
    public final long zzc;
    public long zzcb;
    public final long zzd;
    public final long zze;
    public final List<zzl> zzg;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzam(java.lang.String r13, com.google.android.gms.internal.zzc r14) {
        /*
            r12 = this;
            java.lang.String r2 = r14.zza
            long r3 = r14.zzb
            long r5 = r14.zzc
            long r7 = r14.zzd
            long r9 = r14.zze
            java.util.List<com.google.android.gms.internal.zzl> r0 = r14.zzg
            if (r0 == 0) goto Lf
            goto L15
        Lf:
            java.util.Map<java.lang.String, java.lang.String> r0 = r14.zzf
            java.util.List r0 = com.google.android.gms.internal.zzao.zza(r0)
        L15:
            r11 = r0
            r0 = r12
            r1 = r13
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            byte[] r13 = r14.data
            int r13 = r13.length
            long r13 = (long) r13
            r12.zzcb = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzam.<init>(java.lang.String, com.google.android.gms.internal.zzc):void");
    }

    private zzam(String str, String str2, long j, long j2, long j3, long j4, List<zzl> list) {
        this.key = str;
        this.zza = "".equals(str2) ? null : str2;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzg = list;
    }

    public static zzam zzc(zzan zzanVar) {
        if (zzal.zzb((InputStream) zzanVar) == 538247942) {
            return new zzam(zzal.zza(zzanVar), zzal.zza(zzanVar), zzal.zzc(zzanVar), zzal.zzc(zzanVar), zzal.zzc(zzanVar), zzal.zzc(zzanVar), zzal.zzb(zzanVar));
        }
        throw new IOException();
    }

    public final boolean zza(OutputStream outputStream) {
        try {
            zzal.zza(outputStream, 538247942);
            zzal.zza(outputStream, this.key);
            String str = this.zza;
            if (str == null) {
                str = "";
            }
            zzal.zza(outputStream, str);
            zzal.zza(outputStream, this.zzb);
            zzal.zza(outputStream, this.zzc);
            zzal.zza(outputStream, this.zzd);
            zzal.zza(outputStream, this.zze);
            List<zzl> list = this.zzg;
            if (list != null) {
                zzal.zza(outputStream, list.size());
                for (zzl zzlVar : list) {
                    zzal.zza(outputStream, zzlVar.getName());
                    zzal.zza(outputStream, zzlVar.getValue());
                }
            } else {
                zzal.zza(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e) {
            zzae.zzb("%s", e.toString());
            return false;
        }
    }
}
