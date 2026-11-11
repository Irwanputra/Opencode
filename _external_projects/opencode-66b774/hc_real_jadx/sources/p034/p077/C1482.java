package p034.p077;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p034.p080.C1502;
import p131.p155.p156.p157.C2098;

/* renamed from: づざかべべ.ざっざへづ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1482 extends AbstractC1484 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final String f6852;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final int f6853;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int f6854;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final Parcel f6855;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final int f6856;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final SparseIntArray f6857;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f6858;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f6859;

    public C1482(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1502(), new C1502(), new C1502());
    }

    public C1482(Parcel parcel, int i, int i2, String str, C1502<String, Method> c1502, C1502<String, Method> c15022, C1502<String, Class> c15023) {
        super(c1502, c15022, c15023);
        this.f6857 = new SparseIntArray();
        this.f6858 = -1;
        this.f6854 = 0;
        this.f6859 = -1;
        this.f6855 = parcel;
        this.f6856 = i;
        this.f6853 = i2;
        this.f6854 = i;
        this.f6852 = str;
    }

    @Override // p034.p077.AbstractC1484
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public CharSequence mo3215() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f6855);
    }

    @Override // p034.p077.AbstractC1484
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public AbstractC1484 mo3216() {
        Parcel parcel = this.f6855;
        int dataPosition = parcel.dataPosition();
        int i = this.f6854;
        if (i == this.f6856) {
            i = this.f6853;
        }
        return new C1482(parcel, dataPosition, i, C2098.m4198(new StringBuilder(), this.f6852, "  "), this.f6862, this.f6860, this.f6861);
    }

    @Override // p034.p077.AbstractC1484
    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public byte[] mo3217() {
        int readInt = this.f6855.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f6855.readByteArray(bArr);
        return bArr;
    }

    @Override // p034.p077.AbstractC1484
    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public int mo3218() {
        return this.f6855.readInt();
    }

    @Override // p034.p077.AbstractC1484
    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public void mo3219(int i) {
        mo3221();
        this.f6858 = i;
        this.f6857.put(i, this.f6855.dataPosition());
        this.f6855.writeInt(0);
        this.f6855.writeInt(i);
    }

    @Override // p034.p077.AbstractC1484
    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public void mo3220(boolean z) {
        this.f6855.writeInt(z ? 1 : 0);
    }

    @Override // p034.p077.AbstractC1484
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo3221() {
        int i = this.f6858;
        if (i >= 0) {
            int i2 = this.f6857.get(i);
            int dataPosition = this.f6855.dataPosition();
            this.f6855.setDataPosition(i2);
            this.f6855.writeInt(dataPosition - i2);
            this.f6855.setDataPosition(dataPosition);
        }
    }

    @Override // p034.p077.AbstractC1484
    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public void mo3222(int i) {
        this.f6855.writeInt(i);
    }

    @Override // p034.p077.AbstractC1484
    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public void mo3223(Parcelable parcelable) {
        this.f6855.writeParcelable(parcelable, 0);
    }

    @Override // p034.p077.AbstractC1484
    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public void mo3224(byte[] bArr) {
        if (bArr == null) {
            this.f6855.writeInt(-1);
        } else {
            this.f6855.writeInt(bArr.length);
            this.f6855.writeByteArray(bArr);
        }
    }

    @Override // p034.p077.AbstractC1484
    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public <T extends Parcelable> T mo3225() {
        return (T) this.f6855.readParcelable(C1482.class.getClassLoader());
    }

    @Override // p034.p077.AbstractC1484
    /* renamed from: でどあくず, reason: contains not printable characters */
    public void mo3226(String str) {
        this.f6855.writeString(str);
    }

    @Override // p034.p077.AbstractC1484
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean mo3227() {
        return this.f6855.readInt() != 0;
    }

    @Override // p034.p077.AbstractC1484
    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public void mo3228(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f6855, 0);
    }

    @Override // p034.p077.AbstractC1484
    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public String mo3229() {
        return this.f6855.readString();
    }

    @Override // p034.p077.AbstractC1484
    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean mo3230(int i) {
        while (this.f6854 < this.f6853) {
            int i2 = this.f6859;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f6855.setDataPosition(this.f6854);
            int readInt = this.f6855.readInt();
            this.f6859 = this.f6855.readInt();
            this.f6854 += readInt;
        }
        return this.f6859 == i;
    }
}
