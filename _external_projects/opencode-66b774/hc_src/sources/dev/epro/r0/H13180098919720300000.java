package dev.epro.r0;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class H13180098919720300000 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public H13180098919720300000() {
        if (P5733283974459951585.b == null) {
            P5733283974459951585.b = new P5733283974459951585((byte) 4);
        }
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i);
        }
        return 0;
    }

    public void b() {
        if (((H6457936572911484476) this.d).h == this.c) {
            return;
        }
        U15384774985926769650.c();
    }

    public void c() {
        while (true) {
            int i = this.a;
            H6457936572911484476 h6457936572911484476 = (H6457936572911484476) this.d;
            if (i >= h6457936572911484476.f || h6457936572911484476.c[i] >= 0) {
                return;
            } else {
                this.a = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.a < ((H6457936572911484476) this.d).f;
    }

    public void remove() {
        H6457936572911484476 h6457936572911484476 = (H6457936572911484476) this.d;
        b();
        if (this.b == -1) {
            S10973172697741180971.m("Call next() before removing element from the iterator.");
            return;
        }
        h6457936572911484476.c();
        h6457936572911484476.k(this.b);
        this.b = -1;
        this.c = h6457936572911484476.h;
    }
}
