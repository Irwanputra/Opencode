package p034.p050.p053;

import android.R;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import de.blinkt.openvpn.core.OpenVPNService;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.SecretKeySpec;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import org.jasypt.util.binary.BasicBinaryEncryptor;
import p010.p011.p012.p013.C0753;
import p010.p011.p012.p013.C0765;
import p010.p011.p012.p013.InterfaceC0761;
import p015.p025.p026.C0989;
import p015.p025.p026.p027.C0984;
import p015.p025.p026.p028.C0988;
import p034.p035.p043.C1067;
import p034.p095.C1687;
import p107.p108.p109.p110.p113.C1842;
import p107.p108.p109.p110.p113.InterfaceC1837;
import p107.p108.p109.p110.p113.p115.C1844;
import p131.p155.p156.p157.C2098;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import team.dev.epro.apkcustom.sockets.Tun2SocksService;
import team.dev.epro.apkcustom.sockets.psiphon.PsiphonVPNService;
import team.dev.epro.apkcustom.sockets.v2ray.V2RayVpnService;
import team.dev.epro.apkcustom.widgets.AESEncrypt;
import team.dev.epro.apkcustom.widgets.SystemNative;
import xyz.easypro.ecrypt.utils.Crypt;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.おかぷせ〱, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1216 implements InterfaceC1837 {

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static List<String> f6007 = new ArrayList();

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static final String f6008 = "おかぷせ〱";

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public long f6009;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public String f6011;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f6013;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public String f6016;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public InterfaceC0761 f6018;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public byte[][][] f6014 = {new byte[][]{new byte[]{115, 51, 99, 114, 51, 84, 95, 107, 51, 89, 95, 101, 80, 114, 111}}, new byte[][]{new byte[]{97, 112, 112, 46, 103, 114, 101, 121, 115, 104, 105, 114, 116, 115, 46, 115, 115, 108, 99, 97, 112, 116, 117, 114, 101}, new byte[]{97, 112, 112, 46, 112, 97, 99, 107, 101, 116, 46, 99, 97, 112, 116, 117, 114, 101}, new byte[]{106, 112, 46, 99, 111, 46, 116, 97, 111, 115, 111, 102, 116, 119, 97, 114, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 112, 97, 99, 107, 101, 116, 99, 97, 112, 116, 117, 114, 101}, new byte[]{106, 112, 46, 99, 111, 46, 116, 97, 111, 115, 111, 102, 116, 119, 97, 114, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 112, 97, 99, 107, 101, 116, 99, 97, 112, 116, 117, 114, 101, 112, 114, 111}, new byte[]{111, 114, 103, 46, 99, 104, 101, 97, 116, 101, 110, 103, 105, 110, 101, 46, 99, 101, 103, 117, 105}, new byte[]{99, 111, 109, 46, 100, 101, 118, 97, 100, 118, 97, 110, 99, 101, 46, 114, 111, 111, 116, 99, 108, 111, 97, 107, 112, 108, 117, 115}, new byte[]{100, 101, 46, 100, 101, 102, 105, 109, 46, 97, 112, 107, 46, 104, 105, 100, 101, 110, 111, 112, 97, 115, 115, 119, 111, 114, 100, 115}, new byte[]{108, 118, 46, 110, 51, 111, 46, 115, 104, 97, 114, 107, 110, 97, 116, 105, 118, 101}, new byte[]{108, 118, 46, 110, 51, 111, 46, 115, 104, 97, 114, 107}, new byte[]{98, 108, 97, 107, 101, 46, 104, 97, 109, 105, 108, 116, 111, 110, 46, 98, 105, 116, 115, 104, 97, 114, 107}, new byte[]{98, 108, 97, 107, 101, 46, 104, 97, 109, 105, 108, 116, 111, 110, 46, 98, 105, 116, 115, 104, 97, 114, 107, 116, 114, 105, 97, 108}, new byte[]{117, 107, 46, 99, 111, 46, 111, 112, 116, 105, 99, 105, 97, 110, 99, 109, 115, 46, 119, 105, 102, 105, 112, 114, 111, 98, 101}, new byte[]{104, 117, 46, 101, 100, 117, 100, 114, 111, 105, 100, 46, 109, 101, 97, 115, 117, 114, 101, 109, 101, 110, 116, 95, 117, 112, 108, 111, 97, 100, 101, 114}, new byte[]{115, 117, 46, 115, 110, 105, 102, 102, 46, 99, 101, 112, 116, 101, 114}, new byte[]{99, 111, 109, 46, 115, 101, 114, 105, 111, 117, 115, 46, 115, 110, 105, 102, 102, 100, 114, 111, 105, 100}, new byte[]{111, 114, 103, 46, 115, 97, 110, 100, 114, 111, 112, 114, 111, 120, 121}, new byte[]{99, 111, 109, 46, 101, 118, 98, 97, 100, 114, 111, 105, 100, 46, 119, 105, 99, 97, 112, 100, 101, 109, 111}, new byte[]{99, 111, 109, 46, 101, 118, 98, 97, 100, 114, 111, 105, 100, 46, 119, 105, 99, 97, 112}, new byte[]{105, 116, 46, 115, 115, 115, 117, 112, 46, 114, 116, 110, 46, 115, 110, 105, 102, 102, 101, 114, 49, 53, 52}, new byte[]{108, 118, 46, 110, 51, 111, 46, 115, 104, 97, 114, 107, 114, 101, 97, 100, 101, 114}, new byte[]{115, 110, 105, 102, 102}, new byte[]{115, 110, 105, 102, 102, 101, 114}, new byte[]{21, 38, 2, 101, 69, 27, 109, -114, 107, -51, 124, -117, -104, 36, 82, 5}, new byte[]{-39, 60, 13, -64, 53, -4, 77, -106, -25, -2, -34, 84, -105, 50, 72, -67}}, new byte[][]{new byte[]{115, 103, 46, 101, 97, 115, 121, 112, 114, 111, 46, 120, 121, 122}}, new byte[][]{new byte[]{115, 51, 99, 114, 51, 84, 95, 107, 51, 89, 95, 101, 80, 114, 48, 95, 51, 78, 99, 82, 121, 112, 84}, new byte[]{115, 51, 99, 114, 51, 84, 95, 107, 51, 121, 95, 101, 80, 114, 48, 95, 51, 78, 99, 82, 121, 112, 84}, new byte[]{107, 101, 89, 95, 115, 101, 99, 82, 101, 97, 84, 95, 101}}};

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public byte[][][] f6010 = {new byte[][]{m2750().decrypt(new byte[]{-125, -2, 77, -79, 107, 85, -31, 114, 9, 106, 120, 11, 18, 123, 29, 74, 64, 104, 10, 123, -57, -36, 89, 76, -31, 98, -46, -11, -116, 112, 69, -46, 121, -29, -58, 24, 57, 30, 40, -94, -17, -29, -92, -45, -110, -40, 28, -73, 69, -13, 65, -125, -57, -121, 74, 29, 111, -8, -111, 23, 51, -19, 14, 36}), m2750().decrypt(new byte[]{112, -125, -94, -71, 91, -25, -63, -23, 58, -38, -10, -34, 122, -61, 117, -72, 67, 7, -59, 100, 115, -70, -73, 99}), m2750().decrypt(new byte[]{43, 51, 107, -42, 68, -15, -38, -17, 26, -70, 38, 120, 48, -32, -41, -94, -7, 56, 124, 19, -68, 75, 66, -109, 16, -52, 62, 5, 78, -126, -9, 67})}, new byte[][]{m2750().decrypt(new byte[]{-1, 115, -110, -40, -98, 68, -112, 43, -102, -40, -118, 77, -47, 90, -17, Byte.MAX_VALUE, -99, 56, -24, 30, -10, -109, 63, 105})}, new byte[][]{m2750().decrypt(new byte[]{-59, 104, -12, -108, 78, -94, -42, -49, -59, -85, -4, 99, -62, -123, 19, 8, -11, 82, -85, -12, 98, -90, 3, -94, 118, -121, 111, 94, 31, -43, 6, 48, 15, 85, 52, -7, 123, 97, 83, -22, 97, -13, -42, 97, -104, 16, 69, -29, 29, 75, -112, 60, -103, -41, 63, -60, 50, 102, -20, 108, 93, -34, -59, 79, -20, 36, -124, 4, -95, 88, -46, -63, 96, -68, 115, 66, 26, -90, 29, 109, -71, -96, -27, 39, -19, 98, -36, 50, 23, 72, -82, -14, -37, 36, 44, -89, 110, 119, 106, 115, 90, 49, -67, -125, -114, 126, -22, -5, -100, -94, 21, 8, -68, -83, -64, 117, -35, -83, 2, -74, 44, 124, 85, -116, 31, 0, 13, 69, 41, 49, -55, -38, Byte.MAX_VALUE, 1, -69, 76, -62, 99, 71, 69, -18, -115, 20, -19, Byte.MAX_VALUE, 78, 96, -33, -88, 83, -52, 68, 23, 44, -28, 41, -91, 24, 22, -116, 23, -88, 4, 64, -122, -11, -25, -91, -25, -110, 63, -72, 44, 57, 89, -48, 55, -104, -38, -52, -126, -41, 114, -85, 44, -119, 92, -104, -71, -80, 83, -2, 101, -121, 52, -30, 11, 57, -77, 75, -21, -114, 120, 22, 123, Byte.MIN_VALUE, 59, 126, 59, 67, -92, 85, -44, 88, -27, -42, 117, -51, Byte.MIN_VALUE, -30, -53, -90, 71, 124, -116, -40, 12, 6, 107, -21, -111, -52, -33, 118, -16, -95, 96, 107, 56, 0, 51, -31, 24, 3, 119, -80, -103, -106, 26, -42, -31, 9, 18, 55, -56, -28, 99, 0, 83, -36, -46, -17, -86, 83, -119, 46, 10, -101, -70, 89, 99, 56, 123, 39, 117, -81, 57, 40, 20, 119, 114, -67, 110, -26, 85, -42, -102, -47, 126, -75, -48, 62, 49, -67, -96, 37, 28, 111, 78, -101, -116, 62, 62, 51, -38, -28, 67, 104, -99, 46, 71, -25, -60, 40, -39, -126, 21, -25, -51, 41, 103, -122, 51, 15, 75, 56, Byte.MIN_VALUE, -70, -79, -28, -59, 83, 118, -84, 94, 62, -78, 91, 26, -21, 63, 99, 71, 72, -70, 0, 73, 81, -98, -13, 43, -59, 9, -62, -12, -66, -44, -54, -27, 85, -24, 59, -4, -123, 7, 19, -122, -62, 105, -59, -12, 96, -108, 12, 63, -113, 66, -21, 121, 119, -96, -58, 86, -106, -117, 114, -82, -112, -103, -27, -100, -122, -99, -57, 87, 3, -40, -52, 48, -74, -12, 57, -76, -63, 69, -43, 75, -95, -30, -93, -124, -105, 41, -44, 10, -100, -64, 23, -27, -113, -26, 8, 25, -126, 53, 109, 52, -124, -103, 54, 121, -19, -34, 12, -87, -116, -9, -73, -117, 118, 7, 15, -107, -9, 52, -38, 95, Byte.MAX_VALUE, -27, -2, 112, -97, -127, 96, 117, -23, -119, -45, 70, 111, 101, 107, -96, -117, -60, 40, -19, -28, -59, 63, 65, 42, 64, 106, -32, -32, 50, -14, 73, -39, 97, 53, 64, 6, -85, 76, -24, -55, 65, -41, 94, 31, 34, -29, 54, -23, 75, 102, 5, 2, 98, -103, -57, -22, -38, 89, 12, -116, 14, -79, -47, 108, 120, -83, 37, 12, -119, 103, -54, 43, -26, -63, 63, -66, 43, -80, -90, 17, 42, -12, -61, -8, -110, -32, 2, -19, 32, -110, 64, 86, 123, -22, -99, -111, -89, 97, 8, 122, 123, 74, 68, 123, -107, -36, -71, 62, -70, 89, 77, 40, -2, 104, 97, 14, -91, -80, -20, 111, 54, -100, -74, Byte.MIN_VALUE, -11, 56, 51, -69, -63, 60, -104, 116, -6, -115, 86, -109, -18, 94, 33, 37, 15, 39, 4, 87, 0, 109, -89, -56, 31, 18, -104, 99, 84, -64, -74, -109, 55, 55, -9, 36, 45, 81, 98, -113, 1, 71, -75, 76, -85, -120, 111, 28, 46, -87, 105, -49, 55, -35, -81, -46, -50, 96, 2, -79, 122, -70, Byte.MAX_VALUE, 31, 54, -46, 79, 95, -21, 120, -104, 101, 46, 45, -113, 84, -77, -36, -110, 46, -19, -110, -103, -7, -69, 119, -62, 39, 5, -107, -108, -105, -50, 92, -103, -11, -32, -108, 25, -26, -126, -45, -2, -93, 78, 58, -114, -14, 41, 35, 35, -30, -45, 118, -1, -50, -105, 114, 79, -65, -6, 45, -64, -112, -71, 31, 55, -121, -45, 93, -88, -112, -27, 33, -68, 37, 39, -18, 122, -100, -15, 125, 71, -98, 52, -100, 91, -23, 82, 126, -67, -77, 9, -22, -107, -14, -82, 42, 8, 100, 15, 47, 123, 32, 81, -91, -52, 84, 113, 40, -62, 106, -91, -1, 62, -71, Base64.PAD, -119, -47, 94, -77, 21, 43, -117, -106, -122, 15, -8, 1, 76, 24, 27, -101, -54, -60, -41, 104, 62, -91, -123, -64, 99, 82, 15, -5, 92, 11, -48, 53, 82, 24, -106, -30, -57, -94, Byte.MIN_VALUE, -113, -109, -46, 105, -20, -126, -76, 122, -95, 36, 16, 6, -110, -63, 12, 73, 100, -85, -14, 95, 58, -123, 118, 116, -33, -66, 47, -115, 48, 95, -40, -111, -75, 123, -122, -54, 110, 26, -89, 49, 104, 50, -38, 123, 0, -38, 5, -82, 52, 55, -98, 110, -71, Byte.MAX_VALUE, 20, 121, 92, -14, Byte.MAX_VALUE, -14, 21, 58, 59, 15, -65, Base64.PAD, -22, -29, -94, 117, -58, -76, 91, 20, 38, 40, -104, 60, -87, -81, -93, -112, -93, -38, 106, 119, -16, -111, 120, -20, -90, -123, 29, -11, 108, -103, 112, 56, 99, 62, 121, -50, 110, 59, 101, 73, -95, -112, 48, 75, 87, -121, -10, -95, -100, 124, -113, -67, 92, -127, 107, 35, 1, 24, -61, 2, 62, -58, -112, -63, -61, 120, -45, 34, -64, -65, 32, 14, -62, -117, -107, -116, 38, -103, -100, -7, 55, -38, Byte.MAX_VALUE, 125, -7, 100, -106, 101, 93, 55, -27, -123, -120, -67, -16, -32, -48, -14, 69, -87, 45, -93, -30, -87, 100, Byte.MIN_VALUE, -110, -84, 25, 31, 84, 81, -114, 63, 69, 35, -83, 0, 37, -92, 29, 41, -17, 50, -41, 12, 53, 23, -69, 14, 112, 15, 118, -127, 50, 81, -53, -85, -30, -46, -122, -40, 37, -126, -123, -12, 
    -12, -68, -118, 84, 29, 102, -26, 118, 16, -51, -11, 22, -114, 106, -58, 32, 117, -94, -53, -41, -95, 65, -71, -72, 67, 6, -75, -21, 50, 18, 7, 8, -95, 56, -95, 68, 67, 42, -57, -9, -65, 107, -122, -49, Byte.MAX_VALUE, -16, -13, -120, -17, -16, -58, -15, -62, 126, -46, 49, -85, 47, -58, -86, -68, 83, -58, -34, 76, -40, -113, -115, 120, 6, -126, 103, -60, -38, 109, -97, 58, 70, 84, 97, 102, -59, -47, -97, 36, 71, 76, 8, 36, 13, 70, 63, 4, 14, -126, 47, -107, 54, -113, 113, -76, 88, -76, 58, -25, -111, -3, 104, -127, -64, 44, -14, -22, 35, 123, 99, 54, 62, -36, -81, 115, 22, -84, 105, 115, 55, 44, 12, 62, 96, -7, -26, 102, Base64.PAD, -69, 79, 65, 8, -90, 54, -71, -101, 81, -27, 55, -96, -5, 24, 51, 36, 57, 57, -35, -92, -40, 79, 107, 26, -6, 81, 123, 19, -84, -119, 53, -13, 65, 81, 96, 123, -67, -117, -65, -70, -44, 66, -9, -92, 85, -81, -60, 104, -80, -91, -31, -86, 101, 16, -7, -57, -109, -127, -8, -107, 109, 101, 63, 102, -9, -62, 116, 67, 55, -110, -72, -11, 46, -9, 58, -40, 30, -63, -33, -67, 51, 63, -52, -78, -59, -16, 57, 52, 100, -51, 43, 35, -77, -20, 20, -83, 46, -47, -15, -89, -74, -33, 32, -116, 25, 19, 70, -45, -37, -45, 28, -88, -38, 98, -72, 125, 112, 70, -26, 90, 34, 82, -27, 114, 84, -1, 98, -75, 118, -118, -65, 86, -15, 35, -115, -4, 103, -4, -108, 6, 75, 33, 76, 29, 25, 103, 99, -6, 115, -107, -47, -62, Byte.MIN_VALUE, 80, -114, 83, -23, 22, 60, 73, 2, 53, 15, 67, 4, -65, 9, 0, -15, 4, 42, 68, -5, -125, 90, 81, -2, -58, 93, -77, 44, 102, -68, -79, 13, 83, -37, -121, 111, 57, -49, -65, 63, -23, -122, 63, 68, -95, -90, 25, 44, -18, 59, -110, 84, -119, -74, 53, -111, Base64.PAD, 30, -28, -45, Base64.PAD, 87, -65, 104, 64, 69, 19, 70, -112, -83, -113, 77, -47, 109, 34, -69, 96, -84, -51, 113, -121, -35, 90, 73, 82, 109, -115, 71, -53, -119, -49, 47, 27, 52, 39, 62, -102, -113, 116, 42, 56, 13, 58, 87, 13, -6, -15, -104, -113, 37, -101, -28, 52, 124, 103, 26, -117, -100, 14, -121, -85, Base64.PAD, 99, 40, 84, 80, 93, 117, 42, 48, 12, 36, 26, -126, -78, -56, 3, -77, -14, 40, 81, 77, 91, 88, 118, 10, -61, 29, 29, -109, -93, 101, 110, 17, -41, -107, -12, -25, -35, 81, 49, -123, 39, -80, 79, -51, -104, 90, -15, -43, -23, -19, -89, 48, 26, 79, 63, -96, 102, 1, -77, -41, -52, 43, 84, 41, 67, -123, 124, -29, 58, 116, -105, -62, -75, -57, 108, -109, -126, -36, -42, -60, 53, -84, 52, -109, 89, -6, -40, 11, 5, -97, 84, 44, 85, -96, 43, 106, 111, -72, 48, 16, -23, -125, 125, -109, 119, -39, -81, -33, 42, -48, 119, 33, -113, 95, -119, 39, 12, 123, -14, -108, -52, 22, 71, -85, -107, 6, 113, 59, 58, -109, -42, 15, -35, 63, -92, 47, -109, -117, -11, -85, -48, 15, 3, -93, -106, -53, -100, -70, -7, 79, -65, 66, 122, 41, 108, -73, 93, 16, 123, 19, 75, 1, -78, -112, -110, -113, 37, -40, -116, 123, -74, -76, -56, -103, 59, 86, -12, 10, -12, -125, -53, -126, 82, 91, 103, 23, 68, -49, 104, 116, 98, -94, 10, -47, 75, 124, 52, 92, 87, -85, -61, -41, 19, 68, -86, -42, -71, 123, -51, -56, -37, -114, 60, -116, 27, -21, 96, -22, 35, -123, -24, 83, -36, -47, 11, 1, Base64.PAD, -41, 62, 49, -102, 5, 111, -87, -11, -45, -111, -113, -104, -125, -29, -42, -70, 47, 26, 16, -18, -62, -13, -7, 104, 69, -100, -2, 45, 8, -25, 45, -36, 13, -83, -67, -125, -18, -115, -60, -120, -21, -55, -47, 68, 76, 31, -10, -44, -26, 125, -126, -110, 21, 96, -18, 108, -1, -109, 38, 57, -111, -45, -41, -103, 56, -67, -3, -48})}, new byte[][]{m2750().decrypt(new byte[]{1, 2, -103, -19, 104, 93, 74, 118, 103, Byte.MAX_VALUE, -12, -80, 5, 67, 100, -113, 24, -32, -8, -98, 56, 51, 98, 70, -116, -21, 40, 30, -79, -62, 19, 74}), m2750().decrypt(new byte[]{96, -75, 95, -91, 30, -116, -28, -63, -21, -72, 102, 64, 62, -1, -78, 81, -29, -68, -19, 123, -29, -76, -12, -16, 68, -93, -17, 41, -55, -87, -35, 1}), m2750().decrypt(new byte[]{32, 64, -124, 23, 85, 53, -51, 92, -102, -75, -90, -40, 24, 35, -84, 15, -4, -97, 42, 57, 58, -66, 51, 10}), m2750().decrypt(new byte[]{54, 62, 122, -39, -117, -28, -29, 103, 37, -15, -81, 112, 26, 106, 41, 15, -23, -97, 40, Byte.MIN_VALUE, 56, 103, -34, -3, 96, 114, -98, 32, -86, Byte.MAX_VALUE, -17, 74}), m2750().decrypt(new byte[]{-98, -90, 79, 102, -110, 96, 106, -106, -104, 91, -96, 53, 86, -54, -47, -123, 40, 54, -42, -127, -24, 43, -67, 123, -45, -35, 11, -20, -107, 45, -50, -45}), m2750().decrypt(new byte[]{Base64.PAD, 28, 73, -17, -50, 58, 107, -24, 83, -35, 37, -127, 74, -84, 43, -61, -119, -21, -43, -48, 28, -72, -79, -64, -2, -36, -14, 30, -115, 113, -66, -111}), m2750().decrypt(new byte[]{-13, 84, 31, -125, 39, 30, 17, -10, 26, 78, 91, -30, -111, 91, -109, 8, 115, 69, 81, -24, -53, -42, 10, 96, 21, -82, -43, 83, 120, -41, 2, 77}), m2750().decrypt(new byte[]{17, 97, 48, 83, 21, -28, -78, 70, 110, 83, -79, -115, -91, -74, 51, 62, -22, -26, 34, 74, -39, 122, -25, -85, 23, 71, 32, -71, 28, -112, 80, 12}), m2750().decrypt(new byte[]{-12, 111, 104, 91, 111, -5, -121, -85, 73, -87, 55, 6, -126, 15, 33, 43, 86, 71, -22, 81, -76, 79, 95, -28}), m2750().decrypt(new byte[]{-43, -76, -43, -49, 96, -15, -124, 75, 100, 8, -101, -2, -119, 112, -68, 63, -48, -116, -44, -92, -92, 11, -17, -23, -97, -27, 10, -12, 19, -74, 15, 110})}, new byte[][]{m2750().decrypt(new byte[]{15, 9, -5, -74, 68, -44, 105, -63, 84, 100, 83, -19, 119, 83, 95, 47}), m2750().decrypt(new byte[]{-17, -93, 50, 71, -22, -43, -61, -76, 78, -66, -3, -24, -26, -10, -38, -93}), m2750().decrypt(new byte[]{76, -51, -108, -58, -45, -61, 94, -102, 88, 79, -42, 103, -51, -38, 5, -69}), m2750().decrypt(new byte[]{-42, -40, 46, 19, -19, -79, -111, 87, 67, -125, 11, 69, 45, -99, -60, Byte.MIN_VALUE}), m2750().decrypt(new byte[]{-44, 99, Base64.PAD, -91, 72, -10, 116, 15, -104, -67, -102, 80, 29, -118, 58, -123}), m2750().decrypt(new byte[]{14, 22, -14, -76, -84, 73, 56, -64, 94, -20, 44, 115, -11, -46, -80, 9}), m2750().decrypt(new byte[]{-29, 15, 77, -88, -11, 123, -24, 6, 45, -93, 91, 45, 68, 0, -40, 113}), m2750().decrypt(new byte[]{-13, 103, -58, 120, 109, 29, 123, 67, Base64.PAD, 82, -32, -22, -68, -71, 97, 82, -19, -40, -16, 88, -15, 35, -99, 50})}, new byte[][]{m2750().decrypt(new byte[]{-99, 25, -112, -30, -5, -64, -71, -112, -33, 20, -98, 42, 28, -125, 40, -82, -98, -70, -96, 116, -123, 95, -7, 88}), m2750().decrypt(new byte[]{49, -93, -58, 31, -1, 1, -48, -85, 77, -80, -71, -58, 79, 114, -35, -126}), m2750().decrypt(new byte[]{82, -120, -125, -30, 9, 108, 41, -53, -73, -49, 16, -100, -34, -81, -13, 123, 4, Byte.MIN_VALUE, -108, -39, -113, 50, -51, 80}), m2750().decrypt(new byte[]{84, -28, -9, -25, 13, 120, 17, -90, -19, -93, -32, -67, 7, -23, 96, 23})}, new byte[][]{m2750().decrypt(new byte[]{-72, -52, -47, -69, -60, 13, -82, -75, 108, 117, 109, -107, -79, -122, 7, -44, -71, 119, 38, -34, -5, 4, 56, -80, 96, -110, 75, -59, 37, -104, -52, -26, -77, -44, -90, 59, -96, 70, -38, 21}), m2750().decrypt(new byte[]{24, -122, -85, -26, 1, -69, 17, 34, 69, -22, 25, 91, -84, 88, -59, 98})}};

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final char[] f6017 = {12290, 12291, 12292, 12293, 12294, 12295, 12296, 12297, 12298, 12299, 12300, 12301, 12302, 12303, 12304, 12305, 12306, 12307, 12308, 12309};

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final char[] f6015 = AESEncrypt.arr();

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public ServiceConnection f6012 = new ServiceConnectionC1217();

    /* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.おかぷせ〱$げつ〴ぬぐ, reason: contains not printable characters */
    public class ServiceConnectionC1217 implements ServiceConnection {
        public ServiceConnectionC1217() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1216.this.f6018 = InterfaceC0761.AbstractBinderC0762.m2056(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C1216.this.f6018 = null;
        }
    }

    /* renamed from: 〱〴なぱへて, reason: contains not printable characters */
    public boolean m2701(Context context, Class<?> cls) {
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) context.getSystemService(Crypt.a(Crypt.xrc("Mg>\u001bg<M3fJ7:\u001ae=\u001d7<\u001cfl\u001cjkHdo\u001aknO0")))).getRunningServices(Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            if (cls.getName().equals(it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: 〱〵つてう, reason: contains not printable characters */
    public boolean m2702(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(Crypt.a(Crypt.xrc("N4k\u001a6:N4j@boL09O3nNb=\u001egoMfi\u001cbnNf")))).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 0;
    }

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public String m2703() {
        return new String(android.util.Base64.decode(new String(this.f6010[0][0]), 0), Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1")));
    }

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public final String m2704(File file) {
        String a = Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"));
        if (!file.exists()) {
            m2790(Crypt.a(Crypt.xrc("\u001a6k\u0019dhNfhNkjMff@b=\u00197l\u00193gH7<\u001adk\u001a1")), -65536);
            return "";
        }
        try {
            String a2 = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            new FileInputStream(file);
            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa")));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            StringBuilder sb = new StringBuilder();
            String stringBuffer2 = stringBuffer.toString();
            for (int i = 0; i < stringBuffer2.length(); i++) {
                char charAt = stringBuffer2.charAt(i);
                char[] cArr = this.f6017;
                sb.append((char) (charAt ^ cArr[i % cArr.length]));
            }
            byte[] m3960 = C1844.m3960(sb.toString().getBytes(a));
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(messageDigest.digest(Crypt.a(Crypt.xrc("\u001b7j\u001bfjK0m\u001bc>\u00196gAjjA7f@4jN0mAd;Mk:Hbk\u001cdgI`j\u001d0nMj<\u001bbhA6m\u001ddlOe>\u001a0o\u001b")).getBytes(a)), 16), a2.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[1]);
            Cipher cipher = Cipher.getInstance(a2);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(m3960), a);
        } catch (Exception unused) {
            return Crypt.a(Crypt.xrc("I4mObmI`j\u001c7k\u001ddlO3;Je;\u0019dgJeiNjnJ1"));
        }
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public String m2705(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(Crypt.a(Crypt.xrc("\u001bahHfo\u001dcmN7oMjkJ4k\u001d1oAejNfo\u001b4oHdl\u001ddoIaiA1f@gkIe:\u001d4oK1k\u0019ejK3k\u001a6m\u0019")).getBytes()), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: 〳に〴あぽ, reason: contains not printable characters */
    public boolean m2706() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if (nextElement2 != null && !nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address) && nextElement.isUp() && nextElement.getDisplayName().startsWith(Crypt.a(Crypt.xrc("@cg\u001ag=Ad9Oen\u00190gMj:H3h@jmK`o\u001cki\u00197")))) {
                        nextElement2.getHostAddress().toString();
                        nextElement.getName();
                        return true;
                    }
                }
            }
            return false;
        } catch (SocketException e) {
            e.getMessage();
            return false;
        }
    }

    /* renamed from: 〴ぐち〱へ, reason: contains not printable characters */
    public boolean m2707(String str) {
        Process process;
        DataOutputStream dataOutputStream = null;
        try {
            process = Runtime.getRuntime().exec(Crypt.a(Crypt.xrc("J3f\u001cehIe>@co\u001c4k\u001ec;H6kO4:L7mOci\u001b6")));
            try {
                DataOutputStream dataOutputStream2 = new DataOutputStream(process.getOutputStream());
                try {
                    dataOutputStream2.writeBytes(str + "\n");
                    dataOutputStream2.writeBytes("exit\n");
                    dataOutputStream2.flush();
                    process.waitFor();
                    try {
                        dataOutputStream2.close();
                        process.destroy();
                        return true;
                    } catch (Exception unused) {
                        return true;
                    }
                } catch (Exception unused2) {
                    dataOutputStream = dataOutputStream2;
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (Exception unused3) {
                            return false;
                        }
                    }
                    process.destroy();
                    return false;
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (Exception unused4) {
                            throw th;
                        }
                    }
                    process.destroy();
                    throw th;
                }
            } catch (Exception unused5) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused6) {
            process = null;
        } catch (Throwable th3) {
            th = th3;
            process = null;
        }
    }

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public void m2708() {
        boolean z;
        Intent intent = new Intent(App.f3759, (Class<?>) OpenVPNService.class);
        intent.setAction(Crypt.a(Crypt.xrc("Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019bi@1g\u001bb9O6gL0f\u001d0g\u001b6gIj:M4f\u0019cm\u001d09Aah@`i\u001b4oMcnAkn\u001bcl\u001ekoH0<M`nK3;Iao")));
        App.f3759.bindService(intent, this.f6012, 1);
        boolean m2701 = ((C1216) App.f3760).m2701(App.f3759, SSHTunnelService.class);
        String a = Crypt.a(Crypt.xrc("\u001af9A7hO3iO`iK`kM6:\u001ef;JekL1f\u001aao@k"));
        String a2 = Crypt.a(Crypt.xrc("\u001ae=K3fJ1nN7fL7mM`n@kg\u001b3m\u001a1jNc>Mk"));
        String a3 = Crypt.a(Crypt.xrc("H3nMjfIkmH3kHemN0lJ0kKjf\u001bc;\u001ejjHk"));
        String a4 = Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"));
        String a5 = Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"));
        String a6 = Crypt.a(Crypt.xrc("La=\u001b69Ij:M`gI6iHa=JklMj=H0;\u001dkkAf"));
        if (!m2701 && !C0753.m2042()) {
            if (!((C1216) App.f3760).m2701(App.f3759, Tun2SocksService.class)) {
                if (!((C1216) App.f3760).m2701(App.f3759, V2RayVpnService.class)) {
                    if (!((C1216) App.f3760).m2701(App.f3759, PsiphonVPNService.class)) {
                        String str = f6008;
                        StringBuilder m4207 = C2098.m4207(a5);
                        m4207.append(new SimpleDateFormat(a4, Locale.getDefault()).format(new Date()));
                        m4207.append("] <font color=#FF0000> hook service detected, don't do that!");
                        C1687.m3697(str, m4207.toString());
                        if (((C1216) App.f3760).m2701(App.f3759, Tun2SocksService.class)) {
                            Intent intent2 = new Intent(App.f3759, (Class<?>) Tun2SocksService.class);
                            intent2.setAction(a6);
                            App.f3759.startService(intent2);
                        }
                        if (((C1216) App.f3760).m2701(App.f3759, SSHTunnelService.class)) {
                            Intent intent3 = new Intent(App.f3759, (Class<?>) SSHTunnelService.class);
                            intent3.setAction(a6);
                            App.f3759.startService(intent3);
                        }
                        if (((C1216) App.f3760).m2701(App.f3759, PsiphonVPNService.class)) {
                            Intent intent4 = new Intent(App.f3759, (Class<?>) PsiphonVPNService.class);
                            intent4.setAction(a6);
                            App.f3759.startService(intent4);
                        }
                        if (((C1216) App.f3760).m2701(App.f3759, V2RayVpnService.class)) {
                            Intent intent5 = new Intent(App.f3759, (Class<?>) V2RayVpnService.class);
                            intent5.setAction(a6);
                            App.f3759.startService(intent5);
                        }
                        if (C0753.m2042()) {
                            C0765.m2061(App.f3759);
                            InterfaceC0761 interfaceC0761 = this.f6018;
                            if (interfaceC0761 != null) {
                                try {
                                    interfaceC0761.mo1589(false);
                                } catch (RemoteException unused) {
                                }
                            }
                        }
                        C2098.m4182(App.f3762, a3, false);
                        C2098.m4182(App.f3762, a2, false);
                        C2098.m4182(App.f3762, a, false);
                    }
                }
            }
        }
        try {
            z = Boolean.parseBoolean(m2744(((C1216) App.f3760).m2739())[8]);
        } catch (IndexOutOfBoundsException unused2) {
            z = false;
        }
        if (z && m2714(App.f3759)) {
            String str2 = f6008;
            StringBuilder m42072 = C2098.m4207(a5);
            m42072.append(new SimpleDateFormat(a4, Locale.getDefault()).format(new Date()));
            m42072.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019gf\u001bgi@cg\u001cehO69Lj=Ojh\u001b7jI6:OakHd>\u001db>\u001cbk\u001b7=@d;\u001af=L0g@fk@dk\u001ckhL3nO`o\u001b7f\u001a`:A0n\u001e1<O7fL0<\u001ejnOc:KejNb>K7")));
            C1687.m3697(str2, m42072.toString());
            if (((C1216) App.f3760).m2701(App.f3759, Tun2SocksService.class)) {
                Intent intent6 = new Intent(App.f3759, (Class<?>) Tun2SocksService.class);
                intent6.setAction(a6);
                App.f3759.startService(intent6);
            }
            if (((C1216) App.f3760).m2701(App.f3759, SSHTunnelService.class)) {
                Intent intent7 = new Intent(App.f3759, (Class<?>) SSHTunnelService.class);
                intent7.setAction(a6);
                App.f3759.startService(intent7);
            }
            if (((C1216) App.f3760).m2701(App.f3759, PsiphonVPNService.class)) {
                Intent intent8 = new Intent(App.f3759, (Class<?>) PsiphonVPNService.class);
                intent8.setAction(a6);
                App.f3759.startService(intent8);
            }
            if (((C1216) App.f3760).m2701(App.f3759, V2RayVpnService.class)) {
                Intent intent9 = new Intent(App.f3759, (Class<?>) V2RayVpnService.class);
                intent9.setAction(a6);
                App.f3759.startService(intent9);
            }
            if (C0753.m2042()) {
                C0765.m2061(App.f3759);
                InterfaceC0761 interfaceC07612 = this.f6018;
                if (interfaceC07612 != null) {
                    try {
                        interfaceC07612.mo1589(false);
                    } catch (RemoteException unused3) {
                    }
                }
            }
            C2098.m4182(App.f3762, a3, false);
            C2098.m4182(App.f3762, a2, false);
            C2098.m4182(App.f3762, a, false);
        }
        try {
            if (Boolean.parseBoolean(m2744(((C1216) App.f3760).m2739())[2]) || Boolean.parseBoolean(m2744(((C1216) App.f3760).m2739())[15])) {
                m2740(z);
            }
        } catch (Exception unused4) {
            if (Boolean.parseBoolean(m2744(((C1216) App.f3760).m2739())[2])) {
                m2740(z);
            }
        }
        try {
            App.f3759.unbindService(this.f6012);
        } catch (Exception unused5) {
        }
    }

    /* renamed from: 〺〲に〼へ〸, reason: contains not printable characters */
    public String m2709(String str) {
        if (str.compareTo(Crypt.a(Crypt.xrc("\u001b0hO`lOjoOcmLk>\u001b1;K`:\u001cglM4g@jnLd"))) == 0) {
            return Crypt.a(Crypt.xrc("J69A3k\u0019jnA1iHjgM7i\u001dklM1kNk=\u001d6;\u001af"));
        }
        if (str.compareTo(Crypt.a(Crypt.xrc("H7mNd;@0m\u001ed;I4gMelJ1j\u001bgfAglJfn\u0019c"))) == 0) {
            return Crypt.a(Crypt.xrc("\u001b3mAkfMjg\u001ecf\u00190gJam\u001d0;@`:\u001bam\u001a7;L1"));
        }
        if (str.compareTo(Crypt.a(Crypt.xrc("\u001bbi\u001bdhLc:M6jIckMe<\u001b6hLf:Okf\u001d3iN`"))) == 0) {
            return Crypt.a(Crypt.xrc("\u001a`=Adm\u001e3hL7<HgnOg9NklJeoIbfJ4fN7"));
        }
        if (str.compareTo(Crypt.a(Crypt.xrc("L7=LkfIgi\u001ea:Jbn\u001b`iIk>Jdm@dlL1jJk"))) == 0) {
            return Crypt.a(Crypt.xrc("\u001adn\u001aaiLbhH7lJffAf>Mbf@7:\u001bd>K4h\u0019d"));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0050, code lost:
    
        if (r4 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01db, code lost:
    
        if (r11 == null) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x004a A[Catch: Exception -> 0x004e, TRY_ENTER, TryCatch #0 {Exception -> 0x004e, blocks: (B:8:0x002d, B:9:0x0052, B:134:0x004a), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d8 A[Catch: Exception -> 0x01e0, TRY_ENTER, TryCatch #5 {Exception -> 0x01e0, blocks: (B:53:0x01b5, B:54:0x01dd, B:97:0x01d8), top: B:52:0x01b5 }] */
    /* renamed from: 〺えなひあ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m2710() {
        /*
            Method dump skipped, instructions count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p053.C1216.m2710():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x004d, code lost:
    
        if (r2 != null) goto L7;
     */
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2711() {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p053.C1216.m2711():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        if (r3 != null) goto L29;
     */
    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m2712(java.io.File r10) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p053.C1216.m2712(java.io.File):java.lang.String");
    }

    /* renamed from: 〻えぱひがこ, reason: contains not printable characters */
    public String m2713(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            Process exec = Runtime.getRuntime().exec(str);
            exec.waitFor();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine + "\n");
            }
        } catch (IOException | InterruptedException unused) {
        }
        return sb.toString();
    }

    /* renamed from: 〻しざ〹おま, reason: contains not printable characters */
    public boolean m2714(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) App.f3759.getSystemService(Crypt.a(Crypt.xrc("N4k\u001a6:N4j@boL09O3nNb=\u001egoMfi\u001cbnNf")))).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1;
    }

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public String m2715(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(Crypt.a(Crypt.xrc("\u001ckh\u001adl\u0019gkN0l\u001cf;\u001b6nHagHfi\u001cah\u0019kf@b")).getBytes()), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: 〻はぎっぼ, reason: contains not printable characters */
    public void m2716(Class<?> cls) {
        Intent intent = new Intent(App.f3759, cls);
        intent.setFlags(276824064);
        App.f3759.startActivity(intent);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public String m2717(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(this.f6010[3][2]), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
    public String m2718() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if (!nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address) && nextElement.getDisplayName().startsWith(Crypt.a(Crypt.xrc("A3:M`;Mj=Id:\u0019khL3iJ`o\u001dg;\u001bjn\u001e7=J4")))) {
                        return nextElement2.getHostAddress();
                    }
                }
            }
        } catch (Exception unused) {
        }
        return Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb"));
    }

    /* renamed from: ぁにあがあ, reason: contains not printable characters */
    public boolean m2719() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if (nextElement2 != null && !nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address) && nextElement.isUp() && nextElement.getDisplayName().startsWith(Crypt.a(Crypt.xrc("\u001ck:I`k@ehOjjHki\u001ab>@fl\u001cdlJboH19\u001d3")))) {
                        nextElement2.getHostAddress().toString();
                        nextElement.getName();
                        return true;
                    }
                }
            }
        } catch (SocketException e) {
            e.getMessage();
        }
        if (m2746(App.f3759.getFilesDir().getPath()) > 3) {
            return true;
        }
        String cpuinfo = SystemNative.getCpuinfo();
        if (cpuinfo.contains(Crypt.a(Crypt.xrc("JffKc9AelIb>\u001e6hHcfA49MfiKc:\u001cj:H4l\u001bcjL0lAe;@e:\u0019ckKci\u0019fiHd9\u001akoHfiI"))) || cpuinfo.contains(Crypt.a(Crypt.xrc("Jj<\u001bb>\u001dg9\u001d1mKjnJ0h\u001c1f\u00193n\u001aknM`i\u001b1"))) || cpuinfo.contains(Crypt.a(Crypt.xrc("O1o@0g\u0019a<Lgm\u001cefM7j\u001adjIdjO7o\u001c6k\u001b6n@a9\u001bcg\u0019jm@blJ0hLdjJ0k\u001ajo\u001ea;Id>\u001e"))) || cpuinfo.contains(Crypt.a(Crypt.xrc("\u001b`>\u00196k@6<\u001a7k\u001bb>AjjH4kAbnA3nIfk\u001bdnK69K0hK0kMb>\u0019j=Jc;Mch\u001b6o\u001d3>\u001eclL"))) || cpuinfo.contains(Crypt.a(Crypt.xrc("H3fJki\u001a7nO0>J0i\u001b`hA3>Kej\u001dg=@d<\u001c6fK4iI4=Hb>JjfNci\u001b3mJjj\u001e`nO7j\u001ejn\u001d"))) || cpuinfo.contains(Crypt.a(Crypt.xrc("@6=Hck\u001cehHkh\u001bg<\u001bbf\u00190o\u001bg=@0o\u001b6kN3")))) {
            return true;
        }
        String property = System.getProperty(Crypt.a(Crypt.xrc("\u001ebf\u001ec9\u001e6>Oc=M0o\u001dbg\u001da9\u001b6;Aa9Mc:Le")));
        if (property != null && property.contains(Crypt.a(Crypt.xrc("\u001c3jOejMa>L`9M6oIc:MkhLjoN4:Jkl\u00194")))) {
            return true;
        }
        String str = Build.PRODUCT;
        if (Crypt.a(Crypt.xrc("Jg<@e;JaoA1=Aai\u001c69@`<\u001e6g@alLej\u001ak")).equals(str) || Crypt.a(Crypt.xrc("Neo\u001b09J09Lgo@k9J3hMdkJ7=Acf\u001e6:\u001bb=JggAkl\u001c6<\u001d0g\u00197m\u001ec9Ag:L3i\u001c7kAg9K")).equals(str) || Crypt.a(Crypt.xrc("M`oL6j\u001dd:\u001eff\u00190;Nk:K7=H4h\u0019dkK1<\u001e0")).equals(str) || Crypt.a(Crypt.xrc("L7>\u001dbiNf=\u001cci\u001adg\u0019jl\u001affA`nM6k\u0019b<\u00190")).equals(str) || Crypt.a(Crypt.xrc("@j9\u0019`>@0m@`9\u001a7:\u001cf=O`h\u001e1o\u001e`oKboMk")).equals(str)) {
            return true;
        }
        String str2 = Build.FINGERPRINT;
        String a = Crypt.a(Crypt.xrc("OjhL3=J09\u001d0>L`fJjlO3gLef\u001cdh\u00194iJ`"));
        if (str2.contains(a) || Build.MANUFACTURER.contains(Crypt.a(Crypt.xrc("\u00193=\u001ag;\u0019e:Ljm\u00196=\u00196hKk9@bnJb;\u001d7=@`")))) {
            return true;
        }
        String str3 = Build.MODEL;
        if (str3.contains(Crypt.a(Crypt.xrc("K0g\u001ejl\u001dcf\u001cji@bh\u001aek\u001a1:\u00194k\u001a`kKdi@d"))) || str3.contains(Crypt.a(Crypt.xrc("@1i@3;M1=\u001bcoAf;\u001c0gK4jMf:Nd<L0k\u001b3>Meg\u001cdo\u001cgiAkl\u001edh@1kO6o\u00193j\u001ae<@dnL")))) {
            return true;
        }
        return Build.BRAND.contains(a) && Build.DEVICE.contains(a);
    }

    /* renamed from: ぃぜぶの〸ぃ, reason: contains not printable characters */
    public String m2720(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(this.f6010[3][6]), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public String m2721(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(Crypt.a(Crypt.xrc("Lc<Nam@0h\u001c1;Hdk\u001b`n\u001e4=\u001a`hAbl\u001ek;@f")).getBytes()), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: いおてぢび, reason: contains not printable characters */
    public void m2722(boolean z) {
        String str;
        StringBuilder m4207;
        SimpleDateFormat simpleDateFormat;
        Date date;
        String a = Crypt.a(Crypt.xrc("@0i\u001cghJa:O4k\u001ak9Afh\u0019fl\u001de=N3k\u0019cm@g:K`fHkk\u0019blA4k\u001bk;J`<\u001b6jNkk\u001c1f\u001cafJ"));
        String a2 = Crypt.a(Crypt.xrc("N69Hd:NgiJ7:\u001c3o@f9@3:N6iJjmOcl\u0019g"));
        String a3 = Crypt.a(Crypt.xrc("N4k\u001a6:N4j@boL09O3nNb=\u001egoMfi\u001cbnNf"));
        if (Build.VERSION.SDK_INT < 21) {
            try {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) App.f3759.getSystemService(a3);
                    Field declaredField = Class.forName(connectivityManager.getClass().getName()).getDeclaredField(a2);
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(connectivityManager);
                    Method declaredMethod = Class.forName(obj.getClass().getName()).getDeclaredMethod(a, Boolean.TYPE);
                    Object[] objArr = {Boolean.valueOf(z)};
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(obj, objArr);
                    return;
                } catch (Exception unused) {
                    return;
                }
            } catch (Exception unused2) {
                ConnectivityManager connectivityManager2 = (ConnectivityManager) App.f3759.getSystemService(a3);
                Field declaredField2 = Class.forName(connectivityManager2.getClass().getName()).getDeclaredField(a2);
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(connectivityManager2);
                Method declaredMethod2 = Class.forName(obj2.getClass().getName()).getDeclaredMethod(a, String.class, Boolean.TYPE);
                Object[] objArr2 = {App.f3759.getPackageName(), Boolean.valueOf(z)};
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(obj2, objArr2);
                return;
            }
        }
        boolean m2723 = m2723();
        String a4 = Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019g9Aj:\u001dd:M1nH6gL1mJ`9Ne:Jgk\u001dk9N`nO7j\u001cejHaoAek\u001cgnLe=@7fI1kHgoHc:\u001e7fLe;\u00194hAbnH6>\u0019dn@djKgiI1>\u001a19M0n\u001ea:\u001b7<JakMck\u001efj\u001aej\u001d7;IkmI7n\u00197;\u001b7:M"));
        String a5 = Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"));
        String a6 = Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"));
        if (!m2723) {
            str = f6008;
            m4207 = C2098.m4207(a6);
            simpleDateFormat = new SimpleDateFormat(a5, Locale.getDefault());
            date = new Date();
        } else {
            if (m2803()) {
                m2707(z ? Crypt.a(Crypt.xrc("Ajf\u001a7gA3f\u001e1kNfm\u001ac;Ke=Odh\u001cjl\u001agfJ6")) : Crypt.a(Crypt.xrc("L69\u001cd;M7hH0<\u001c`jLkmLcg\u001af<LgiH4hH6fLbkNb<\u001ekfJ7gAkj@goM0k\u001d0jHg=\u0019jfN")));
                return;
            }
            str = f6008;
            m4207 = C2098.m4207(a6);
            simpleDateFormat = new SimpleDateFormat(a5, Locale.getDefault());
            date = new Date();
        }
        m4207.append(simpleDateFormat.format(date));
        m4207.append(a4);
        C1687.m3697(str, m4207.toString());
    }

    /* renamed from: いたぷすいだ, reason: contains not printable characters */
    public boolean m2723() {
        if (App.f3758) {
            return true;
        }
        return this.f6013;
    }

    /* renamed from: ぅばづそほせ, reason: contains not printable characters */
    public String m2724() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if (!nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address) && nextElement.getDisplayName().startsWith(Crypt.a(Crypt.xrc("Lak\u001efh@`oH4hIjiK`k@gmM`lAeoAe9\u00197")))) {
                        return nextElement2.getHostAddress();
                    }
                }
            }
        } catch (Exception unused) {
        }
        return Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb"));
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public String m2725(File file) {
        String a = Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"));
        if (!file.exists()) {
            m2790(Crypt.a(Crypt.xrc("\u001a6k\u0019dhNfhNkjMff@b=\u00197l\u00193gH7<\u001adk\u001a1")), -65536);
            return "";
        }
        try {
            String a2 = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            new FileInputStream(file);
            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa")));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            StringBuilder sb = new StringBuilder();
            String stringBuffer2 = stringBuffer.toString();
            for (int i = 0; i < stringBuffer2.length(); i++) {
                char charAt = stringBuffer2.charAt(i);
                char[] cArr = this.f6017;
                sb.append((char) (charAt ^ cArr[i % cArr.length]));
            }
            byte[] m3960 = C1844.m3960(sb.toString().getBytes(a));
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(messageDigest.digest(Crypt.a(Crypt.xrc("@jiN7oMeg\u001d6=@g<\u001bclI4k\u001ak<Hak\u001bg<O0")).getBytes(a)), 16), a2.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[1]);
            Cipher cipher = Cipher.getInstance(a2);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(m3960), a);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public String m2726(File file) {
        String a = Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"));
        if (!file.exists()) {
            m2790(Crypt.a(Crypt.xrc("\u001a6k\u0019dhNfhNkjMff@b=\u00197l\u00193gH7<\u001adk\u001a1")), -65536);
            return "";
        }
        try {
            String a2 = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            new FileInputStream(file);
            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa")));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            StringBuilder sb = new StringBuilder();
            String stringBuffer2 = stringBuffer.toString();
            for (int i = 0; i < stringBuffer2.length(); i++) {
                char charAt = stringBuffer2.charAt(i);
                char[] cArr = this.f6017;
                sb.append((char) (charAt ^ cArr[i % cArr.length]));
            }
            byte[] m3960 = C1844.m3960(sb.toString().getBytes(a));
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(messageDigest.digest(Crypt.a(Crypt.xrc("Ik;HegHc>@4;O0>A`=I49\u001b7m\u0019k>J0h\u0019a")).getBytes(a)), 16), a2.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[1]);
            Cipher cipher = Cipher.getInstance(a2);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(m3960), a);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: ぇいうげ〱〹, reason: contains not printable characters */
    public String m2727() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if (nextElement2 != null && !nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address) && nextElement.getDisplayName().startsWith(Crypt.a(Crypt.xrc("\u001dboLanL69Lb9A4iKghHcf\u00194oK19\u001c`g\u0019f")))) {
                        return nextElement.getDisplayName();
                    }
                }
            }
            return "";
        } catch (SocketException e) {
            e.getMessage();
            return "";
        }
    }

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public String m2728(File file) {
        if (!file.exists()) {
            m2790(Crypt.a(Crypt.xrc("\u001a6k\u0019dhNfhNkjMff@b=\u00197l\u00193gH7<\u001adk\u001a1")), -65536);
            return "";
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            StringBuilder sb = new StringBuilder();
            String stringBuffer2 = stringBuffer.toString();
            for (int i = 0; i < stringBuffer2.length(); i++) {
                char charAt = stringBuffer2.charAt(i);
                char[] cArr = this.f6015;
                sb.append((char) (charAt ^ cArr[i % cArr.length]));
            }
            return AESEncrypt.decode0(App.f3759, sb.toString(), 0);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public String m2729(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(Crypt.a(Crypt.xrc("\u0019al\u001ajj\u001bc>\u001ddj\u001d3h\u0019e=\u001b4n\u001eei\u001a4n\u001ckjHklN7i\u0019j<\u001dfiM`<\u001c0nNkhK6gK`oM3iAj<N")).getBytes()), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: え〱さぽぜ, reason: contains not printable characters */
    public String m2730() {
        ArrayList arrayList = new ArrayList();
        String a = Crypt.a(Crypt.xrc("\u001b0hO`lOjoOcmLk>\u001b1;K`:\u001cglM4g@jnLd"));
        arrayList.add(a);
        String a2 = Crypt.a(Crypt.xrc("H7mNd;@0m\u001ed;I4gMelJ1j\u001bgfAglJfn\u0019c"));
        arrayList.add(a2);
        String a3 = Crypt.a(Crypt.xrc("\u001bbi\u001bdhLc:M6jIckMe<\u001b6hLf:Okf\u001d3iN`"));
        arrayList.add(a3);
        arrayList.add(Crypt.a(Crypt.xrc("L7=LkfIgi\u001ea:Jbn\u001b`iIk>Jdm@dlL1jJk")));
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                Iterator it2 = Collections.list(((NetworkInterface) it.next()).getInetAddresses()).iterator();
                while (it2.hasNext()) {
                    InetAddress inetAddress = (InetAddress) it2.next();
                    String hostAddress = inetAddress.getHostAddress();
                    if (inetAddress instanceof Inet4Address) {
                        if (hostAddress.startsWith(Crypt.a(Crypt.xrc("K7;K6h\u001bbgL0iHfjO0k\u001d0h@6lA3f\u001bki@a")))) {
                            arrayList.remove(a);
                        } else if (hostAddress.length() >= 6 && hostAddress.substring(0, 6).compareTo(Crypt.a(Crypt.xrc("LalIbmK7lN1=Oe9\u0019f9\u001df;Lck\u001ccl\u0019ehI1"))) >= 0 && hostAddress.substring(0, 6).compareTo(Crypt.a(Crypt.xrc("Lfh\u001ae=H7f\u001bkg\u001cem\u001ebhNjmManL1l\u001b`n\u00196"))) <= 0) {
                            arrayList.remove(a2);
                        } else if (hostAddress.startsWith(Crypt.a(Crypt.xrc("\u001d4hI1mIkj\u00193iLjjKem@6;H1:Of=JkgM1")))) {
                            arrayList.remove(a3);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                return (String) arrayList.get(0);
            }
        } catch (SocketException unused) {
        }
        return null;
    }

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public String m2731(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(this.f6010[3][9]), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: えみにぃほす, reason: contains not printable characters */
    public boolean m2732(byte[] bArr) {
        try {
            for (String str : new String(bArr, Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"))).split("\\n")) {
                if (str.startsWith(Crypt.a(Crypt.xrc("Af>IdiMkmL7fAc<\u001e7iNg;Md=Ne>O3mO1")))) {
                    return true;
                }
            }
        } catch (UnsupportedEncodingException unused) {
        }
        return false;
    }

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public String m2733(File file) {
        String a = Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"));
        if (!file.exists()) {
            m2790(Crypt.a(Crypt.xrc("\u001a6k\u0019dhNfhNkjMff@b=\u00197l\u00193gH7<\u001adk\u001a1")), -65536);
            return "";
        }
        try {
            String a2 = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            new FileInputStream(file);
            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa")));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            StringBuilder sb = new StringBuilder();
            String stringBuffer2 = stringBuffer.toString();
            for (int i = 0; i < stringBuffer2.length(); i++) {
                char charAt = stringBuffer2.charAt(i);
                char[] cArr = this.f6017;
                sb.append((char) (charAt ^ cArr[i % cArr.length]));
            }
            byte[] m3960 = C1844.m3960(sb.toString().getBytes(a));
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(messageDigest.digest(Crypt.a(Crypt.xrc("\u001bbkJ7l\u0019koK1oKcnH1oL`9\u001e7i\u001a49\u0019kk\u001ae>Nff\u001bciL3;\u001cjk\u001d0g\u001cej\u001e3nNkmN3lLboA")).getBytes(a)), 16), a2.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[1]);
            Cipher cipher = Cipher.getInstance(a2);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(m3960), a);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public String m2734(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(Crypt.a(Crypt.xrc("\u0019al\u001ajj\u001bc>\u001ddj\u001d3h\u0019e=\u001b4n\u001eei\u001a4n\u001ckjHk>Abo\u001ae:Lj;MjfMk<\u001a4oL1f\u001d6m\u001ekn@6m\u001b")).getBytes()), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: ぉねぞはがぞ, reason: contains not printable characters */
    public String m2735() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if (!nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address) && nextElement.getDisplayName().startsWith(Crypt.a(Crypt.xrc("Lak\u001efh@`oH4hIjiK`k@gmM`lAeoAe9\u00197")))) {
                        return nextElement.getDisplayName();
                    }
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public String m2736(File file) {
        String a = Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"));
        if (!file.exists()) {
            m2790(Crypt.a(Crypt.xrc("\u001a6k\u0019dhNfhNkjMff@b=\u00197l\u00193gH7<\u001adk\u001a1")), -65536);
            return "";
        }
        try {
            String a2 = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            new FileInputStream(file);
            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa")));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            StringBuilder sb = new StringBuilder();
            String stringBuffer2 = stringBuffer.toString();
            for (int i = 0; i < stringBuffer2.length(); i++) {
                char charAt = stringBuffer2.charAt(i);
                char[] cArr = this.f6017;
                sb.append((char) (charAt ^ cArr[i % cArr.length]));
            }
            byte[] m3960 = C1844.m3960(sb.toString().getBytes(a));
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(messageDigest.digest(Crypt.a(Crypt.xrc("\u001ekk@a:K69\u001c4<\u001dgiHjf\u001dgk\u001c0;\u001a1l\u001db;\u001e3")).getBytes(a)), 16), a2.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[1]);
            Cipher cipher = Cipher.getInstance(a2);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(m3960), a);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        if (r3 != null) goto L29;
     */
    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m2737(java.io.File r10) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p053.C1216.m2737(java.io.File):java.lang.String");
    }

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public String m2738(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(Crypt.a(Crypt.xrc("\u0019al\u001ajj\u001bc>\u001ddj\u001d3h\u0019e=\u001b4n\u001eei\u001a4n\u001ckjHkfNek@3:\u001eekNegHdl\u001a7fA6;Nb:\u001efk\u0019glH")).getBytes()), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: かちして〹づ, reason: contains not printable characters */
    public String m2739() {
        String string = App.f3762.getString(new String(this.f6010[5][0]), "");
        return string == null ? "" : string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x090f, code lost:
    
        if (r2 != null) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0911, code lost:
    
        r2.mo1589(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0afb, code lost:
    
        p010.p011.p012.p013.C0753.m2053();
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0b6d, code lost:
    
        if (((p034.p050.p053.C1216) team.dev.epro.apkcustom.App.m1604()).m2701(team.dev.epro.apkcustom.App.m1605(), team.dev.epro.apkcustom.sockets.SSHTunnelService.class) != false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0af7, code lost:
    
        if (r2 != null) goto L436;
     */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0b37  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0b86  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0baf  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0bd8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0bef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0c47  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0c67  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0c87  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0ca7  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0cbb  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0d1b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x10c8 A[Catch: Exception -> 0x11df, TryCatch #7 {Exception -> 0x11df, blocks: (B:264:0x1092, B:266:0x10c8, B:268:0x110e, B:269:0x1123, B:271:0x1135, B:272:0x114a, B:274:0x115c, B:275:0x1171, B:277:0x1183, B:278:0x1198, B:280:0x119e, B:283:0x11a9, B:285:0x11ad, B:286:0x11b0), top: B:263:0x1092, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:383:? A[RETURN, SYNTHETIC] */
    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2740(boolean r17) {
        /*
            Method dump skipped, instructions count: 4822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p053.C1216.m2740(boolean):void");
    }

    /* renamed from: がぐくいおす, reason: contains not printable characters */
    public String m2741(Context context) {
        switch (((TelephonyManager) context.getSystemService(Crypt.a(Crypt.xrc("K3m\u001a7o\u001aj:\u001a3k\u0019k>\u001c1nKkk\u001d`>I7k\u001b4gNc")))).getNetworkType()) {
            case 1:
                return Crypt.a(Crypt.xrc("\u001daf\u001a`gM69H6:M1=N1j\u001e0mM0=KbnAb=Lj"));
            case 2:
                return Crypt.a(Crypt.xrc("\u001bfj@3g\u001ek=L4;Jc9K39@kgI1nJ3=Ia;Ke"));
            case 3:
                return Crypt.a(Crypt.xrc("MjgOkkJe<\u001abhM3;Hcm\u001e7i\u001e6kIa:\u001ak<\u001e7"));
            case 4:
                return Crypt.a(Crypt.xrc("Oj>H3j\u001dko\u001ea9KkhLf;A1mHdg\u001ak=N3=\u001ac"));
            case 5:
                return Crypt.a(Crypt.xrc("\u001aemJe;OgiA6:A09H3;AagMc:\u0019km\u001ba<\u001b6"));
            case 6:
                return Crypt.a(Crypt.xrc("Lf9@khH1j@09K3jI6mHb=Lkf\u001b0:\u001e4i@3"));
            case 7:
                return Crypt.a(Crypt.xrc("@c>Kc>HjkJ3l\u001b`i\u001d4:LbnO`m\u001c`kLb:L6"));
            case 8:
                return Crypt.a(Crypt.xrc("N`l\u00197hL4<Mem@1>K4lKafI6g\u001b`oK1k\u001aj"));
            case 9:
                return Crypt.a(Crypt.xrc("\u001db>\u001cch\u001eklJk>\u0019jkLjfMj<\u001bkhN3jAfnMe"));
            case 10:
                return Crypt.a(Crypt.xrc("O6h\u001c39\u001b`l\u001agnHff@6h\u00191:N4<\u001d7o\u001bck@c"));
            case 11:
                return Crypt.a(Crypt.xrc("\u001banJ6:\u0019e=\u001aciI4f\u001e6j\u001bklLgoL3jJb;\u001bg"));
            case 12:
                return Crypt.a(Crypt.xrc("Jg9Af;L1l\u001ef>\u001e0m\u001b6=@0m\u001dcj\u00190=I4>\u001ad"));
            case 13:
                return Crypt.a(Crypt.xrc("M`lI`=\u001b6l\u001c`oIc;\u001e`oJ3g@3hIci\u0019`;He"));
            case 14:
                return Crypt.a(Crypt.xrc("\u001d3lJ3m\u001bj;Hki\u001c0l\u001ab=JalMcnM69Mgn\u001cf"));
            case 15:
                return Crypt.a(Crypt.xrc("Oai@6hOa<\u0019kh\u001c7m@fjM6f\u001a1hHe=\u001b3lNf"));
            default:
                return Crypt.a(Crypt.xrc("L0:A`hN3hMe<Jb:\u001ckfL3oA7j\u001b4f\u001ej<\u001dd"));
        }
    }

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public String m2742() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if (nextElement2 != null && !nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address) && nextElement.isUp() && !nextElement.getDisplayName().startsWith(Crypt.a(Crypt.xrc("@cg\u001ag=Ad9Oen\u00190gMj:H3h@jmK`o\u001cki\u00197")))) {
                        return nextElement.getDisplayName();
                    }
                }
            }
            return "";
        } catch (SocketException e) {
            e.getMessage();
            return "";
        }
    }

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public final String m2743(X509Certificate x509Certificate) {
        MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa")));
        messageDigest.update(x509Certificate.getEncoded());
        byte[] digest = messageDigest.digest();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuffer stringBuffer = new StringBuffer(digest.length * 2);
        for (int i = 0; i < digest.length; i++) {
            stringBuffer.append(cArr[(digest[i] & 240) >> 4]);
            stringBuffer.append(cArr[digest[i] & 15]);
        }
        return stringBuffer.toString();
    }

    /* renamed from: く〱なおぎ, reason: contains not printable characters */
    public String[] m2744(String str) {
        if (str.trim().isEmpty()) {
            return C1842.f8212;
        }
        File file = new File(str);
        if (!file.exists()) {
            ((C1216) App.f3760).m2794();
            return C1842.f8212;
        }
        String m2789 = ((C1216) App.f3760).m2789(file);
        if (!m2789.isEmpty() && m2789.contains(Crypt.a(Crypt.xrc("HgfIg>A69A`:\u00190i\u001b`h\u001c6m\u001c79I7=@c=Ok")))) {
            return m2789.split("\\[splitConfig\\]", -1);
        }
        return C1842.f8212;
    }

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public final String m2745(File file) {
        String a = Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"));
        if (!file.exists()) {
            m2790(Crypt.a(Crypt.xrc("\u001a6k\u0019dhNfhNkjMff@b=\u00197l\u00193gH7<\u001adk\u001a1")), -65536);
            return "";
        }
        try {
            String a2 = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            new FileInputStream(file);
            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa")));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            StringBuilder sb = new StringBuilder();
            String stringBuffer2 = stringBuffer.toString();
            for (int i = 0; i < stringBuffer2.length(); i++) {
                char charAt = stringBuffer2.charAt(i);
                char[] cArr = this.f6017;
                sb.append((char) (charAt ^ cArr[i % cArr.length]));
            }
            byte[] m3960 = C1844.m3960(sb.toString().getBytes(a));
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(messageDigest.digest(Crypt.a(Crypt.xrc("\u001b7j\u001bfjK0m\u001bc>\u00196gAjjA7f@4jN0mAd;Mkh\u001cgg@3>MkjI7jOc=\u001bdlId9\u001c4:Ag:Ig9O")).getBytes(a)), 16), a2.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[1]);
            Cipher cipher = Cipher.getInstance(a2);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(m3960), a);
        } catch (Exception unused) {
            return Crypt.a(Crypt.xrc("I4mObmI`j\u001c7k\u001ddlO3;Je;\u0019dgJeiNjnJ1"));
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final int m2746(String str) {
        return str.length() - str.replace(Crypt.a(Crypt.xrc("K7kM7<\u0019d>\u001c1<\u00194f\u001e4:O79Iji\u001cdkAbo\u001dk")), "").length();
    }

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public final String m2747(File file) {
        String a = Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"));
        if (!file.exists()) {
            m2790(Crypt.a(Crypt.xrc("\u001a6k\u0019dhNfhNkjMff@b=\u00197l\u00193gH7<\u001adk\u001a1")), -65536);
            return "";
        }
        try {
            String a2 = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            new FileInputStream(file);
            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa")));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            StringBuilder sb = new StringBuilder();
            String stringBuffer2 = stringBuffer.toString();
            for (int i = 0; i < stringBuffer2.length(); i++) {
                char charAt = stringBuffer2.charAt(i);
                char[] cArr = this.f6017;
                sb.append((char) (charAt ^ cArr[i % cArr.length]));
            }
            byte[] m3960 = C1844.m3960(sb.toString().getBytes(a));
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(messageDigest.digest(Crypt.a(Crypt.xrc("\u001b7j\u001bfjK0m\u001bc>\u00196gAjjA7f@4jN0mAd;Mk=@gmMdl\u001bggNdkAj;@knMe<\u001a0oJb<Mki\u001c")).getBytes(a)), 16), a2.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[1]);
            Cipher cipher = Cipher.getInstance(a2);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(m3960), a);
        } catch (Exception unused) {
            return Crypt.a(Crypt.xrc("I4mObmI`j\u001c7k\u001ddlO3;Je;\u0019dgJeiNjnJ1"));
        }
    }

    /* renamed from: けときぜと, reason: contains not printable characters */
    public String m2748(File file) {
        String a = Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"));
        if (!file.exists()) {
            m2790(Crypt.a(Crypt.xrc("\u001a6k\u0019dhNfhNkjMff@b=\u00197l\u00193gH7<\u001adk\u001a1")), -65536);
            return "";
        }
        try {
            String a2 = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            new FileInputStream(file);
            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa")));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            StringBuilder sb = new StringBuilder();
            String stringBuffer2 = stringBuffer.toString();
            for (int i = 0; i < stringBuffer2.length(); i++) {
                char charAt = stringBuffer2.charAt(i);
                char[] cArr = this.f6017;
                sb.append((char) (charAt ^ cArr[i % cArr.length]));
            }
            byte[] m3960 = C1844.m3960(AESEncrypt.decode(App.f3759, sb.toString()).getBytes(a));
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(messageDigest.digest(Crypt.a(Crypt.xrc("\u001c19JfgAkh\u001e6;\u001ceiM3f@foOah\u001e7h\u001d`h\u001dj")).getBytes(a)), 16), a2.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[1]);
            Cipher cipher = Cipher.getInstance(a2);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(m3960), a);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public String m2749(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(this.f6010[3][5]), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public BasicBinaryEncryptor m2750() {
        BasicBinaryEncryptor basicBinaryEncryptor = new BasicBinaryEncryptor();
        basicBinaryEncryptor.setPassword(new String(this.f6014[0][0]));
        return basicBinaryEncryptor;
    }

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public final String m2751(File file) {
        String a = Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"));
        if (!file.exists()) {
            m2790(Crypt.a(Crypt.xrc("\u001a6k\u0019dhNfhNkjMff@b=\u00197l\u00193gH7<\u001adk\u001a1")), -65536);
            return "";
        }
        try {
            String a2 = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            new FileInputStream(file);
            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa")));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            StringBuilder sb = new StringBuilder();
            String stringBuffer2 = stringBuffer.toString();
            for (int i = 0; i < stringBuffer2.length(); i++) {
                char charAt = stringBuffer2.charAt(i);
                char[] cArr = this.f6017;
                sb.append((char) (charAt ^ cArr[i % cArr.length]));
            }
            byte[] m3960 = C1844.m3960(sb.toString().getBytes(a));
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(messageDigest.digest(Crypt.a(Crypt.xrc("\u001b7j\u001bfjK0m\u001bc>\u00196gAjjA7f@4jN0mAd;Mko\u001bc<H`iI1=K4nN6;@fk\u001c3=\u001aknHd:Mfl\u0019")).getBytes(a)), 16), a2.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[1]);
            Cipher cipher = Cipher.getInstance(a2);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(m3960), a);
        } catch (Exception unused) {
            return Crypt.a(Crypt.xrc("I4mObmI`j\u001c7k\u001ddlO3;Je;\u0019dgJeiNjnJ1"));
        }
    }

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public String m2752(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(Crypt.a(Crypt.xrc("\u0019al\u001ajj\u001bc>\u001ddj\u001d3h\u0019e=\u001b4n\u001eei\u001a4n\u001ckjHkiLeo\u001deo@blJb;L0f\u001daiObf\u001ac9H0m\u0019bfA")).getBytes()), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: ごまぉてう, reason: contains not printable characters */
    public String m2753() {
        String string = App.f3762.getString(new String(this.f6010[5][2]), "");
        return string == null ? "" : string;
    }

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public String m2754(File file) {
        String a = Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"));
        if (!file.exists()) {
            m2790(Crypt.a(Crypt.xrc("\u001a6k\u0019dhNfhNkjMff@b=\u00197l\u00193gH7<\u001adk\u001a1")), -65536);
            return "";
        }
        try {
            String a2 = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            new FileInputStream(file);
            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa")));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            StringBuilder sb = new StringBuilder();
            String stringBuffer2 = stringBuffer.toString();
            for (int i = 0; i < stringBuffer2.length(); i++) {
                char charAt = stringBuffer2.charAt(i);
                char[] cArr = this.f6017;
                sb.append((char) (charAt ^ cArr[i % cArr.length]));
            }
            byte[] m3960 = C1844.m3960(sb.toString().getBytes(a));
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(messageDigest.digest(Crypt.a(Crypt.xrc("I6n\u001b3l\u001a6i\u001bgj\u001b`jHbmL6>Kf>LbjNblKa")).getBytes(a)), 16), a2.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[1]);
            Cipher cipher = Cipher.getInstance(a2);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(m3960), a);
        } catch (Exception unused) {
            return Crypt.a(Crypt.xrc("I4mObmI`j\u001c7k\u001ddlO3;Je;\u0019dgJeiNjnJ1"));
        }
    }

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public String m2755(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(Crypt.a(Crypt.xrc("Ig>@6>\u001d`mJ3mL6;\u001a`mHbi\u001dfmJb<\u00190g\u001ad")).getBytes()), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public String m2756(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(this.f6010[3][3]), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: しげにけぃ, reason: contains not printable characters */
    public int m2757(String str) {
        if (str.compareTo(Crypt.a(Crypt.xrc("\u001b0hO`lOjoOcmLk>\u001b1;K`:\u001cglM4g@jnLd"))) == 0) {
            return 8;
        }
        if (str.compareTo(Crypt.a(Crypt.xrc("H7mNd;@0m\u001ed;I4gMelJ1j\u001bgfAglJfn\u0019c"))) == 0) {
            return 12;
        }
        if (str.compareTo(Crypt.a(Crypt.xrc("\u001bbi\u001bdhLc:M6jIckMe<\u001b6hLf:Okf\u001d3iN`"))) == 0) {
            return 16;
        }
        return str.compareTo(Crypt.a(Crypt.xrc("L7=LkfIgi\u001ea:Jbn\u001b`iIk>Jdm@dlL1jJk"))) == 0 ? 24 : 0;
    }

    /* renamed from: しぷげへが, reason: contains not printable characters */
    public String m2758() {
        Enumeration<NetworkInterface> networkInterfaces;
        try {
            networkInterfaces = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException e) {
            e.getMessage();
        }
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface nextElement = networkInterfaces.nextElement();
            Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
            while (inetAddresses.hasMoreElements()) {
                InetAddress nextElement2 = inetAddresses.nextElement();
                if (nextElement2 != null && !nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address) && nextElement.isUp() && !nextElement2.getHostAddress().equals(Crypt.a(Crypt.xrc("\u001cb;@fgM7nI`mNdhIb9\u00196gJ0fJfh@k=\u001b1"))) && !nextElement2.getHostAddress().equals(Crypt.a(Crypt.xrc("\u001b3fNkj\u001afiJgi\u0019knN6f\u001bjfHaoN`fOcfKe"))) && !nextElement2.getHostAddress().equals(Crypt.a(Crypt.xrc("\u001bdhNfoI6f\u001dalM4iH7o\u001b6i@4lAd;\u001b6<\u001c0"))) && !nextElement2.getHostAddress().equals(Crypt.a(Crypt.xrc("OgfLj9\u001c`9HelJ7iKg=\u001c6iKk;Lfk\u001dj>M3")))) {
                    if (m2714(App.f3759)) {
                        if (!nextElement.getDisplayName().startsWith(Crypt.a(Crypt.xrc("Lb;O1nIgl@ggH6j\u001dbm\u001cflMamOe=OaiI6")))) {
                            if (!nextElement.getDisplayName().startsWith(Crypt.a(Crypt.xrc("@cg\u001ag=Ad9Oen\u00190gMj:H3h@jmK`o\u001cki\u00197"))) && !nextElement.getDisplayName().startsWith(Crypt.a(Crypt.xrc("A3:M`;Mj=Id:\u0019khL3iJ`o\u001dg;\u001bjn\u001e7=J4"))) && !nextElement.getDisplayName().startsWith(Crypt.a(Crypt.xrc("Ad<\u001ck=\u0019ckH`=@3g\u001bbmKgmLfn\u0019e;IahJ4"))) && !nextElement.getDisplayName().startsWith(Crypt.a(Crypt.xrc("Lak\u001efh@`oH4hIjiK`k@gmM`lAeoAe9\u00197")))) {
                                return nextElement2.getHostAddress();
                            }
                        }
                    } else if (nextElement.getDisplayName().startsWith(Crypt.a(Crypt.xrc("\u001dboLanL69Lb9A4iKghHcf\u00194oK19\u001c`g\u0019f")))) {
                        continue;
                    } else {
                        if (!nextElement.getDisplayName().startsWith(Crypt.a(Crypt.xrc("@cg\u001ag=Ad9Oen\u00190gMj:H3h@jmK`o\u001cki\u00197")))) {
                            return nextElement2.getHostAddress();
                        }
                        continue;
                    }
                    e.getMessage();
                    return Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb"));
                }
            }
        }
        return Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb"));
    }

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public String m2759(File file) {
        String a = Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"));
        if (!file.exists()) {
            m2790(Crypt.a(Crypt.xrc("\u001a6k\u0019dhNfhNkjMff@b=\u00197l\u00193gH7<\u001adk\u001a1")), -65536);
            return "";
        }
        try {
            String a2 = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            new FileInputStream(file);
            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa")));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            StringBuilder sb = new StringBuilder();
            String stringBuffer2 = stringBuffer.toString();
            for (int i = 0; i < stringBuffer2.length(); i++) {
                char charAt = stringBuffer2.charAt(i);
                char[] cArr = this.f6017;
                sb.append((char) (charAt ^ cArr[i % cArr.length]));
            }
            byte[] m3960 = C1844.m3960(sb.toString().getBytes(a));
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(messageDigest.digest(Crypt.a(Crypt.xrc("Afi\u00196=I1jMcm@6m\u001da9L7oHkhH1>\u001dg:\u001b3")).getBytes(a)), 16), a2.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[1]);
            Cipher cipher = Cipher.getInstance(a2);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(m3960), a);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0107, code lost:
    
        if (r2 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0064, code lost:
    
        if (r3 == null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0104 A[Catch: Exception -> 0x010c, TRY_ENTER, TryCatch #1 {Exception -> 0x010c, blocks: (B:29:0x00e8, B:30:0x0109, B:41:0x0104), top: B:18:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc A[Catch: Exception -> 0x00ff, TRY_LEAVE, TryCatch #8 {Exception -> 0x00ff, blocks: (B:51:0x00f7, B:46:0x00fc), top: B:50:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005e A[Catch: Exception -> 0x0062, TRY_ENTER, TryCatch #14 {Exception -> 0x0062, blocks: (B:13:0x0041, B:14:0x0066, B:72:0x005e), top: B:2:0x001e }] */
    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m2760(java.io.File r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p050.p053.C1216.m2760(java.io.File, java.lang.String):void");
    }

    /* renamed from: せだてはぺて, reason: contains not printable characters */
    public String m2761() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if (!nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address) && nextElement.getDisplayName().startsWith(Crypt.a(Crypt.xrc("Ad<\u001ck=\u0019ckH`=@3g\u001bbmKgmLfn\u0019e;IahJ4")))) {
                        return nextElement2.getHostAddress();
                    }
                }
            }
        } catch (Exception unused) {
        }
        return Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb"));
    }

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public String m2762(File file) {
        String a = Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"));
        if (!file.exists()) {
            m2790(Crypt.a(Crypt.xrc("\u001a6k\u0019dhNfhNkjMff@b=\u00197l\u00193gH7<\u001adk\u001a1")), -65536);
            return "";
        }
        try {
            String a2 = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            new FileInputStream(file);
            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa")));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            StringBuilder sb = new StringBuilder();
            String stringBuffer2 = stringBuffer.toString();
            for (int i = 0; i < stringBuffer2.length(); i++) {
                char charAt = stringBuffer2.charAt(i);
                char[] cArr = this.f6017;
                sb.append((char) (charAt ^ cArr[i % cArr.length]));
            }
            byte[] m3960 = C1844.m3960(sb.toString().getBytes(a));
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(messageDigest.digest(Crypt.a(Crypt.xrc("OcfMkkMgk\u001d`k\u0019khHanL7>\u001b`h\u001a7;@0=\u001ck")).getBytes(a)), 16), a2.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[1]);
            Cipher cipher = Cipher.getInstance(a2);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(m3960), a);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public String m2763(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(this.f6010[3][8]), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: つしけおつ, reason: contains not printable characters */
    public String m2764(Context context) {
        String a;
        WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService(Crypt.a(Crypt.xrc("Hfk@gfIgiMj;Oj>LfoI1mJgoKb:H`lO7")))).getConnectionInfo();
        String replace = connectionInfo.getSSID().replace("\"", "");
        if (replace.contains(Crypt.a(Crypt.xrc("\u001ekm\u001c0<K`n\u001baiOe9JakM4<IdkIc<Lkg\u0019b")))) {
            try {
                replace = ((ConnectivityManager) context.getSystemService(Crypt.a(Crypt.xrc("N4k\u001a6:N4j@boL09O3nNb=\u001egoMfi\u001cbnNf")))).getActiveNetworkInfo().getExtraInfo().replace("\"", "");
            } catch (Exception unused) {
            }
        }
        StringBuilder m4179 = C2098.m4179(replace, Crypt.a(Crypt.xrc("JbgNg9K3fHcn\u001cfiNaiJ3kI7m\u00194>\u001979\u001b6")));
        m4179.append(connectionInfo.getLinkSpeed());
        m4179.append(Crypt.a(Crypt.xrc("\u001edj\u00191iOknJgiNcg\u001dcn\u001cejJjmH`iHbjJ1")));
        if (Build.VERSION.SDK_INT >= 21) {
            StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("\u001ej=\u001cdmNj<\u001ed<\u001cjfLfg\u001dc;L3k\u001cg>H3mKb")));
            DecimalFormat decimalFormat = new DecimalFormat(Crypt.a(Crypt.xrc("\u001c4kI7k\u0019fjKcgLem\u001c6h@7m\u001bkf\u001bk;\u001c4<\u00194")));
            double frequency = connectionInfo.getFrequency();
            Double.isNaN(frequency);
            Double.isNaN(frequency);
            m4207.append(decimalFormat.format(frequency / 1000.0d));
            m4207.append(Crypt.a(Crypt.xrc("O`<Lc;\u001bf=\u001ag<OglNkk@3<O49\u001bamN4oA3")));
            a = m4207.toString();
        } else {
            a = Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"));
        }
        m4179.append(a);
        return m4179.toString();
    }

    /* renamed from: づあてぐく, reason: contains not printable characters */
    public String m2765(String str) {
        Process process;
        DataOutputStream dataOutputStream;
        StringBuilder sb = new StringBuilder();
        DataOutputStream dataOutputStream2 = null;
        try {
            try {
                process = Runtime.getRuntime().exec(Crypt.a(Crypt.xrc("J3f\u001cehIe>@co\u001c4k\u001ec;H6kO4:L7mOci\u001b6")));
                try {
                    dataOutputStream = new DataOutputStream(process.getOutputStream());
                } catch (Exception unused) {
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
            process = null;
        } catch (Throwable th2) {
            th = th2;
            process = null;
        }
        try {
            dataOutputStream.writeBytes(str + "\n");
            dataOutputStream.writeBytes("exit\n");
            dataOutputStream.flush();
            process.waitFor();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine + "\n");
            }
            dataOutputStream.close();
        } catch (Exception unused4) {
            dataOutputStream2 = dataOutputStream;
            if (dataOutputStream2 != null) {
                dataOutputStream2.close();
            }
            process.destroy();
            return sb.toString();
        } catch (Throwable th3) {
            th = th3;
            dataOutputStream2 = dataOutputStream;
            if (dataOutputStream2 != null) {
                try {
                    dataOutputStream2.close();
                } catch (Exception unused5) {
                    throw th;
                }
            }
            process.destroy();
            throw th;
        }
        process.destroy();
        return sb.toString();
    }

    /* renamed from: づおぴ〱いづ, reason: contains not printable characters */
    public void m2766(View view, String str, int i) {
        ((C1216) App.f3760).m2790(str, i);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public String m2767(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(this.f6010[3][0]), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public String m2768(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(this.f6010[3][7]), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public String m2769(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(Crypt.a(Crypt.xrc("A`=\u001b6:Lf;HkgI7j\u0019ahLa:I3f\u001d3iAcnJc")).getBytes()), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: でどあくず, reason: contains not printable characters */
    public String m2770(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(Crypt.a(Crypt.xrc("\u0019b>Og;Jfo\u001de;@gjLeo\u001cbiL1=H1iMc>Jj")).getBytes()), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public String m2771(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(this.f6010[3][4]), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public byte[] m2772(int i, int i2) {
        return this.f6010[i][i2];
    }

    /* renamed from: ながふずは, reason: contains not printable characters */
    public String m2773(File file) {
        if (!file.exists()) {
            m2790(Crypt.a(Crypt.xrc("\u001a6k\u0019dhNfhNkjMff@b=\u00197l\u00193gH7<\u001adk\u001a1")), -65536);
            return "";
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            StringBuilder sb = new StringBuilder();
            String stringBuffer2 = stringBuffer.toString();
            for (int i = 0; i < stringBuffer2.length(); i++) {
                char charAt = stringBuffer2.charAt(i);
                char[] cArr = this.f6015;
                sb.append((char) (charAt ^ cArr[i % cArr.length]));
            }
            return AESEncrypt.decode0(App.f3759, sb.toString(), 1);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public String m2774(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(this.f6010[3][1]), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public String m2775(File file) {
        String a = Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"));
        if (!file.exists()) {
            m2790(Crypt.a(Crypt.xrc("\u001a6k\u0019dhNfhNkjMff@b=\u00197l\u00193gH7<\u001adk\u001a1")), -65536);
            return "";
        }
        try {
            String a2 = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            new FileInputStream(file);
            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa")));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            StringBuilder sb = new StringBuilder();
            String stringBuffer2 = stringBuffer.toString();
            for (int i = 0; i < stringBuffer2.length(); i++) {
                char charAt = stringBuffer2.charAt(i);
                char[] cArr = this.f6017;
                sb.append((char) (charAt ^ cArr[i % cArr.length]));
            }
            byte[] m3960 = C1844.m3960(sb.toString().getBytes(a));
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(messageDigest.digest(Crypt.a(Crypt.xrc("Oe;Mdo@`i\u001d0;I6f\u001cbmId=N1:Och@`=\u001bj")).getBytes(a)), 16), a2.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[1]);
            Cipher cipher = Cipher.getInstance(a2);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(m3960), a);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public String m2776() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if (!nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address) && nextElement.getDisplayName().startsWith(Crypt.a(Crypt.xrc("Ad<\u001ck=\u0019ckH`=@3g\u001bbmKgmLfn\u0019e;IahJ4")))) {
                        return nextElement.getDisplayName();
                    }
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: にぷきなせこ, reason: contains not printable characters */
    public boolean m2777(String str) {
        Process process;
        DataOutputStream dataOutputStream = null;
        try {
            process = Runtime.getRuntime().exec(Crypt.a(Crypt.xrc("\u001e1>A7f\u001bcj\u001a`fMkk\u001af9\u001bflKaj\u001909\u001a1kIk")));
            try {
                DataOutputStream dataOutputStream2 = new DataOutputStream(process.getOutputStream());
                try {
                    dataOutputStream2.writeBytes(str + "\n");
                    dataOutputStream2.writeBytes("exit\n");
                    dataOutputStream2.flush();
                    process.waitFor();
                    try {
                        dataOutputStream2.close();
                        process.destroy();
                        return true;
                    } catch (Exception unused) {
                        return true;
                    }
                } catch (Exception unused2) {
                    dataOutputStream = dataOutputStream2;
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (Exception unused3) {
                            return false;
                        }
                    }
                    if (process != null) {
                        process.destroy();
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (Exception unused4) {
                            throw th;
                        }
                    }
                    if (process != null) {
                        process.destroy();
                    }
                    throw th;
                }
            } catch (Exception unused5) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused6) {
            process = null;
        } catch (Throwable th3) {
            th = th3;
            process = null;
        }
    }

    /* renamed from: のかまじえ, reason: contains not printable characters */
    public boolean m2778(Context context, String str) {
        try {
            for (Signature signature : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
                if (!str.equalsIgnoreCase(m2743(m2784(signature)))) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException unused) {
            return true;
        }
    }

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public final String m2779(File file) {
        String a = Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"));
        if (!file.exists()) {
            m2790(Crypt.a(Crypt.xrc("\u001a6k\u0019dhNfhNkjMff@b=\u00197l\u00193gH7<\u001adk\u001a1")), -65536);
            return "";
        }
        try {
            String a2 = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            new FileInputStream(file);
            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa")));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            StringBuilder sb = new StringBuilder();
            String stringBuffer2 = stringBuffer.toString();
            for (int i = 0; i < stringBuffer2.length(); i++) {
                char charAt = stringBuffer2.charAt(i);
                char[] cArr = this.f6017;
                sb.append((char) (charAt ^ cArr[i % cArr.length]));
            }
            byte[] m3960 = C1844.m3960(sb.toString().getBytes(a));
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(messageDigest.digest(Crypt.a(Crypt.xrc("\u001b7j\u001bfjK0m\u001bc>\u00196gAjjA7f@4jN0mAd;Mk<L6:\u0019`l\u001ce>Hj=Jb:Nd;\u001a1=\u001c7jOei\u001dg9J")).getBytes(a)), 16), a2.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[1]);
            Cipher cipher = Cipher.getInstance(a2);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(m3960), a);
        } catch (Exception unused) {
            return Crypt.a(Crypt.xrc("I4mObmI`j\u001c7k\u001ddlO3;Je;\u0019dgJeiNjnJ1"));
        }
    }

    /* renamed from: のびぶけせ, reason: contains not printable characters */
    public String m2780() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if (!nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address) && nextElement.getDisplayName().startsWith(Crypt.a(Crypt.xrc("A3:M`;Mj=Id:\u0019khL3iJ`o\u001dg;\u001bjn\u001e7=J4")))) {
                        return nextElement.getDisplayName();
                    }
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public String m2781(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(Crypt.a(Crypt.xrc("\u0019al\u001ajj\u001bc>\u001ddj\u001d3h\u0019e=\u001b4n\u001eei\u001a4n\u001ckjHki\u001degJ4j\u001c`gMf:\u001cffHfh\u001cbkK3oO1iKaf\u001e")).getBytes()), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public String m2782(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(Crypt.a(Crypt.xrc("\u0019al\u001ajj\u001bc>\u001ddj\u001d3h\u0019e=\u001b4n\u001eei\u001a4n\u001ckjHkhAgk@k:\u001db:K3nJ3jKjfM1<J`i\u001ad;\u001d7:\u001c")).getBytes()), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: はぁとそぎ, reason: contains not printable characters */
    public String m2783() {
        String string = App.f3762.getString(new String(this.f6010[5][1]), "");
        return string == null ? "" : string;
    }

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public final X509Certificate m2784(Signature signature) {
        return (X509Certificate) CertificateFactory.getInstance(Crypt.a(Crypt.xrc("\u001df;\u001cji\u001d`i\u001e7:J`kMjn\u0019a;\u001e1n@6;K7;@7"))).generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
    }

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public String m2785(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(Crypt.a(Crypt.xrc("\u001bahHfo\u001dcmN7oMjkJ4k\u001d1oAejNfo\u001b4oHd:\u001agfLegM1mAchKk9\u00196i\u001aa<\u001ad9L6;\u001ab:\u001e")).getBytes()), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: ぱでかぁ〻〹, reason: contains not printable characters */
    public String m2786(String str) {
        if (str.compareTo(Crypt.a(Crypt.xrc("\u001b0hO`lOjoOcmLk>\u001b1;K`:\u001cglM4g@jnLd"))) == 0) {
            return Crypt.a(Crypt.xrc("JjoLdjMdkI3nL3=\u001e7g\u001aalNe<\u001c`m\u001c6>I4"));
        }
        if (str.compareTo(Crypt.a(Crypt.xrc("H7mNd;@0m\u001ed;I4gMelJ1j\u001bgfAglJfn\u0019c"))) == 0) {
            return Crypt.a(Crypt.xrc("K4k@1;NboOemH0l\u001eemOei\u00191gKcg\u001e4gJa"));
        }
        if (str.compareTo(Crypt.a(Crypt.xrc("\u001bbi\u001bdhLc:M6jIckMe<\u001b6hLf:Okf\u001d3iN`"))) == 0) {
            return Crypt.a(Crypt.xrc("\u00197o\u001ea:\u001bd9Nkg\u0019fl@go\u001eef@c=I4f\u001c`g\u001c3"));
        }
        if (str.compareTo(Crypt.a(Crypt.xrc("L7=LkfIgi\u001ea:Jbn\u001b`iIk>Jdm@dlL1jJk"))) == 0) {
            return Crypt.a(Crypt.xrc("A3k\u001c4=M3<\u001edf\u001ddh\u001b1m\u001aem\u001aalM`h\u001a0h\u001dd"));
        }
        return null;
    }

    /* renamed from: ひぞ〴つき, reason: contains not printable characters */
    public boolean m2787(Context context) {
        return context.getPackageName().equals(new String(this.f6010[0][2]));
    }

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public String m2788(File file) {
        String a = Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"));
        if (!file.exists()) {
            m2790(Crypt.a(Crypt.xrc("\u001a6k\u0019dhNfhNkjMff@b=\u00197l\u00193gH7<\u001adk\u001a1")), -65536);
            return "";
        }
        try {
            String a2 = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            new FileInputStream(file);
            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa")));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            StringBuilder sb = new StringBuilder();
            String stringBuffer2 = stringBuffer.toString();
            for (int i = 0; i < stringBuffer2.length(); i++) {
                char charAt = stringBuffer2.charAt(i);
                char[] cArr = this.f6017;
                sb.append((char) (charAt ^ cArr[i % cArr.length]));
            }
            byte[] m3960 = C1844.m3960(sb.toString().getBytes(a));
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(messageDigest.digest(Crypt.a(Crypt.xrc("\u001a39Kb9L0;\u001bckHgi\u001ba>H7jN6hIf>Kgk\u001ad")).getBytes(a)), 16), a2.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[1]);
            Cipher cipher = Cipher.getInstance(a2);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(m3960), a);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: びがえ〱な, reason: contains not printable characters */
    public String m2789(File file) {
        if (file.length() <= 0) {
            this.f6016 = null;
            return "";
        }
        if (!file.exists()) {
            this.f6016 = null;
            return "";
        }
        if (!file.getPath().equals(this.f6011)) {
            this.f6009 = file.lastModified();
            this.f6011 = file.getPath();
            this.f6016 = null;
        }
        if (this.f6016 != null && file.lastModified() == this.f6009) {
            return this.f6016;
        }
        this.f6009 = file.lastModified();
        try {
            Object newInstance = ClassLoader.getSystemClassLoader().loadClass(Crypt.a(Crypt.xrc("I1l\u001a7g\u001cj9\u001dd<Mao\u001e6:O3k\u001ba;N`h\u001cbg\u001dd:IbkJk9I1h\u001bjmN0=I4iL6j@6fM`<O3>\u001d6f\u001a3nN0:\u001d`gLa:\u001be;\u001d0m\u001dam\u001c7oA4n\u001cbi"))).newInstance();
            Field declaredField = newInstance.getClass().getDeclaredField(Crypt.a(Crypt.xrc("K`9J`;\u001cc<L3:Na9\u001bd<Me=\u001adlJ`=\u001aj:M0")));
            declaredField.setAccessible(true);
            Set keySet = ((HashMap) declaredField.get(newInstance)).keySet();
            String a = Crypt.a(Crypt.xrc("Jd>\u001dahM7mO0gA0<\u001a7lA6m\u001ak9\u001a0iO7n\u0019bg@6hK0:@6o\u00193oJe<\u001e6;\u001bcn\u001b`k\u001b`gMei\u001d"));
            if (keySet != null && !keySet.isEmpty()) {
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    if (it.next().toString().toLowerCase().contains(a)) {
                        this.f6016 = null;
                        return "";
                    }
                }
            }
            Field declaredField2 = newInstance.getClass().getDeclaredField(Crypt.a(Crypt.xrc("O3k\u001de:\u001bc<O`kN39Oj9I0jHkkO1jLfoMj")));
            declaredField2.setAccessible(true);
            Set keySet2 = ((HashMap) declaredField2.get(newInstance)).keySet();
            if (keySet2 != null && !keySet2.isEmpty()) {
                Iterator it2 = keySet2.iterator();
                while (it2.hasNext()) {
                    if (it2.next().toString().toLowerCase().contains(a)) {
                        this.f6016 = null;
                        return "";
                    }
                }
            }
            Field declaredField3 = newInstance.getClass().getDeclaredField(Crypt.a(Crypt.xrc("\u001bk9L0fI79MjgJ7kNgk\u001d7<OcfIgmIfg\u001cj=\u001bko\u001bgg\u001b0oI1nMc9A69\u001d7g@jl\u001a3<Aa>\u001c")));
            declaredField3.setAccessible(true);
            Set keySet3 = ((HashMap) declaredField3.get(newInstance)).keySet();
            if (keySet3 != null && !keySet3.isEmpty()) {
                Iterator it3 = keySet3.iterator();
                while (it3.hasNext()) {
                    if (it3.next().toString().toLowerCase().contains(a)) {
                        this.f6016 = null;
                        return "";
                    }
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | Exception unused) {
        }
        String m2773 = ((C1216) App.f3760).m2773(file);
        String a2 = Crypt.a(Crypt.xrc("HgfIg>A69A`:\u00190i\u001b`h\u001c6m\u001c79I7=@c=Ok"));
        if (m2773.contains(a2)) {
            this.f6016 = m2773;
            return m2773;
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2728(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused2) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2712(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused3) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2737(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused4) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2748(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused5) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2754(file);
            if (m2773.contains(a2)) {
                try {
                    m2760(file, m2773);
                } catch (Exception unused6) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = m2751(file);
            if (m2773.contains(a2)) {
                try {
                    m2760(file, m2773);
                } catch (Exception unused7) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = m2745(file);
            if (m2773.contains(a2)) {
                try {
                    m2760(file, m2773);
                } catch (Exception unused8) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = m2704(file);
            if (m2773.contains(a2)) {
                try {
                    m2760(file, m2773);
                } catch (Exception unused9) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = m2747(file);
            if (m2773.contains(a2)) {
                try {
                    m2760(file, m2773);
                } catch (Exception unused10) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = m2779(file);
            if (m2773.contains(a2)) {
                try {
                    m2760(file, m2773);
                } catch (Exception unused11) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = m2801(file);
            if (m2773.contains(a2)) {
                try {
                    m2760(file, m2773);
                } catch (Exception unused12) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2793(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused13) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2762(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused14) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2736(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused15) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2802(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused16) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2759(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused17) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2725(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused18) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2775(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused19) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2788(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused20) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2726(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused21) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2733(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused22) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2715(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused23) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2792(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused24) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2770(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused25) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2755(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused26) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2752(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused27) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2782(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused28) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2734(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused29) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2729(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused30) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2738(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused31) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2797(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused32) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2781(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused33) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2769(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused34) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2804(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused35) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2721(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused36) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2799(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused37) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2705(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused38) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2785(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused39) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2731(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused40) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2763(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused41) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2768(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused42) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2720(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused43) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2749(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused44) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2771(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused45) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2756(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused46) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2717(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused47) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2774(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused48) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (!m2773.contains(a2)) {
            m2773 = ((C1216) App.f3760).m2767(file);
            if (m2773.contains(a2)) {
                try {
                    ((C1216) App.f3760).m2760(file, m2773);
                } catch (Exception unused49) {
                }
                this.f6016 = m2773;
                return m2773;
            }
        }
        if (m2773.contains(a2)) {
            return m2773;
        }
        String a3 = Crypt.a(Crypt.xrc("L0;N0hIel\u00190=L3<L`<O49\u0019cnL0;L7gO7"));
        this.f6016 = a3;
        return a3;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m2790(String str, int i) {
        try {
            try {
                Toast toast = new Toast(App.f3759);
                toast.setDuration(1);
                View inflate = ((LayoutInflater) App.f3759.getSystemService(Crypt.a(Crypt.xrc("\u001cfoM4o\u001b`kJb=NjfN6mNk;MffM3fIjf\u001d1")))).inflate(2131493039, (ViewGroup) null);
                inflate.setBackgroundColor(C1067.m2405(App.f3759, R.color.transparent));
                TextView textView = (TextView) inflate.findViewById(2131296641);
                textView.setTextColor(i);
                textView.setGravity(17);
                textView.setPadding(20, 15, 20, 15);
                textView.setText(str);
                toast.setView(inflate);
                toast.show();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            Toast.makeText(App.f3759, str, 1).show();
        }
    }

    /* renamed from: びちづぼぬ, reason: contains not printable characters */
    public String m2791() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if (nextElement2 != null && !nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address) && nextElement.isUp() && nextElement.getDisplayName().startsWith(Crypt.a(Crypt.xrc("@cg\u001ag=Ad9Oen\u00190gMj:H3h@jmK`o\u001cki\u00197")))) {
                        return nextElement.getDisplayName();
                    }
                }
            }
            return "";
        } catch (SocketException e) {
            e.getMessage();
            return "";
        }
    }

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public String m2792(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(Crypt.a(Crypt.xrc("\u001ba;Odk\u001dcm\u00191<I7gMbiMe9\u001ad<\u001aal\u001d3lNj")).getBytes()), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public String m2793(File file) {
        String a = Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"));
        if (!file.exists()) {
            m2790(Crypt.a(Crypt.xrc("\u001a6k\u0019dhNfhNkjMff@b=\u00197l\u00193gH7<\u001adk\u001a1")), -65536);
            return "";
        }
        try {
            String a2 = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            new FileInputStream(file);
            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa")));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            StringBuilder sb = new StringBuilder();
            String stringBuffer2 = stringBuffer.toString();
            for (int i = 0; i < stringBuffer2.length(); i++) {
                char charAt = stringBuffer2.charAt(i);
                char[] cArr = this.f6017;
                sb.append((char) (charAt ^ cArr[i % cArr.length]));
            }
            byte[] m3960 = C1844.m3960(sb.toString().getBytes(a));
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(messageDigest.digest(Crypt.a(Crypt.xrc("\u001c19JfgAkh\u001e6;\u001ceiM3f@foOah\u001e7h\u001d`h\u001dj")).getBytes(a)), 16), a2.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[1]);
            Cipher cipher = Cipher.getInstance(a2);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(m3960), a);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: ぷちぅぐね, reason: contains not printable characters */
    public void m2794() {
        this.f6016 = null;
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("I4fH1;\u001djl\u001ccfJ`;\u001eem\u001dan\u0019klA1:\u001cjoKg")), false);
        C2098.m4206(App.f3762, Crypt.a(Crypt.xrc("@gk\u0019agM3oM6iHcj\u001aei@`fL7jA1n\u001ejo\u001af")), "");
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("\u0019jkL1<\u001b3o\u00190o\u001djf\u001c`;H1n\u00193=\u001ebg\u001e7mMf")), false);
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("\u001c1m\u001d1jKjhOdn\u00190:MciNen\u001b4oKfj\u001ae9\u001bf")), false);
        C2098.m4206(App.f3762, Crypt.a(Crypt.xrc("\u001d6o\u001cgmJ6h\u001ce>\u001eb>\u0019jlAc:\u001b`mN1=J4h\u001cb")), "");
        C2098.m4206(App.f3762, Crypt.a(Crypt.xrc("M`i\u001b7nNkmN0kOemM3>O0hHjk\u001d4l@4iOf")), "");
        C2098.m4206(App.f3762, Crypt.a(Crypt.xrc("Le=\u0019eoIbg\u001ek:Ifh\u001aal\u001e3f\u0019dgMfh\u0019df\u001ca")), "");
        SharedPreferences sharedPreferences = App.f3762;
        String a = Crypt.a(Crypt.xrc("\u00190lHcg\u001e3jJelOg:Nj<Lc:L1=\u00197<Ngm\u0019`"));
        C2098.m4206(sharedPreferences, a, "");
        C2098.m4206(App.f3762, a, "");
        C2098.m4206(App.f3762, Crypt.a(Crypt.xrc("H7nOghObiKb>\u0019cgHd=\u0019k:J`iH0m\u001d`fA1")), "");
        C2098.m4206(App.f3762, Crypt.a(Crypt.xrc("\u001bj;\u0019dhH`>A4hO`j\u001a3f@7kOen\u001c0>L1>\u001ce")), "");
        C2098.m4206(App.f3762, Crypt.a(Crypt.xrc("L1hLclNjiN`n@em\u001b7>Kak\u001c09H6m\u001e6mLj")), "");
        C2098.m4206(App.f3762, Crypt.a(Crypt.xrc("H6mN69K0i\u001b`h\u001a7h@0jN6:\u001bfo\u001d`oJjkN6")), "");
        C2098.m4206(App.f3762, Crypt.a(Crypt.xrc("\u001ddiO3:\u00193g\u001c3mNfiL69KkmIco\u0019c9\u001cg>I0")), "");
        C2098.m4206(App.f3762, Crypt.a(Crypt.xrc("Kkl\u001eg9\u001eanIcf\u0019`oH4;\u0019anMboMa:\u0019k<\u001db")), "");
        C2098.m4206(App.f3762, Crypt.a(Crypt.xrc("\u001d0f@d:OfnM7>A7:\u001cbfJ4lH49L79\u001c0:O6")), "");
        C2098.m4206(App.f3762, Crypt.a(Crypt.xrc("H6f@4j\u001ad;LajN4=\u00190j\u001a4o\u001b1kN3:O4;@e")), "");
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("O1jMk<\u001ag>\u001b`j@dl@g>\u001d7<M6j\u001e3>HjhO4kM3jId>\u001e`i@0g\u001cemOamA7h\u001a1g@kl\u001e4g\u001c")), false);
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("Oj:Oe=Aal\u001bfjAbj\u001eao\u001cg;AboJb>K1f@0i@a;AkkKj:\u001e0j\u00190mJd:KafKfi\u0019giNc<L")), false);
        C2098.m4182(App.f3762, Crypt.a(Crypt.xrc("\u001d1>\u001cc>@dn\u001e1mMclMbl\u001ad;H3j\u0019d>\u001bbhMf")), false);
        App.f3762.edit().putString(new String(((C1216) App.f3760).m2772(5, 0)), "").apply();
        App.f3762.edit().putString(new String(((C1216) App.f3760).m2772(5, 1)), "").apply();
        App.f3762.edit().putString(new String(((C1216) App.f3760).m2772(5, 2)), "").apply();
        C2098.m4206(App.f3762, Crypt.a(Crypt.xrc("J`hJ6m\u001b`>\u001e6gJdj\u001e6;\u0019foKci\u001edi\u001bbg\u001d`")), "");
    }

    /* renamed from: へ〱そかのず, reason: contains not printable characters */
    public String m2795(Context context) {
        if (!m2702(context)) {
            return Crypt.a(Crypt.xrc("M1gN7l\u001bkl\u001abmAa=KchMel\u001dj>Jj;\u00190j\u0019f"));
        }
        switch (((TelephonyManager) context.getSystemService(Crypt.a(Crypt.xrc("K3m\u001a7o\u001aj:\u001a3k\u0019k>\u001c1nKkk\u001d`>I7k\u001b4gNc")))).getNetworkType()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return Crypt.a(Crypt.xrc("\u00191f@0iA3iAe9\u001a`iNfo\u001b6:H6l\u001d6:\u001c4m\u001c3"));
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return Crypt.a(Crypt.xrc("\u001d`9\u001db<\u0019g>\u001dc=HggIj;\u001b4iNfhLbmJ6hL4"));
            case 13:
                return Crypt.a(Crypt.xrc("Jc9JggOd:Mgf@7:NboIjfKjj\u001cbjNaoK0"));
            default:
                return Crypt.a(Crypt.xrc("L0:A`hN3hMe<Jb:\u001ckfL3oA7j\u001b4f\u001ej<\u001dd"));
        }
    }

    /* renamed from: へえどぜせ, reason: contains not printable characters */
    public String m2796() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if (nextElement2 != null && !nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address) && nextElement.getDisplayName().startsWith(Crypt.a(Crypt.xrc("\u001dboLanL69Lb9A4iKghHcf\u00194oK19\u001c`g\u0019f")))) {
                        return nextElement2.getHostAddress();
                    }
                }
            }
        } catch (Exception unused) {
        }
        return Crypt.a(Crypt.xrc("HaiAehO0gJ1i\u00190;M7>\u001eg;\u0019`9\u001b`lH1k\u001eb"));
    }

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public String m2797(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(Crypt.a(Crypt.xrc("\u0019al\u001ajj\u001bc>\u001ddj\u001d3h\u0019e=\u001b4n\u001eei\u001a4n\u001ckjHkgJbiJf:M39\u001d6<L3oM6oOf<\u001a49NbkAkmM")).getBytes()), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: へぼ〳〻び, reason: contains not printable characters */
    public String m2798() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if (nextElement2 != null && !nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address) && nextElement.getDisplayName().startsWith(Crypt.a(Crypt.xrc("\u001dboLanL69Lb9A4iKghHcf\u00194oK19\u001c`g\u0019f")))) {
                        String str = nextElement2.getHostAddress().toString();
                        return str.substring(0, str.lastIndexOf(Crypt.a(Crypt.xrc("K7kM7<\u0019d>\u001c1<\u00194f\u001e4:O79Iji\u001cdkAbo\u001dk"))) + 1);
                    }
                }
            }
        } catch (SocketException e) {
            e.getMessage();
        }
        return Crypt.a(Crypt.xrc("\u001bdiJ`o\u001d0l\u001bjh\u001bj;\u001bjf@bg\u001abnA1:MkgI1"));
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public String m2799(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(Crypt.a(Crypt.xrc("\u001bahHfo\u001dcmN7oMjkJ4k\u001d1oAejNfo\u001b4oHdgM3>Oc;@g>@klNjkJ1;LgfHg;\u001b7lO0kK")).getBytes()), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: ぺぃつぢぼ, reason: contains not printable characters */
    public String m2800(byte[] bArr) {
        String a = Crypt.a(Crypt.xrc("Ij=\u00191jL1;\u0019c9\u001b7g\u001d3mLa:Jj>\u001e6=Keo\u001ab"));
        try {
            String[] split = new String(bArr, Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"))).split("\\n");
            for (int i = 0; i < split.length; i++) {
                boolean startsWith = split[i].startsWith(Crypt.a(Crypt.xrc("IgjOfgJk:\u001bjjM3;@e>\u001a4=Mc=@knO7k\u001a7")));
                String a2 = Crypt.a(Crypt.xrc("\u001da>@7o@bj\u0019blL`>AekJ4kJ`:\u001denLf:\u001bd"));
                if (startsWith) {
                    if (split[i].split(a2).length > 3) {
                        return split[i].split(a2)[3].trim();
                    }
                } else if (split[i].startsWith(Crypt.a(Crypt.xrc("Nc=@bjOcgA6>\u001c`<M4lMfn\u001bd9O7m\u001djjNj")))) {
                    return split[i].split(a2).length > 1 ? split[i].split(a2)[1].trim() : a;
                }
            }
        } catch (UnsupportedEncodingException unused) {
        }
        return a;
    }

    /* renamed from: ぺがぅす〹ち, reason: contains not printable characters */
    public final String m2801(File file) {
        String a = Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"));
        if (!file.exists()) {
            m2790(Crypt.a(Crypt.xrc("\u001a6k\u0019dhNfhNkjMff@b=\u00197l\u00193gH7<\u001adk\u001a1")), -65536);
            return "";
        }
        try {
            String a2 = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            new FileInputStream(file);
            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa")));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            StringBuilder sb = new StringBuilder();
            String stringBuffer2 = stringBuffer.toString();
            for (int i = 0; i < stringBuffer2.length(); i++) {
                char charAt = stringBuffer2.charAt(i);
                char[] cArr = this.f6017;
                sb.append((char) (charAt ^ cArr[i % cArr.length]));
            }
            byte[] m3960 = C1844.m3960(sb.toString().getBytes(a));
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(messageDigest.digest(Crypt.a(Crypt.xrc("\u001b7j\u001bfjK0m\u001bc>\u00196gAjjA7f@4jN0mAd;Mk:M3lK3o\u001b1:Kb>\u001e1>@ko\u001dk;MklA0k\u001c`o\u001e")).getBytes(a)), 16), a2.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[1]);
            Cipher cipher = Cipher.getInstance(a2);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(m3960), a);
        } catch (Exception unused) {
            return Crypt.a(Crypt.xrc("I4mObmI`j\u001c7k\u001ddlO3;Je;\u0019dgJeiNjnJ1"));
        }
    }

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public String m2802(File file) {
        String a = Crypt.a(Crypt.xrc("\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"));
        if (!file.exists()) {
            m2790(Crypt.a(Crypt.xrc("\u001a6k\u0019dhNfhNkjMff@b=\u00197l\u00193gH7<\u001adk\u001a1")), -65536);
            return "";
        }
        try {
            String a2 = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            new FileInputStream(file);
            MessageDigest messageDigest = MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa")));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            StringBuilder sb = new StringBuilder();
            String stringBuffer2 = stringBuffer.toString();
            for (int i = 0; i < stringBuffer2.length(); i++) {
                char charAt = stringBuffer2.charAt(i);
                char[] cArr = this.f6017;
                sb.append((char) (charAt ^ cArr[i % cArr.length]));
            }
            byte[] m3960 = C1844.m3960(sb.toString().getBytes(a));
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(messageDigest.digest(Crypt.a(Crypt.xrc("H`9J3:\u001bc;\u001cak\u00197h\u001dkn\u001be:AjmN`kLkj\u0019d")).getBytes(a)), 16), a2.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[1]);
            Cipher cipher = Cipher.getInstance(a2);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(m3960), a);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: ぺでどぜべ, reason: contains not printable characters */
    public boolean m2803() {
        boolean z = false;
        try {
            C0989 m2319 = C0989.m2319();
            C0984 c0984 = new C0984(Crypt.a(Crypt.xrc("\u0019e<\u001dckN3hNdi\u0019`i\u001egg\u001c09Me9Jdo@`h\u001ej")));
            m2319.m2321(c0984);
            synchronized (c0984) {
                do {
                    if (!c0984.f5348) {
                        try {
                            c0984.wait(10000);
                        } catch (InterruptedException unused) {
                        }
                    } else if (c0984.f5349) {
                        throw new C0988();
                    }
                } while (c0984.f5348);
                c0984.f5348 = true;
                String a = Crypt.a(Crypt.xrc("\u001a1i\u001dcnMkfMjgA0;\u001bci\u001e`;\u001e7k\u0019kg\u0019kn\u001c6"));
                try {
                    c0984.f5352.close();
                    c0984.m2316(a);
                } catch (IOException unused2) {
                }
                throw new TimeoutException(Crypt.a(Crypt.xrc("Ob>\u001c4j\u001ba>Nj<\u0019e>\u001aghJc9\u001egkI`:\u001dj9Lk;@b;A`>Ij=L6f\u001c6jOj;\u001dajOeo\u001d`kM1g\u001e")));
            }
            z = c0984.f5347.toString().contains(Crypt.a(Crypt.xrc("\u001c1n\u001b7=\u001c1=N`;\u001b0hHf;\u001b39A0:Kdl\u001b`>Mg")));
            m2319.close();
        } catch (Exception unused3) {
        }
        if (!z) {
            for (String str : f6007) {
                String str2 = f6008;
                StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1")));
                m4207.append(new SimpleDateFormat(Crypt.a(Crypt.xrc("\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0")), Locale.getDefault()).format(new Date()));
                m4207.append(Crypt.a(Crypt.xrc("Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019glLff\u001a`lN0hHbgN0hL`oAbm\u001a3j\u001c39I4m\u001e")));
                m4207.append(str);
                m4207.append(Crypt.a(Crypt.xrc("\u001dej\u001d1o\u0019knA7:\u00196gJ6jA7<Hd9@cmL1n\u001djj\u001bgm\u001de;K6l\u001e`iK1hH`;K4l\u001cbkHajHkiA")));
                C1687.m3697(str2, m4207.toString());
            }
        }
        return z;
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public String m2804(File file) {
        String str = "";
        try {
            String a = Crypt.a(Crypt.xrc("J1o\u001e6=\u001cjoLk9A4i\u001a4kIf=\u001e4:\u001b0;Ac=\u001ajn\u001edn@6gH4;LkoLjl@gg\u001cjk\u001c49Abo\u001ec;\u001d"));
            FileInputStream fileInputStream = new FileInputStream(file);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance(Crypt.a(Crypt.xrc("\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"))).digest(Crypt.a(Crypt.xrc("HbfIcnA7f\u001cb>O`9Adn\u001c3hK7gO0jOb:\u0019`")).getBytes()), 16), a.split(Crypt.a(Crypt.xrc("J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad")))[0]);
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(2, secretKeySpec);
            CipherInputStream cipherInputStream = new CipherInputStream(fileInputStream, cipher);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = cipherInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                str = str + new String(bArr, 0, read);
            }
            cipherInputStream.close();
        } catch (Exception unused) {
        }
        return str;
    }
}
