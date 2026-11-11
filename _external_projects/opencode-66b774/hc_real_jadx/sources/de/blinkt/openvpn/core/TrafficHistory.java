package de.blinkt.openvpn.core;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

/* loaded from: /tmp/opencode/hc_real.dex */
public class TrafficHistory implements Parcelable {
    public static final Parcelable.Creator<TrafficHistory> CREATOR = new C0504();

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public TrafficDatapoint f3740;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public TrafficDatapoint f3741;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public LinkedList<TrafficDatapoint> f3738 = new LinkedList<>();

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public LinkedList<TrafficDatapoint> f3739 = new LinkedList<>();

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public LinkedList<TrafficDatapoint> f3742 = new LinkedList<>();

    public static class TrafficDatapoint implements Parcelable {
        public static final Parcelable.Creator<TrafficDatapoint> CREATOR = new C0502();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final long f3743;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final long f3744;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final long f3745;

        /* renamed from: de.blinkt.openvpn.core.TrafficHistory$TrafficDatapoint$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0502 implements Parcelable.Creator<TrafficDatapoint> {
            @Override // android.os.Parcelable.Creator
            public TrafficDatapoint createFromParcel(Parcel parcel) {
                return new TrafficDatapoint(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public TrafficDatapoint[] newArray(int i) {
                return new TrafficDatapoint[i];
            }
        }

        public TrafficDatapoint(long j, long j2, long j3, C0504 c0504) {
            this.f3744 = j;
            this.f3745 = j2;
            this.f3743 = j3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f3743);
            parcel.writeLong(this.f3744);
            parcel.writeLong(this.f3745);
        }

        public TrafficDatapoint(Parcel parcel, C0504 c0504) {
            this.f3743 = parcel.readLong();
            this.f3744 = parcel.readLong();
            this.f3745 = parcel.readLong();
        }
    }

    /* renamed from: de.blinkt.openvpn.core.TrafficHistory$〺つふすそ, reason: contains not printable characters */
    public static class C0503 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final TrafficDatapoint f3746;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final TrafficDatapoint f3747;

        public C0503(TrafficDatapoint trafficDatapoint, TrafficDatapoint trafficDatapoint2, C0504 c0504) {
            this.f3746 = trafficDatapoint;
            this.f3747 = trafficDatapoint2;
        }
    }

    /* renamed from: de.blinkt.openvpn.core.TrafficHistory$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C0504 implements Parcelable.Creator<TrafficHistory> {
        @Override // android.os.Parcelable.Creator
        public TrafficHistory createFromParcel(Parcel parcel) {
            return new TrafficHistory(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public TrafficHistory[] newArray(int i) {
            return new TrafficHistory[i];
        }
    }

    public TrafficHistory() {
    }

    public TrafficHistory(Parcel parcel) {
        parcel.readList(this.f3738, TrafficHistory.class.getClassLoader());
        parcel.readList(this.f3739, TrafficHistory.class.getClassLoader());
        parcel.readList(this.f3742, TrafficHistory.class.getClassLoader());
        this.f3740 = (TrafficDatapoint) parcel.readParcelable(TrafficHistory.class.getClassLoader());
        this.f3741 = (TrafficDatapoint) parcel.readParcelable(TrafficHistory.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f3738);
        parcel.writeList(this.f3739);
        parcel.writeList(this.f3742);
        parcel.writeParcelable(this.f3740, 0);
        parcel.writeParcelable(this.f3741, 0);
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final void m1600(TrafficDatapoint trafficDatapoint, boolean z) {
        long j;
        LinkedList<TrafficDatapoint> linkedList;
        LinkedList<TrafficDatapoint> linkedList2;
        TrafficDatapoint trafficDatapoint2;
        HashSet hashSet = new HashSet();
        new Vector();
        if (z) {
            j = 60000;
            linkedList = this.f3738;
            linkedList2 = this.f3739;
            trafficDatapoint2 = this.f3740;
        } else {
            j = 3600000;
            linkedList = this.f3739;
            linkedList2 = this.f3742;
            trafficDatapoint2 = this.f3741;
        }
        if (trafficDatapoint.f3743 / j > trafficDatapoint2.f3743 / j) {
            linkedList2.add(trafficDatapoint);
            if (z) {
                this.f3740 = trafficDatapoint;
                m1600(trafficDatapoint, false);
            } else {
                this.f3741 = trafficDatapoint;
            }
            Iterator<TrafficDatapoint> it = linkedList.iterator();
            while (it.hasNext()) {
                TrafficDatapoint next = it.next();
                if ((trafficDatapoint.f3743 - next.f3743) / j >= 5) {
                    hashSet.add(next);
                }
            }
            linkedList.removeAll(hashSet);
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public C0503 m1601(TrafficDatapoint trafficDatapoint) {
        TrafficDatapoint trafficDatapoint2 = this.f3738.size() == 0 ? new TrafficDatapoint(0L, 0L, System.currentTimeMillis(), null) : this.f3738.getLast();
        if (trafficDatapoint == null) {
            if (this.f3738.size() < 2) {
                trafficDatapoint = trafficDatapoint2;
            } else {
                this.f3738.descendingIterator().next();
                trafficDatapoint = this.f3738.descendingIterator().next();
            }
        }
        return new C0503(trafficDatapoint2, trafficDatapoint, null);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public C0503 m1602(long j, long j2) {
        TrafficDatapoint trafficDatapoint = new TrafficDatapoint(j, j2, System.currentTimeMillis(), null);
        C0503 m1601 = m1601(trafficDatapoint);
        this.f3738.add(trafficDatapoint);
        if (this.f3740 == null) {
            this.f3740 = new TrafficDatapoint(0L, 0L, 0L, null);
            this.f3741 = new TrafficDatapoint(0L, 0L, 0L, null);
        }
        m1600(trafficDatapoint, true);
        return m1601;
    }
}
