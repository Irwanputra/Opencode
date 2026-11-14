package dev.epro.r0;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F3187248827616951674 {
    public final K5454855350570310837 a;
    public final F2833317347889062771 b;
    public final List c;
    public final O12494175665883759871 d;

    public F3187248827616951674(K5454855350570310837 k5454855350570310837, F2833317347889062771 f2833317347889062771, List list, B13729205492206812220 b13729205492206812220) {
        this.a = k5454855350570310837;
        this.b = f2833317347889062771;
        this.c = list;
        this.d = new O12494175665883759871(new O15204059771659353812(b13729205492206812220, (byte) 2));
    }

    public final List a() {
        return (List) this.d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F3187248827616951674)) {
            return false;
        }
        F3187248827616951674 f3187248827616951674 = (F3187248827616951674) obj;
        return f3187248827616951674.a == this.a && f3187248827616951674.b == this.b && S10823041268949770285.t(f3187248827616951674.a(), a()) && f3187248827616951674.c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((a().hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(Z115818233709597990.k0(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                type2.getClass();
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.a);
        sb.append(" cipherSuite=");
        sb.append(this.b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.c;
        ArrayList arrayList2 = new ArrayList(Z115818233709597990.k0(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                type.getClass();
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
