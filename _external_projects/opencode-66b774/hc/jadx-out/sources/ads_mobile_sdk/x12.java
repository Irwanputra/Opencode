package ads_mobile_sdk;

import android.content.Context;
import android.os.SystemClock;
import dev.epro.r0.G10308367458345557237;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.Z3437138737604933638;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class x12 implements G10308367458345557237 {
    public final Context a;
    public final String b;
    public final String c;
    public final ri d;
    public final Optional e;
    public final O16637889491137121389 f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public final w12 i;

    public x12(Context context, String str, String str2, ri riVar, Optional optional, O16637889491137121389 o16637889491137121389) {
        context.getClass();
        str.getClass();
        str2.getClass();
        riVar.getClass();
        optional.getClass();
        o16637889491137121389.getClass();
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = riVar;
        this.e = optional;
        this.f = o16637889491137121389;
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        w12 w12Var = new w12();
        w12Var.a = false;
        w12Var.d = 0L;
        w12Var.f = null;
        this.i = w12Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.R4833348786910499294 r17) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.x12.a(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    @Override // dev.epro.r0.G10308367458345557237
    public final Object b(qo3 qo3Var, R4833348786910499294 r4833348786910499294) {
        Object objA;
        boolean z = this.h.get() ? false : qo3Var.b;
        w12 w12Var = this.i;
        w12Var.a = z;
        this.f.getClass();
        w12Var.d = SystemClock.elapsedRealtime();
        w12Var.f = qo3Var;
        return (this.g.get() && (objA = a(r4833348786910499294)) == Z3437138737604933638.a) ? objA : O9245300239821758723.a;
    }
}
