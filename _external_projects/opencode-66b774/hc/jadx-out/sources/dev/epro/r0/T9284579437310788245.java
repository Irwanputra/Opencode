package dev.epro.r0;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T9284579437310788245 {
    public final String a;
    public final Field b;
    public final String c;
    public final /* synthetic */ Method d;
    public final /* synthetic */ K10678596132709730734 e;
    public final /* synthetic */ K10678596132709730734 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    public T9284579437310788245(String str, Field field, Method method, K10678596132709730734 k10678596132709730734, K10678596132709730734 k106785961327097307342, boolean z, boolean z2) {
        this.d = method;
        this.e = k10678596132709730734;
        this.f = k106785961327097307342;
        this.g = z;
        this.h = z2;
        this.a = str;
        this.b = field;
        this.c = field.getName();
    }

    public final void a(Y14132333989764804283 y14132333989764804283, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Method method = this.d;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new O6142514240279757215(G6547577305291411977.s("Accessor ", P15002231639878788228.d(method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = this.b.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        y14132333989764804283.j(this.a);
        this.e.c(y14132333989764804283, objInvoke);
    }
}
