package dev.epro.r0;

import ads_mobile_sdk.hm2;
import ads_mobile_sdk.vo3;
import ads_mobile_sdk.xt3;
import java.util.Locale;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I10296188574218802332 extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public I10296188574218802332(vo3 vo3Var, hm2 hm2Var, long j) {
        int iD = C468629748621011703.d(430548174, 1962777121, -1294155075, 737454769) ^ 129967840;
        Locale locale = Locale.US;
        Object[] objArr = new Object[iD];
        objArr[0] = Long.valueOf(vo3Var.a);
        objArr[1] = Long.valueOf(hm2Var.a);
        Long lValueOf = Long.valueOf(j);
        objArr[2] = lValueOf;
        super(String.format(locale, xt3.a("bk3t6gFTc30="), objArr));
        Optional.of(hm2Var);
        Optional.of(lValueOf);
    }

    public I10296188574218802332(vo3 vo3Var, Exception exc) {
        super(String.format(Locale.US, xt3.a("bk0="), Long.valueOf(vo3Var.a)), exc);
        Optional.empty();
        Optional.empty();
    }
}
