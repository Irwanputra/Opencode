package com.google.android.gms.internal;

import java.util.Comparator;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzib implements Comparator<zzhp> {
    public zzib(zzia zziaVar) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzhp zzhpVar, zzhp zzhpVar2) {
        zzhp zzhpVar3 = zzhpVar;
        zzhp zzhpVar4 = zzhpVar2;
        if (zzhpVar3.zzgz() < zzhpVar4.zzgz()) {
            return -1;
        }
        if (zzhpVar3.zzgz() > zzhpVar4.zzgz()) {
            return 1;
        }
        if (zzhpVar3.zzgy() < zzhpVar4.zzgy()) {
            return -1;
        }
        if (zzhpVar3.zzgy() > zzhpVar4.zzgy()) {
            return 1;
        }
        float zzha = (zzhpVar3.zzha() - zzhpVar3.zzgy()) * (zzhpVar3.zzhb() - zzhpVar3.zzgz());
        float zzha2 = (zzhpVar4.zzha() - zzhpVar4.zzgy()) * (zzhpVar4.zzhb() - zzhpVar4.zzgz());
        if (zzha > zzha2) {
            return -1;
        }
        return zzha < zzha2 ? 1 : 0;
    }
}
