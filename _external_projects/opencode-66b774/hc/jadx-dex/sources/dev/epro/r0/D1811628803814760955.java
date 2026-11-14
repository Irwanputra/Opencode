package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class D1811628803814760955 implements android.os.IBinder.DeathRecipient {
    public final /* synthetic */ byte a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ D1811628803814760955(java.lang.Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        byte b = this.a;
        java.lang.Object obj = this.b;
        switch (b) {
            case 0:
                dev.epro.r0.K12238100791927223227 k12238100791927223227 = (dev.epro.r0.K12238100791927223227) obj;
                k12238100791927223227.b.getClass();
                if (k12238100791927223227.j.get() != null) {
                    dev.epro.r0.Z3383101362411723454.s();
                    return;
                }
                java.util.ArrayList arrayList = k12238100791927223227.d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    java.lang.Object obj2 = arrayList.get(i);
                    i++;
                    ((dev.epro.r0.N3901745123707141715) obj2).a(new android.os.RemoteException(java.lang.String.valueOf(k12238100791927223227.c).concat(" : Binder has died.")));
                }
                arrayList.clear();
                synchronized (k12238100791927223227.f) {
                    java.util.HashSet hashSet = k12238100791927223227.e;
                    java.util.Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((dev.epro.r0.M17133811648581684718) it.next()).a(new android.os.RemoteException(java.lang.String.valueOf(k12238100791927223227.c).concat(" : Binder has died.")));
                    }
                    hashSet.clear();
                    break;
                }
                return;
            default:
                dev.epro.r0.P17112279574965248524 p17112279574965248524 = (dev.epro.r0.P17112279574965248524) obj;
                java.util.ArrayList arrayList2 = (java.util.ArrayList) p17112279574965248524.d;
                synchronized (arrayList2) {
                    arrayList2.clear();
                    break;
                }
                p17112279574965248524.c(new dev.epro.r0.U11129707225609510868(p17112279574965248524, (byte) 1));
                return;
        }
    }
}
