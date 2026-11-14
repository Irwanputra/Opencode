package ads_mobile_sdk;

import android.graphics.Rect;
import dev.epro.r0.L11610354117192841236;
import dev.epro.r0.U1554499319261669842;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class qo3 {
    public final int a;
    public final boolean b;
    public final int c;
    public final Rect d;
    public final boolean e;
    public final Rect f;
    public final Rect g;
    public final boolean h;
    public final Rect i;
    public final boolean j;
    public final Rect k;

    public qo3(int i, boolean z, int i2, Rect rect, boolean z2, Rect rect2, Rect rect3, boolean z3, Rect rect4, boolean z4, Rect rect5) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo3)) {
            return false;
        }
        qo3 qo3Var = (qo3) obj;
        return this.a == qo3Var.a && this.b == qo3Var.b && this.c == qo3Var.c && this.d.equals(qo3Var.d) && this.e == qo3Var.e && this.f.equals(qo3Var.f) && this.g.equals(qo3Var.g) && this.h == qo3Var.h && this.i.equals(qo3Var.i) && this.j == qo3Var.j && this.k.equals(qo3Var.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int A = L11610354117192841236.A(this.a) * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode = (this.d.hashCode() + U1554499319261669842.h(this.c, (A + i) * 31)) * 31;
        boolean z2 = this.e;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int hashCode2 = (this.g.hashCode() + ((this.f.hashCode() + ((hashCode + i2) * 31)) * 31)) * 31;
        boolean z3 = this.h;
        int i3 = z3;
        if (z3 != 0) {
            i3 = 1;
        }
        int hashCode3 = (this.i.hashCode() + ((hashCode2 + i3) * 31)) * 31;
        boolean z4 = this.j;
        return this.k.hashCode() + ((hashCode3 + (z4 ? 1 : z4 ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewabilityEvent(viewabilityUpdateEvent=");
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
