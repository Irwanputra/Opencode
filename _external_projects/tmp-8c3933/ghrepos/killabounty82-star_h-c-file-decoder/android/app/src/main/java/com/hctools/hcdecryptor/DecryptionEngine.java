package com.hctools.hcdecryptor;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.Security;
import java.util.Base64;

public class DecryptionEngine {

    private static final String[] XOR_LIST = {
            "。", "〃", "〄", "々", "〆", "〇", "〈", "〉", "《", "》",
            "「", "」", "『", "』", "【", "】", "〒", "〓", "〔", "〕"
    };

    private static final String[] EMBEDDED_KEYS = {
            "hc_reborn___7", "hc_reborn_tester", "hc_reborn_tester_5", "hc_reborn_7", "hc_reborn_6",
            "hc_reborn_5", "hc_reborn_4", "hc_reborn_3", "hc_reborn_2", "hc_reborn_1", "hc_reborn10",
            "hc_reborn9", "hc_reborn8", "hc_reborn7", "keY_secReaT_hc", "keY_secReaT_hc1",
            "keY_secReaT_hc2", "keY_secReaT_hc_reborn", "keY_secReaT_hc_reborn1", "keY_secReaT_hc_2",
            "keY_secReaT_hc_reborn3", "keY_secReaT_hc_reborn4", "keY_secReaT_hc_reborn5",
            "keY_secReaT_hc_reborn6", "keY_secReaT_te4Z9", "keY_secReaT_te4Z10", "keY_secReaT_te4Z11", "keY_secReaT_e"
    };

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    public static byte[] deobfuscate(byte[] contents) throws Exception {
        String encryptedString = new String(contents, StandardCharsets.UTF_8);
        byte[] deobfuscatedContents = new byte[encryptedString.length()];

        for (int index = 0; index < encryptedString.length(); index++) {
            char xorChar = XOR_LIST[index % XOR_LIST.length].charAt(0);
            deobfuscatedContents[index] = (byte) (encryptedString.charAt(index) ^ xorChar);
        }

        return Base64.getDecoder().decode(deobfuscatedContents);
    }

    public static byte[] decrypt(byte[] contents, String key) throws Exception {
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        sha1.update(key.getBytes(StandardCharsets.UTF_8));
        byte[] digest = sha1.digest();
        byte[] decryptionKey = new byte[16];
        System.arraycopy(digest, 0, decryptionKey, 0, 16);

        SecretKeySpec secretKey = new SecretKeySpec(decryptionKey, 0, decryptionKey.length, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        return cipher.doFinal(contents);
    }

    public static DecryptResult tryDecrypt(byte[] fileContents) {
        byte[] contents = fileContents;

        try {
            contents = deobfuscate(fileContents);
        } catch (Exception e) {
            // No obfuscation
        }

        for (String key : EMBEDDED_KEYS) {
            try {
                byte[] decrypted = decrypt(contents, key);
                String decryptedString = new String(decrypted, StandardCharsets.UTF_8);

                if (decryptedString.contains("splitConfig")) {
                    return new DecryptResult(true, decryptedString, key);
                }
            } catch (Exception e) {
                // Wrong key
            }
        }

        return new DecryptResult(false, null, null);
    }

    public static java.util.Map<String, String> parseConfig(String decryptedContent) {
        java.util.Map<String, String> config = new java.util.HashMap<>();
        String[] fields = {"payload", "payloadProxyURL", "shouldNotWorkWithRoot", "lockPayloadAndServers",
                "expiryDate", "hasNotes", "noteField2", "sshAddress", "onlyAllowOnMobileData",
                "unlockRemoteProxy", "unknown", "vpnAddress", "sslSni", "shouldConnectUsingSSH",
                "udpgwPort", "lockPayload", "hasHWID", "hwid", "noteField1", "unlockUserAndPassword",
                "sslAndPayloadMode", "enablePassword", "password"};

        String[] values = decryptedContent.split("\\[splitConfig\\]");
        for (int i = 0; i < fields.length && i < values.length; i++) {
            config.put(fields[i], values[i].trim());
        }

        return config;
    }

    public static class DecryptResult {
        public boolean success;
        public String content;
        public String usedKey;

        public DecryptResult(boolean success, String content, String usedKey) {
            this.success = success;
            this.content = content;
            this.usedKey = usedKey;
        }
    }
}
