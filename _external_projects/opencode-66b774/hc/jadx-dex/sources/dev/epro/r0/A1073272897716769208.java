package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class A1073272897716769208 {
    public final int a;
    public final java.lang.String b;
    public final java.lang.Object[] c;

    public A1073272897716769208(java.lang.String str, java.lang.Object... objArr) {
        this.a = -1;
        this.b = str;
        this.c = objArr;
    }

    public java.lang.Object[] a() {
        return this.c;
    }

    public java.lang.String toString() {
        java.lang.Object[] objArr = this.c;
        java.lang.String str = this.b;
        if (str != null) {
            return java.lang.String.format(str, objArr);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("mIssueId: ");
        sb.append(this.a);
        for (java.lang.Object obj : objArr) {
            sb.append(", ");
            sb.append(obj.toString());
        }
        return sb.toString();
    }

    public A1073272897716769208(int i, java.lang.Object... objArr) {
        this.a = i;
        this.b = null;
        this.c = objArr;
    }
}
