package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class A1073272897716769208 {
    public final int a;
    public final String b;
    public final Object[] c;

    public A1073272897716769208(String str, Object... objArr) {
        this.a = -1;
        this.b = str;
        this.c = objArr;
    }

    public Object[] a() {
        return this.c;
    }

    public String toString() {
        Object[] objArr = this.c;
        String str = this.b;
        if (str != null) {
            return String.format(str, objArr);
        }
        StringBuilder sb = new StringBuilder("mIssueId: ");
        sb.append(this.a);
        for (Object obj : objArr) {
            sb.append(", ");
            sb.append(obj.toString());
        }
        return sb.toString();
    }

    public A1073272897716769208(int i, Object... objArr) {
        this.a = i;
        this.b = null;
        this.c = objArr;
    }
}
