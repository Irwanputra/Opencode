package com.hctools.hcdecryptor;

import org.bouncycastle.crypto.engines.ChaCha20Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.Security;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HCConstants {
    public static final List<byte[]> CHACHA_KEYS = Arrays.asList(
        hexToBytes("2be4342943c6f91ff58987f41a1aafd179eeb4e053f5cea55b11d6a7db58bd7d"),
        hexToBytes("3380aa278b744ba5b529a7f32fa803e48749280dae378345d9b526cf1dbce372"),
        hexToBytes("cea9305c95168b162a335b137c61983b8df54e6375da01136547890f14c5fac3"),
        hexToBytes("4beeace0e42bae8f29470cf40cf2dfacd5f4e1f751912bf52e803c8c85792193"),
        hexToBytes("f8e5f6ebea90558eb32229da24fd0fb7d813091dafe89bb2954fda33b4c60f63"),
        hexToBytes("81342f558a6273bac4548d473f54c4ffc7c41747dee81369acab9c787d41ab9c"),
        hexToBytes("45635e6fc70486e2fd10d3c2b4780f02d0b4c5f4aa929fc54f86bb8fa4417944"),
        hexToBytes("3d632a251c9820f2baf83e15498d27548fc67921cb437f8ce48505989378adea")
    );

    public static final List<byte[]> RST_KEYS = Arrays.asList(
        "JN1k3YHc2.6_v235".getBytes(StandardCharsets.UTF_8),
        "JN1k3YHc_2.7_v71".getBytes(StandardCharsets.UTF_8),
        "JN1k3YHc2.7.ps69".getBytes(StandardCharsets.UTF_8),
        "JN1k3YHc2.7.6950".getBytes(StandardCharsets.UTF_8),
        "Jn1K3yHc2.8.ps08".getBytes(StandardCharsets.UTF_8),
        "Jn1K3yHc2.9.ps6c".getBytes(StandardCharsets.UTF_8),
        "Zk:L7>WKaiK*s9>D".getBytes(StandardCharsets.UTF_8),
        "!<f!&WIlM**R.B0X".getBytes(StandardCharsets.UTF_8),
        "b4a5opinx2uloec6".getBytes(StandardCharsets.UTF_8)
    );

    public static final byte[] JKL_KEY_OLD = {
        (byte)0xd5, (byte)0xd4, (byte)0xd3, (byte)0xd2, (byte)0xd1, (byte)0xd0, 
        (byte)0xcf, (byte)0xce, (byte)0xcd, (byte)0xcc, (byte)0xbd, (byte)0xbc, 
        (byte)0xbb, (byte)0xba, (byte)0xb9, (byte)0xb8, (byte)0xb7, (byte)0xb6, 
        (byte)0xb5, (byte)0xb4
    };

    public static final byte[] JKL_KEY_NEW = {
        8, 9, 10, 11, 12, 13, 14, 15, 17, 17, 
        5, 4, 3, 2, 1, 0, (byte)255, (byte)254, (byte)253, (byte)252
    };

    public static final Map<Integer, String> TOKEN_MAP = new HashMap<>();
    static {
        TOKEN_MAP.put(0, "payload");
        TOKEN_MAP.put(1, "proxy");
        TOKEN_MAP.put(2, "lockAllConfig");
        TOKEN_MAP.put(3, "blockedByRoot");
        TOKEN_MAP.put(4, "expiryTime");
        TOKEN_MAP.put(5, "noteEnabled");
        TOKEN_MAP.put(6, "notes");
        TOKEN_MAP.put(7, "sshField");
        TOKEN_MAP.put(8, "mobileDataAndLockProvider");
        TOKEN_MAP.put(9, "unlockUserAndPass");
        TOKEN_MAP.put(10, "ovpnConfig");
        TOKEN_MAP.put(11, "ovpnUserAndPass");
        TOKEN_MAP.put(12, "sni");
        TOKEN_MAP.put(13, "unlockUserAndPass2");
        TOKEN_MAP.put(14, "unknown14");
        TOKEN_MAP.put(15, "blockedByHwid");
        TOKEN_MAP.put(16, "cloudconfig");
        TOKEN_MAP.put(17, "psiphon");
        TOKEN_MAP.put(18, "name");
        TOKEN_MAP.put(19, "blockArea");
        TOKEN_MAP.put(20, "connectionMode");
        TOKEN_MAP.put(21, "blockedByPassword");
        TOKEN_MAP.put(22, "unknown22");
        TOKEN_MAP.put(23, "extraSniffer");
        TOKEN_MAP.put(24, "psiphon2");
        TOKEN_MAP.put(25, "v2rayEnabled");
        TOKEN_MAP.put(26, "v2rayConfig");
        TOKEN_MAP.put(27, "version");
        TOKEN_MAP.put(28, "slowdnsEnabled");
        TOKEN_MAP.put(29, "slowdnsServer");
        TOKEN_MAP.put(30, "slowdnsPublickey");
        TOKEN_MAP.put(31, "dnsResolver");
    }

    public static final String BRAILLE_ALPHABET = "⠁⠃⠉⠙⠑⠋⠛⠓⠊⠚⠅⠇⠍⠝⠕⠏⠟⠗⠎⠞⠥⠧⠺⠭⠽⠵⠼⠁⠼⠃⠼⠉⠼⠙⠼⠑⠼⠋⠼⠛⠼⠓⠼⠊⠼⠚";
    public static final byte[] STATIC_NONCE = new byte[]{(byte)0xdb, (byte)0xdb, (byte)0xdb, (byte)0xdb, (byte)0xdb, (byte)0xdb, (byte)0xdb, (byte)0xdb};
    public static final byte[] RST_XOR_KEY = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};

    public static byte[] hexToBytes(String hex) {
        int len = hex.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4) + Character.digit(hex.charAt(i + 1), 16));
        }
        return data;
    }
}
