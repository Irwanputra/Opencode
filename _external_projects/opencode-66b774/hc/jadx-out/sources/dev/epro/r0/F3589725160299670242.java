package dev.epro.r0;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class F3589725160299670242 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ A13573370436844979007 b;
    public final /* synthetic */ int c;

    public /* synthetic */ F3589725160299670242(A13573370436844979007 a13573370436844979007, int i, List list, boolean z) {
        this.a = (byte) 2;
        this.b = a13573370436844979007;
        this.c = i;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        switch (this.a) {
            case 0:
                A13573370436844979007 a13573370436844979007 = this.b;
                int i = this.c;
                a13573370436844979007.k.getClass();
                try {
                    a13573370436844979007.w.j(i, N10274084507843431211.CANCEL);
                    synchronized (a13573370436844979007) {
                        a13573370436844979007.y.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return O9245300239821758723.a;
            case 1:
                A13573370436844979007 a135733704368449790072 = this.b;
                int i2 = this.c;
                a135733704368449790072.k.getClass();
                synchronized (a135733704368449790072) {
                    a135733704368449790072.y.remove(Integer.valueOf(i2));
                }
                return O9245300239821758723.a;
            default:
                A13573370436844979007 a135733704368449790073 = this.b;
                int i3 = this.c;
                a135733704368449790073.k.getClass();
                try {
                    a135733704368449790073.w.j(i3, N10274084507843431211.CANCEL);
                    synchronized (a135733704368449790073) {
                        a135733704368449790073.y.remove(Integer.valueOf(i3));
                    }
                } catch (IOException unused2) {
                }
                return O9245300239821758723.a;
        }
    }

    public /* synthetic */ F3589725160299670242(A13573370436844979007 a13573370436844979007, int i, Object obj, byte b) {
        this.a = b;
        this.b = a13573370436844979007;
        this.c = i;
    }
}
