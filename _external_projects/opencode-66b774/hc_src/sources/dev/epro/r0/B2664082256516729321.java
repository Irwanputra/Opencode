package dev.epro.r0;

import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B2664082256516729321 implements U16443665883761795894 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final F4096073349764486348 c;

    public B2664082256516729321(U16443665883761795894 u16443665883761795894, F4096073349764486348 f4096073349764486348, byte b) {
        this.a = b;
        switch (b) {
            case 3:
                u16443665883761795894.getClass();
                f4096073349764486348.getClass();
                this.b = u16443665883761795894;
                this.c = f4096073349764486348;
                break;
            default:
                E12338935621460473980 e12338935621460473980 = E12338935621460473980.h;
                this.b = u16443665883761795894;
                this.c = f4096073349764486348;
                break;
        }
    }

    @Override // dev.epro.r0.U16443665883761795894
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new Z3304046065836599372(((U16443665883761795894) this.b).iterator(), this.c);
            case 1:
                return new I938944866413167075(this);
            case 2:
                return new M7968841747429118896(this);
            case 3:
                return new V8329864917487020755(this);
            default:
                return new C13932356399610645840(this);
        }
    }

    public /* synthetic */ B2664082256516729321(Object obj, F4096073349764486348 f4096073349764486348, byte b) {
        this.a = b;
        this.b = obj;
        this.c = f4096073349764486348;
    }
}
