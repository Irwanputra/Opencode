package dev.epro.r0;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class F3160751278268780235 {
    public int a;
    public Object b;

    public F3160751278268780235(int i) {
        this.a = i;
    }

    public static int t(int i, FileInputStream fileInputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = fileInputStream.read();
            if (i4 == -1) {
                throw F10620977331851870088.e();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = fileInputStream.read();
            if (i5 == -1) {
                throw F10620977331851870088.e();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw F10620977331851870088.c();
    }

    public abstract int A();

    public abstract int B();

    public abstract long C();

    public abstract boolean D(int i);

    public void E() throws A9458650138667563085 {
        int iA;
        do {
            iA = A();
            if (iA == 0) {
                return;
            }
            int i = this.a;
            if (i >= 100) {
                throw new A9458650138667563085("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.a = i + 1;
            this.a--;
        } while (D(iA));
    }

    public abstract void a(int i);

    public abstract int b();

    public abstract boolean c();

    public abstract N3121440022506799205 f(N3121440022506799205 n3121440022506799205, List list);

    public abstract V10300877997588547986 g(Q12598757537405990809 q12598757537405990809, V10300877997588547986 v10300877997588547986);

    public abstract void i(int i);

    public abstract int j(int i);

    public abstract boolean k();

    public abstract D8243293650800641817 l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract String y();

    public abstract String z();

    public /* synthetic */ F3160751278268780235() {
    }

    public void d(Q12598757537405990809 q12598757537405990809) {
    }

    public void e(Q12598757537405990809 q12598757537405990809) {
    }
}
