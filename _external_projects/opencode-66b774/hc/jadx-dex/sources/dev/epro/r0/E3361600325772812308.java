package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public enum E3361600325772812308 {
    INTERNAL_ERROR(0),
    INVALID_REQUEST(1),
    NETWORK_ERROR(2),
    NO_FILL(3),
    TIMEOUT(4),
    CANCELLED(5),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_FOUND(7),
    APP_ID_MISSING(8),
    REQUEST_ID_MISMATCH(10),
    INVALID_AD_RESPONSE(11),
    AD_RESPONSE_ALREADY_USED(12);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    E3361600325772812308(int i) {
        this.a = i;
    }
}
