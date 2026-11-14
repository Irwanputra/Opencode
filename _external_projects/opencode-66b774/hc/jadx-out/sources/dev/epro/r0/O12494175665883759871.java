package dev.epro.r0;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O12494175665883759871 implements K7493131619793429513, Serializable {
    public B13729205492206812220 a;
    public volatile Object b;
    public final Object c;

    public O12494175665883759871(B13729205492206812220 b13729205492206812220) {
        b13729205492206812220.getClass();
        this.a = b13729205492206812220;
        this.b = N5158094851646208854.q;
        this.c = this;
    }

    public final boolean a() {
        return this.b != N5158094851646208854.q;
    }

    @Override // dev.epro.r0.K7493131619793429513
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.b;
        N5158094851646208854 n5158094851646208854 = N5158094851646208854.q;
        if (obj != n5158094851646208854) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.b;
            if (objInvoke == n5158094851646208854) {
                B13729205492206812220 b13729205492206812220 = this.a;
                b13729205492206812220.getClass();
                objInvoke = b13729205492206812220.invoke();
                this.b = objInvoke;
                this.a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
