package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B9934915652113529982 {
    public final dev.epro.r0.W13734796219485846113 a;
    public final java.util.List b;
    public final java.util.ArrayList c;
    public final java.util.ArrayList d = new java.util.ArrayList();
    public boolean e;

    static {
        dev.epro.r0.B14824868959299866349.o("WorkContinuationImpl");
    }

    public B9934915652113529982(dev.epro.r0.W13734796219485846113 w13734796219485846113, java.util.List list) {
        this.a = w13734796219485846113;
        this.b = list;
        this.c = new java.util.ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            java.lang.String string = ((dev.epro.r0.M10089736868580320414) list.get(i)).a.toString();
            string.getClass();
            this.c.add(string);
            this.d.add(string);
        }
    }

    public static java.util.HashSet a(dev.epro.r0.B9934915652113529982 b9934915652113529982) {
        java.util.HashSet hashSet = new java.util.HashSet();
        b9934915652113529982.getClass();
        return hashSet;
    }
}
