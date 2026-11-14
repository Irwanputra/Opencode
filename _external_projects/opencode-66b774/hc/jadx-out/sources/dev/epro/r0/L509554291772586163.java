package dev.epro.r0;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L509554291772586163 {
    public final /* synthetic */ byte a;
    public final P14632082186738269386 b;

    public /* synthetic */ L509554291772586163(P14632082186738269386 p14632082186738269386, byte b) {
        this.a = b;
        this.b = p14632082186738269386;
    }

    public final Object a(String str) throws GeneralSecurityException {
        byte b = this.a;
        int i = 0;
        P14632082186738269386 p14632082186738269386 = this.b;
        Exception exc = null;
        switch (b) {
            case 0:
                String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < 2; i2++) {
                    Provider provider = Security.getProvider(strArr[i2]);
                    if (provider != null) {
                        arrayList.add(provider);
                    }
                }
                int size = arrayList.size();
                Exception exc2 = null;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    try {
                        return p14632082186738269386.e(str, (Provider) obj);
                    } catch (Exception e) {
                        if (exc2 == null) {
                            exc2 = e;
                        }
                    }
                }
                return p14632082186738269386.e(str, null);
            case 1:
                return p14632082186738269386.e(str, null);
            default:
                String[] strArr2 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < 3; i3++) {
                    Provider provider2 = Security.getProvider(strArr2[i3]);
                    if (provider2 != null) {
                        arrayList2.add(provider2);
                    }
                }
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    try {
                        return p14632082186738269386.e(str, (Provider) obj2);
                    } catch (Exception e2) {
                        if (exc == null) {
                            exc = e2;
                        }
                    }
                }
                throw new GeneralSecurityException("No good Provider found.", exc);
        }
    }
}
