package ads_mobile_sdk;

import android.util.Base64;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.F16059529287866721367;
import dev.epro.r0.G12293736735718106169;
import dev.epro.r0.M16184408391440927034;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.O5378677881740157249;
import dev.epro.r0.P2480554073835519965;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class hp {
    public final jr0 a;

    public hp(jr0 jr0Var) {
        jr0Var.getClass();
        this.a = jr0Var;
    }

    public final M16184408391440927034 a(String str) {
        M16184408391440927034 qu0Var;
        M16184408391440927034 tu0Var;
        SecretKey secretKeyGenerateKey;
        byte[] encoded;
        jr0 jr0Var = this.a;
        WeakHashMap weakHashMap = ji3.a;
        th3 th3VarA = ji3.a(wv0.CUI_NAME_BLOB_ENCRYPTION, O2161699089510411363.a, true);
        try {
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                keyGenerator.init(128);
                secretKeyGenerateKey = keyGenerator.generateKey();
                encoded = secretKeyGenerateKey.getEncoded();
            } catch (Exception e) {
                qu0Var = new qu0(e, 0, null, 6);
            }
            if (encoded == null || encoded.length != 16) {
                tu0Var = new tu0("Encoded symmetric key had unexected length: " + (encoded != null ? Integer.valueOf(encoded.length) : null), 1);
            } else {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
                cipher.init(1, secretKeyGenerateKey);
                byte[] iv = cipher.getIV();
                if (iv.length != 16) {
                    tu0Var = new tu0("iv had unexpected length: " + iv.length, 1);
                } else {
                    byte[] bytes = str.getBytes(F16059529287866721367.a);
                    bytes.getClass();
                    byte[] bArrDoFinal = cipher.doFinal(bytes);
                    KeyGenerator keyGenerator2 = KeyGenerator.getInstance("HmacSHA1");
                    keyGenerator2.init(128);
                    SecretKey secretKeyGenerateKey2 = keyGenerator2.generateKey();
                    byte[] encoded2 = secretKeyGenerateKey2.getEncoded();
                    if (encoded2 == null || encoded2.length != 16) {
                        tu0Var = new tu0("Hmac is unexpected size: " + (encoded2 != null ? Integer.valueOf(encoded2.length) : null), 1);
                    } else {
                        byte[] bArrC = E17665849472693074628.c(encoded, encoded2);
                        if (bArrC == null) {
                            tu0Var = new tu0("Unable to compute sha1 of symmetric key.", 1);
                        } else {
                            byte[] iv2 = cipher.getIV();
                            iv2.getClass();
                            byte[] bArrM0 = O5378677881740157249.M0(bArrC, iv2);
                            bArrDoFinal.getClass();
                            byte[] bArrM02 = O5378677881740157249.M0(bArrM0, bArrDoFinal);
                            ao aoVar = ao.a$6;
                            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode((String) jr0Var.a("gads:gads:blob_encryption_public_key", "MIGdMA0GCSqGSIb3DQEBAQUAA4GLADCBhwKBgQDILejyvRuVmPUcwUTpEVaE8A_-D7bZPnTOMs91 WZ0iSLQrK0lcICNKeWom1jWNBxjw89oyra30BlZCDEu7nfGacaTmzX74wD_RJV3xh81_9l2PWr46 0J9DJcXSi4yGzJyyUYp7Q1YXam8J6DYWV6PoemmP71T2fbm9i1VQy1NFgQIBAw", aoVar), 8)));
                            Cipher cipher2 = Cipher.getInstance("RSA/None/OAEPwithSHA-1andMGF1Padding");
                            cipher2.init(1, publicKeyGeneratePublic);
                            G12293736735718106169 g12293736735718106169O = hl1.o();
                            qq qqVarA = sq.a(0, encoded, encoded.length);
                            g12293736735718106169O.b();
                            ((hl1) g12293736735718106169O.b).b(qqVarA);
                            qq qqVarA2 = sq.a(0, encoded2, encoded2.length);
                            g12293736735718106169O.b();
                            ((hl1) g12293736735718106169O.b).a(qqVarA2);
                            g12293736735718106169O.b();
                            hl1 hl1Var = (hl1) g12293736735718106169O.b;
                            hl1Var.getClass();
                            hl1Var.type_ = 3;
                            hl1Var.bitField0_ |= 1;
                            byte[] bArrDoFinal2 = cipher2.doFinal(((hl1) g12293736735718106169O.a()).a());
                            String strEncodeToString = Base64.encodeToString(new byte[]{0, 19, -48, -88, -79}, 0);
                            strEncodeToString.getClass();
                            byte[] bArrDecode = Base64.decode((String) jr0Var.a("gads:blob_encryption_public_key_first_hashed_bytes", strEncodeToString, aoVar), 11);
                            if (bArrDecode.length != 5) {
                                qu0Var = new tu0("sha1 has of public key has unexpected size: " + bArrDecode.length + "}", 1);
                            } else {
                                bArrDoFinal2.getClass();
                                byte[] bArrM03 = O5378677881740157249.M0(O5378677881740157249.M0(bArrDecode, bArrDoFinal2), bArrM02);
                                Mac mac = Mac.getInstance("HmacSHA1");
                                mac.init(secretKeyGenerateKey2);
                                byte[] bArrDoFinal3 = mac.doFinal(bArrM02);
                                bArrDoFinal3.getClass();
                                qu0Var = new xu0(Base64.encodeToString(O5378677881740157249.M0(bArrM03, bArrDoFinal3), 11));
                            }
                            tu0Var = qu0Var;
                        }
                    }
                }
            }
            if (tu0Var instanceof pu0) {
                zi3.a((pu0) tu0Var, false);
            }
            th3VarA.close();
            return tu0Var;
        } catch (Throwable th) {
            try {
                th3VarA.b(th);
                if (th instanceof N340633841638932414) {
                    throw th;
                }
                if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                    th3VarA.a(th);
                }
                if (th instanceof P2480554073835519965) {
                    throw new lw0(th);
                }
                if (th instanceof CancellationException) {
                    throw new du0(th);
                }
                if (th instanceof dv0) {
                    throw th;
                }
                throw new iu0(th);
            } finally {
            }
        }
    }
}
