package com.google.android.gms.internal;

import java.util.Comparator;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzhs implements Comparator<zzhy> {
    public zzhs(zzhr zzhrVar) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzhy zzhyVar, zzhy zzhyVar2) {
        zzhy zzhyVar3 = zzhyVar;
        zzhy zzhyVar4 = zzhyVar2;
        int i = zzhyVar3.zzbaj - zzhyVar4.zzbaj;
        return i != 0 ? i : (int) (zzhyVar3.value - zzhyVar4.value);
    }
}
