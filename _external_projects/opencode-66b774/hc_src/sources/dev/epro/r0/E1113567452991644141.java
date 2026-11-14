package dev.epro.r0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E1113567452991644141 implements Iterable {
    public final /* synthetic */ byte a;
    public final List b;
    public final Object c;

    public E1113567452991644141(Context context) {
        this.a = (byte) 1;
        this.b = new ArrayList();
        this.c = context;
    }

    public void a(ComponentName componentName) {
        Context context = (Context) this.c;
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        try {
            for (Intent M = T18016951143603335921.M(context, componentName); M != null; M = T18016951143603335921.M(context, M.getComponent())) {
                arrayList.add(size, M);
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            S10973172697741180971.m("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        ((Context) this.c).startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                return new G6870679046281036082(list.iterator(), ((List) this.c).iterator());
            default:
                return ((ArrayList) list).iterator();
        }
    }

    public E1113567452991644141(List list, List list2) {
        this.a = (byte) 0;
        this.b = list;
        this.c = list2;
    }
}
