package com.trilead.ssh2.crypto;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class PEMStructure {
    byte[] data;
    java.lang.String[] dekInfo;
    int pemType;
    java.lang.String[] procType;

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.trilead.ssh2.crypto.PEMStructure pEMStructure = (com.trilead.ssh2.crypto.PEMStructure) obj;
            if (this.pemType == pEMStructure.pemType && java.util.Arrays.equals(this.dekInfo, pEMStructure.dekInfo) && java.util.Arrays.equals(this.procType, pEMStructure.procType) && java.util.Arrays.equals(this.data, pEMStructure.data)) {
                return true;
            }
        }
        return false;
    }

    public byte[] getData() {
        return this.data;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.data) + (((((java.util.Objects.hash(java.lang.Integer.valueOf(this.pemType)) * 31) + java.util.Arrays.hashCode(this.dekInfo)) * 31) + java.util.Arrays.hashCode(this.procType)) * 31);
    }

    public java.lang.String toString() {
        return "PEMStructure{pemType=" + this.pemType + ", dekInfo=" + java.util.Arrays.toString(this.dekInfo) + ", procType=" + java.util.Arrays.toString(this.procType) + ", data=" + dev.epro.r0.T15589241373902147015.l(dev.epro.r0.T15589241373902147015.o(), this.data) + ", data.length=" + this.data.length + '}';
    }
}
