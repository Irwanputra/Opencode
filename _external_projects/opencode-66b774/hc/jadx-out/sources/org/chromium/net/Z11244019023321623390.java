package org.chromium.net;

import dev.epro.r0.M69217867917312856;
import java.util.Comparator;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class Z11244019023321623390 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        M69217867917312856 m69217867917312856 = (M69217867917312856) obj;
        M69217867917312856 m692178679173128562 = (M69217867917312856) obj2;
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(m69217867917312856.a.getName())) {
            return 1;
        }
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(m692178679173128562.a.getName())) {
            return -1;
        }
        return -CronetEngine.Builder.compareVersions(m69217867917312856.a.getVersion(), m692178679173128562.a.getVersion());
    }
}
