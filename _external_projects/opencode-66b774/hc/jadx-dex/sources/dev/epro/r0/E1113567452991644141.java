package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E1113567452991644141 implements java.lang.Iterable {
    public final /* synthetic */ byte a;
    public final java.util.List b;
    public final java.lang.Object c;

    public E1113567452991644141(android.content.Context context) {
        this.a = (byte) 1;
        this.b = new java.util.ArrayList();
        this.c = context;
    }

    public void a(android.content.ComponentName componentName) {
        android.content.Context context = (android.content.Context) this.c;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.b;
        int size = arrayList.size();
        try {
            for (android.content.Intent intentM = dev.epro.r0.T18016951143603335921.M(context, componentName); intentM != null; intentM = dev.epro.r0.T18016951143603335921.M(context, intentM.getComponent())) {
                arrayList.add(size, intentM);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public void b() {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.b;
        if (arrayList.isEmpty()) {
            dev.epro.r0.S10973172697741180971.m("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        android.content.Intent[] intentArr = (android.content.Intent[]) arrayList.toArray(new android.content.Intent[0]);
        intentArr[0] = new android.content.Intent(intentArr[0]).addFlags(268484608);
        ((android.content.Context) this.c).startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        byte b = this.a;
        java.util.List list = this.b;
        switch (b) {
            case 0:
                return new dev.epro.r0.G6870679046281036082(list.iterator(), ((java.util.List) this.c).iterator());
            default:
                return ((java.util.ArrayList) list).iterator();
        }
    }

    public E1113567452991644141(java.util.List list, java.util.List list2) {
        this.a = (byte) 0;
        this.b = list;
        this.c = list2;
    }
}
