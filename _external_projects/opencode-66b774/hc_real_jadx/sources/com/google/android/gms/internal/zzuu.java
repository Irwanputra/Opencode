package com.google.android.gms.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzuu implements zzug {
    private final Context mContext;
    private final long mStartTime;
    private final zznu zzanj;
    private final zzux zzanw;
    private final boolean zzavp;
    private final zzui zzcef;
    private final boolean zzcej;
    private final boolean zzcek;
    private final zzaat zzcey;
    private final long zzcez;
    private final String zzcfd;
    private zzul zzcfi;
    private final Object mLock = new Object();
    private boolean zzcfb = false;
    private List<zzuo> zzcfe = new ArrayList();

    public zzuu(Context context, zzaat zzaatVar, zzux zzuxVar, zzui zzuiVar, boolean z, boolean z2, String str, long j, long j2, zznu zznuVar, boolean z3) {
        this.mContext = context;
        this.zzcey = zzaatVar;
        this.zzanw = zzuxVar;
        this.zzcef = zzuiVar;
        this.zzavp = z;
        this.zzcej = z2;
        this.zzcfd = str;
        this.mStartTime = j;
        this.zzcez = j2;
        this.zzanj = zznuVar;
        this.zzcek = z3;
    }

    @Override // com.google.android.gms.internal.zzug
    public final void cancel() {
        synchronized (this.mLock) {
            this.zzcfb = true;
            zzul zzulVar = this.zzcfi;
            if (zzulVar != null) {
                zzulVar.cancel();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:55:0x016d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.google.android.gms.internal.zzug
    public final com.google.android.gms.internal.zzuo zzh(java.util.List<com.google.android.gms.internal.zzuh> r34) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzuu.zzh(java.util.List):com.google.android.gms.internal.zzuo");
    }

    @Override // com.google.android.gms.internal.zzug
    public final List<zzuo> zzlu() {
        return this.zzcfe;
    }
}
