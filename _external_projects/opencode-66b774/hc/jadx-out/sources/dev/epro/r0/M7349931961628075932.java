package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M7349931961628075932 {
    public static final F15209282533750470613 b = new F15209282533750470613();
    public final Object a;

    public /* synthetic */ M7349931961628075932(Object obj) {
        this.a = obj;
    }

    public static final Object a(Object obj) {
        if (obj instanceof F15209282533750470613) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof M7349931961628075932) {
            return S10823041268949770285.t(this.a, ((M7349931961628075932) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof I12241705932167711945) {
            return ((I12241705932167711945) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
