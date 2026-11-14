package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public interface WebMessagePayloadBoundaryInterface extends FeatureFlagHolderBoundaryInterface {

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    @Retention(RetentionPolicy.SOURCE)
    public @interface WebMessagePayloadType {
        public static final int TYPE_ARRAY_BUFFER = 1;
        public static final int TYPE_STRING = 0;
    }

    byte[] getAsArrayBuffer();

    String getAsString();

    int getType();
}
