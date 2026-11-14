package dev.epro.r0;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q9103558464140585130 implements B13729205492206812220 {
    public final M15575253401561633137 a;
    public final /* synthetic */ A13573370436844979007 b;

    public Q9103558464140585130(A13573370436844979007 a13573370436844979007, M15575253401561633137 m15575253401561633137) {
        this.b = a13573370436844979007;
        this.a = m15575253401561633137;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() throws Throwable {
        Throwable th;
        A13573370436844979007 a13573370436844979007 = this.b;
        M15575253401561633137 m15575253401561633137 = this.a;
        N10274084507843431211 n10274084507843431211 = N10274084507843431211.INTERNAL_ERROR;
        IOException iOException = null;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e) {
                iOException = e;
            }
            if (!m15575253401561633137.b(true, this)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            do {
                try {
                } catch (Throwable th3) {
                    th = th3;
                }
            } while (m15575253401561633137.b(false, this));
            N10274084507843431211 n102740845078434312112 = N10274084507843431211.NO_ERROR;
            try {
                n10274084507843431211 = N10274084507843431211.CANCEL;
                a13573370436844979007.b(n102740845078434312112, n10274084507843431211, null);
                this = n102740845078434312112;
            } catch (IOException e2) {
                iOException = e2;
                N10274084507843431211 n102740845078434312113 = N10274084507843431211.PROTOCOL_ERROR;
                a13573370436844979007.b(n102740845078434312113, n102740845078434312113, iOException);
                this = n102740845078434312113;
            }
            L14928198200995638215.b(m15575253401561633137);
            return O9245300239821758723.a;
        } catch (Throwable th4) {
            th = th4;
        }
        this = n10274084507843431211;
        a13573370436844979007.b(this, n10274084507843431211, iOException);
        L14928198200995638215.b(m15575253401561633137);
        throw th;
    }
}
