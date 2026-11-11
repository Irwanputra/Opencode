package p131.p161.p211.p214.p215;

import p034.p095.C1687;
import p131.p161.p211.AbstractC2658;
import p131.p161.p211.C2673;
import p131.p161.p211.InterfaceC2522;
import p131.p161.p211.InterfaceC2530;
import p131.p161.p211.InterfaceC2538;
import p131.p161.p211.InterfaceC2656;
import p131.p161.p211.InterfaceC2669;
import p131.p161.p211.p213.C2534;
import p131.p161.p211.p218.C2672;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.のぷのちつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2609<T> extends AbstractC2658<T> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final InterfaceC2530<T> f10026;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public AbstractC2658<T> f10027;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C2673 f10028;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final InterfaceC2522<T> f10029;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final InterfaceC2656 f10030;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final C2609<T>.C2610 f10031 = new C2610(this, null);

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C2672<T> f10032;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.のぷのちつ$〺つふすそ, reason: contains not printable characters */
    public final class C2610 implements InterfaceC2669, InterfaceC2538 {
        public C2610(C2609 c2609, C2612 c2612) {
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.のぷのちつ$くし〴〺ぅ, reason: contains not printable characters */
    public static final class C2611 implements InterfaceC2656 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final C2672<?> f10033;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final boolean f10034;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final InterfaceC2522<?> f10035;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final InterfaceC2530<?> f10036;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final Class<?> f10037;

        public C2611(Object obj, C2672<?> c2672, boolean z, Class<?> cls) {
            InterfaceC2522<?> interfaceC2522 = obj instanceof InterfaceC2522 ? (InterfaceC2522) obj : null;
            this.f10035 = interfaceC2522;
            InterfaceC2530<?> interfaceC2530 = obj instanceof InterfaceC2530 ? (InterfaceC2530) obj : null;
            this.f10036 = interfaceC2530;
            C1687.m3659((interfaceC2522 == null && interfaceC2530 == null) ? false : true);
            this.f10033 = c2672;
            this.f10034 = z;
            this.f10037 = null;
        }

        @Override // p131.p161.p211.InterfaceC2656
        /* renamed from: げつ〴ぬぐ */
        public <T> AbstractC2658<T> mo4592(C2673 c2673, C2672<T> c2672) {
            C2672<?> c26722 = this.f10033;
            if (c26722 != null ? c26722.equals(c2672) || (this.f10034 && this.f10033.f10128 == c2672.f10130) : this.f10037.isAssignableFrom(c2672.f10130)) {
                return new C2609(this.f10035, this.f10036, c2673, c2672, this);
            }
            return null;
        }
    }

    public C2609(InterfaceC2522<T> interfaceC2522, InterfaceC2530<T> interfaceC2530, C2673 c2673, C2672<T> c2672, InterfaceC2656 interfaceC2656) {
        this.f10029 = interfaceC2522;
        this.f10026 = interfaceC2530;
        this.f10028 = c2673;
        this.f10032 = c2672;
        this.f10030 = interfaceC2656;
    }

    @Override // p131.p161.p211.AbstractC2658
    /* renamed from: 〺つふすそ */
    public void mo4533(C2534 c2534, T t) {
        InterfaceC2522<T> interfaceC2522 = this.f10029;
        if (interfaceC2522 == null) {
            AbstractC2658<T> abstractC2658 = this.f10027;
            if (abstractC2658 == null) {
                abstractC2658 = this.f10028.m4649(this.f10030, this.f10032);
                this.f10027 = abstractC2658;
            }
            abstractC2658.mo4533(c2534, t);
            return;
        }
        if (t == null) {
            c2534.mo4541();
        } else {
            C2562.f9985.mo4533(c2534, interfaceC2522.mo4031(t, this.f10032.f10128, this.f10031));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    @Override // p131.p161.p211.AbstractC2658
    /* renamed from: げつ〴ぬぐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T mo4534(p131.p161.p211.p213.C2535 r4) {
        /*
            r3 = this;
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぇぬぎばつ<T> r0 = r3.f10026
            if (r0 != 0) goto L1a
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.なぶひせが<T> r0 = r3.f10027
            if (r0 == 0) goto L9
            goto L15
        L9:
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぺふねづ〺 r0 = r3.f10028
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.どぇぞほだ r1 = r3.f10030
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぺづげぺが.げつ〴ぬぐ<T> r2 = r3.f10032
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.なぶひせが r0 = r0.m4649(r1, r2)
            r3.f10027 = r0
        L15:
            java.lang.Object r4 = r0.mo4534(r4)
            return r4
        L1a:
            r4.mo4559()     // Catch: java.lang.NumberFormatException -> L29 java.io.IOException -> L30 p131.p161.p211.p213.C2537 -> L37 java.io.EOFException -> L3e
            r0 = 0
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.なぶひせが<なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉざぅち〻> r1 = p131.p161.p211.p214.p215.C2562.f9985     // Catch: java.io.EOFException -> L27 java.lang.NumberFormatException -> L29 java.io.IOException -> L30 p131.p161.p211.p213.C2537 -> L37
            java.lang.Object r4 = r1.mo4534(r4)     // Catch: java.io.EOFException -> L27 java.lang.NumberFormatException -> L29 java.io.IOException -> L30 p131.p161.p211.p213.C2537 -> L37
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉざぅち〻 r4 = (p131.p161.p211.AbstractC2532) r4     // Catch: java.io.EOFException -> L27 java.lang.NumberFormatException -> L29 java.io.IOException -> L30 p131.p161.p211.p213.C2537 -> L37
            goto L44
        L27:
            r4 = move-exception
            goto L40
        L29:
            r4 = move-exception
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉ〲なぱぽた r0 = new なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉ〲なぱぽた
            r0.<init>(r4)
            throw r0
        L30:
            r4 = move-exception
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ざとぅぼこ〺 r0 = new なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ざとぅぼこ〺
            r0.<init>(r4)
            throw r0
        L37:
            r4 = move-exception
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉ〲なぱぽた r0 = new なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉ〲なぱぽた
            r0.<init>(r4)
            throw r0
        L3e:
            r4 = move-exception
            r0 = 1
        L40:
            if (r0 == 0) goto L5a
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.は〲ぱなで r4 = p131.p161.p211.C2660.f10117
        L44:
            r4.getClass()
            boolean r0 = r4 instanceof p131.p161.p211.C2660
            if (r0 == 0) goto L4d
            r4 = 0
            return r4
        L4d:
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぇぬぎばつ<T> r0 = r3.f10026
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぺづげぺが.げつ〴ぬぐ<T> r1 = r3.f10032
            java.lang.reflect.Type r1 = r1.f10128
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.じぜこほぱ.ぇ〳〲〺すっ.のぷのちつ<T>$〺つふすそ r2 = r3.f10031
            java.lang.Object r4 = r0.m4537(r4, r1, r2)
            return r4
        L5a:
            なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉ〲なぱぽた r0 = new なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉ〲なぱぽた
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p161.p211.p214.p215.C2609.mo4534(なぎぱいぢぎ.なぎぱいぢぎ.くし〴〺ぅ.ぉひのべい.げつ〴ぬぐ):java.lang.Object");
    }
}
