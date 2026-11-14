package com.trilead.ssh2.crypto;

import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class PEMStructure {
    byte[] data;
    String[] dekInfo;
    int pemType;
    String[] procType;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PEMStructure pEMStructure = (PEMStructure) obj;
            if (this.pemType == pEMStructure.pemType && Arrays.equals(this.dekInfo, pEMStructure.dekInfo) && Arrays.equals(this.procType, pEMStructure.procType) && Arrays.equals(this.data, pEMStructure.data)) {
                return true;
            }
        }
        return false;
    }

    public byte[] getData() {
        return this.data;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data) + (((((Objects.hash(Integer.valueOf(this.pemType)) * 31) + Arrays.hashCode(this.dekInfo)) * 31) + Arrays.hashCode(this.procType)) * 31);
    }

    public String toString() {
        Base64.Encoder encoder;
        String encodeToString;
        StringBuilder sb = new StringBuilder("PEMStructure{pemType=");
        sb.append(this.pemType);
        sb.append(", dekInfo=");
        sb.append(Arrays.toString(this.dekInfo));
        sb.append(", procType=");
        sb.append(Arrays.toString(this.procType));
        sb.append(", data=");
        encoder = java.util.Base64.getEncoder();
        encodeToString = encoder.encodeToString(this.data);
        sb.append(encodeToString);
        sb.append(", data.length=");
        sb.append(this.data.length);
        sb.append('}');
        return sb.toString();
    }
}
