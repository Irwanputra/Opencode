.class public Lteam/dev/epro/apkcustom/models/VPNServer;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lteam/dev/epro/apkcustom/models/VPNServer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private configData:Ljava/lang/String;

.field private countryLong:Ljava/lang/String;

.field private countryShort:Ljava/lang/String;

.field private hostName:Ljava/lang/String;

.field private ip:Ljava/lang/String;

.field private logType:Ljava/lang/String;

.field private message:Ljava/lang/String;

.field private numVpnSessions:Ljava/lang/String;

.field private operator:Ljava/lang/String;

.field private ping:Ljava/lang/String;

.field private proto:Ljava/lang/String;

.field private score:Ljava/lang/String;

.field private speed:Ljava/lang/String;

.field private totalTraffic:Ljava/lang/String;

.field private totalUsers:Ljava/lang/String;

.field private uptime:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lteam/dev/epro/apkcustom/models/VPNServer$げつ〴ぬぐ;

    invoke-direct {v0}, Lteam/dev/epro/apkcustom/models/VPNServer$げつ〴ぬぐ;-><init>()V

    sput-object v0, Lteam/dev/epro/apkcustom/models/VPNServer;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->hostName:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->ip:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->score:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->ping:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->speed:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->countryLong:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->countryShort:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->numVpnSessions:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->uptime:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->totalUsers:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->totalTraffic:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->logType:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->operator:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->message:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->configData:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->proto:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 19

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lteam/dev/epro/apkcustom/models/VPNServer;->hostName:Ljava/lang/String;

    move-object v1, p2

    iput-object v1, v0, Lteam/dev/epro/apkcustom/models/VPNServer;->ip:Ljava/lang/String;

    move-object v1, p3

    iput-object v1, v0, Lteam/dev/epro/apkcustom/models/VPNServer;->score:Ljava/lang/String;

    move-object v1, p4

    iput-object v1, v0, Lteam/dev/epro/apkcustom/models/VPNServer;->ping:Ljava/lang/String;

    move-object v1, p5

    iput-object v1, v0, Lteam/dev/epro/apkcustom/models/VPNServer;->speed:Ljava/lang/String;

    move-object v1, p6

    iput-object v1, v0, Lteam/dev/epro/apkcustom/models/VPNServer;->countryLong:Ljava/lang/String;

    move-object v1, p7

    iput-object v1, v0, Lteam/dev/epro/apkcustom/models/VPNServer;->countryShort:Ljava/lang/String;

    move-object v1, p8

    iput-object v1, v0, Lteam/dev/epro/apkcustom/models/VPNServer;->numVpnSessions:Ljava/lang/String;

    move-object v1, p9

    iput-object v1, v0, Lteam/dev/epro/apkcustom/models/VPNServer;->uptime:Ljava/lang/String;

    move-object v1, p10

    iput-object v1, v0, Lteam/dev/epro/apkcustom/models/VPNServer;->totalUsers:Ljava/lang/String;

    move-object v1, p11

    iput-object v1, v0, Lteam/dev/epro/apkcustom/models/VPNServer;->totalTraffic:Ljava/lang/String;

    move-object v1, p12

    iput-object v1, v0, Lteam/dev/epro/apkcustom/models/VPNServer;->logType:Ljava/lang/String;

    move-object v1, p13

    iput-object v1, v0, Lteam/dev/epro/apkcustom/models/VPNServer;->operator:Ljava/lang/String;

    move-object/from16 v1, p14

    iput-object v1, v0, Lteam/dev/epro/apkcustom/models/VPNServer;->message:Ljava/lang/String;

    move-object/from16 v1, p15

    iput-object v1, v0, Lteam/dev/epro/apkcustom/models/VPNServer;->configData:Ljava/lang/String;

    move-object/from16 v1, p16

    iput-object v1, v0, Lteam/dev/epro/apkcustom/models/VPNServer;->proto:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    iget-object p2, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->hostName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->ip:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->score:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->ping:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->speed:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->countryLong:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->countryShort:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->numVpnSessions:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->uptime:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->totalUsers:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->totalTraffic:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->logType:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->operator:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->message:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->configData:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->proto:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

.method public 〳ぜぞぜべっ()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->countryShort:Ljava/lang/String;

    return-object v0
.end method

.method public ぁごぐすすぃ()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->countryLong:Ljava/lang/String;

    return-object v0
.end method

.method public いいにぽつ()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->proto:Ljava/lang/String;

    return-object v0
.end method

.method public なぎぱいぢぎ()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->configData:Ljava/lang/String;

    return-object v0
.end method

.method public ぺぁあねじ()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->ip:Ljava/lang/String;

    return-object v0
.end method

.method public ぺふねづ〺()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Lteam/dev/epro/apkcustom/models/VPNServer;->speed:Ljava/lang/String;

    return-object v0
.end method
