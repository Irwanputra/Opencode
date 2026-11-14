package dev.epro.r0;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X8293765978123339002 {
    public static final X8293765978123339002 c = new X8293765978123339002();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final H12843822278061842084 a = new H12843822278061842084((byte) 5);

    public final B8838962141159673445 a(Class cls) {
        U12348740181602283822 u12348740181602283822;
        B8838962141159673445 w;
        Class cls2;
        A9187767737237685029.a("messageType", cls);
        ConcurrentHashMap concurrentHashMap = this.b;
        B8838962141159673445 b8838962141159673445 = (B8838962141159673445) concurrentHashMap.get(cls);
        if (b8838962141159673445 != null) {
            return b8838962141159673445;
        }
        Class cls3 = K2393395423856546155.a;
        if (!T3817383632789307090.class.isAssignableFrom(cls) && (cls2 = K2393395423856546155.a) != null && !cls2.isAssignableFrom(cls)) {
            S10973172697741180971.j("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        J12688447796732847593 a = ((J1170565920253950774) this.a.b).a(cls);
        if ((a.d & 2) == 2) {
            if (T3817383632789307090.class.isAssignableFrom(cls)) {
                w = new S1345250588663079529(K2393395423856546155.c, A12869220217425608112.a, a.a);
            } else {
                B4833153077418241720 b4833153077418241720 = K2393395423856546155.b;
                U12348740181602283822 u123487401816022838222 = A12869220217425608112.b;
                if (u123487401816022838222 == null) {
                    S10973172697741180971.m("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                w = new S1345250588663079529(b4833153077418241720, u123487401816022838222, a.a);
            }
        } else if (T3817383632789307090.class.isAssignableFrom(cls)) {
            w = L12427379894931272439.w(a, L6904873737249745602.b, O9239986460338037332.b, K2393395423856546155.c, L11610354117192841236.A(a.a()) != 1 ? A12869220217425608112.a : null, B10739341014087931342.b);
        } else {
            L10938498148143445092 l10938498148143445092 = L6904873737249745602.a;
            B2789568257983442151 b2789568257983442151 = O9239986460338037332.a;
            B4833153077418241720 b48331530774182417202 = K2393395423856546155.b;
            if (L11610354117192841236.A(a.a()) != 1) {
                U12348740181602283822 u123487401816022838223 = A12869220217425608112.b;
                if (u123487401816022838223 == null) {
                    S10973172697741180971.m("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                u12348740181602283822 = u123487401816022838223;
            } else {
                u12348740181602283822 = null;
            }
            w = L12427379894931272439.w(a, l10938498148143445092, b2789568257983442151, b48331530774182417202, u12348740181602283822, B10739341014087931342.a);
        }
        B8838962141159673445 b88389621411596734452 = (B8838962141159673445) concurrentHashMap.putIfAbsent(cls, w);
        return b88389621411596734452 != null ? b88389621411596734452 : w;
    }
}
