package dev.epro.r0;

import ads_mobile_sdk.fq;
import ads_mobile_sdk.pu0;
import ads_mobile_sdk.tu0;
import ads_mobile_sdk.xu0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W15082408677311432558 {
    public static M16184408391440927034 a(M16184408391440927034 m16184408391440927034) {
        String strP;
        String strP2;
        m16184408391440927034.getClass();
        if (!(m16184408391440927034 instanceof xu0)) {
            if (m16184408391440927034 instanceof pu0) {
                return m16184408391440927034;
            }
            Z3383101362411723454.g();
            return null;
        }
        I16631908410500040363 i16631908410500040363 = (I16631908410500040363) ((xu0) m16184408391440927034).b;
        K15572083692188606544 k15572083692188606544W = i16631908410500040363.w("errors");
        String strP3 = k15572083692188606544W != null ? k15572083692188606544W.p() : null;
        K15572083692188606544 k15572083692188606544W2 = i16631908410500040363.w("valid");
        if (k15572083692188606544W2 != null) {
            boolean z = true;
            if (k15572083692188606544W2.j() == 1) {
                K15572083692188606544 k15572083692188606544W3 = i16631908410500040363.w("url");
                String strP4 = k15572083692188606544W3 != null ? k15572083692188606544W3.p() : null;
                if (strP4 == null) {
                    return new tu0("BuildAdUrlResult url is null", 1);
                }
                K15572083692188606544 k15572083692188606544W4 = i16631908410500040363.w("base_uri");
                String strP5 = k15572083692188606544W4 != null ? k15572083692188606544W4.p() : null;
                K15572083692188606544 k15572083692188606544W5 = i16631908410500040363.w("post_parameters");
                String strP6 = k15572083692188606544W5 != null ? k15572083692188606544W5.p() : null;
                K15572083692188606544 k15572083692188606544W6 = i16631908410500040363.w("cookies_include");
                if (k15572083692188606544W6 != null && (strP2 = k15572083692188606544W6.p()) != null && !strP2.equals("1") && !strP2.equals("true")) {
                    z = false;
                }
                boolean z2 = z;
                K15572083692188606544 k15572083692188606544W7 = i16631908410500040363.w("csrb_errors");
                return new xu0(new fq(strP3 != null ? M8927913404651150384.p0(strP3, new String[]{","}, 6) : null, strP5, strP6, z2, strP4, null, (k15572083692188606544W7 == null || (strP = k15572083692188606544W7.p()) == null) ? null : M8927913404651150384.p0(strP, new String[]{","}, 6)));
            }
        }
        return new tu0(G6547577305291411977.C("Error building request URL: ", strP3), 2);
    }
}
