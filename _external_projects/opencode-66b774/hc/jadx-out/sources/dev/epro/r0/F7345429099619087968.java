package dev.epro.r0;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F7345429099619087968 extends L14144435763408236280 implements IInterface {
    public final M17133811648581684718 j;
    public final /* synthetic */ S8093187219740136623 k;
    public final /* synthetic */ byte l;
    public final P8755783434649014957 m;
    public final /* synthetic */ S8093187219740136623 n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public F7345429099619087968(S8093187219740136623 s8093187219740136623, M17133811648581684718 m17133811648581684718, byte b) {
        this(s8093187219740136623, m17133811648581684718, (char) 0);
        this.l = b;
        switch (b) {
            case 1:
                Objects.requireNonNull(s8093187219740136623);
                this.n = s8093187219740136623;
                this(s8093187219740136623, m17133811648581684718, (char) 0);
                this.m = new P8755783434649014957("OnWarmUpIntegrityTokenCallback");
                break;
            default:
                Objects.requireNonNull(s8093187219740136623);
                this.n = s8093187219740136623;
                this.m = new P8755783434649014957("OnRequestIntegrityTokenCallback");
                break;
        }
    }

    public final void d(Bundle bundle) {
        this.k.e.c(this.j);
    }

    public final void e(Bundle bundle) {
        this.k.e.c(this.j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F7345429099619087968(S8093187219740136623 s8093187219740136623, M17133811648581684718 m17133811648581684718, char c) {
        super((byte) 0);
        Objects.requireNonNull(s8093187219740136623);
        this.k = s8093187219740136623;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.j = m17133811648581684718;
    }
}
