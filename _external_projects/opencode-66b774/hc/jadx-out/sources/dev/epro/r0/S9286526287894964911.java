package dev.epro.r0;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S9286526287894964911 {
    public byte a = 1;
    public B18329032920392634747 b;
    public final String c;

    public S9286526287894964911(String str, B18329032920392634747 b18329032920392634747) {
        this.c = str;
        this.b = b18329032920392634747;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(int i) {
        byte b = this.a;
        if (b == i || b == 4) {
            return false;
        }
        String str = this.c;
        if (i == 2) {
            Bundle bundle = new Bundle();
            bundle.putString("targetPackage", str);
            this.b.onShown(bundle);
        } else if (i == 3) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("targetPackage", str);
            this.b.onDismissed(bundle2);
        } else if (i != 4) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("targetPackage", str);
            bundle3.putBoolean("dldpRedirect", true);
            this.b.onDismissed(bundle3);
        } else if (b == 2) {
            Bundle bundle4 = new Bundle();
            bundle4.putString("targetPackage", str);
            bundle4.putString("errorMessage", "HSDP overlay destroyed");
            this.b.onDismissed(bundle4);
        }
        this.a = i;
        return true;
    }

    public final String toString() {
        byte b = this.a;
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder("HsdpOverlay{'");
        X2485016533998461232.k(sb, this.c, "': ", b, ", ");
        return G6547577305291411977.u(sb, strValueOf, "}");
    }
}
