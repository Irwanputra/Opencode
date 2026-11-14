package dev.epro.r0;

import ads_mobile_sdk.hv;
import ads_mobile_sdk.i03;
import ads_mobile_sdk.jx2;
import ads_mobile_sdk.qw2;
import ads_mobile_sdk.y2;
import ads_mobile_sdk.z1;
import android.net.Uri;
import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V8338995781648207308 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte t;
    public boolean u;
    public Object v;
    public Object w;
    public Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V8338995781648207308(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
        this.y = obj4;
        this.z = obj5;
        this.A = obj6;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.A;
        Object obj3 = this.z;
        Object obj4 = this.y;
        switch (b) {
            case 0:
                V8338995781648207308 v8338995781648207308 = new V8338995781648207308((E5386183571211952538) this.x, (U16834965109098959004) obj4, (W1972671267364756056) obj3, (W1972671267364756056) obj2, r4833348786910499294, (byte) 0);
                v8338995781648207308.w = obj;
                return v8338995781648207308;
            case 1:
                return new V8338995781648207308((i03) this.v, (Map.Entry) this.w, (U4857089234315512256) this.x, (Map) obj4, (qw2) obj3, (E6758797890281795541) obj2, r4833348786910499294, (byte) 1);
            case 2:
                return new V8338995781648207308((Bundle) obj4, (Bundle) obj3, (E6758797890281795541) obj2, (i03) this.v, (String) this.w, (String) this.x, r4833348786910499294);
            case 3:
                return new V8338995781648207308((jx2) this.v, (Uri) this.w, (z1) this.x, (hv) obj4, (y2) obj3, (Boolean) obj2, r4833348786910499294, (byte) 3);
            case 4:
                V8338995781648207308 v83389957816482073082 = new V8338995781648207308((P14960607863193493823) obj4, (V14323974914327418545) obj3, (L16425900549479658727) obj2, r4833348786910499294);
                v83389957816482073082.w = obj;
                return v83389957816482073082;
            default:
                return new V8338995781648207308((R3192876217964974737) this.x, (Q14196755420833223976) obj4, (W5797197595347441198) obj3, (L12639328004344855510) obj2, r4833348786910499294, (byte) 5);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((V8338995781648207308) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                return ((V8338995781648207308) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 2:
                return ((V8338995781648207308) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 3:
                return ((V8338995781648207308) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 4:
                return ((V8338995781648207308) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((V8338995781648207308) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2 A[Catch: all -> 0x00db, TryCatch #4 {all -> 0x00db, blocks: (B:33:0x0054, B:38:0x008d, B:43:0x00a5, B:55:0x009a, B:57:0x009f, B:58:0x00a2, B:59:0x0083, B:61:0x0087, B:62:0x008a), top: B:32:0x0054 }] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.concurrent.atomic.AtomicInteger] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x02cf -> B:133:0x02d3). Please report as a decompilation issue!!! */
    @Override // dev.epro.r0.B401944902727389462
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.V8338995781648207308.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V8338995781648207308(Object obj, Object obj2, Object obj3, Object obj4, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V8338995781648207308(P14960607863193493823 p14960607863193493823, V14323974914327418545 v14323974914327418545, L16425900549479658727 l16425900549479658727, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 4;
        this.y = p14960607863193493823;
        this.z = v14323974914327418545;
        this.A = l16425900549479658727;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V8338995781648207308(Bundle bundle, Bundle bundle2, E6758797890281795541 e6758797890281795541, i03 i03Var, String str, String str2, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 2;
        this.v = i03Var;
        this.w = str;
        this.x = str2;
        this.y = bundle;
        this.z = bundle2;
        this.A = e6758797890281795541;
    }
}
