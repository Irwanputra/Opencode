package p034.p068;

import android.util.SparseIntArray;
import androidx.media.AudioAttributesCompat;
import java.util.Arrays;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.おぐぴう〸ず.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1428 implements InterfaceC1429 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int f6703 = 0;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f6701 = 0;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f6702 = 0;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f6704 = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof C1428)) {
            return false;
        }
        C1428 c1428 = (C1428) obj;
        if (this.f6701 != c1428.f6701) {
            return false;
        }
        int i = this.f6702;
        int i2 = c1428.f6702;
        int i3 = c1428.f6704;
        int i4 = 4;
        if (i3 == -1) {
            int i5 = c1428.f6703;
            SparseIntArray sparseIntArray = AudioAttributesCompat.f1290;
            if ((i2 & 1) != 1) {
                if ((i2 & 4) != 4) {
                    switch (i5) {
                        case 2:
                            i4 = 0;
                            break;
                        case 3:
                            i4 = 8;
                            break;
                        case 4:
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i4 = 5;
                            break;
                        case 6:
                            i4 = 2;
                            break;
                        case 11:
                            i4 = 10;
                            break;
                        case 12:
                        default:
                            i4 = 3;
                            break;
                        case 13:
                            i4 = 1;
                            break;
                    }
                } else {
                    i4 = 6;
                }
            } else {
                i4 = 7;
            }
        } else {
            i4 = i3;
        }
        if (i4 == 6) {
            i2 |= 4;
        } else if (i4 == 7) {
            i2 |= 1;
        }
        return i == (i2 & 273) && this.f6703 == c1428.f6703 && this.f6704 == i3;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6701), Integer.valueOf(this.f6702), Integer.valueOf(this.f6703), Integer.valueOf(this.f6704)});
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f6704 != -1) {
            sb.append(" stream=");
            sb.append(this.f6704);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f6703;
        SparseIntArray sparseIntArray = AudioAttributesCompat.f1290;
        switch (i) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = C2098.m4208("unknown usage ", i);
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f6701);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f6702).toUpperCase());
        return sb.toString();
    }
}
