.class public final L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final 〺つふすそ:[Ljava/lang/String;

.field public static final くし〴〺ぅ:[Ljava/lang/String;

.field public static final げつ〴ぬぐ:Lぺぁあねじ/〳ぜぞぜべっ;

.field public static final びぐびあび:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .registers 16

    const-string v0, "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"

    invoke-static {v0}, Lぺぁあねじ/〳ぜぞぜべっ;->づざかべべ(Ljava/lang/String;)Lぺぁあねじ/〳ぜぞぜべっ;

    move-result-object v0

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->げつ〴ぬぐ:Lぺぁあねじ/〳ぜぞぜべっ;

    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "DATA"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "HEADERS"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const/4 v1, 0x2

    const-string v4, "PRIORITY"

    aput-object v4, v0, v1

    const-string v1, "RST_STREAM"

    const/4 v5, 0x3

    aput-object v1, v0, v5

    const-string v1, "SETTINGS"

    const/4 v6, 0x4

    aput-object v1, v0, v6

    const/4 v1, 0x5

    const-string v7, "PUSH_PROMISE"

    aput-object v7, v0, v1

    const/4 v1, 0x6

    const-string v7, "PING"

    aput-object v7, v0, v1

    const/4 v1, 0x7

    const-string v7, "GOAWAY"

    aput-object v7, v0, v1

    const-string v1, "WINDOW_UPDATE"

    const/16 v7, 0x8

    aput-object v1, v0, v7

    const/16 v1, 0x9

    const-string v8, "CONTINUATION"

    aput-object v8, v0, v1

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->〺つふすそ:[Ljava/lang/String;

    const/16 v0, 0x40

    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ:[Ljava/lang/String;

    const/16 v0, 0x100

    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->びぐびあび:[Ljava/lang/String;

    const/4 v0, 0x0

    :goto_4f
    sget-object v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->びぐびあび:[Ljava/lang/String;

    array-length v8, v1

    const/16 v9, 0x20

    if-ge v0, v8, :cond_6f

    new-array v8, v3, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v2

    const-string v10, "%8s"

    invoke-static {v10, v8}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->のぷのちつ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    const/16 v10, 0x30

    invoke-virtual {v8, v9, v10}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_4f

    :cond_6f
    sget-object v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ:[Ljava/lang/String;

    const-string v1, ""

    aput-object v1, v0, v2

    const-string v1, "END_STREAM"

    aput-object v1, v0, v3

    new-array v1, v3, [I

    aput v3, v1, v2

    const-string v8, "PADDED"

    aput-object v8, v0, v7

    const/4 v0, 0x0

    :goto_82
    const-string v8, "|PADDED"

    if-ge v0, v3, :cond_9c

    aget v10, v1, v0

    sget-object v11, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ:[Ljava/lang/String;

    or-int/lit8 v12, v10, 0x8

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v10, v11, v10

    invoke-static {v13, v10, v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v11, v12

    add-int/lit8 v0, v0, 0x1

    goto :goto_82

    :cond_9c
    sget-object v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ:[Ljava/lang/String;

    const-string v10, "END_HEADERS"

    aput-object v10, v0, v6

    aput-object v4, v0, v9

    const/16 v4, 0x24

    const-string v6, "END_HEADERS|PRIORITY"

    aput-object v6, v0, v4

    new-array v0, v5, [I

    fill-array-data v0, :array_106

    const/4 v4, 0x0

    :goto_b0
    if-ge v4, v5, :cond_f3

    aget v6, v0, v4

    const/4 v9, 0x0

    :goto_b5
    if-ge v9, v3, :cond_f0

    aget v10, v1, v9

    sget-object v11, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ:[Ljava/lang/String;

    or-int v12, v10, v6

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v14, v11, v10

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v14, 0x7c

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    aget-object v15, v11, v6

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    aput-object v13, v11, v12

    or-int/2addr v12, v7

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v10, v11, v10

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    aget-object v10, v11, v6

    invoke-static {v13, v10, v8}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    aput-object v10, v11, v12

    add-int/lit8 v9, v9, 0x1

    goto :goto_b5

    :cond_f0
    add-int/lit8 v4, v4, 0x1

    goto :goto_b0

    :cond_f3
    :goto_f3
    sget-object v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ:[Ljava/lang/String;

    array-length v1, v0

    if-ge v2, v1, :cond_105

    aget-object v1, v0, v2

    if-nez v1, :cond_102

    sget-object v1, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->びぐびあび:[Ljava/lang/String;

    aget-object v1, v1, v2

    aput-object v1, v0, v2

    :cond_102
    add-int/lit8 v2, v2, 0x1

    goto :goto_f3

    :cond_105
    return-void

    :array_106
    .array-data 4
        0x4
        0x20
        0x24
    .end array-data
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static varargs 〺つふすそ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;
    .registers 3

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p0, p1}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->のぷのちつ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static varargs くし〴〺ぅ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;
    .registers 3

    new-instance v0, Ljava/io/IOException;

    invoke-static {p0, p1}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->のぷのちつ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static げつ〴ぬぐ(ZIIBB)Ljava/lang/String;
    .registers 14

    sget-object v0, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->〺つふすそ:[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ge p3, v1, :cond_a

    aget-object v0, v0, p3

    goto :goto_18

    :cond_a
    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "0x%02x"

    invoke-static {v1, v0}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->のぷのちつ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_18
    const/4 v1, 0x5

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x4

    if-nez p4, :cond_21

    const-string p3, ""

    goto :goto_67

    :cond_21
    if-eq p3, v5, :cond_63

    if-eq p3, v4, :cond_63

    if-eq p3, v6, :cond_59

    const/4 v7, 0x6

    if-eq p3, v7, :cond_59

    const/4 v7, 0x7

    if-eq p3, v7, :cond_63

    const/16 v7, 0x8

    if-eq p3, v7, :cond_63

    .line 1
    sget-object v7, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->くし〴〺ぅ:[Ljava/lang/String;

    array-length v8, v7

    if-ge p4, v8, :cond_39

    aget-object v7, v7, p4

    goto :goto_3d

    :cond_39
    sget-object v7, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->びぐびあび:[Ljava/lang/String;

    aget-object v7, v7, p4

    :goto_3d
    if-ne p3, v1, :cond_4c

    and-int/lit8 v8, p4, 0x4

    if-eqz v8, :cond_4c

    const-string p3, "HEADERS"

    const-string p4, "PUSH_PROMISE"

    :goto_47
    invoke-virtual {v7, p3, p4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p3

    goto :goto_67

    :cond_4c
    if-nez p3, :cond_57

    and-int/lit8 p3, p4, 0x20

    if-eqz p3, :cond_57

    const-string p3, "PRIORITY"

    const-string p4, "COMPRESSED"

    goto :goto_47

    :cond_57
    move-object p3, v7

    goto :goto_67

    :cond_59
    if-ne p4, v3, :cond_5e

    const-string p3, "ACK"

    goto :goto_67

    :cond_5e
    sget-object p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->びぐびあび:[Ljava/lang/String;

    aget-object p3, p3, p4

    goto :goto_67

    :cond_63
    sget-object p3, L〳ぜぞぜべっ/ぉひのべい/ぺぁあねじ/づざかべべ;->びぐびあび:[Ljava/lang/String;

    aget-object p3, p3, p4

    :goto_67
    new-array p4, v1, [Ljava/lang/Object;

    if-eqz p0, :cond_6e

    const-string p0, "<<"

    goto :goto_70

    :cond_6e
    const-string p0, ">>"

    :goto_70
    aput-object p0, p4, v2

    .line 2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, p4, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, p4, v5

    aput-object v0, p4, v4

    aput-object p3, p4, v6

    const-string p0, "%s 0x%08x %5d %-13s %s"

    invoke-static {p0, p4}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->のぷのちつ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
