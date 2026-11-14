package dev.epro.r0;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M8580228815930431099 extends T15504973625601650233 {
    @Override // dev.epro.r0.T15504973625601650233
    public final Signature[] h(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
