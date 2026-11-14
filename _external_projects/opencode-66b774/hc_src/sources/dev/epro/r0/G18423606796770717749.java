package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G18423606796770717749 implements J12078565427869724451 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ G18423606796770717749(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                long j = ((U10174709222559481877) obj).a;
                M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= m3727281027331139839.e(j) ? 4 : 2;
                }
                if (m3727281027331139839.R(intValue & 1, (intValue & 19) != 18)) {
                    I828473291849542367.b(((M15272139858142996533) obj4).c, j, m3727281027331139839, (intValue << 3) & 112);
                } else {
                    m3727281027331139839.U();
                }
                return O9245300239821758723.a;
            default:
                I1722681268793429505 i1722681268793429505 = (I1722681268793429505) obj;
                M3727281027331139839 m37272810273311398392 = (M3727281027331139839) obj2;
                ((Number) obj3).intValue();
                m37272810273311398392.a0(-1498516085);
                M7102034154292440921 A0 = J8045362843799184672.A0(H12684780467384173668.b, m37272810273311398392);
                M7102034154292440921 A02 = J8045362843799184672.A0(H12684780467384173668.d, m37272810273311398392);
                W3656598099029166611 w3656598099029166611 = (W3656598099029166611) obj4;
                O3410298526443296213 o3410298526443296213 = D15913187640519482289.h;
                L6855102173777462404 l6855102173777462404 = w3656598099029166611.a;
                V697849047308847220 v697849047308847220 = w3656598099029166611.d;
                boolean booleanValue = ((Boolean) l6855102173777462404.g()).booleanValue();
                m37272810273311398392.a0(-1553362193);
                float f = booleanValue ? 1.0f : 0.8f;
                m37272810273311398392.q(false);
                Float valueOf = Float.valueOf(f);
                boolean booleanValue2 = ((Boolean) v697849047308847220.getValue()).booleanValue();
                m37272810273311398392.a0(-1553362193);
                float f2 = booleanValue2 ? 1.0f : 0.8f;
                m37272810273311398392.q(false);
                Float valueOf2 = Float.valueOf(f2);
                w3656598099029166611.f();
                m37272810273311398392.a0(386845748);
                m37272810273311398392.q(false);
                O4957013336652243483 m = V933048422416352811.m(w3656598099029166611, valueOf, valueOf2, A0, o3410298526443296213, m37272810273311398392, 196608);
                boolean booleanValue3 = ((Boolean) w3656598099029166611.a.g()).booleanValue();
                m37272810273311398392.a0(2073045083);
                float f3 = booleanValue3 ? 1.0f : 0.0f;
                m37272810273311398392.q(false);
                Float valueOf3 = Float.valueOf(f3);
                boolean booleanValue4 = ((Boolean) v697849047308847220.getValue()).booleanValue();
                m37272810273311398392.a0(2073045083);
                float f4 = booleanValue4 ? 1.0f : 0.0f;
                m37272810273311398392.q(false);
                Float valueOf4 = Float.valueOf(f4);
                w3656598099029166611.f();
                m37272810273311398392.a0(-281714272);
                m37272810273311398392.q(false);
                I1722681268793429505 L = M18113111391818111737.L(i1722681268793429505, ((Number) m.j.getValue()).floatValue(), ((Number) m.j.getValue()).floatValue(), ((Number) V933048422416352811.m(w3656598099029166611, valueOf3, valueOf4, A02, o3410298526443296213, m37272810273311398392, 196608).j.getValue()).floatValue(), 0.0f, null, 131064);
                m37272810273311398392.q(false);
                return L;
        }
    }
}
