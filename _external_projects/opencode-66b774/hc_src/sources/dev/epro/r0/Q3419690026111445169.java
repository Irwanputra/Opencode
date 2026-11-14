package dev.epro.r0;

import org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q3419690026111445169 implements PrefetchOperationCallbackBoundaryInterface {
    public final /* synthetic */ H2380759164981958837 a;

    public Q3419690026111445169(H2380759164981958837 h2380759164981958837) {
        this.a = h2380759164981958837;
    }

    @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
    public final void onFailure(int i, String str, int i2) {
        H2380759164981958837 h2380759164981958837 = this.a;
        if (i == 1) {
            new U451033857130572909(str);
            ((U11450443558875589191) h2380759164981958837).getClass();
        } else {
            new B7417075504873050935(str);
            ((U11450443558875589191) h2380759164981958837).getClass();
        }
    }

    @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
    public final void onSuccess() {
        ((U11450443558875589191) this.a).getClass();
    }
}
