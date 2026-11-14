package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class G12227970815778091393 extends N18027129999013161219 implements D15596191924284547207 {
    public final boolean g;

    public G12227970815778091393(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.g = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G12227970815778091393) {
            G12227970815778091393 g12227970815778091393 = (G12227970815778091393) obj;
            return d().equals(g12227970815778091393.d()) && this.d.equals(g12227970815778091393.d) && this.e.equals(g12227970815778091393.e) && S10823041268949770285.t(this.b, g12227970815778091393.b);
        }
        if (obj instanceof D15596191924284547207) {
            return obj.equals(f());
        }
        return false;
    }

    public final D11026297070180776487 f() {
        if (this.g) {
            return this;
        }
        D11026297070180776487 d11026297070180776487 = this.a;
        if (d11026297070180776487 != null) {
            return d11026297070180776487;
        }
        D11026297070180776487 d11026297070180776487B = b();
        this.a = d11026297070180776487B;
        return d11026297070180776487B;
    }

    public final int hashCode() {
        return this.e.hashCode() + E12098517352909843120.h(d().hashCode() * 31, 31, this.d);
    }

    public final String toString() {
        D11026297070180776487 d11026297070180776487F = f();
        return d11026297070180776487F != this ? d11026297070180776487F.toString() : G6547577305291411977.u(new StringBuilder("property "), this.d, " (Kotlin reflection is not available)");
    }
}
