package ads_mobile_sdk;

import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.Y4798753258822141670;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ai2 implements Y4798753258822141670 {
    public Object a;
    public final Y4798753258822141670 b;
    public final /* synthetic */ byte c;

    public ai2(z1 z1Var, Y4798753258822141670 y4798753258822141670, byte b) {
        this.c = b;
        switch (b) {
            case 1:
                z1Var.getClass();
                this.b = y4798753258822141670;
                k61 k61Var = z1Var.I;
                this.a = k61Var != null ? k61Var.e : null;
                break;
            default:
                this.a = z1Var;
                this.b = y4798753258822141670;
                break;
        }
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final void a(String str) {
        switch (this.c) {
            case 0:
                str.getClass();
                this.b.a(str);
                break;
            default:
                str.getClass();
                this.a = str;
                break;
        }
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final int b() {
        byte b = this.c;
        Y4798753258822141670 y4798753258822141670 = this.b;
        switch (b) {
        }
        return y4798753258822141670.b();
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final boolean c() {
        byte b = this.c;
        Y4798753258822141670 y4798753258822141670 = this.b;
        switch (b) {
        }
        return y4798753258822141670.c();
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final String d() {
        switch (this.c) {
            case 0:
                k61 k61Var = ((z1) this.a).I;
                if (k61Var != null) {
                    return k61Var.e;
                }
                return null;
            default:
                return (String) this.a;
        }
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Object a(tx0 tx0Var, Map map, R4833348786910499294 r4833348786910499294) {
        byte b = this.c;
        Y4798753258822141670 y4798753258822141670 = this.b;
        switch (b) {
        }
        return y4798753258822141670.a(tx0Var, map, r4833348786910499294);
    }

    @Override // dev.epro.r0.Y4798753258822141670
    public final Y4798753258822141670 a() {
        byte b = this.c;
        Y4798753258822141670 y4798753258822141670 = this.b;
        switch (b) {
        }
        return y4798753258822141670.a();
    }
}
