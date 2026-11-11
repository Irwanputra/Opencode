.class public Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lde/blinkt/openvpn/core/TrafficHistory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TrafficDatapoint"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final 〺つふすそ:J

.field public final くし〴〺ぅ:J

.field public final びぐびあび:J


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint$げつ〴ぬぐ;

    invoke-direct {v0}, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint$げつ〴ぬぐ;-><init>()V

    sput-object v0, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(JJJLde/blinkt/openvpn/core/TrafficHistory$げつ〴ぬぐ;)V
    .registers 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;->くし〴〺ぅ:J

    iput-wide p3, p0, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;->びぐびあび:J

    iput-wide p5, p0, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;->〺つふすそ:J

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;Lde/blinkt/openvpn/core/TrafficHistory$げつ〴ぬぐ;)V
    .registers 5

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;->〺つふすそ:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;->くし〴〺ぅ:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide p1

    iput-wide p1, p0, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;->びぐびあび:J

    return-void
.end method


# virtual methods
.method public describeContents()I
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 5

    iget-wide v0, p0, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;->〺つふすそ:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;->くし〴〺ぅ:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;->びぐびあび:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method
