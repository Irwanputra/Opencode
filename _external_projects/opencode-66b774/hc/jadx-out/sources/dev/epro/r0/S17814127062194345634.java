package dev.epro.r0;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S17814127062194345634 implements Z4972949040470868463 {
    public final Set a;
    public final D389890677992184566 b = new D389890677992184566(0, new F819643558874997944[16]);

    public S17814127062194345634(Set set) {
        this.a = set;
    }

    @Override // dev.epro.r0.Z4972949040470868463
    public final void a() {
        D389890677992184566 d389890677992184566 = this.b;
        Object[] objArr = d389890677992184566.a;
        int i = d389890677992184566.c;
        for (int i2 = 0; i2 < i; i2++) {
            Z4972949040470868463 z4972949040470868463 = ((F819643558874997944) objArr[i2]).a;
            this.a.remove(z4972949040470868463);
            z4972949040470868463.a();
        }
    }

    @Override // dev.epro.r0.Z4972949040470868463
    public final void d() {
    }

    @Override // dev.epro.r0.Z4972949040470868463
    public final void f() {
    }
}
