package ads_mobile_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import dev.epro.r0.O12494175665883759871;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class pa2 {
    public final jr0 a;
    public final Context b;
    public final O12494175665883759871 c;
    public final O12494175665883759871 d;
    public final O12494175665883759871 e;

    public pa2(Context context, jr0 jr0Var) {
        jr0Var.getClass();
        context.getClass();
        this.a = jr0Var;
        this.b = context;
        this.c = new O12494175665883759871(new ma2(this, (byte) 1));
        this.d = new O12494175665883759871(new ma2(this, (byte) 2));
        this.e = new O12494175665883759871(new ma2(this, (byte) 0));
    }

    public final void a() {
        try {
            Object value = this.c.getValue();
            value.getClass();
            sa2 sa2Var = (sa2) value;
            synchronized (sa2.class) {
                sa2Var.f.a(sa2Var.c);
                sa2Var.f.a(sa2Var.a);
            }
        } catch (Exception e) {
            zi3.a(4, "Exception while clearing PAIDV1", e);
        }
    }

    public final void b() {
        try {
            Object value = this.d.getValue();
            value.getClass();
            ua2 ua2Var = (ua2) value;
            synchronized (ua2.class) {
                try {
                    ii iiVar = ua2Var.f;
                    if (((SharedPreferences) iiVar.b).contains(ua2Var.a)) {
                        ua2Var.f.a(ua2Var.c);
                        ua2Var.f.a(ua2Var.a);
                    }
                } finally {
                }
            }
        } catch (Exception e) {
            zi3.a(4, "Exception while clearing PAIDV2", e);
        }
    }
}
