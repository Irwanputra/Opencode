package dev.epro.r0;

import ads_mobile_sdk.fq;
import ads_mobile_sdk.pu0;
import ads_mobile_sdk.tu0;
import ads_mobile_sdk.xu0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W15082408677311432558 {
    public static M16184408391440927034 a(M16184408391440927034 m16184408391440927034) {
        String p;
        String p2;
        m16184408391440927034.getClass();
        if (!(m16184408391440927034 instanceof xu0)) {
            if (m16184408391440927034 instanceof pu0) {
                return m16184408391440927034;
            }
            Z3383101362411723454.g();
            return null;
        }
        I16631908410500040363 i16631908410500040363 = (I16631908410500040363) ((xu0) m16184408391440927034).b;
        K15572083692188606544 w = i16631908410500040363.w("errors");
        String p3 = w != null ? w.p() : null;
        K15572083692188606544 w2 = i16631908410500040363.w("valid");
        if (w2 != null) {
            boolean z = true;
            if (w2.j() == 1) {
                K15572083692188606544 w3 = i16631908410500040363.w("url");
                String p4 = w3 != null ? w3.p() : null;
                if (p4 == null) {
                    return new tu0("BuildAdUrlResult url is null", 1);
                }
                K15572083692188606544 w4 = i16631908410500040363.w("base_uri");
                String p5 = w4 != null ? w4.p() : null;
                K15572083692188606544 w5 = i16631908410500040363.w("post_parameters");
                String p6 = w5 != null ? w5.p() : null;
                K15572083692188606544 w6 = i16631908410500040363.w("cookies_include");
                if (w6 != null && (p2 = w6.p()) != null && !p2.equals("1") && !p2.equals("true")) {
                    z = false;
                }
                boolean z2 = z;
                K15572083692188606544 w7 = i16631908410500040363.w("csrb_errors");
                return new xu0(new fq(p3 != null ? M8927913404651150384.p0(p3, new String[]{","}, 6) : null, p5, p6, z2, p4, null, (w7 == null || (p = w7.p()) == null) ? null : M8927913404651150384.p0(p, new String[]{","}, 6)));
            }
        }
        return new tu0(G6547577305291411977.C("Error building request URL: ", p3), 2);
    }
}
