.class public Lde/blinkt/openvpn/core/LogItem;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lde/blinkt/openvpn/core/LogItem;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public 〺つふすそ:[Ljava/lang/Object;

.field public ぁごぐすすぃ:I

.field public くし〴〺ぅ:Ljava/lang/String;

.field public づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

.field public なぎぱいぢぎ:J

.field public びぐびあび:I


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lde/blinkt/openvpn/core/LogItem$げつ〴ぬぐ;

    invoke-direct {v0}, Lde/blinkt/openvpn/core/LogItem$げつ〴ぬぐ;-><init>()V

    sput-object v0, Lde/blinkt/openvpn/core/LogItem;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->くし〴〺ぅ:Ljava/lang/String;

    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lde/blinkt/openvpn/core/LogItem;->なぎぱいぢぎ:J

    const/4 v0, -0x1

    iput v0, p0, Lde/blinkt/openvpn/core/LogItem;->ぁごぐすすぃ:I

    const-class v0, Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArray(Ljava/lang/ClassLoader;)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->くし〴〺ぅ:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lde/blinkt/openvpn/core/LogItem;->びぐびあび:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;->げつ〴ぬぐ(I)Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    move-result-object v0

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lde/blinkt/openvpn/core/LogItem;->ぁごぐすすぃ:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lde/blinkt/openvpn/core/LogItem;->なぎぱいぢぎ:J

    return-void
.end method

.method public constructor <init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;I)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->くし〴〺ぅ:Ljava/lang/String;

    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lde/blinkt/openvpn/core/LogItem;->なぎぱいぢぎ:J

    const/4 v0, -0x1

    iput v0, p0, Lde/blinkt/openvpn/core/LogItem;->ぁごぐすすぃ:I

    iput p2, p0, Lde/blinkt/openvpn/core/LogItem;->びぐびあび:I

    iput-object p1, p0, Lde/blinkt/openvpn/core/LogItem;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    return-void
.end method

.method public constructor <init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;ILjava/lang/String;)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->くし〴〺ぅ:Ljava/lang/String;

    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lde/blinkt/openvpn/core/LogItem;->なぎぱいぢぎ:J

    const/4 v0, -0x1

    iput v0, p0, Lde/blinkt/openvpn/core/LogItem;->ぁごぐすすぃ:I

    iput-object p3, p0, Lde/blinkt/openvpn/core/LogItem;->くし〴〺ぅ:Ljava/lang/String;

    iput-object p1, p0, Lde/blinkt/openvpn/core/LogItem;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    iput p2, p0, Lde/blinkt/openvpn/core/LogItem;->ぁごぐすすぃ:I

    return-void
.end method

.method public varargs constructor <init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;I[Ljava/lang/Object;)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->くし〴〺ぅ:Ljava/lang/String;

    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lde/blinkt/openvpn/core/LogItem;->なぎぱいぢぎ:J

    const/4 v0, -0x1

    iput v0, p0, Lde/blinkt/openvpn/core/LogItem;->ぁごぐすすぃ:I

    iput p2, p0, Lde/blinkt/openvpn/core/LogItem;->びぐびあび:I

    iput-object p3, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    iput-object p1, p0, Lde/blinkt/openvpn/core/LogItem;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    return-void
.end method

.method public constructor <init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;Ljava/lang/String;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->くし〴〺ぅ:Ljava/lang/String;

    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lde/blinkt/openvpn/core/LogItem;->なぎぱいぢぎ:J

    const/4 v0, -0x1

    iput v0, p0, Lde/blinkt/openvpn/core/LogItem;->ぁごぐすすぃ:I

    iput-object p1, p0, Lde/blinkt/openvpn/core/LogItem;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    iput-object p2, p0, Lde/blinkt/openvpn/core/LogItem;->くし〴〺ぅ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>([BI)V
    .registers 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->くし〴〺ぅ:Ljava/lang/String;

    sget-object v1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;->くし〴〺ぅ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    iput-object v1, p0, Lde/blinkt/openvpn/core/LogItem;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lde/blinkt/openvpn/core/LogItem;->なぎぱいぢぎ:J

    const/4 v1, -0x1

    iput v1, p0, Lde/blinkt/openvpn/core/LogItem;->ぁごぐすすぃ:I

    const/4 v1, 0x0

    invoke-static {p1, v1, p2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide v2

    iput-wide v2, p0, Lde/blinkt/openvpn/core/LogItem;->なぎぱいぢぎ:J

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p2

    iput p2, p0, Lde/blinkt/openvpn/core/LogItem;->ぁごぐすすぃ:I

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p2

    invoke-static {p2}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;->げつ〴ぬぐ(I)Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    move-result-object p2

    iput-object p2, p0, Lde/blinkt/openvpn/core/LogItem;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p2

    iput p2, p0, Lde/blinkt/openvpn/core/LogItem;->びぐびあび:I

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p2

    const-string v2, "\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez p2, :cond_4c

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->くし〴〺ぅ:Ljava/lang/String;

    goto :goto_5e

    :cond_4c
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v3

    if-gt p2, v3, :cond_136

    new-array p2, p2, [B

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, p2, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    iput-object v3, p0, Lde/blinkt/openvpn/core/LogItem;->くし〴〺ぅ:Ljava/lang/String;

    :goto_5e
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p2

    const/16 v3, 0x1e

    if-gt p2, v3, :cond_126

    if-nez p2, :cond_6c

    iput-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    goto/16 :goto_fc

    :cond_6c
    new-array v3, p2, [Ljava/lang/Object;

    iput-object v3, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    :goto_70
    if-ge v1, p2, :cond_fc

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getChar()C

    move-result v3

    const/16 v4, 0x30

    if-eq v3, v4, :cond_f4

    const/16 v4, 0x64

    if-eq v3, v4, :cond_e7

    const/16 v4, 0x66

    if-eq v3, v4, :cond_da

    const/16 v4, 0x69

    if-eq v3, v4, :cond_cd

    const/16 v4, 0x6c

    if-eq v3, v4, :cond_c0

    const/16 v4, 0x73

    if-ne v3, v4, :cond_a1

    iget-object v3, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    .line 1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v4

    new-array v4, v4, [B

    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, v4, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 2
    aput-object v5, v3, v1

    goto :goto_f8

    :cond_a1
    new-instance p1, Ljava/io/UnsupportedEncodingException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "L0j\u001ag:Jf<\u001bcgKal@1l\u001c0lLjjA1o\u001dfo\u001adh\u001efl\u001e49\u001cjh\u001b4>\u001edi\u001c3fJjk\u001a3<Lc;\u001ckh\u0019"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/UnsupportedEncodingException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c0
    iget-object v3, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v1

    goto :goto_f8

    :cond_cd
    iget-object v3, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    goto :goto_f8

    :cond_da
    iget-object v3, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getFloat()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v3, v1

    goto :goto_f8

    :cond_e7
    iget-object v3, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getDouble()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    aput-object v4, v3, v1

    goto :goto_f8

    :cond_f4
    iget-object v3, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    aput-object v0, v3, v1

    :goto_f8
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_70

    :cond_fc
    :goto_fc
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result p2

    if-nez p2, :cond_103

    return-void

    :cond_103
    new-instance p2, Ljava/io/UnsupportedEncodingException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "\u001db<Og>\u001b4:\u001djf@3fK6;\u00196>Kfl@7kNgoN3>I0>N1hK3;\u001bgo@e9Ac;MbhJ4m\u001cbfH0iMjfN`=OcgN4oNghH`:\u001bb<H4hLfh\u001da9M7;"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/UnsupportedEncodingException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_126
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "N0mIa9A7;\u001c1hH1<N7jHc>NknHbh\u001acoJco\u001dkmOao\u001d49Ijf\u001ckfNggKchKgh\u001b1:J4fLe9A6=\u001ce;A4=Mkf\u001ech\u00196iOghHgo@ggIgn"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_136
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "IfhKefI7iOaf\u001b09I1g\u001c4gLgnIco\u001dehI0"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "\u0019jhM1;I6kHd9H3:\u001a`n@klNenLc9J4hLg<@cnNej\u001939H7:L1i\u001delOkh\u001cfmH1;\u001dg9\u001a4kNgjJ4>@ff\u001a6jKcmHb>J7jN4>JdnLa="

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    goto :goto_16a

    :goto_169
    throw v0

    :goto_16a
    goto :goto_169
.end method


# virtual methods
.method public describeContents()I
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    instance-of v0, p1, Lde/blinkt/openvpn/core/LogItem;

    if-nez v0, :cond_9

    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_9
    check-cast p1, Lde/blinkt/openvpn/core/LogItem;

    iget-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    iget-object v1, p1, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4b

    iget-object v0, p1, Lde/blinkt/openvpn/core/LogItem;->くし〴〺ぅ:Ljava/lang/String;

    if-nez v0, :cond_1d

    iget-object v1, p0, Lde/blinkt/openvpn/core/LogItem;->くし〴〺ぅ:Ljava/lang/String;

    if-eq v1, v0, :cond_25

    :cond_1d
    iget-object v1, p0, Lde/blinkt/openvpn/core/LogItem;->くし〴〺ぅ:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4b

    :cond_25
    iget v0, p0, Lde/blinkt/openvpn/core/LogItem;->びぐびあび:I

    iget v1, p1, Lde/blinkt/openvpn/core/LogItem;->びぐびあび:I

    if-ne v0, v1, :cond_4b

    iget-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    if-nez v0, :cond_33

    iget-object v1, p1, Lde/blinkt/openvpn/core/LogItem;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    if-eq v1, v0, :cond_3b

    :cond_33
    iget-object v1, p1, Lde/blinkt/openvpn/core/LogItem;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    invoke-virtual {v1, v0}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4b

    :cond_3b
    iget v0, p0, Lde/blinkt/openvpn/core/LogItem;->ぁごぐすすぃ:I

    iget v1, p1, Lde/blinkt/openvpn/core/LogItem;->ぁごぐすすぃ:I

    if-ne v0, v1, :cond_4b

    iget-wide v0, p0, Lde/blinkt/openvpn/core/LogItem;->なぎぱいぢぎ:J

    iget-wide v2, p1, Lde/blinkt/openvpn/core/LogItem;->なぎぱいぢぎ:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_4b

    const/4 p1, 0x1

    goto :goto_4c

    :cond_4b
    const/4 p1, 0x0

    :goto_4c
    return p1
.end method

.method public toString()Ljava/lang/String;
    .registers 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lde/blinkt/openvpn/core/LogItem;->〳ぜぞぜべっ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 5

    iget-object p2, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeArray([Ljava/lang/Object;)V

    iget-object p2, p0, Lde/blinkt/openvpn/core/LogItem;->くし〴〺ぅ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lde/blinkt/openvpn/core/LogItem;->びぐびあび:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lde/blinkt/openvpn/core/LogItem;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    .line 1
    iget p2, p2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;->〺つふすそ:I

    .line 2
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lde/blinkt/openvpn/core/LogItem;->ぁごぐすすぃ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lde/blinkt/openvpn/core/LogItem;->なぎぱいぢぎ:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method

.method public 〳ぜぞぜべっ(Landroid/content/Context;)Ljava/lang/String;
    .registers 12

    const/4 v0, 0x0

    :try_start_1
    iget-object v1, p0, Lde/blinkt/openvpn/core/LogItem;->くし〴〺ぅ:Ljava/lang/String;

    if-eqz v1, :cond_6

    return-object v1

    :cond_6
    if-eqz p1, :cond_22

    iget v1, p0, Lde/blinkt/openvpn/core/LogItem;->びぐびあび:I

    const v2, 0x7f1101b6

    if-ne v1, v2, :cond_14

    invoke-virtual {p0, p1}, Lde/blinkt/openvpn/core/LogItem;->ぁごぐすすぃ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_14
    iget-object v2, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    if-nez v2, :cond_1d

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1d
    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_22
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v2, "H4o\u0019kfNanJ1g\u001adh\u001e3>Kf=Lc9\u001bgf@3gH0gIf;\u001c6gH1oA4fO4i@a>M6:\u0019e:Mki\u001e1lA"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    iget v5, p0, Lde/blinkt/openvpn/core/LogItem;->びぐびあび:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {v1, v2, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    if-eqz v2, :cond_79

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\u001dan@cn\u001cjkN3:\u001c`9Afm\u001c6:Ib:\u00194iJ69Hg"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    .line 1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    array-length v7, v4

    const/4 v8, 0x0

    :goto_5d
    if-ge v8, v7, :cond_6e

    aget-object v9, v4, v8

    if-eqz v3, :cond_65

    const/4 v3, 0x0

    goto :goto_68

    :cond_65
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    :goto_68
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, 0x1

    goto :goto_5d

    :cond_6e
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_79
    .catch Ljava/util/UnknownFormatConversionException; {:try_start_1 .. :try_end_79} :catch_9f
    .catch Ljava/util/FormatFlagsConversionMismatchException; {:try_start_1 .. :try_end_79} :catch_7a

    :cond_79
    return-object v1

    :catch_7a
    move-exception v1

    if-eqz p1, :cond_9e

    new-instance p1, Ljava/util/FormatFlagsConversionMismatchException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/util/FormatFlagsConversionMismatchException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Lde/blinkt/openvpn/core/LogItem;->〳ぜぞぜべっ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljava/util/FormatFlagsConversionMismatchException;->getConversion()C

    move-result v1

    invoke-direct {p1, v0, v1}, Ljava/util/FormatFlagsConversionMismatchException;-><init>(Ljava/lang/String;C)V

    throw p1

    :cond_9e
    throw v1

    :catch_9f
    move-exception v1

    if-eqz p1, :cond_bf

    new-instance p1, Ljava/util/UnknownFormatConversionException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/util/UnknownFormatConversionException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Lde/blinkt/openvpn/core/LogItem;->〳ぜぞぜべっ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/UnknownFormatConversionException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_bf
    goto :goto_c1

    :goto_c0
    throw v1

    :goto_c1
    goto :goto_c0
.end method

.method public final ぁごぐすすぃ(Landroid/content/Context;)Ljava/lang/String;
    .registers 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StringFormatMatches"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    const/4 v0, 0x1

    :try_start_4
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x40

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    const-string v3, "\u001df;\u001cji\u001d`i\u001e7:J`kMjn\u0019a;\u001e1n@6;K7;@7"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v3

    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-virtual {v1}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v1

    invoke-direct {v4, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v3, v4}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v1

    check-cast v1, Ljava/security/cert/X509Certificate;

    const-string v3, "\u001d`>Me;O49Mj<L`jO0<Mfk@fh\u001ag<I0lHa"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v3

    invoke-virtual {v1}, Ljava/security/cert/X509Certificate;->getEncoded()[B

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v3

    sget-object v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->てぜきぽく:[B

    invoke-static {v3, v4}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v4

    if-eqz v4, :cond_5d

    const v1, 0x7f110212

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_a6

    :cond_5d
    sget-object v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->のぷのちつ:[B

    invoke-static {v3, v4}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v4

    if-eqz v4, :cond_6d

    const v1, 0x7f1100d8

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_a6

    :cond_6d
    sget-object v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->へぬ〴づぞ:[B

    invoke-static {v3, v4}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v4

    if-eqz v4, :cond_80

    const-string v1, "\u0019a9Ij=Me:L0k\u001d1m@4;Lc=\u001ef=O7j\u001d3f\u00193"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_a6

    :cond_80
    sget-object v4, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->おぐぴう〸ず:[B

    invoke-static {v3, v4}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v3

    if-eqz v3, :cond_93

    const-string v1, "Je>\u001cdm\u001eg<J`f\u001bdm\u001dc>IjoL7o\u001e`9\u001cd9L19Ok<Aa9\u001bjoI0nJj:K`>\u001ajk\u001a69L1=H`iA4lM6lL6oMgi\u0019e>\u001bf>N4=\u001aa9Mf9Oa;\u001c`="

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_a6

    :cond_93
    const v3, 0x7f11007c

    new-array v4, v0, [Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/security/auth/x500/X500Principal;->getName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v2

    invoke-virtual {p1, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1
    :try_end_a6
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_4 .. :try_end_a6} :catch_b5
    .catch Ljava/security/cert/CertificateException; {:try_start_4 .. :try_end_a6} :catch_b5
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_4 .. :try_end_a6} :catch_b5

    :goto_a6
    :try_start_a6
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    iget-object v2, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_b4
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_a6 .. :try_end_b4} :catch_bf
    .catch Ljava/security/cert/CertificateException; {:try_start_a6 .. :try_end_b4} :catch_bf
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_a6 .. :try_end_b4} :catch_bf

    goto :goto_c9

    :catch_b5
    const-string v1, "M1o\u001a3>O7jM1f\u001ee=\u001a7l\u001ab>O3mN1gIgo\u001c4:JgmL`;\u001ba;J6f\u00196mJd:\u001bgoIj<Ag=Kd9I"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :catch_bf
    const-string v2, "\u001ejk\u001e1hI1mN0mM3lAejI1<\u001b6f\u001ed:M69Haf\u0019glM0k@cnLaiH3o\u001e0<\u001c4>N7fIfi\u001eg=I"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_c9
    iget-object v3, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    array-length v4, v3

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    array-length v4, v3

    sub-int/2addr v4, v0

    aput-object v1, v3, v4

    array-length v0, v3

    add-int/lit8 v0, v0, -0x2

    aput-object v2, v3, v0

    const v0, 0x7f1101b6

    invoke-virtual {p1, v0, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public なぎぱいぢぎ()[B
    .registers 10

    const/16 v0, 0x4000

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    iget-wide v2, p0, Lde/blinkt/openvpn/core/LogItem;->なぎぱいぢぎ:J

    invoke-virtual {v0, v2, v3}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    iget v2, p0, Lde/blinkt/openvpn/core/LogItem;->ぁごぐすすぃ:I

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    iget-object v2, p0, Lde/blinkt/openvpn/core/LogItem;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    .line 1
    iget v2, v2, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;->〺つふすそ:I

    .line 2
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    iget v2, p0, Lde/blinkt/openvpn/core/LogItem;->びぐびあび:I

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    iget-object v2, p0, Lde/blinkt/openvpn/core/LogItem;->くし〴〺ぅ:Ljava/lang/String;

    const-string v3, "\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v2, :cond_43

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_35

    goto :goto_43

    :cond_35
    iget-object v2, p0, Lde/blinkt/openvpn/core/LogItem;->くし〴〺ぅ:Ljava/lang/String;

    .line 3
    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    array-length v4, v2

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    goto :goto_46

    .line 4
    :cond_43
    :goto_43
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    :goto_46
    iget-object v2, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    if-eqz v2, :cond_f8

    array-length v4, v2

    if-nez v4, :cond_4f

    goto/16 :goto_f8

    :cond_4f
    array-length v2, v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    iget-object v2, p0, Lde/blinkt/openvpn/core/LogItem;->〺つふすそ:[Ljava/lang/Object;

    array-length v4, v2

    :goto_56
    if-ge v1, v4, :cond_fb

    aget-object v5, v2, v1

    instance-of v6, v5, Ljava/lang/String;

    const/16 v7, 0x73

    if-eqz v6, :cond_72

    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->putChar(C)Ljava/nio/ByteBuffer;

    check-cast v5, Ljava/lang/String;

    .line 5
    invoke-virtual {v5, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v5

    array-length v6, v5

    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    goto/16 :goto_f4

    .line 6
    :cond_72
    instance-of v6, v5, Ljava/lang/Integer;

    if-eqz v6, :cond_85

    const/16 v6, 0x69

    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->putChar(C)Ljava/nio/ByteBuffer;

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    goto :goto_f4

    :cond_85
    instance-of v6, v5, Ljava/lang/Float;

    if-eqz v6, :cond_98

    const/16 v6, 0x66

    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->putChar(C)Ljava/nio/ByteBuffer;

    check-cast v5, Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    goto :goto_f4

    :cond_98
    instance-of v6, v5, Ljava/lang/Double;

    if-eqz v6, :cond_ab

    const/16 v6, 0x64

    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->putChar(C)Ljava/nio/ByteBuffer;

    check-cast v5, Ljava/lang/Double;

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    invoke-virtual {v0, v5, v6}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    goto :goto_f4

    :cond_ab
    instance-of v6, v5, Ljava/lang/Long;

    if-eqz v6, :cond_be

    const/16 v6, 0x6c

    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->putChar(C)Ljava/nio/ByteBuffer;

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v0, v5, v6}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    goto :goto_f4

    :cond_be
    if-nez v5, :cond_c6

    const/16 v5, 0x30

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->putChar(C)Ljava/nio/ByteBuffer;

    goto :goto_f4

    :cond_c6
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "H1>A7oNe<\u001dk:\u001a4>\u001d`m\u001e3>\u001d3hHj;\u001bb<\u001ddm@1i\u001bji\u001deoMem\u001ed=\u001cdl\u001c`m\u001cblHblO1fM4=@7=H0h\u001a7jA4mM6=O1=Ha=\u001aafKd=\u001de<"

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぁごぐすすぃ(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/nio/ByteBuffer;->putChar(C)Ljava/nio/ByteBuffer;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 7
    invoke-virtual {v5, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v5

    array-length v6, v5

    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    :goto_f4
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_56

    .line 8
    :cond_f8
    :goto_f8
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    :cond_fb
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0
.end method

.method public ぺぁあねじ()I
    .registers 3

    iget v0, p0, Lde/blinkt/openvpn/core/LogItem;->ぁごぐすすぃ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_9

    iget-object v0, p0, Lde/blinkt/openvpn/core/LogItem;->づざかべべ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;

    .line 1
    iget v0, v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ$〺つふすそ;->〺つふすそ:I

    :cond_9
    return v0
.end method
