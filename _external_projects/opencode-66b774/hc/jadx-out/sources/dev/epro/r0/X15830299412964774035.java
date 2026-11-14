package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X15830299412964774035 {
    public final Object a;
    public final N8760694116812456657 b;
    public final J12078565427869724451 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ X15830299412964774035(Object obj, N8760694116812456657 n8760694116812456657, J12078565427869724451 j12078565427869724451, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : n8760694116812456657, (i & 4) != 0 ? null : j12078565427869724451, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static X15830299412964774035 a(X15830299412964774035 x15830299412964774035, N8760694116812456657 n8760694116812456657, Throwable th, int i) {
        Object obj = x15830299412964774035.a;
        if ((i & 2) != 0) {
            n8760694116812456657 = x15830299412964774035.b;
        }
        N8760694116812456657 n87606941168124566572 = n8760694116812456657;
        J12078565427869724451 j12078565427869724451 = x15830299412964774035.c;
        Object obj2 = x15830299412964774035.d;
        if ((i & 16) != 0) {
            th = x15830299412964774035.e;
        }
        return new X15830299412964774035(obj, n87606941168124566572, j12078565427869724451, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X15830299412964774035)) {
            return false;
        }
        X15830299412964774035 x15830299412964774035 = (X15830299412964774035) obj;
        return S10823041268949770285.t(this.a, x15830299412964774035.a) && S10823041268949770285.t(this.b, x15830299412964774035.b) && S10823041268949770285.t(this.c, x15830299412964774035.c) && S10823041268949770285.t(this.d, x15830299412964774035.d) && S10823041268949770285.t(this.e, x15830299412964774035.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        N8760694116812456657 n8760694116812456657 = this.b;
        int iHashCode2 = (iHashCode + (n8760694116812456657 == null ? 0 : n8760694116812456657.hashCode())) * 31;
        J12078565427869724451 j12078565427869724451 = this.c;
        int iHashCode3 = (iHashCode2 + (j12078565427869724451 == null ? 0 : j12078565427869724451.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public X15830299412964774035(Object obj, N8760694116812456657 n8760694116812456657, J12078565427869724451 j12078565427869724451, Object obj2, Throwable th) {
        this.a = obj;
        this.b = n8760694116812456657;
        this.c = j12078565427869724451;
        this.d = obj2;
        this.e = th;
    }
}
