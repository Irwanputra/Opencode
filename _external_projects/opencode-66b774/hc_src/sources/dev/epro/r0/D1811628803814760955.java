package dev.epro.r0;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final /* synthetic */ class D1811628803814760955 implements IBinder.DeathRecipient {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ D1811628803814760955(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                K12238100791927223227 k12238100791927223227 = (K12238100791927223227) obj;
                k12238100791927223227.b.getClass();
                if (k12238100791927223227.j.get() != null) {
                    Z3383101362411723454.s();
                    return;
                }
                ArrayList arrayList = k12238100791927223227.d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ((N3901745123707141715) obj2).a(new RemoteException(String.valueOf(k12238100791927223227.c).concat(" : Binder has died.")));
                }
                arrayList.clear();
                synchronized (k12238100791927223227.f) {
                    HashSet hashSet = k12238100791927223227.e;
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((M17133811648581684718) it.next()).a(new RemoteException(String.valueOf(k12238100791927223227.c).concat(" : Binder has died.")));
                    }
                    hashSet.clear();
                }
                return;
            default:
                P17112279574965248524 p17112279574965248524 = (P17112279574965248524) obj;
                ArrayList arrayList2 = (ArrayList) p17112279574965248524.d;
                synchronized (arrayList2) {
                    arrayList2.clear();
                }
                p17112279574965248524.c(new U11129707225609510868(p17112279574965248524, (byte) 1));
                return;
        }
    }
}
