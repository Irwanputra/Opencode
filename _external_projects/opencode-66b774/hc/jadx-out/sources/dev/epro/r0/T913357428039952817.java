package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T913357428039952817 extends B11964701839924937722 {
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f513o;

    public T913357428039952817(int i, String str) {
        if (i == 0) {
            throw null;
        }
        this.n = i;
        this.f513o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T913357428039952817)) {
            return false;
        }
        T913357428039952817 t913357428039952817 = (T913357428039952817) obj;
        return this.n == t913357428039952817.n && this.f513o.equals(t913357428039952817.f513o);
    }

    public final int hashCode() {
        return E12098517352909843120.h(L11610354117192841236.A(this.n) * 31, 31, this.f513o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FullScreenContentError(code=");
        int i = this.n;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "H5_SHOW_AD_NOT_LOADED" : "MEDIATION_SHOW_ERROR" : "APP_NOT_FOREGROUND" : "AD_REUSED" : "INTERNAL_ERROR");
        sb.append(", message=");
        sb.append(this.f513o);
        sb.append(", mediationAdError=null)");
        return sb.toString();
    }
}
