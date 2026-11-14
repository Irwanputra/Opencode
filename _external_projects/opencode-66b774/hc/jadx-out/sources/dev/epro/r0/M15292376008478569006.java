package dev.epro.r0;

import ads_mobile_sdk.ga3;
import ads_mobile_sdk.pg;
import ads_mobile_sdk.rm2;
import ads_mobile_sdk.vi3;
import ads_mobile_sdk.yk0;
import ads_mobile_sdk.yl0;
import ads_mobile_sdk.zm3;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import net.zetetic.database.CursorWindow;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class M15292376008478569006 implements W6764693637816104089 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ M15292376008478569006(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // dev.epro.r0.W6764693637816104089
    public final Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return (K17751841687800543607) obj2;
            case 1:
                K17751841687800543607 k17751841687800543607 = (K17751841687800543607) obj;
                ((ga3) obj2).f.set(k17751841687800543607);
                return k17751841687800543607;
            case 2:
                pg pgVar = (pg) obj2;
                String strC = (String) obj;
                if (T3803022700175900929.a(strC)) {
                    File file = new File(pgVar.a.getPackageResourcePath());
                    if (!file.exists() || !file.canRead()) {
                        return "";
                    }
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            byte[] bArr = new byte[CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE];
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                            for (int i = fileInputStream.read(bArr); i != -1; i = fileInputStream.read(bArr)) {
                                messageDigest.update(bArr, 0, i);
                            }
                            strC = W1349480363743553773.f.f().c(messageDigest.digest());
                            fileInputStream.close();
                        } finally {
                        }
                    } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused) {
                        return "";
                    }
                }
                return strC;
            case 3:
                return Boolean.valueOf(((Y5459655644324746057) obj2).a((rm2) obj));
            default:
                yl0 yl0Var = (yl0) obj;
                vi3 vi3Var = ((zm3) obj2).d;
                switch (L11610354117192841236.A(yl0Var.q$1())) {
                    case 0:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        yk0 yk0Var = yk0.EVENT_ID_UNSPECIFIED;
                        vi3Var.a.a(1004, -1L, null, ((int) E12098517352909843120.b(yl0Var.q$1())) + "");
                        throw new V14017774250067683447(C468629748621011703.e(E12098517352909843120.b(yl0Var.q$1()), "r: "));
                    case 1:
                    case 2:
                        return yl0Var;
                    case 3:
                        yk0 yk0Var2 = yk0.EVENT_ID_UNSPECIFIED;
                        vi3Var.a.a(1003, -1L, null, ((int) E12098517352909843120.b(yl0Var.q$1())) + "");
                        throw new D17661665633033485461(C468629748621011703.e(E12098517352909843120.b(yl0Var.q$1()), "r: "));
                    case 12:
                        yk0 yk0Var3 = yk0.EVENT_ID_UNSPECIFIED;
                        vi3Var.a.a(1004, -1L, null, ((int) E12098517352909843120.b(yl0Var.q$1())) + "");
                        throw new T11567659380858569563(C468629748621011703.e(E12098517352909843120.b(yl0Var.q$1()), "r: "));
                    default:
                        throw new IncompatibleClassChangeError();
                }
        }
    }
}
