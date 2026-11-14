package dev.epro.r0;

import android.accounts.Account;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class R11411706056986754302 extends E1636901823844057514 implements N2113054325721141872 {
    public final Set b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public R11411706056986754302(android.content.Context r10, android.os.Looper r11, int r12, dev.epro.r0.B16853324304735504143 r13, dev.epro.r0.U11179075180450893832 r14, dev.epro.r0.R3599537314284374589 r15) {
        /*
            r9 = this;
            dev.epro.r0.K4690422250417820120 r3 = dev.epro.r0.K4690422250417820120.a(r10)
            dev.epro.r0.X11123940576545591343 r4 = dev.epro.r0.X11123940576545591343.d
            dev.epro.r0.M18113111391818111737.v(r14)
            dev.epro.r0.M18113111391818111737.v(r15)
            dev.epro.r0.M204440408817344908 r6 = new dev.epro.r0.M204440408817344908
            r0 = 9
            r6.<init>(r14, r0)
            dev.epro.r0.M204440408817344908 r7 = new dev.epro.r0.M204440408817344908
            r14 = 10
            r7.<init>(r15, r14)
            java.lang.Object r14 = r13.e
            r8 = r14
            java.lang.String r8 = (java.lang.String) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r9 = r13.c
            java.util.Set r9 = (java.util.Set) r9
            java.util.Iterator r10 = r9.iterator()
        L2e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L48
            java.lang.Object r11 = r10.next()
            com.google.android.gms.common.api.Scope r11 = (com.google.android.gms.common.api.Scope) r11
            boolean r11 = r9.contains(r11)
            if (r11 == 0) goto L41
            goto L2e
        L41:
            java.lang.String r9 = "Expanding scopes is not permitted, use implied scopes instead"
            dev.epro.r0.S10973172697741180971.m(r9)
            r9 = 0
            throw r9
        L48:
            r0.b = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.R11411706056986754302.<init>(android.content.Context, android.os.Looper, int, dev.epro.r0.B16853324304735504143, dev.epro.r0.U11179075180450893832, dev.epro.r0.R3599537314284374589):void");
    }

    @Override // dev.epro.r0.N2113054325721141872
    public final Set a() {
        return requiresSignIn() ? this.b : Collections.EMPTY_SET;
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final Account getAccount() {
        return null;
    }

    @Override // dev.epro.r0.E1636901823844057514
    public final Set getScopes() {
        return this.b;
    }
}
