package dev.epro.r0;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P5799335319119159120 extends P15728539964912394135 {
    public int l;
    public int m;
    public V8767056641518014226 n;
    public final ArrayList g = new ArrayList();
    public final HashMap h = new HashMap();
    public final ArrayList i = new ArrayList();
    public final HashMap j = new HashMap();
    public final ArrayList k = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f432o = new ArrayList();
    public final ArrayList p = new ArrayList();

    @Override // dev.epro.r0.P15728539964912394135
    public final boolean b() {
        return !this.p.isEmpty();
    }

    @Override // dev.epro.r0.P15728539964912394135
    public final boolean c() {
        return !this.f432o.isEmpty();
    }

    @Override // dev.epro.r0.P15728539964912394135
    public final ArrayList d() {
        return this.p;
    }

    @Override // dev.epro.r0.P15728539964912394135
    public final ArrayList e() {
        return this.f432o;
    }

    public final void f(G15471856606567993098 g15471856606567993098, Object... objArr) {
        this.p.add(new L14430836125261710634(g15471856606567993098, objArr));
    }

    public final void g(G15471856606567993098 g15471856606567993098, Object... objArr) {
        this.f432o.add(new L14430836125261710634(g15471856606567993098, objArr));
    }
}
