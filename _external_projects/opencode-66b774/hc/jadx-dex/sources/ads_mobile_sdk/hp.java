package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class hp {
    public final ads_mobile_sdk.jr0 a;

    public hp(ads_mobile_sdk.jr0 jr0Var) {
        jr0Var.getClass();
        this.a = jr0Var;
    }

    public final dev.epro.r0.M16184408391440927034 a(java.lang.String str) {
        dev.epro.r0.M16184408391440927034 qu0Var;
        dev.epro.r0.M16184408391440927034 tu0Var;
        javax.crypto.SecretKey secretKeyGenerateKey;
        byte[] encoded;
        ads_mobile_sdk.jr0 jr0Var = this.a;
        java.util.WeakHashMap weakHashMap = ads_mobile_sdk.ji3.a;
        ads_mobile_sdk.th3 th3VarA = ads_mobile_sdk.ji3.a(ads_mobile_sdk.wv0.CUI_NAME_BLOB_ENCRYPTION, dev.epro.r0.O2161699089510411363.a, true);
        try {
            try {
                javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance("AES");
                keyGenerator.init(128);
                secretKeyGenerateKey = keyGenerator.generateKey();
                encoded = secretKeyGenerateKey.getEncoded();
            } catch (java.lang.Exception e) {
                qu0Var = new ads_mobile_sdk.qu0(e, 0, null, 6);
            }
            if (encoded == null || encoded.length != 16) {
                tu0Var = new ads_mobile_sdk.tu0("Encoded symmetric key had unexected length: " + (encoded != null ? java.lang.Integer.valueOf(encoded.length) : null), 1);
            } else {
                javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS7PADDING");
                cipher.init(1, secretKeyGenerateKey);
                byte[] iv = cipher.getIV();
                if (iv.length != 16) {
                    tu0Var = new ads_mobile_sdk.tu0("iv had unexpected length: " + iv.length, 1);
                } else {
                    byte[] bytes = str.getBytes(dev.epro.r0.F16059529287866721367.a);
                    bytes.getClass();
                    byte[] bArrDoFinal = cipher.doFinal(bytes);
                    javax.crypto.KeyGenerator keyGenerator2 = javax.crypto.KeyGenerator.getInstance("HmacSHA1");
                    keyGenerator2.init(128);
                    javax.crypto.SecretKey secretKeyGenerateKey2 = keyGenerator2.generateKey();
                    byte[] encoded2 = secretKeyGenerateKey2.getEncoded();
                    if (encoded2 == null || encoded2.length != 16) {
                        tu0Var = new ads_mobile_sdk.tu0("Hmac is unexpected size: " + (encoded2 != null ? java.lang.Integer.valueOf(encoded2.length) : null), 1);
                    } else {
                        byte[] bArrC = dev.epro.r0.E17665849472693074628.c(encoded, encoded2);
                        if (bArrC == null) {
                            tu0Var = new ads_mobile_sdk.tu0("Unable to compute sha1 of symmetric key.", 1);
                        } else {
                            byte[] iv2 = cipher.getIV();
                            iv2.getClass();
                            byte[] bArrM0 = dev.epro.r0.O5378677881740157249.M0(bArrC, iv2);
                            bArrDoFinal.getClass();
                            byte[] bArrM02 = dev.epro.r0.O5378677881740157249.M0(bArrM0, bArrDoFinal);
                            ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$6;
                            java.security.PublicKey publicKeyGeneratePublic = java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode((java.lang.String) jr0Var.a("gads:gads:blob_encryption_public_key", "MIGdMA0GCSqGSIb3DQEBAQUAA4GLADCBhwKBgQDILejyvRuVmPUcwUTpEVaE8A_-D7bZPnTOMs91 WZ0iSLQrK0lcICNKeWom1jWNBxjw89oyra30BlZCDEu7nfGacaTmzX74wD_RJV3xh81_9l2PWr46 0J9DJcXSi4yGzJyyUYp7Q1YXam8J6DYWV6PoemmP71T2fbm9i1VQy1NFgQIBAw", aoVar), 8)));
                            javax.crypto.Cipher cipher2 = javax.crypto.Cipher.getInstance("RSA/None/OAEPwithSHA-1andMGF1Padding");
                            cipher2.init(1, publicKeyGeneratePublic);
                            dev.epro.r0.G12293736735718106169 g12293736735718106169O = ads_mobile_sdk.hl1.o();
                            ads_mobile_sdk.qq qqVarA = ads_mobile_sdk.sq.a(0, encoded, encoded.length);
                            g12293736735718106169O.b();
                            ((ads_mobile_sdk.hl1) g12293736735718106169O.b).b(qqVarA);
                            ads_mobile_sdk.qq qqVarA2 = ads_mobile_sdk.sq.a(0, encoded2, encoded2.length);
                            g12293736735718106169O.b();
                            ((ads_mobile_sdk.hl1) g12293736735718106169O.b).a(qqVarA2);
                            g12293736735718106169O.b();
                            ads_mobile_sdk.hl1 hl1Var = (ads_mobile_sdk.hl1) g12293736735718106169O.b;
                            hl1Var.getClass();
                            hl1Var.type_ = 3;
                            hl1Var.bitField0_ |= 1;
                            byte[] bArrDoFinal2 = cipher2.doFinal(((ads_mobile_sdk.hl1) g12293736735718106169O.a()).a());
                            java.lang.String strEncodeToString = android.util.Base64.encodeToString(new byte[]{0, 19, -48, -88, -79}, 0);
                            strEncodeToString.getClass();
                            byte[] bArrDecode = android.util.Base64.decode((java.lang.String) jr0Var.a("gads:blob_encryption_public_key_first_hashed_bytes", strEncodeToString, aoVar), 11);
                            if (bArrDecode.length != 5) {
                                qu0Var = new ads_mobile_sdk.tu0("sha1 has of public key has unexpected size: " + bArrDecode.length + "}", 1);
                            } else {
                                bArrDoFinal2.getClass();
                                byte[] bArrM03 = dev.epro.r0.O5378677881740157249.M0(dev.epro.r0.O5378677881740157249.M0(bArrDecode, bArrDoFinal2), bArrM02);
                                javax.crypto.Mac mac = javax.crypto.Mac.getInstance("HmacSHA1");
                                mac.init(secretKeyGenerateKey2);
                                byte[] bArrDoFinal3 = mac.doFinal(bArrM02);
                                bArrDoFinal3.getClass();
                                qu0Var = new ads_mobile_sdk.xu0(android.util.Base64.encodeToString(dev.epro.r0.O5378677881740157249.M0(bArrM03, bArrDoFinal3), 11));
                            }
                            tu0Var = qu0Var;
                        }
                    }
                }
            }
            if (tu0Var instanceof ads_mobile_sdk.pu0) {
                ads_mobile_sdk.zi3.a((ads_mobile_sdk.pu0) tu0Var, false);
            }
            th3VarA.close();
            return tu0Var;
        } catch (java.lang.Throwable th) {
            try {
                th3VarA.b(th);
                if (th instanceof dev.epro.r0.N340633841638932414) {
                    throw th;
                }
                if (!(th instanceof dev.epro.r0.P2480554073835519965) && !(th instanceof java.util.concurrent.CancellationException)) {
                    th3VarA.a(th);
                }
                if (th instanceof dev.epro.r0.P2480554073835519965) {
                    throw new ads_mobile_sdk.lw0((dev.epro.r0.P2480554073835519965) th);
                }
                if (th instanceof java.util.concurrent.CancellationException) {
                    throw new ads_mobile_sdk.du0(th);
                }
                if (th instanceof ads_mobile_sdk.dv0) {
                    throw th;
                }
                throw new ads_mobile_sdk.iu0(th);
            } finally {
            }
        }
    }
}
