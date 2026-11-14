package ads_mobile_sdk;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.TextView;
import com.google.android.libraries.ads.mobile.sdk.common.AdActivity;
import dev.epro.r0.C775827382551829194;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.S4967920478913205567;
import dev.epro.r0.U10597134596418829392;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.Y12546913575648597673;
import dev.epro.r0.Z14316276734425062790;
import dev.epro.r0.Z3437138737604933638;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ca2 {
    public final Context a;
    public final rw0 b;
    public final g0 c;
    public final w81 d;
    public final V2597580950516131749 e;
    public final V2597580950516131749 f;
    public final V2597580950516131749 g;
    public final V2597580950516131749 h;
    public final bb0 i;
    public final H15186625828076266306 j;
    public final LinkedHashMap k;

    public ca2(Context context, rw0 rw0Var, g0 g0Var, w81 w81Var, bb0 bb0Var, bb0 bb0Var2, bb0 bb0Var3, bb0 bb0Var4, bb0 bb0Var5) {
        context.getClass();
        rw0Var.getClass();
        g0Var.getClass();
        w81Var.getClass();
        bb0Var.getClass();
        bb0Var2.getClass();
        bb0Var3.getClass();
        bb0Var4.getClass();
        this.a = context;
        this.b = rw0Var;
        this.c = g0Var;
        this.d = w81Var;
        this.e = bb0Var;
        this.f = bb0Var2;
        this.g = bb0Var3;
        this.h = bb0Var4;
        this.i = bb0Var5;
        this.j = new H15186625828076266306();
        this.k = new LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x005f, code lost:
    
        if (r13.c(r0) == r7) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r11v21, types: [dev.epro.r0.R8015591507171738907] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.ca2 r11, ads_mobile_sdk.ea2 r12, dev.epro.r0.R4833348786910499294 r13) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ca2.a(ads_mobile_sdk.ca2, ads_mobile_sdk.ea2, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    public static final TextView b(ca2 ca2Var, AdActivity adActivity, String str, String str2) {
        TextView textView = new TextView(adActivity);
        textView.setTag(str2);
        textView.setText(str);
        textView.setTextAppearance(R.style.TextAppearance.Medium);
        textView.setTextColor(-16777216);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.width = -2;
        marginLayoutParams.height = -2;
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        return textView;
    }

    public static final TextView a(ca2 ca2Var, AdActivity adActivity, String str, String str2) {
        TextView textView = new TextView(adActivity);
        textView.setTag(str2);
        textView.setText(str);
        textView.setTextAppearance(R.style.TextAppearance.Small);
        textView.setTextColor(-9210245);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.width = -2;
        marginLayoutParams.height = -2;
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 0.0f, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        return textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fc, code lost:
    
        if (ads_mobile_sdk.w81.d(r9, r0) == r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0063, code lost:
    
        if (r12 == r6) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.K6033805112333592087 r10, ads_mobile_sdk.ea2 r11, dev.epro.r0.R4833348786910499294 r12) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ca2.a(dev.epro.r0.K6033805112333592087, ads_mobile_sdk.ea2, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    public final Object a(ea2 ea2Var, R4833348786910499294 r4833348786910499294) {
        qw2 qw2Var = ea2Var.b;
        S4967920478913205567 s4967920478913205567 = ea2Var.d;
        if (s4967920478913205567 == null) {
            s4967920478913205567 = new S4967920478913205567(ea2Var.a, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null);
        }
        f8 f8Var = (f8) this.i.get();
        f8Var.c = qw2Var;
        f8Var.b = s4967920478913205567;
        f8Var.d = s4967920478913205567;
        f8Var.e = Boolean.TRUE;
        f8Var.f = Boolean.FALSE;
        Z14316276734425062790.d(f8Var.c, qw2.class);
        Z14316276734425062790.d((Boolean) f8Var.e, Boolean.class);
        Z14316276734425062790.d((Boolean) f8Var.f, Boolean.class);
        db0 db0Var = (db0) f8Var.a;
        S4967920478913205567 s49679204789132055672 = (S4967920478913205567) f8Var.b;
        S4967920478913205567 s49679204789132055673 = (S4967920478913205567) f8Var.d;
        qw2 qw2Var2 = f8Var.c;
        Boolean bool = (Boolean) f8Var.e;
        Boolean bool2 = (Boolean) f8Var.f;
        bd0 bd0Var = new bd0((byte) 1);
        hb1 hb1Var = U10597134596418829392.a;
        bd0Var.b = new gj0(new z2(hb1Var, hb1Var, hb1Var));
        bd0Var.c = new gj0(new qv(db0Var.u0, (byte) 21));
        bd0Var.d = hb1.a(qw2Var2);
        bd0Var.e = hb1.a(bool2);
        bd0Var.f = new v80(hb1.a(s49679204789132055673));
        bd0Var.g = new gj0(new e71(db0Var.M0, bd0Var.d, bd0Var.f, bd0Var.c, hb1.a(bool), db0Var.h, db0Var.t, hb1Var));
        hb1 a = hb1.a(s49679204789132055672);
        gj0 gj0Var = new gj0(C775827382551829194.m);
        rg0 rg0Var = db0Var.u;
        bd0Var.i = new gj0(new jm(db0Var.S3, rg0Var, bd0Var.b, db0Var.t, db0Var.G, bd0Var.c, bd0Var.d, db0Var.d, bd0Var.e, bd0Var.g, a, db0Var.U3, new gj0(new bc(rg0Var, (V2597580950516131749) gj0Var, (byte) 9)), db0Var.b0, (byte) 7));
        Object a2 = a(bd0Var, ea2Var, r4833348786910499294);
        return a2 == Z3437138737604933638.a ? a2 : O9245300239821758723.a;
    }

    public static void a(S4967920478913205567 s4967920478913205567, Y12546913575648597673 y12546913575648597673) {
        Iterator it = s4967920478913205567.e.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            y12546913575648597673.f.add(str);
        }
        y12546913575648597673.b(s4967920478913205567.d);
        for (Map.Entry entry : s4967920478913205567.c.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            str2.getClass();
            str3.getClass();
            y12546913575648597673.d.put(str2, str3);
        }
        String str4 = s4967920478913205567.b;
        if (str4 != null) {
            if (str4.length() > 0) {
                y12546913575648597673.c = str4;
                y12546913575648597673.a();
            } else {
                S10973172697741180971.j("Content URL must be non-empty.");
                return;
            }
        }
        y12546913575648597673.c(s4967920478913205567.f);
        String str5 = s4967920478913205567.h;
        if (str5 != null) {
            y12546913575648597673.i = str5;
            y12546913575648597673.a();
        }
        for (String str6 : s4967920478913205567.a) {
            str6.getClass();
            y12546913575648597673.b.add(str6);
        }
    }
}
