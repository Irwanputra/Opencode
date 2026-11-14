package dev.epro.r0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L11462694090053902638 {
    public boolean a = true;
    public boolean b;
    public Object c;
    public Serializable d;

    public I17300838719998789664 a() {
        return new I17300838719998789664(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public void b(F2833317347889062771... f2833317347889062771Arr) {
        if (!this.a) {
            S10973172697741180971.j("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(f2833317347889062771Arr.length);
        for (F2833317347889062771 f2833317347889062771 : f2833317347889062771Arr) {
            arrayList.add(f2833317347889062771.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.a) {
            S10973172697741180971.j("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.c = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            S10973172697741180971.j("At least one cipher suite is required");
        }
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.Serializable, java.lang.String[]] */
    public void c(K5454855350570310837... k5454855350570310837Arr) {
        if (!this.a) {
            S10973172697741180971.j("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(k5454855350570310837Arr.length);
        for (K5454855350570310837 k5454855350570310837 : k5454855350570310837Arr) {
            arrayList.add(k5454855350570310837.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.a) {
            S10973172697741180971.j("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.d = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            S10973172697741180971.j("At least one TLS version is required");
        }
    }
}
