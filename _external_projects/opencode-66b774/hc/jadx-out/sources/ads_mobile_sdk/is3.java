package ads_mobile_sdk;

import dev.epro.r0.G10308367458345557237;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4239627874707364917;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.W3966999060673115128;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z3437138737604933638;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class is3 extends R4239627874707364917 implements G10308367458345557237, W3966999060673115128 {
    public final H15186625828076266306 c;
    public qo3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is3(W5797197595347441198 w5797197595347441198, Map map) {
        super(w5797197595347441198, map);
        w5797197595347441198.getClass();
        map.getClass();
        this.c = new H15186625828076266306();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.is3 r9, ads_mobile_sdk.qo3 r10, dev.epro.r0.K14749510448791472029 r11) {
        /*
            boolean r0 = r11 instanceof ads_mobile_sdk.gs3
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.gs3 r0 = (ads_mobile_sdk.gs3) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.gs3 r0 = new ads_mobile_sdk.gs3
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.d
            int r1 = r0.f
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            dev.epro.r0.H15186625828076266306 r9 = r0.c
            ads_mobile_sdk.qo3 r10 = r0.b
            ads_mobile_sdk.is3 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r11)
            r11 = r9
            r9 = r0
        L2c:
            r7 = r10
            goto L4b
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r9)
            r9 = 0
            return r9
        L35:
            dev.epro.r0.E17665849472693074628.k(r11)
            dev.epro.r0.H15186625828076266306 r11 = r9.c
            r0.a = r9
            r0.b = r10
            r0.c = r11
            r0.f = r2
            java.lang.Object r0 = r11.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L2c
            return r1
        L4b:
            r6 = 0
            ads_mobile_sdk.qo3 r10 = r9.d     // Catch: java.lang.Throwable -> L5c
            dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a
            if (r10 == 0) goto L5f
            boolean r10 = dev.epro.r0.S10823041268949770285.t(r7, r10)     // Catch: java.lang.Throwable -> L5c
            if (r10 == 0) goto L5f
            r11.b(r6)
            return r0
        L5c:
            r0 = move-exception
            r9 = r0
            goto La1
        L5f:
            r9.d = r7     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r10 = r9.b     // Catch: java.lang.Throwable -> L5c
            java.util.Map r10 = (java.util.Map) r10     // Catch: java.lang.Throwable -> L5c
            java.util.Set r10 = r10.entrySet()     // Catch: java.lang.Throwable -> L5c
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L5c
        L6d:
            boolean r1 = r10.hasNext()     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L9d
            java.lang.Object r1 = r10.next()     // Catch: java.lang.Throwable -> L5c
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L5c
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r5 = r1.getValue()     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r1 = r9.a     // Catch: java.lang.Throwable -> L5c
            dev.epro.r0.W5797197595347441198 r1 = (dev.epro.r0.W5797197595347441198) r1     // Catch: java.lang.Throwable -> L5c
            ads_mobile_sdk.y9 r3 = new ads_mobile_sdk.y9     // Catch: java.lang.Throwable -> L5c
            r8 = 1
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5c
            dev.epro.r0.I3826119971291161142 r4 = dev.epro.r0.I3826119971291161142.a     // Catch: java.lang.Throwable -> L5c
            r1.getClass()     // Catch: java.lang.Throwable -> L5c
            dev.epro.r0.P7598478828797568949 r5 = new dev.epro.r0.P7598478828797568949     // Catch: java.lang.Throwable -> L5c
            r5.<init>(r3, r6, r2)     // Catch: java.lang.Throwable -> L5c
            r3 = 2
            dev.epro.r0.R7033599853981556291.E(r1, r4, r6, r5, r3)     // Catch: java.lang.Throwable -> L5c
            goto L6d
        L9d:
            r11.b(r6)
            return r0
        La1:
            r11.b(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.is3.a(ads_mobile_sdk.is3, ads_mobile_sdk.qo3, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.G10308367458345557237
    public final Object b(qo3 qo3Var, R4833348786910499294 r4833348786910499294) {
        return a(this, qo3Var, (K14749510448791472029) r4833348786910499294);
    }

    @Override // dev.epro.r0.W3966999060673115128
    public final Object c(qo3 qo3Var, R14062301455140331524 r14062301455140331524) {
        Object objA = a(this, qo3Var, r14062301455140331524);
        return objA == Z3437138737604933638.a ? objA : O9245300239821758723.a;
    }
}
