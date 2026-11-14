package dev.epro.r0;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R13288784299695828459 implements K7493131619793429513, Serializable {
    public B13729205492206812220 a;
    public Object b;

    @Override // dev.epro.r0.K7493131619793429513
    public final Object getValue() {
        Object obj = this.b;
        if (obj != N5158094851646208854.q) {
            return obj;
        }
        B13729205492206812220 b13729205492206812220 = this.a;
        b13729205492206812220.getClass();
        Object objInvoke = b13729205492206812220.invoke();
        this.b = objInvoke;
        this.a = null;
        return objInvoke;
    }

    public final String toString() {
        return this.b != N5158094851646208854.q ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
