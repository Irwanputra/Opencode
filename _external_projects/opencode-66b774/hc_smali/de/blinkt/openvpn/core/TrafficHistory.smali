.class public Lde/blinkt/openvpn/core/TrafficHistory;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lde/blinkt/openvpn/core/TrafficHistory$〺つふすそ;,
        Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lde/blinkt/openvpn/core/TrafficHistory;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public 〺つふすそ:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;",
            ">;"
        }
    .end annotation
.end field

.field public くし〴〺ぅ:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;",
            ">;"
        }
    .end annotation
.end field

.field public づざかべべ:Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

.field public なぎぱいぢぎ:Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

.field public びぐびあび:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lde/blinkt/openvpn/core/TrafficHistory$げつ〴ぬぐ;

    invoke-direct {v0}, Lde/blinkt/openvpn/core/TrafficHistory$げつ〴ぬぐ;-><init>()V

    sput-object v0, Lde/blinkt/openvpn/core/TrafficHistory;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lde/blinkt/openvpn/core/TrafficHistory;->〺つふすそ:Ljava/util/LinkedList;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lde/blinkt/openvpn/core/TrafficHistory;->くし〴〺ぅ:Ljava/util/LinkedList;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lde/blinkt/openvpn/core/TrafficHistory;->びぐびあび:Ljava/util/LinkedList;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lde/blinkt/openvpn/core/TrafficHistory;->〺つふすそ:Ljava/util/LinkedList;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lde/blinkt/openvpn/core/TrafficHistory;->くし〴〺ぅ:Ljava/util/LinkedList;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lde/blinkt/openvpn/core/TrafficHistory;->びぐびあび:Ljava/util/LinkedList;

    iget-object v0, p0, Lde/blinkt/openvpn/core/TrafficHistory;->〺つふすそ:Ljava/util/LinkedList;

    const-class v1, Lde/blinkt/openvpn/core/TrafficHistory;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    iget-object v0, p0, Lde/blinkt/openvpn/core/TrafficHistory;->くし〴〺ぅ:Ljava/util/LinkedList;

    const-class v1, Lde/blinkt/openvpn/core/TrafficHistory;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    iget-object v0, p0, Lde/blinkt/openvpn/core/TrafficHistory;->びぐびあび:Ljava/util/LinkedList;

    const-class v1, Lde/blinkt/openvpn/core/TrafficHistory;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    const-class v0, Lde/blinkt/openvpn/core/TrafficHistory;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

    iput-object v0, p0, Lde/blinkt/openvpn/core/TrafficHistory;->づざかべべ:Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

    const-class v0, Lde/blinkt/openvpn/core/TrafficHistory;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

    iput-object p1, p0, Lde/blinkt/openvpn/core/TrafficHistory;->なぎぱいぢぎ:Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 4

    iget-object p2, p0, Lde/blinkt/openvpn/core/TrafficHistory;->〺つふすそ:Ljava/util/LinkedList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    iget-object p2, p0, Lde/blinkt/openvpn/core/TrafficHistory;->くし〴〺ぅ:Ljava/util/LinkedList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    iget-object p2, p0, Lde/blinkt/openvpn/core/TrafficHistory;->びぐびあび:Ljava/util/LinkedList;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    iget-object p2, p0, Lde/blinkt/openvpn/core/TrafficHistory;->づざかべべ:Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lde/blinkt/openvpn/core/TrafficHistory;->なぎぱいぢぎ:Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method

.method public final 〳ぜぞぜべっ(Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;Z)V
    .registers 13

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    new-instance v1, Ljava/util/Vector;

    invoke-direct {v1}, Ljava/util/Vector;-><init>()V

    if-eqz p2, :cond_16

    const-wide/32 v1, 0xea60

    iget-object v3, p0, Lde/blinkt/openvpn/core/TrafficHistory;->〺つふすそ:Ljava/util/LinkedList;

    iget-object v4, p0, Lde/blinkt/openvpn/core/TrafficHistory;->くし〴〺ぅ:Ljava/util/LinkedList;

    iget-object v5, p0, Lde/blinkt/openvpn/core/TrafficHistory;->づざかべべ:Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

    goto :goto_1f

    :cond_16
    const-wide/32 v1, 0x36ee80

    iget-object v3, p0, Lde/blinkt/openvpn/core/TrafficHistory;->くし〴〺ぅ:Ljava/util/LinkedList;

    iget-object v4, p0, Lde/blinkt/openvpn/core/TrafficHistory;->びぐびあび:Ljava/util/LinkedList;

    iget-object v5, p0, Lde/blinkt/openvpn/core/TrafficHistory;->なぎぱいぢぎ:Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

    :goto_1f
    iget-wide v6, p1, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;->〺つふすそ:J

    div-long/2addr v6, v1

    iget-wide v8, v5, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;->〺つふすそ:J

    div-long/2addr v8, v1

    cmp-long v5, v6, v8

    if-lez v5, :cond_5a

    invoke-virtual {v4, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    if-eqz p2, :cond_35

    iput-object p1, p0, Lde/blinkt/openvpn/core/TrafficHistory;->づざかべべ:Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lde/blinkt/openvpn/core/TrafficHistory;->〳ぜぞぜべっ(Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;Z)V

    goto :goto_37

    :cond_35
    iput-object p1, p0, Lde/blinkt/openvpn/core/TrafficHistory;->なぎぱいぢぎ:Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

    :goto_37
    invoke-virtual {v3}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3b
    :goto_3b
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_57

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

    iget-wide v5, p1, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;->〺つふすそ:J

    iget-wide v7, v4, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;->〺つふすそ:J

    sub-long/2addr v5, v7

    div-long/2addr v5, v1

    const-wide/16 v7, 0x5

    cmp-long v9, v5, v7

    if-ltz v9, :cond_3b

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3b

    :cond_57
    invoke-virtual {v3, v0}, Ljava/util/LinkedList;->removeAll(Ljava/util/Collection;)Z

    :cond_5a
    return-void
.end method

.method public ぁごぐすすぃ(Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;)Lde/blinkt/openvpn/core/TrafficHistory$〺つふすそ;
    .registers 11

    iget-object v0, p0, Lde/blinkt/openvpn/core/TrafficHistory;->〺つふすそ:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-nez v0, :cond_18

    new-instance v0, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    const/4 v8, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;-><init>(JJJLde/blinkt/openvpn/core/TrafficHistory$げつ〴ぬぐ;)V

    goto :goto_20

    :cond_18
    iget-object v0, p0, Lde/blinkt/openvpn/core/TrafficHistory;->〺つふすそ:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

    :goto_20
    if-nez p1, :cond_42

    iget-object p1, p0, Lde/blinkt/openvpn/core/TrafficHistory;->〺つふすそ:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->size()I

    move-result p1

    const/4 v1, 0x2

    if-ge p1, v1, :cond_2d

    move-object p1, v0

    goto :goto_42

    :cond_2d
    iget-object p1, p0, Lde/blinkt/openvpn/core/TrafficHistory;->〺つふすそ:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->descendingIterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    iget-object p1, p0, Lde/blinkt/openvpn/core/TrafficHistory;->〺つふすそ:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->descendingIterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

    :cond_42
    :goto_42
    new-instance v1, Lde/blinkt/openvpn/core/TrafficHistory$〺つふすそ;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p1, v2}, Lde/blinkt/openvpn/core/TrafficHistory$〺つふすそ;-><init>(Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;Lde/blinkt/openvpn/core/TrafficHistory$げつ〴ぬぐ;)V

    return-object v1
.end method

.method public なぎぱいぢぎ(JJ)Lde/blinkt/openvpn/core/TrafficHistory$〺つふすそ;
    .registers 31

    move-object/from16 v0, p0

    new-instance v9, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    const/4 v8, 0x0

    move-object v1, v9

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    invoke-direct/range {v1 .. v8}, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;-><init>(JJJLde/blinkt/openvpn/core/TrafficHistory$げつ〴ぬぐ;)V

    invoke-virtual {v0, v9}, Lde/blinkt/openvpn/core/TrafficHistory;->ぁごぐすすぃ(Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;)Lde/blinkt/openvpn/core/TrafficHistory$〺つふすそ;

    move-result-object v1

    .line 1
    iget-object v2, v0, Lde/blinkt/openvpn/core/TrafficHistory;->〺つふすそ:Ljava/util/LinkedList;

    invoke-virtual {v2, v9}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    iget-object v2, v0, Lde/blinkt/openvpn/core/TrafficHistory;->づざかべべ:Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

    if-nez v2, :cond_3f

    new-instance v2, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    move-object v10, v2

    invoke-direct/range {v10 .. v17}, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;-><init>(JJJLde/blinkt/openvpn/core/TrafficHistory$げつ〴ぬぐ;)V

    iput-object v2, v0, Lde/blinkt/openvpn/core/TrafficHistory;->づざかべべ:Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

    new-instance v2, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v18, v2

    invoke-direct/range {v18 .. v25}, Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;-><init>(JJJLde/blinkt/openvpn/core/TrafficHistory$げつ〴ぬぐ;)V

    iput-object v2, v0, Lde/blinkt/openvpn/core/TrafficHistory;->なぎぱいぢぎ:Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;

    :cond_3f
    const/4 v2, 0x1

    invoke-virtual {v0, v9, v2}, Lde/blinkt/openvpn/core/TrafficHistory;->〳ぜぞぜべっ(Lde/blinkt/openvpn/core/TrafficHistory$TrafficDatapoint;Z)V

    return-object v1
.end method
