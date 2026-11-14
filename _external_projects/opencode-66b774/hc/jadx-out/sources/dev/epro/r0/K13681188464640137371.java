package dev.epro.r0;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K13681188464640137371 extends C775827382551829194 {
    public final /* synthetic */ byte q = 1;
    public final /* synthetic */ C13374971588771233833 r;

    public K13681188464640137371(U12005525216752176281 u12005525216752176281, K13681188464640137371 k13681188464640137371) {
        this.r = u12005525216752176281;
    }

    @Override // dev.epro.r0.C775827382551829194
    public final View S(int i) {
        byte b = this.q;
        C13374971588771233833 c13374971588771233833 = this.r;
        switch (b) {
            case 0:
                Dialog dialog = ((U12005525216752176281) c13374971588771233833).b0;
                if (dialog != null) {
                    return dialog.findViewById(i);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + c13374971588771233833 + " does not have a view");
        }
    }

    @Override // dev.epro.r0.C775827382551829194
    public final boolean T() {
        switch (this.q) {
            case 0:
                return ((U12005525216752176281) this.r).f0;
            default:
                return false;
        }
    }

    public K13681188464640137371(C13374971588771233833 c13374971588771233833) {
        this.r = c13374971588771233833;
    }
}
