package dev.epro.r0;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final /* synthetic */ class D11988991656201568495 implements I8220319968057211477, Y16033830328113725410, X2032800221577147908, D9017764184818113880, W15703198999188857860, P11181209716866457693 {
    public final /* synthetic */ byte a;

    public /* synthetic */ D11988991656201568495(byte b) {
        this.a = b;
    }

    public static /* synthetic */ void g(int i, Object obj) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + obj);
    }

    public static /* synthetic */ void h(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void i(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void j(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void k(String str, Object obj) {
        throw new IllegalStateException(str + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l(String str, Object obj, int i) {
        throw new IllegalArgumentException(str + obj + ((char) i));
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void p(Throwable th) {
        throw new M8821877208104636290(th);
    }

    public static /* synthetic */ void q(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void r(String str, Object obj) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void s(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void t(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    @Override // dev.epro.r0.W15703198999188857860
    public I1581330382723795749 a(Z1953481206310471956 z1953481206310471956) {
        D14731132657808549702 d14731132657808549702;
        switch (this.a) {
            case 7:
                Q1452147735941829490 q1452147735941829490 = (Q1452147735941829490) z1953481206310471956;
                S374265373476613408 y = X4910690020927282554.y();
                Q4760503431172271891 y2 = V14519458016070766624.y();
                String str = q1452147735941829490.j.a;
                y2.e();
                ((V14519458016070766624) y2.b).A(str);
                V14519458016070766624 v14519458016070766624 = (V14519458016070766624) y2.b();
                y.e();
                ((X4910690020927282554) y.b).B(v14519458016070766624);
                return I1581330382723795749.f("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((X4910690020927282554) y.b()).f(), D14731132657808549702.i0, M18113111391818111737.R(q1452147735941829490.j.b), q1452147735941829490.l);
            case 11:
                H11662549649512977837 h11662549649512977837 = (H11662549649512977837) z1953481206310471956;
                J9470203582267173614 y3 = O4237683467374095939.y();
                M12396306005833971742 c0 = U15853425786981391261.c0(h11662549649512977837.j);
                y3.e();
                ((O4237683467374095939) y3.b).B(c0);
                M18082356575916498704 f = ((O4237683467374095939) y3.b()).f();
                D14731132657808549702 d147311326578085497022 = D14731132657808549702.i0;
                D14731132657808549702 d147311326578085497023 = h11662549649512977837.j.a;
                if (D14731132657808549702.c0 == d147311326578085497023) {
                    d14731132657808549702 = D14731132657808549702.k0;
                } else {
                    if (D14731132657808549702.d0 != d147311326578085497023) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(d147311326578085497023)));
                    }
                    d14731132657808549702 = D14731132657808549702.m0;
                }
                return I1581330382723795749.f("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", f, d147311326578085497022, d14731132657808549702, h11662549649512977837.l);
            default:
                return ((U2157586126377853843) z1953481206310471956).j;
        }
    }

    @Override // dev.epro.r0.P11181209716866457693
    public Z1953481206310471956 b(I1581330382723795749 i1581330382723795749) {
        D14731132657808549702 d14731132657808549702;
        switch (this.a) {
            case 8:
                if (!((String) i1581330382723795749.a).equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    S10973172697741180971.j("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    X4910690020927282554 z = X4910690020927282554.z((N17666688112968464504) i1581330382723795749.b, R4931231174251890987.a());
                    if (z.x() != 0) {
                        throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(z)));
                    }
                    String x = z.w().x();
                    D14731132657808549702 d147311326578085497022 = (D14731132657808549702) i1581330382723795749.d;
                    if (d147311326578085497022 == D14731132657808549702.k0) {
                        d14731132657808549702 = D14731132657808549702.U;
                    } else {
                        if (d147311326578085497022 != D14731132657808549702.m0) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(d147311326578085497022)));
                        }
                        d14731132657808549702 = D14731132657808549702.V;
                    }
                    return Q1452147735941829490.e0(new Q17410559678825476760(x, d14731132657808549702), (Integer) i1581330382723795749.e);
                } catch (N11355818201711573941 e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
                }
            default:
                if (!((String) i1581330382723795749.a).equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    S10973172697741180971.j("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    O4237683467374095939 z2 = O4237683467374095939.z((N17666688112968464504) i1581330382723795749.b, R4931231174251890987.a());
                    if (z2.x() != 0) {
                        throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(z2)));
                    }
                    M12396306005833971742 w = z2.w();
                    D14731132657808549702 d147311326578085497023 = (D14731132657808549702) i1581330382723795749.d;
                    D14731132657808549702 d147311326578085497024 = D14731132657808549702.k0;
                    if (d147311326578085497023 != d147311326578085497024 && d147311326578085497023 != (d147311326578085497024 = D14731132657808549702.m0)) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(d147311326578085497023)));
                    }
                    return H11662549649512977837.e0(U15853425786981391261.W(w, d147311326578085497024), (Integer) i1581330382723795749.e);
                } catch (N11355818201711573941 e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
                }
        }
    }

    @Override // dev.epro.r0.Y16033830328113725410
    public boolean c() {
        return false;
    }

    @Override // dev.epro.r0.I8220319968057211477
    public Object d(Z1953481206310471956 z1953481206310471956) {
        switch (this.a) {
            case 2:
                D13009265547245150778.a(((Q1452147735941829490) z1953481206310471956).j.a);
                throw null;
            case 3:
                D13009265547245150778.a(((H11662549649512977837) z1953481206310471956).j.b);
                throw null;
            case 13:
                U2157586126377853843 u2157586126377853843 = (U2157586126377853843) z1953481206310471956;
                I1581330382723795749 i1581330382723795749 = u2157586126377853843.j;
                D14731132657808549702 d14731132657808549702 = (D14731132657808549702) i1581330382723795749.d;
                O8620973563946607355.V(d14731132657808549702);
                O8620973563946607355.J(d14731132657808549702, (Integer) u2157586126377853843.j.e).b();
                return new B5876679728636531530();
            case 25:
                I1581330382723795749 i15813303827237957492 = ((U2157586126377853843) z1953481206310471956).j;
                O8620973563946607355.J((D14731132657808549702) i15813303827237957492.d, (Integer) i15813303827237957492.e).b();
                D14731132657808549702 d147311326578085497022 = D14731132657808549702.l0;
                return new E16404348017745658067();
            default:
                I1581330382723795749 i15813303827237957493 = ((U2157586126377853843) z1953481206310471956).j;
                A8947685337014270457 a8947685337014270457 = (A8947685337014270457) U1515840713725655492.d.a(A8947685337014270457.class, (String) i15813303827237957493.a).a((N17666688112968464504) i15813303827237957493.b);
                D14731132657808549702 d147311326578085497023 = (D14731132657808549702) i15813303827237957493.d;
                return new Y5809172221756938728(a8947685337014270457, O8620973563946607355.J(d147311326578085497023, (Integer) i15813303827237957493.e).b(), d147311326578085497023 != D14731132657808549702.l0 ? new byte[0] : new byte[]{0});
        }
    }

    @Override // dev.epro.r0.D9017764184818113880
    public T5990920249823963282 e(I1632105416032993715 i1632105416032993715) {
        D14731132657808549702 d14731132657808549702;
        switch (this.a) {
            case 6:
                String str = (String) i1632105416032993715.c;
                if (!str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ", str));
                    return null;
                }
                try {
                    String x = V14519458016070766624.z((N17666688112968464504) i1632105416032993715.b, R4931231174251890987.a()).x();
                    D14731132657808549702 d147311326578085497022 = (D14731132657808549702) i1632105416032993715.d;
                    if (d147311326578085497022 == D14731132657808549702.k0) {
                        d14731132657808549702 = D14731132657808549702.U;
                    } else {
                        if (d147311326578085497022 != D14731132657808549702.m0) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(d147311326578085497022)));
                        }
                        d14731132657808549702 = D14731132657808549702.V;
                    }
                    return new Q17410559678825476760(x, d14731132657808549702);
                } catch (N11355818201711573941 e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
                }
            default:
                String str2 = (String) i1632105416032993715.c;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    S10973172697741180971.j(G6547577305291411977.C("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ", str2));
                    return null;
                }
                try {
                    return U15853425786981391261.W(M12396306005833971742.A((N17666688112968464504) i1632105416032993715.b, R4931231174251890987.a()), (D14731132657808549702) i1632105416032993715.d);
                } catch (N11355818201711573941 e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
                }
        }
    }

    @Override // dev.epro.r0.X2032800221577147908
    public I1632105416032993715 f(T5990920249823963282 t5990920249823963282) {
        D14731132657808549702 d14731132657808549702;
        switch (this.a) {
            case 5:
                Q17410559678825476760 q17410559678825476760 = (Q17410559678825476760) t5990920249823963282;
                D14731132657808549702 R = M18113111391818111737.R(q17410559678825476760.b);
                Q4760503431172271891 y = V14519458016070766624.y();
                String str = q17410559678825476760.a;
                y.e();
                ((V14519458016070766624) y.b).A(str);
                return I1632105416032993715.d("type.googleapis.com/google.crypto.tink.KmsAeadKey", R, ((V14519458016070766624) y.b()).f());
            case 9:
                T16846362121353535418 t16846362121353535418 = (T16846362121353535418) t5990920249823963282;
                D14731132657808549702 d147311326578085497022 = t16846362121353535418.a;
                if (D14731132657808549702.c0 == d147311326578085497022) {
                    d14731132657808549702 = D14731132657808549702.k0;
                } else {
                    if (D14731132657808549702.d0 != d147311326578085497022) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(d147311326578085497022)));
                    }
                    d14731132657808549702 = D14731132657808549702.m0;
                }
                return I1632105416032993715.d("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", d14731132657808549702, U15853425786981391261.c0(t16846362121353535418).f());
            default:
                return ((V5443054910857193357) t5990920249823963282).a;
        }
    }
}
