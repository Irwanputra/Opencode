package org.jasypt.digest;

/* loaded from: /tmp/opencode/hc_real.dex */
public interface StringDigester {
    String digest(String str);

    boolean matches(String str, String str2);
}
