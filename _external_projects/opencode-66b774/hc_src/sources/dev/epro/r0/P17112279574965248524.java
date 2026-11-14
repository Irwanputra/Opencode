package dev.epro.r0;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P17112279574965248524 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Cloneable f;
    public final Object g;
    public final Object h;
    public Object i;
    public Object j;

    public P17112279574965248524() {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashSet();
        this.f = new HashSet();
        this.g = new HashSet();
        this.h = new HashMap();
        this.i = new HashSet();
        this.j = new WeakHashMap();
    }

    public void a(Runnable runnable) {
        c(new I3863025946240164840(this, runnable, (byte) 21));
    }

    public void b() {
        Iterator it = ((CopyOnWriteArrayList) this.e).iterator();
        while (it.hasNext()) {
            R2847330884077978889 r2847330884077978889 = (R2847330884077978889) it.next();
            ((Handler) ((H3430986877638506198) r2847330884077978889.b.b).f()).post(new U3594978070141619353((Object) r2847330884077978889, (byte) 24));
        }
    }

    public void c(Runnable runnable) {
        ((Handler) ((H3430986877638506198) this.b).f()).post(new A884078926372128069(runnable, (byte) 2));
    }

    public P17112279574965248524(Context context, String str, Intent intent, P5733283974459951585 p5733283974459951585) {
        this.d = new ArrayList();
        this.e = new CopyOnWriteArrayList();
        this.c = context;
        this.f = intent;
        this.g = p5733283974459951585;
        this.b = P13747563277035175218.o(new D14731132657808549702(str, (byte) 26));
        this.h = new D1811628803814760955(this, (byte) 1);
    }
}
