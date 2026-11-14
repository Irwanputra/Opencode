package dev.epro.r0;

import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V4742515998328533943 {
    public final H9807528374655572032 a;
    public final J18325703078859211263 b;

    public /* synthetic */ V4742515998328533943(H9807528374655572032 h9807528374655572032, J18325703078859211263 j18325703078859211263) {
        this.a = h9807528374655572032;
        this.b = j18325703078859211263;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof V4742515998328533943)) {
            return false;
        }
        V4742515998328533943 v4742515998328533943 = (V4742515998328533943) obj;
        return V1475975160983963926.t(this.a, v4742515998328533943.a) && V1475975160983963926.t(this.b, v4742515998328533943.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        V10300877997588547986 v10300877997588547986 = new V10300877997588547986(this);
        v10300877997588547986.b("key", this.a);
        v10300877997588547986.b("feature", this.b);
        return v10300877997588547986.toString();
    }
}
