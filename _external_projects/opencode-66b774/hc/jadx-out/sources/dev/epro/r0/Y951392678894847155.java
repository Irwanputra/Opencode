package dev.epro.r0;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y951392678894847155 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public Y951392678894847155(int i, String str) {
        String str2;
        if (i == 1) {
            str2 = "HTTP";
        } else if (i == 2) {
            str2 = "SOCKS4";
        } else {
            if (i != 3) {
                throw null;
            }
            str2 = "SOCKS5";
        }
        super(G6547577305291411977.t("Proxy Exception ", str2, " : ", str));
    }
}
