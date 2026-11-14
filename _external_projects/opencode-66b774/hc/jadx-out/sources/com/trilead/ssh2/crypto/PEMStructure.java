package com.trilead.ssh2.crypto;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
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
        return "PEMStructure{pemType=" + this.pemType + ", dekInfo=" + Arrays.toString(this.dekInfo) + ", procType=" + Arrays.toString(this.procType) + ", data=" + java.util.Base64.getEncoder().encodeToString(this.data) + ", data.length=" + this.data.length + '}';
    }
}
