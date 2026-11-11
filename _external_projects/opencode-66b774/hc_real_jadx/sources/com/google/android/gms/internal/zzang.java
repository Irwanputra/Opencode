package com.google.android.gms.internal;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzang extends zzana {
    private static final Set<String> zzdki = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzdkj = new DecimalFormat("#,###");
    private File zzdkk;
    private boolean zzdkl;

    public zzang(zzamp zzampVar) {
        super(zzampVar);
        File cacheDir = this.mContext.getCacheDir();
        if (cacheDir == null) {
            zzakb.zzcu("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.zzdkk = file;
        if (!file.isDirectory() && !this.zzdkk.mkdirs()) {
            String valueOf = String.valueOf(this.zzdkk.getAbsolutePath());
            zzakb.zzcu(valueOf.length() != 0 ? "Could not create preload cache directory at ".concat(valueOf) : new String("Could not create preload cache directory at "));
            this.zzdkk = null;
        } else {
            if (this.zzdkk.setReadable(true, false) && this.zzdkk.setExecutable(true, false)) {
                return;
            }
            String valueOf2 = String.valueOf(this.zzdkk.getAbsolutePath());
            zzakb.zzcu(valueOf2.length() != 0 ? "Could not set cache file permissions at ".concat(valueOf2) : new String("Could not set cache file permissions at "));
            this.zzdkk = null;
        }
    }

    private final File zzc(File file) {
        return new File(this.zzdkk, String.valueOf(file.getName()).concat(".done"));
    }

    @Override // com.google.android.gms.internal.zzana
    public final void abort() {
        this.zzdkl = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x02be, code lost:
    
        r15 = "sizeExceeded";
        r1 = java.lang.String.valueOf(java.lang.Integer.toString(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02ce, code lost:
    
        if (r1.length() == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02d0, code lost:
    
        r1 = "File too big for full file cache. Size: ".concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02e2, code lost:
    
        throw new java.io.IOException("stream cache file size limit exceeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x02e3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02e6, code lost:
    
        r2 = r1;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02ee, code lost:
    
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02d6, code lost:
    
        r1 = new java.lang.String("File too big for full file cache. Size: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03d6, code lost:
    
        r25 = r4;
        r23 = r10;
        r20 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03dc, code lost:
    
        r25.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03e4, code lost:
    
        if (com.google.android.gms.internal.zzakb.zzae(3) == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03e6, code lost:
    
        r1 = com.google.android.gms.internal.zzang.zzdkj.format(r11);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 22) + java.lang.String.valueOf(r29).length());
        r3.append("Preloaded ");
        r3.append(r1);
        r3.append(" bytes from ");
        r3.append(r29);
        com.google.android.gms.internal.zzakb.zzbx(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0427, code lost:
    
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x042e, code lost:
    
        if (r0.isFile() == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0430, code lost:
    
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0438, code lost:
    
        r0.createNewFile();
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x044f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0452, code lost:
    
        r1 = r23;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04b6  */
    @Override // com.google.android.gms.internal.zzana
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzcx(java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzang.zzcx(java.lang.String):boolean");
    }
}
