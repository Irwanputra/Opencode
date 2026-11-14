package dev.epro.r0;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class H12922621320026152513 extends K10678596132709730734 {
    public final R11530267699218145783 a;

    public H12922621320026152513(R11530267699218145783 r11530267699218145783) {
        this.a = r11530267699218145783;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) {
        if (d13396727227989475489.H() == 9) {
            d13396727227989475489.D();
            return null;
        }
        Object d = d();
        Map map = this.a.a;
        try {
            d13396727227989475489.c();
            while (d13396727227989475489.p()) {
                T9284579437310788245 t9284579437310788245 = (T9284579437310788245) map.get(d13396727227989475489.B());
                if (t9284579437310788245 == null) {
                    d13396727227989475489.O();
                } else {
                    f(d, d13396727227989475489, t9284579437310788245);
                }
            }
            d13396727227989475489.h();
            return e(d);
        } catch (IllegalAccessException e) {
            S12227320117525376577 s12227320117525376577 = P15002231639878788228.a;
            Z3383101362411723454.m("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalStateException e2) {
            throw new X13554947934760653097(e2);
        }
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) {
        if (obj == null) {
            y14132333989764804283.p();
            return;
        }
        y14132333989764804283.d();
        try {
            Iterator it = this.a.b.iterator();
            while (it.hasNext()) {
                ((T9284579437310788245) it.next()).a(y14132333989764804283, obj);
            }
            y14132333989764804283.h();
        } catch (IllegalAccessException e) {
            S12227320117525376577 s12227320117525376577 = P15002231639878788228.a;
            Z3383101362411723454.m("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    public abstract Object d();

    public void f(Object obj, D13396727227989475489 d13396727227989475489, T9284579437310788245 t9284579437310788245) {
        Field field = t9284579437310788245.b;
        Object b = t9284579437310788245.f.b(d13396727227989475489);
        if (b == null && t9284579437310788245.g) {
            return;
        }
        if (t9284579437310788245.h) {
            throw new O6142514240279757215("Cannot set value of 'static final' ".concat(P15002231639878788228.d(field, false)));
        }
        field.set(obj, b);
    }

    public Object e(Object obj) {
        return obj;
    }
}
