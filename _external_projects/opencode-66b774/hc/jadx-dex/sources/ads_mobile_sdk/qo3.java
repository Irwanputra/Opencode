package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class qo3 {
    public final int a;
    public final boolean b;
    public final int c;
    public final android.graphics.Rect d;
    public final boolean e;
    public final android.graphics.Rect f;
    public final android.graphics.Rect g;
    public final boolean h;
    public final android.graphics.Rect i;
    public final boolean j;
    public final android.graphics.Rect k;

    public qo3(int i, boolean z, int i2, android.graphics.Rect rect, boolean z2, android.graphics.Rect rect2, android.graphics.Rect rect3, boolean z3, android.graphics.Rect rect4, boolean z4, android.graphics.Rect rect5) {
        if (i == 0) {
            throw null;
        }
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = rect;
        this.e = z2;
        this.f = rect2;
        this.g = rect3;
        this.h = z3;
        this.i = rect4;
        this.j = z4;
        this.k = rect5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.qo3)) {
            return false;
        }
        ads_mobile_sdk.qo3 qo3Var = (ads_mobile_sdk.qo3) obj;
        return this.a == qo3Var.a && this.b == qo3Var.b && this.c == qo3Var.c && this.d.equals(qo3Var.d) && this.e == qo3Var.e && this.f.equals(qo3Var.f) && this.g.equals(qo3Var.g) && this.h == qo3Var.h && this.i.equals(qo3Var.i) && this.j == qo3Var.j && this.k.equals(qo3Var.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    public final int hashCode() {
        int iA = dev.epro.r0.L11610354117192841236.A(this.a) * 31;
        boolean z = this.b;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int iHashCode = (this.d.hashCode() + dev.epro.r0.U1554499319261669842.h(this.c, (iA + r2) * 31)) * 31;
        boolean z2 = this.e;
        ?? r0 = z2;
        if (z2) {
            r0 = 1;
        }
        int iHashCode2 = (this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + r0) * 31)) * 31)) * 31;
        boolean z3 = this.h;
        ?? r02 = z3;
        if (z3) {
            r02 = 1;
        }
        int iHashCode3 = (this.i.hashCode() + ((iHashCode2 + r02) * 31)) * 31;
        boolean z4 = this.j;
        return this.k.hashCode() + ((iHashCode3 + (z4 ? 1 : z4)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewabilityEvent(viewabilityUpdateEvent=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "APP_STATE" : "SCROLL" : "VIEW_STATE" : "LAYOUT");
        sb.append(", isVisible=");
        sb.append(this.b);
        sb.append(", windowVisibility=");
        sb.append(this.c);
        sb.append(", adPosition=");
        sb.append(this.d);
        sb.append(", isAttachedToWindow=");
        sb.append(this.e);
        sb.append(", screenPosition=");
        sb.append(this.f);
        sb.append(", globalVisibleBox=");
        sb.append(this.g);
        sb.append(", globalVisibleBoxVisible=");
        sb.append(this.h);
        sb.append(", localVisibleBox=");
        sb.append(this.i);
        sb.append(", localVisibleBoxVisible=");
        sb.append(this.j);
        sb.append(", hitRect=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
