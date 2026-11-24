package com.hctools.hcdecryptor;

import android.util.Base64;
import org.bouncycastle.crypto.engines.ChaCha20Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.json.JSONException;
import org.json.JSONObject;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.Security;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HCDecryptor {

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    public static String cleanHex(String raw) {
        if (raw == null || raw.isEmpty()) return "";
        String clean = raw.replaceAll("[^0-9a-fA-F]", "");
        return clean.length() % 2 != 0 ? "0" + clean : clean;
    }

    public static boolean isHex(String s) {
        if (s == null || s.length() < 16) return false;
        return s.matches("^[0-9a-fA-F]+$");
    }

    public static boolean isMostlyPrintable(String s, boolean strict) {
        if (s == null || s.isEmpty()) return false;
        if (s.length() < 4) return true;
        long printableCount = s.chars().filter(c -> Character.isWhitespace(c) || 
            (c >= 32 && c < 127) || c == '\t' || c == '\n' || c == '\r').count();
        return (printableCount / (double) s.length()) > (strict ? 0.90 : 0.80);
    }

    public static String decryptBraille(String ciphertext) {
        try {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < ciphertext.length() - 1; i += 2) {
                int idx1 = HCConstants.BRAILLE_ALPHABET.indexOf(ciphertext.charAt(i));
                int idx2 = HCConstants.BRAILLE_ALPHABET.indexOf(ciphertext.charAt(i + 1));
                if (idx1 >= 0 && idx2 >= 0) {
                    result.append((char) (((idx1 * 16 + idx2) & 0xFF)));
                }
            }
            return result.toString();
        } catch (Exception e) {
            return ciphertext;
        }
    }

    public static String abcDecrypt(String rawInput, byte[] key) {
        if (rawInput == null || rawInput.isEmpty()) return "";
        try {
            String cleanedHex = cleanHex(rawInput);
            byte[] data = hexToBytes(cleanedHex);
            if (data.length > 16) {
                byte[] nonce = HCConstants.STATIC_NONCE;
                ChaCha20Engine cipher = new ChaCha20Engine();
                cipher.init(false, new ParametersWithIV(new KeyParameter(key), nonce));
                cipher.processBytes(data, 0, data.length - 16, data, 0);
                return new String(data, 0, data.length - 16, StandardCharsets.UTF_8);
            }
        } catch (Exception ignored) {}
        return "";
    }

    public static String jklDecrypt(String inputStr, boolean isNew) {
        if (inputStr == null || inputStr.isEmpty()) return inputStr;
        try {
            byte[] key = isNew ? HCConstants.JKL_KEY_NEW : HCConstants.JKL_KEY_OLD;
            String padded = inputStr;
            int pad = inputStr.length() % 4;
            if (pad != 0) {
                padded = inputStr + "====".substring(0, 4 - pad);
            }
            byte[] data = Base64.decode(padded, Base64.NO_WRAP);
            for (int i = 0; i < data.length; i++) {
                byte k = key[i % 20];
                byte d = data[i];
                data[i] = (byte) (((((d ^ 0xff) & 0xca) | (d & 0x35)) ^ 
                                   (((k ^ 0xff) & 0xca) | (k & 0x35))));
            }
            byte[] decoded = Base64.decode(new String(data, StandardCharsets.UTF_8), Base64.NO_WRAP);
            return new String(decoded, StandardCharsets.UTF_8);
        } catch (Exception ignored) {}
        return inputStr;
    }

    public static String extractInitialPayload(byte[] fileBytes) {
        try {
            String hexKey = "e382e4b8adc386f09f9293";
            byte[] keyBytes = hexToBytes(hexKey);
            String fileStr = new String(fileBytes, StandardCharsets.UTF_8);
            byte[] encrypted = fileStr.getBytes("ISO-8859-1");
            byte[] result = new byte[encrypted.length];
            for (int i = 0; i < encrypted.length; i++) {
                result[i] = (byte) (encrypted[i] ^ keyBytes[i % keyBytes.length]);
            }
            return new String(result, StandardCharsets.UTF_8);
        } catch (Exception ignored) {}
        return null;
    }

    public static byte[] hexToBytes(String hex) {
        int len = hex.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4) + 
                                   Character.digit(hex.charAt(i + 1), 16));
        }
        return data;
    }

    public static String execute(byte[] fileBytes) {
        try {
            String hexPayload = extractInitialPayload(fileBytes);
            if (hexPayload == null) return null;

            String outer = abcDecrypt(hexPayload, HCConstants.CHACHA_KEYS.get(5));
            if (outer == null || outer.isEmpty() || !outer.startsWith("{")) return null;

            JSONObject jsonObj = new JSONObject(outer);
            JSONObject cfgObj = jsonObj.optJSONObject("cfg");
            if (cfgObj == null) cfgObj = new JSONObject();

            StringBuilder result = new StringBuilder();
            result.append("🔓 BOUNTY KILLA DECRYPTOR\n");
            result.append("================================\n\n");
            result.append("✅ DECRYPTION SUCCESSFUL\n\n");
            result.append("CONFIG DATA:\n\n");

            Iterator<String> keys = jsonObj.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                String value = jsonObj.optString(key, "");
                if (!value.isEmpty() && !key.startsWith("_")) {
                    result.append("📌 ").append(key).append(":\n");
                    if (value.length() > 150) {
                        result.append(value, 0, 150).append("...\n\n");
                    } else {
                        result.append(value).append("\n\n");
                    }
                }
            }

            result.append("================================\n");
            result.append("🔒 CODE: @BOUNTY_KILLA");

            return result.toString();

        } catch (Exception e) {
            return "❌ Decryption Failed: " + e.getMessage();
        }
    }
}
