.class public final Lぺぁあねじ/づざかべべ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lぺぁあねじ/ぁごぐすすぃ;
.implements Lぺぁあねじ/なぎぱいぢぎ;
.implements Ljava/lang/Cloneable;
.implements Ljava/nio/channels/ByteChannel;


# static fields
.field public static final びぐびあび:[B


# instance fields
.field public 〺つふすそ:Lぺぁあねじ/は〲ぱなで;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public くし〴〺ぅ:J


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_a

    sput-object v0, Lぺぁあねじ/づざかべべ;->びぐびあび:[B

    return-void

    :array_a
    .array-data 1
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
    .end array-data
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .registers 7

    .line 1
    new-instance v0, Lぺぁあねじ/づざかべべ;

    invoke-direct {v0}, Lぺぁあねじ/づざかべべ;-><init>()V

    iget-wide v1, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_e

    goto :goto_32

    :cond_e
    iget-object v1, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    invoke-virtual {v1}, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ()Lぺぁあねじ/は〲ぱなで;

    move-result-object v1

    iput-object v1, v0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    iput-object v1, v1, Lぺぁあねじ/は〲ぱなで;->ぁごぐすすぃ:Lぺぁあねじ/は〲ぱなで;

    iput-object v1, v1, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    iget-object v1, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    :goto_1c
    iget-object v1, v1, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    iget-object v2, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    if-eq v1, v2, :cond_2e

    iget-object v2, v0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    iget-object v2, v2, Lぺぁあねじ/は〲ぱなで;->ぁごぐすすぃ:Lぺぁあねじ/は〲ぱなで;

    invoke-virtual {v1}, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ()Lぺぁあねじ/は〲ぱなで;

    move-result-object v3

    invoke-virtual {v2, v3}, Lぺぁあねじ/は〲ぱなで;->〺つふすそ(Lぺぁあねじ/は〲ぱなで;)Lぺぁあねじ/は〲ぱなで;

    goto :goto_1c

    :cond_2e
    iget-wide v1, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    iput-wide v1, v0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    :goto_32
    return-object v0
.end method

.method public close()V
    .registers 1

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 15

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lぺぁあねじ/づざかべべ;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lぺぁあねじ/づざかべべ;

    iget-wide v3, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    iget-wide v5, p1, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_15

    return v2

    :cond_15
    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-nez v1, :cond_1c

    return v0

    :cond_1c
    iget-object v1, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    iget-object p1, p1, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    iget v3, v1, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    iget v4, p1, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    :goto_24
    iget-wide v7, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    cmp-long v9, v5, v7

    if-gez v9, :cond_61

    iget v7, v1, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    sub-int/2addr v7, v3

    iget v8, p1, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    sub-int/2addr v8, v4

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    int-to-long v7, v7

    const/4 v9, 0x0

    :goto_36
    int-to-long v10, v9

    cmp-long v12, v10, v7

    if-gez v12, :cond_4f

    iget-object v10, v1, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    add-int/lit8 v11, v3, 0x1

    aget-byte v3, v10, v3

    iget-object v10, p1, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    add-int/lit8 v12, v4, 0x1

    aget-byte v4, v10, v4

    if-eq v3, v4, :cond_4a

    return v2

    :cond_4a
    add-int/lit8 v9, v9, 0x1

    move v3, v11

    move v4, v12

    goto :goto_36

    :cond_4f
    iget v9, v1, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    if-ne v3, v9, :cond_57

    iget-object v1, v1, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    iget v3, v1, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    :cond_57
    iget v9, p1, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    if-ne v4, v9, :cond_5f

    iget-object p1, p1, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    iget v4, p1, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    :cond_5f
    add-long/2addr v5, v7

    goto :goto_24

    :cond_61
    return v0
.end method

.method public flush()V
    .registers 1

    return-void
.end method

.method public hashCode()I
    .registers 6

    iget-object v0, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    if-nez v0, :cond_6

    const/4 v0, 0x0

    return v0

    :cond_6
    const/4 v1, 0x1

    :cond_7
    iget v2, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    iget v3, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    :goto_b
    if-ge v2, v3, :cond_17

    mul-int/lit8 v1, v1, 0x1f

    iget-object v4, v0, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    aget-byte v4, v4, v2

    add-int/2addr v1, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    :cond_17
    iget-object v0, v0, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    iget-object v2, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    if-ne v0, v2, :cond_7

    return v1
.end method

.method public isOpen()Z
    .registers 2

    const/4 v0, 0x1

    return v0
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .registers 8

    iget-object v0, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    if-nez v0, :cond_6

    const/4 p1, -0x1

    return p1

    :cond_6
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v1

    iget v2, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget v3, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-object v2, v0, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    iget v3, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    invoke-virtual {p1, v2, v3, v1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    iget p1, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    add-int/2addr p1, v1

    iput p1, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    iget-wide v2, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    int-to-long v4, v1

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    iget v2, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    if-ne p1, v2, :cond_32

    invoke-virtual {v0}, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ()Lぺぁあねじ/は〲ぱなで;

    move-result-object p1

    iput-object p1, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    invoke-static {v0}, Lぺぁあねじ/ごづごきえ;->げつ〴ぬぐ(Lぺぁあねじ/は〲ぱなで;)V

    :cond_32
    return v1
.end method

.method public toString()Ljava/lang/String;
    .registers 6

    .line 1
    iget-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, v0, v2

    if-gtz v4, :cond_19

    long-to-int v1, v0

    if-nez v1, :cond_f

    .line 2
    sget-object v0, Lぺぁあねじ/〳ぜぞぜべっ;->なぎぱいぢぎ:Lぺぁあねじ/〳ぜぞぜべっ;

    goto :goto_14

    :cond_f
    new-instance v0, Lぺぁあねじ/ざっざへづ;

    invoke-direct {v0, p0, v1}, Lぺぁあねじ/ざっざへづ;-><init>(Lぺぁあねじ/づざかべべ;I)V

    .line 3
    :goto_14
    invoke-virtual {v0}, Lぺぁあねじ/〳ぜぞぜべっ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 4
    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "size > Integer.MAX_VALUE: "

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .registers 8

    if-eqz p1, :cond_2b

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    move v1, v0

    :goto_7
    if-lez v1, :cond_24

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lぺぁあねじ/づざかべべ;->ながふずは(I)Lぺぁあねじ/は〲ぱなで;

    move-result-object v2

    iget v3, v2, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    rsub-int v3, v3, 0x2000

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    iget-object v4, v2, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    iget v5, v2, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    invoke-virtual {p1, v4, v5, v3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    sub-int/2addr v1, v3

    iget v4, v2, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    add-int/2addr v4, v3

    iput v4, v2, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    goto :goto_7

    :cond_24
    iget-wide v1, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    int-to-long v3, v0

    add-long/2addr v1, v3

    iput-wide v1, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    return v0

    :cond_2b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "source == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_34

    :goto_33
    throw p1

    :goto_34
    goto :goto_33
.end method

.method public 〱こか〺ぃせ(Ljava/lang/String;II)Lぺぁあねじ/づざかべべ;
    .registers 11

    if-ltz p2, :cond_103

    if-lt p3, p2, :cond_e4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-gt p3, v0, :cond_c1

    :goto_a
    if-ge p2, p3, :cond_c0

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x80

    if-ge v0, v1, :cond_49

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lぺぁあねじ/づざかべべ;->ながふずは(I)Lぺぁあねじ/は〲ぱなで;

    move-result-object v2

    iget-object v3, v2, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    iget v4, v2, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    sub-int/2addr v4, p2

    rsub-int v5, v4, 0x2000

    invoke-static {p3, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    add-int/lit8 v6, p2, 0x1

    add-int/2addr p2, v4

    int-to-byte v0, v0

    aput-byte v0, v3, p2

    :goto_2a
    move p2, v6

    if-ge p2, v5, :cond_3b

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-lt v0, v1, :cond_34

    goto :goto_3b

    :cond_34
    add-int/lit8 v6, p2, 0x1

    add-int/2addr p2, v4

    int-to-byte v0, v0

    aput-byte v0, v3, p2

    goto :goto_2a

    :cond_3b
    :goto_3b
    add-int/2addr v4, p2

    iget v0, v2, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    sub-int/2addr v4, v0

    add-int/2addr v0, v4

    iput v0, v2, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    int-to-long v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    goto :goto_a

    :cond_49
    const/16 v2, 0x800

    if-ge v0, v2, :cond_52

    shr-int/lit8 v2, v0, 0x6

    or-int/lit16 v2, v2, 0xc0

    goto :goto_b3

    :cond_52
    const v2, 0xd800

    const/16 v3, 0x3f

    if-lt v0, v2, :cond_a8

    const v2, 0xdfff

    if-le v0, v2, :cond_5f

    goto :goto_a8

    :cond_5f
    add-int/lit8 v4, p2, 0x1

    if-ge v4, p3, :cond_68

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    goto :goto_69

    :cond_68
    const/4 v5, 0x0

    :goto_69
    const v6, 0xdbff

    if-gt v0, v6, :cond_a2

    const v6, 0xdc00

    if-lt v5, v6, :cond_a2

    if-le v5, v2, :cond_76

    goto :goto_a2

    :cond_76
    const/high16 v2, 0x10000

    const v4, -0xd801

    and-int/2addr v0, v4

    shl-int/lit8 v0, v0, 0xa

    const v4, -0xdc01

    and-int/2addr v4, v5

    or-int/2addr v0, v4

    add-int/2addr v0, v2

    shr-int/lit8 v2, v0, 0x12

    or-int/lit16 v2, v2, 0xf0

    invoke-virtual {p0, v2}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    shr-int/lit8 v2, v0, 0xc

    and-int/2addr v2, v3

    or-int/2addr v2, v1

    invoke-virtual {p0, v2}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    shr-int/lit8 v2, v0, 0x6

    and-int/2addr v2, v3

    or-int/2addr v2, v1

    invoke-virtual {p0, v2}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    and-int/2addr v0, v3

    or-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    add-int/lit8 p2, p2, 0x2

    goto/16 :goto_a

    :cond_a2
    :goto_a2
    invoke-virtual {p0, v3}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    move p2, v4

    goto/16 :goto_a

    :cond_a8
    :goto_a8
    shr-int/lit8 v2, v0, 0xc

    or-int/lit16 v2, v2, 0xe0

    invoke-virtual {p0, v2}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    shr-int/lit8 v2, v0, 0x6

    and-int/2addr v2, v3

    or-int/2addr v2, v1

    :goto_b3
    invoke-virtual {p0, v2}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    and-int/lit8 v0, v0, 0x3f

    or-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    add-int/lit8 p2, p2, 0x1

    goto/16 :goto_a

    :cond_c0
    return-object p0

    :cond_c1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "endIndex > string.length: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " > "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_e4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "endIndex < beginIndex: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " < "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_103
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p3, "beginIndex < 0: "

    invoke-static {p3, p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_110

    :goto_10f
    throw p1

    :goto_110
    goto :goto_10f
.end method

.method public bridge synthetic 〳ぜぞぜべっ(I)Lぺぁあねじ/なぎぱいぢぎ;
    .registers 2

    invoke-virtual {p0, p1}, Lぺぁあねじ/づざかべべ;->のね〱ばぁぢ(I)Lぺぁあねじ/づざかべべ;

    return-object p0
.end method

.method public 〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;
    .registers 2

    sget-object v0, Lぺぁあねじ/〻ぞまぎな〻;->びぐびあび:Lぺぁあねじ/〻ぞまぎな〻;

    return-object v0
.end method

.method public 〺でおいここ([B)V
    .registers 5

    const/4 v0, 0x0

    :goto_1
    array-length v1, p1

    if-ge v0, v1, :cond_15

    array-length v1, p1

    sub-int/2addr v1, v0

    invoke-virtual {p0, p1, v0, v1}, Lぺぁあねじ/づざかべべ;->ぷぞてのほき([BII)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_f

    add-int/2addr v0, v1

    goto :goto_1

    :cond_f
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_15
    return-void
.end method

.method public 〻ぞまぎな〻(J)V
    .registers 6

    iget-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    cmp-long v2, v0, p1

    if-ltz v2, :cond_7

    return-void

    :cond_7
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1
.end method

.method public ぁごぐすすぃ(J)V
    .registers 9

    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_37

    iget-object v0, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    if-eqz v0, :cond_31

    iget v1, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget v0, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sub-int/2addr v1, v0

    int-to-long v0, v1

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    iget-wide v2, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    int-to-long v4, v1

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    sub-long/2addr p1, v4

    iget-object v0, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    iget v2, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    add-int/2addr v2, v1

    iput v2, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    iget v1, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    if-ne v2, v1, :cond_0

    invoke-virtual {v0}, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ()Lぺぁあねじ/は〲ぱなで;

    move-result-object v1

    iput-object v1, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    invoke-static {v0}, Lぺぁあねじ/ごづごきえ;->げつ〴ぬぐ(Lぺぁあねじ/は〲ぱなで;)V

    goto :goto_0

    :cond_31
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_37
    return-void
.end method

.method public ぃぜぶの〸ぃ(Lぺぁあねじ/〳ぜぞぜべっ;)Lぺぁあねじ/づざかべべ;
    .registers 3

    if-eqz p1, :cond_6

    invoke-virtual {p1, p0}, Lぺぁあねじ/〳ぜぞぜべっ;->ぇぬぎばつ(Lぺぁあねじ/づざかべべ;)V

    return-object p0

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "byteString == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic いいにぽつ(I)Lぺぁあねじ/なぎぱいぢぎ;
    .registers 2

    invoke-virtual {p0, p1}, Lぺぁあねじ/づざかべべ;->ぺがぅす〹ち(I)Lぺぁあねじ/づざかべべ;

    return-object p0
.end method

.method public ぅみぱぎぎ()B
    .registers 10

    iget-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_28

    iget-object v2, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    iget v3, v2, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    iget v4, v2, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget-object v5, v2, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    add-int/lit8 v6, v3, 0x1

    aget-byte v3, v5, v3

    const-wide/16 v7, 0x1

    sub-long/2addr v0, v7

    iput-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    if-ne v6, v4, :cond_25

    invoke-virtual {v2}, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ()Lぺぁあねじ/は〲ぱなで;

    move-result-object v0

    iput-object v0, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    invoke-static {v2}, Lぺぁあねじ/ごづごきえ;->げつ〴ぬぐ(Lぺぁあねじ/は〲ぱなで;)V

    goto :goto_27

    :cond_25
    iput v6, v2, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    :goto_27
    return v3

    :cond_28
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "size == 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic ぇ〳〲〺すっ(J)Lぺぁあねじ/なぎぱいぢぎ;
    .registers 3

    invoke-virtual {p0, p1, p2}, Lぺぁあねじ/づざかべべ;->ごまけがぢは(J)Lぺぁあねじ/づざかべべ;

    move-result-object p1

    return-object p1
.end method

.method public ぇとしたべど(JLjava/nio/charset/Charset;)Ljava/lang/String;
    .registers 10

    iget-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v2, 0x0

    move-wide v4, p1

    invoke-static/range {v0 .. v5}, Lぺぁあねじ/ぉ〲なぱぽた;->〺つふすそ(JJJ)V

    if-eqz p3, :cond_6c

    const-wide/32 v0, 0x7fffffff

    cmp-long v2, p1, v0

    if-gtz v2, :cond_55

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_1a

    const-string p1, ""

    return-object p1

    :cond_1a
    iget-object v0, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    iget v1, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    int-to-long v1, v1

    add-long/2addr v1, p1

    iget v3, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    int-to-long v3, v3

    cmp-long v5, v1, v3

    if-lez v5, :cond_31

    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lぺぁあねじ/づざかべべ;->おぐぴう〸ず(J)[B

    move-result-object p1

    invoke-direct {v0, p1, p3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0

    :cond_31
    new-instance v1, Ljava/lang/String;

    iget-object v2, v0, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    iget v3, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    long-to-int v4, p1

    invoke-direct {v1, v2, v3, v4, p3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iget p3, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    int-to-long v2, p3

    add-long/2addr v2, p1

    long-to-int p3, v2

    iput p3, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    iget-wide v2, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    sub-long/2addr v2, p1

    iput-wide v2, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    iget p1, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    if-ne p3, p1, :cond_54

    invoke-virtual {v0}, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ()Lぺぁあねじ/は〲ぱなで;

    move-result-object p1

    iput-object p1, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    invoke-static {v0}, Lぺぁあねじ/ごづごきえ;->げつ〴ぬぐ(Lぺぁあねじ/は〲ぱなで;)V

    :cond_54
    return-object v1

    :cond_55
    new-instance p3, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "byteCount > Integer.MAX_VALUE: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_6c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "charset == null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ぇぬぎばつ()Ljava/lang/String;
    .registers 4

    :try_start_0
    iget-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    sget-object v2, Lぺぁあねじ/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0, v1, v2}, Lぺぁあねじ/づざかべべ;->ぇとしたべど(JLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0
    :try_end_8
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_8} :catch_9

    return-object v0

    :catch_9
    move-exception v0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public えがぐせほち(Lぺぁあねじ/ぶでにく〼〳;)J
    .registers 9

    if-eqz p1, :cond_13

    const-wide/16 v0, 0x0

    :goto_4
    const-wide/16 v2, 0x2000

    invoke-interface {p1, p0, v2, v3}, Lぺぁあねじ/ぶでにく〼〳;->ざっざへづ(Lぺぁあねじ/づざかべべ;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v6, v2, v4

    if-eqz v6, :cond_12

    add-long/2addr v0, v2

    goto :goto_4

    :cond_12
    return-wide v0

    :cond_13
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "source == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_1c

    :goto_1b
    throw p1

    :goto_1c
    goto :goto_1b
.end method

.method public bridge synthetic ぉ〲なぱぽた(Ljava/lang/String;)Lぺぁあねじ/なぎぱいぢぎ;
    .registers 2

    invoke-virtual {p0, p1}, Lぺぁあねじ/づざかべべ;->くねねぱす〻(Ljava/lang/String;)Lぺぁあねじ/づざかべべ;

    return-object p0
.end method

.method public bridge synthetic ぉざぅち〻([B)Lぺぁあねじ/なぎぱいぢぎ;
    .registers 2

    invoke-virtual {p0, p1}, Lぺぁあねじ/づざかべべ;->ておぞぞはね([B)Lぺぁあねじ/づざかべべ;

    return-object p0
.end method

.method public ぉひのべい(J)B
    .registers 9

    iget-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v4, 0x1

    move-wide v2, p1

    invoke-static/range {v0 .. v5}, Lぺぁあねじ/ぉ〲なぱぽた;->〺つふすそ(JJJ)V

    iget-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    sub-long v2, v0, p1

    cmp-long v4, v2, p1

    if-lez v4, :cond_27

    iget-object v0, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    :goto_12
    iget v1, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget v2, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sub-int/2addr v1, v2

    int-to-long v3, v1

    cmp-long v1, p1, v3

    if-gez v1, :cond_23

    iget-object v0, v0, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    long-to-int p2, p1

    add-int/2addr v2, p2

    aget-byte p1, v0, v2

    return p1

    :cond_23
    sub-long/2addr p1, v3

    iget-object v0, v0, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    goto :goto_12

    :cond_27
    sub-long/2addr p1, v0

    iget-object v0, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    :cond_2a
    iget-object v0, v0, Lぺぁあねじ/は〲ぱなで;->ぁごぐすすぃ:Lぺぁあねじ/は〲ぱなで;

    iget v1, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget v2, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sub-int/2addr v1, v2

    int-to-long v3, v1

    add-long/2addr p1, v3

    const-wide/16 v3, 0x0

    cmp-long v1, p1, v3

    if-ltz v1, :cond_2a

    iget-object v0, v0, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    long-to-int p2, p1

    add-int/2addr v2, p2

    aget-byte p1, v0, v2

    return p1
.end method

.method public おかぷせ〱()Lぺぁあねじ/〳ぜぞぜべっ;
    .registers 3

    new-instance v0, Lぺぁあねじ/〳ぜぞぜべっ;

    invoke-virtual {p0}, Lぺぁあねじ/づざかべべ;->けときぜと()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lぺぁあねじ/〳ぜぞぜべっ;-><init>([B)V

    return-object v0
.end method

.method public おぐぴう〸ず(J)[B
    .registers 9

    iget-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v2, 0x0

    move-wide v4, p1

    invoke-static/range {v0 .. v5}, Lぺぁあねじ/ぉ〲なぱぽた;->〺つふすそ(JJJ)V

    const-wide/32 v0, 0x7fffffff

    cmp-long v2, p1, v0

    if-gtz v2, :cond_16

    long-to-int p2, p1

    new-array p1, p2, [B

    invoke-virtual {p0, p1}, Lぺぁあねじ/づざかべべ;->〺でおいここ([B)V

    return-object p1

    :cond_16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "byteCount > Integer.MAX_VALUE: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public くぎぶ〼のそ(I)Lぺぁあねじ/づざかべべ;
    .registers 5

    const/16 v0, 0x80

    if-ge p1, v0, :cond_5

    goto :goto_43

    :cond_5
    const/16 v1, 0x800

    const/16 v2, 0x3f

    if-ge p1, v1, :cond_10

    shr-int/lit8 v1, p1, 0x6

    or-int/lit16 v1, v1, 0xc0

    goto :goto_3e

    :cond_10
    const/high16 v1, 0x10000

    if-ge p1, v1, :cond_27

    const v1, 0xd800

    if-lt p1, v1, :cond_22

    const v1, 0xdfff

    if-gt p1, v1, :cond_22

    invoke-virtual {p0, v2}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    goto :goto_46

    :cond_22
    shr-int/lit8 v1, p1, 0xc

    or-int/lit16 v1, v1, 0xe0

    goto :goto_37

    :cond_27
    const v1, 0x10ffff

    if-gt p1, v1, :cond_47

    shr-int/lit8 v1, p1, 0x12

    or-int/lit16 v1, v1, 0xf0

    invoke-virtual {p0, v1}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    shr-int/lit8 v1, p1, 0xc

    and-int/2addr v1, v2

    or-int/2addr v1, v0

    :goto_37
    invoke-virtual {p0, v1}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    shr-int/lit8 v1, p1, 0x6

    and-int/2addr v1, v2

    or-int/2addr v1, v0

    :goto_3e
    invoke-virtual {p0, v1}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    and-int/2addr p1, v2

    or-int/2addr p1, v0

    :goto_43
    invoke-virtual {p0, p1}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    :goto_46
    return-object p0

    :cond_47
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unexpected code point: "

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic くし〴〺ぅ([BII)Lぺぁあねじ/なぎぱいぢぎ;
    .registers 4

    invoke-virtual {p0, p1, p2, p3}, Lぺぁあねじ/づざかべべ;->ち〴みぎ〻び([BII)Lぺぁあねじ/づざかべべ;

    return-object p0
.end method

.method public くねねぱす〻(Ljava/lang/String;)Lぺぁあねじ/づざかべべ;
    .registers 4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lぺぁあねじ/づざかべべ;->〱こか〺ぃせ(Ljava/lang/String;II)Lぺぁあねじ/づざかべべ;

    return-object p0
.end method

.method public けときぜと()[B
    .registers 3

    :try_start_0
    iget-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    invoke-virtual {p0, v0, v1}, Lぺぁあねじ/づざかべべ;->おぐぴう〸ず(J)[B

    move-result-object v0
    :try_end_6
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_6} :catch_7

    return-object v0

    :catch_7
    move-exception v0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public げがぴうあだ(J)Ljava/lang/String;
    .registers 9

    const-wide/16 v0, 0x1

    const-wide/16 v2, 0x0

    cmp-long v4, p1, v2

    if-lez v4, :cond_1e

    sub-long v2, p1, v0

    invoke-virtual {p0, v2, v3}, Lぺぁあねじ/づざかべべ;->ぉひのべい(J)B

    move-result v4

    const/16 v5, 0xd

    if-ne v4, v5, :cond_1e

    .line 1
    sget-object p1, Lぺぁあねじ/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v2, v3, p1}, Lぺぁあねじ/づざかべべ;->ぇとしたべど(JLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    const-wide/16 v0, 0x2

    .line 2
    :goto_1a
    invoke-virtual {p0, v0, v1}, Lぺぁあねじ/づざかべべ;->ぁごぐすすぃ(J)V

    return-object p1

    .line 3
    :cond_1e
    sget-object v2, Lぺぁあねじ/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/nio/charset/Charset;

    invoke-virtual {p0, p1, p2, v2}, Lぺぁあねじ/づざかべべ;->ぇとしたべど(JLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1a
.end method

.method public げつ〴ぬぐ()Lぺぁあねじ/づざかべべ;
    .registers 1

    return-object p0
.end method

.method public こ〲しでおか(J)Lぺぁあねじ/づざかべべ;
    .registers 12

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_c

    const/16 p1, 0x30

    invoke-virtual {p0, p1}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    return-object p0

    :cond_c
    invoke-static {p1, p2}, Ljava/lang/Long;->highestOneBit(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v0

    const/4 v1, 0x4

    div-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lぺぁあねじ/づざかべべ;->ながふずは(I)Lぺぁあねじ/は〲ぱなで;

    move-result-object v2

    iget-object v3, v2, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    iget v4, v2, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    add-int v5, v4, v0

    add-int/lit8 v5, v5, -0x1

    :goto_24
    if-lt v5, v4, :cond_34

    sget-object v6, Lぺぁあねじ/づざかべべ;->びぐびあび:[B

    const-wide/16 v7, 0xf

    and-long/2addr v7, p1

    long-to-int v8, v7

    aget-byte v6, v6, v8

    aput-byte v6, v3, v5

    ushr-long/2addr p1, v1

    add-int/lit8 v5, v5, -0x1

    goto :goto_24

    :cond_34
    iget p1, v2, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    add-int/2addr p1, v0

    iput p1, v2, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget-wide p1, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    int-to-long v0, v0

    add-long/2addr p1, v0

    iput-wide p1, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    return-object p0
.end method

.method public ごづごきえ()Lぺぁあねじ/なぎぱいぢぎ;
    .registers 1

    return-object p0
.end method

.method public ごまけがぢは(J)Lぺぁあねじ/づざかべべ;
    .registers 14

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_c

    const/16 p1, 0x30

    invoke-virtual {p0, p1}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    return-object p0

    :cond_c
    const/4 v2, 0x0

    const/4 v3, 0x1

    cmp-long v4, p1, v0

    if-gez v4, :cond_1e

    neg-long p1, p1

    cmp-long v2, p1, v0

    if-gez v2, :cond_1d

    const-string p1, "-9223372036854775808"

    invoke-virtual {p0, p1}, Lぺぁあねじ/づざかべべ;->くねねぱす〻(Ljava/lang/String;)Lぺぁあねじ/づざかべべ;

    return-object p0

    :cond_1d
    const/4 v2, 0x1

    :cond_1e
    const-wide/32 v4, 0x5f5e100

    const-wide/16 v6, 0xa

    cmp-long v8, p1, v4

    if-gez v8, :cond_6a

    const-wide/16 v4, 0x2710

    cmp-long v8, p1, v4

    if-gez v8, :cond_48

    const-wide/16 v4, 0x64

    cmp-long v8, p1, v4

    if-gez v8, :cond_3c

    cmp-long v4, p1, v6

    if-gez v4, :cond_39

    goto/16 :goto_e2

    :cond_39
    const/4 v3, 0x2

    goto/16 :goto_e2

    :cond_3c
    const-wide/16 v3, 0x3e8

    cmp-long v5, p1, v3

    if-gez v5, :cond_45

    const/4 v3, 0x3

    goto/16 :goto_e2

    :cond_45
    const/4 v3, 0x4

    goto/16 :goto_e2

    :cond_48
    const-wide/32 v3, 0xf4240

    cmp-long v5, p1, v3

    if-gez v5, :cond_5c

    const-wide/32 v3, 0x186a0

    cmp-long v5, p1, v3

    if-gez v5, :cond_59

    const/4 v3, 0x5

    goto/16 :goto_e2

    :cond_59
    const/4 v3, 0x6

    goto/16 :goto_e2

    :cond_5c
    const-wide/32 v3, 0x989680

    cmp-long v5, p1, v3

    if-gez v5, :cond_66

    const/4 v3, 0x7

    goto/16 :goto_e2

    :cond_66
    const/16 v3, 0x8

    goto/16 :goto_e2

    :cond_6a
    const-wide v3, 0xe8d4a51000L

    cmp-long v5, p1, v3

    if-gez v5, :cond_98

    const-wide v3, 0x2540be400L

    cmp-long v5, p1, v3

    if-gez v5, :cond_89

    const-wide/32 v3, 0x3b9aca00

    cmp-long v5, p1, v3

    if-gez v5, :cond_86

    const/16 v3, 0x9

    goto :goto_e2

    :cond_86
    const/16 v3, 0xa

    goto :goto_e2

    :cond_89
    const-wide v3, 0x174876e800L

    cmp-long v5, p1, v3

    if-gez v5, :cond_95

    const/16 v3, 0xb

    goto :goto_e2

    :cond_95
    const/16 v3, 0xc

    goto :goto_e2

    :cond_98
    const-wide v3, 0x38d7ea4c68000L

    cmp-long v5, p1, v3

    if-gez v5, :cond_bc

    const-wide v3, 0x9184e72a000L

    cmp-long v5, p1, v3

    if-gez v5, :cond_ad

    const/16 v3, 0xd

    goto :goto_e2

    :cond_ad
    const-wide v3, 0x5af3107a4000L

    cmp-long v5, p1, v3

    if-gez v5, :cond_b9

    const/16 v3, 0xe

    goto :goto_e2

    :cond_b9
    const/16 v3, 0xf

    goto :goto_e2

    :cond_bc
    const-wide v3, 0x16345785d8a0000L

    cmp-long v5, p1, v3

    if-gez v5, :cond_d4

    const-wide v3, 0x2386f26fc10000L

    cmp-long v5, p1, v3

    if-gez v5, :cond_d1

    const/16 v3, 0x10

    goto :goto_e2

    :cond_d1
    const/16 v3, 0x11

    goto :goto_e2

    :cond_d4
    const-wide v3, 0xde0b6b3a7640000L

    cmp-long v5, p1, v3

    if-gez v5, :cond_e0

    const/16 v3, 0x12

    goto :goto_e2

    :cond_e0
    const/16 v3, 0x13

    :goto_e2
    if-eqz v2, :cond_e6

    add-int/lit8 v3, v3, 0x1

    :cond_e6
    invoke-virtual {p0, v3}, Lぺぁあねじ/づざかべべ;->ながふずは(I)Lぺぁあねじ/は〲ぱなで;

    move-result-object v4

    iget-object v5, v4, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    iget v8, v4, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    add-int/2addr v8, v3

    :goto_ef
    cmp-long v9, p1, v0

    if-eqz v9, :cond_100

    rem-long v9, p1, v6

    long-to-int v10, v9

    add-int/lit8 v8, v8, -0x1

    sget-object v9, Lぺぁあねじ/づざかべべ;->びぐびあび:[B

    aget-byte v9, v9, v10

    aput-byte v9, v5, v8

    div-long/2addr p1, v6

    goto :goto_ef

    :cond_100
    if-eqz v2, :cond_108

    add-int/lit8 v8, v8, -0x1

    const/16 p1, 0x2d

    aput-byte p1, v5, v8

    :cond_108
    iget p1, v4, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    add-int/2addr p1, v3

    iput p1, v4, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget-wide p1, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    int-to-long v0, v3

    add-long/2addr p1, v0

    iput-wide p1, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    return-object p0
.end method

.method public ざっざへづ(Lぺぁあねじ/づざかべべ;J)J
    .registers 9

    if-eqz p1, :cond_31

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_1a

    iget-wide v2, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    cmp-long v4, v2, v0

    if-nez v4, :cond_11

    const-wide/16 p1, -0x1

    return-wide p1

    :cond_11
    cmp-long v0, p2, v2

    if-lez v0, :cond_16

    move-wide p2, v2

    :cond_16
    invoke-virtual {p1, p0, p2, p3}, Lぺぁあねじ/づざかべべ;->びぐびあび(Lぺぁあねじ/づざかべべ;J)V

    return-wide p2

    :cond_1a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "byteCount < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_31
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "sink == null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic ざとぅぼこ〺(Lぺぁあねじ/〳ぜぞぜべっ;)Lぺぁあねじ/なぎぱいぢぎ;
    .registers 2

    invoke-virtual {p0, p1}, Lぺぁあねじ/づざかべべ;->ぃぜぶの〸ぃ(Lぺぁあねじ/〳ぜぞぜべっ;)Lぺぁあねじ/づざかべべ;

    return-object p0
.end method

.method public じぜこほぱ()V
    .registers 3

    :try_start_0
    iget-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    invoke-virtual {p0, v0, v1}, Lぺぁあねじ/づざかべべ;->ぁごぐすすぃ(J)V
    :try_end_5
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_5} :catch_6

    return-void

    :catch_6
    move-exception v0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public せづっ〸ちね(BJJ)J
    .registers 21

    move-object v0, p0

    const-wide/16 v1, 0x0

    cmp-long v3, p2, v1

    if-ltz v3, :cond_7f

    cmp-long v3, p4, p2

    if-ltz v3, :cond_7f

    iget-wide v3, v0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    cmp-long v5, p4, v3

    if-lez v5, :cond_13

    move-wide v5, v3

    goto :goto_15

    :cond_13
    move-wide/from16 v5, p4

    :goto_15
    const-wide/16 v7, -0x1

    cmp-long v9, p2, v5

    if-nez v9, :cond_1c

    return-wide v7

    :cond_1c
    iget-object v9, v0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    if-nez v9, :cond_21

    return-wide v7

    :cond_21
    sub-long v10, v3, p2

    cmp-long v12, v10, p2

    if-gez v12, :cond_35

    :goto_27
    cmp-long v1, v3, p2

    if-lez v1, :cond_45

    iget-object v9, v9, Lぺぁあねじ/は〲ぱなで;->ぁごぐすすぃ:Lぺぁあねじ/は〲ぱなで;

    iget v1, v9, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget v2, v9, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    sub-long/2addr v3, v1

    goto :goto_27

    :cond_35
    :goto_35
    iget v3, v9, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget v4, v9, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sub-int/2addr v3, v4

    int-to-long v3, v3

    add-long/2addr v3, v1

    cmp-long v10, v3, p2

    if-gez v10, :cond_44

    iget-object v9, v9, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    move-wide v1, v3

    goto :goto_35

    :cond_44
    move-wide v3, v1

    :cond_45
    move-wide/from16 v1, p2

    :goto_47
    cmp-long v10, v3, v5

    if-gez v10, :cond_7e

    iget-object v10, v9, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    iget v11, v9, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    int-to-long v11, v11

    iget v13, v9, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    int-to-long v13, v13

    add-long/2addr v13, v5

    sub-long/2addr v13, v3

    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v11

    long-to-int v12, v11

    iget v11, v9, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    int-to-long v13, v11

    add-long/2addr v13, v1

    sub-long/2addr v13, v3

    long-to-int v1, v13

    :goto_60
    if-ge v1, v12, :cond_71

    aget-byte v2, v10, v1

    move/from16 v11, p1

    if-ne v2, v11, :cond_6e

    iget v2, v9, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    add-long/2addr v1, v3

    return-wide v1

    :cond_6e
    add-int/lit8 v1, v1, 0x1

    goto :goto_60

    :cond_71
    move/from16 v11, p1

    iget v1, v9, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget v2, v9, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    add-long/2addr v3, v1

    iget-object v9, v9, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    move-wide v1, v3

    goto :goto_47

    :cond_7e
    return-wide v7

    :cond_7f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-wide v4, v0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x2

    invoke-static/range {p4 .. p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const-string v3, "size=%s fromIndex=%s toIndex=%s"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_a6

    :goto_a5
    throw v1

    :goto_a6
    goto :goto_a5
.end method

.method public ち〴みぎ〻び([BII)Lぺぁあねじ/づざかべべ;
    .registers 13

    if-eqz p1, :cond_30

    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v7, p3

    move-wide v5, v7

    invoke-static/range {v1 .. v6}, Lぺぁあねじ/ぉ〲なぱぽた;->〺つふすそ(JJJ)V

    add-int/2addr p3, p2

    :goto_b
    if-ge p2, p3, :cond_2a

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lぺぁあねじ/づざかべべ;->ながふずは(I)Lぺぁあねじ/は〲ぱなで;

    move-result-object v0

    sub-int v1, p3, p2

    iget v2, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    rsub-int v2, v2, 0x2000

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-object v2, v0, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    iget v3, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    invoke-static {p1, p2, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, v1

    iget v2, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    add-int/2addr v2, v1

    iput v2, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    goto :goto_b

    :cond_2a
    iget-wide p1, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    add-long/2addr p1, v7

    iput-wide p1, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    return-object p0

    :cond_30
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "source == null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_39

    :goto_38
    throw p1

    :goto_39
    goto :goto_38
.end method

.method public bridge synthetic づざかべべ(J)Lぺぁあねじ/なぎぱいぢぎ;
    .registers 3

    invoke-virtual {p0, p1, p2}, Lぺぁあねじ/づざかべべ;->こ〲しでおか(J)Lぺぁあねじ/づざかべべ;

    move-result-object p1

    return-object p1
.end method

.method public ておぞぞはね([B)Lぺぁあねじ/づざかべべ;
    .registers 4

    if-eqz p1, :cond_8

    const/4 v0, 0x0

    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lぺぁあねじ/づざかべべ;->ち〴みぎ〻び([BII)Lぺぁあねじ/づざかべべ;

    return-object p0

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "source == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public てぜきぽく()I
    .registers 4

    invoke-virtual {p0}, Lぺぁあねじ/づざかべべ;->ぺぁあねじ()I

    move-result v0

    .line 1
    sget-object v1, Lぺぁあねじ/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/nio/charset/Charset;

    const/high16 v1, -0x1000000

    and-int/2addr v1, v0

    ushr-int/lit8 v1, v1, 0x18

    const/high16 v2, 0xff0000

    and-int/2addr v2, v0

    ushr-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    const v2, 0xff00

    and-int/2addr v2, v0

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    or-int/2addr v0, v1

    return v0
.end method

.method public でどあくず(J)Ljava/lang/String;
    .registers 13

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_88

    const-wide/16 v0, 0x1

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v4, p1, v2

    if-nez v4, :cond_12

    goto :goto_14

    :cond_12
    add-long v2, p1, v0

    :goto_14
    const/16 v5, 0xa

    const-wide/16 v6, 0x0

    move-object v4, p0

    move-wide v8, v2

    invoke-virtual/range {v4 .. v9}, Lぺぁあねじ/づざかべべ;->せづっ〸ちね(BJJ)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v8, v4, v6

    if-eqz v8, :cond_29

    invoke-virtual {p0, v4, v5}, Lぺぁあねじ/づざかべべ;->げがぴうあだ(J)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 1
    :cond_29
    iget-wide v4, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    cmp-long v6, v2, v4

    if-gez v6, :cond_46

    sub-long v0, v2, v0

    .line 2
    invoke-virtual {p0, v0, v1}, Lぺぁあねじ/づざかべべ;->ぉひのべい(J)B

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_46

    invoke-virtual {p0, v2, v3}, Lぺぁあねじ/づざかべべ;->ぉひのべい(J)B

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_46

    invoke-virtual {p0, v2, v3}, Lぺぁあねじ/づざかべべ;->げがぴうあだ(J)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_46
    new-instance v6, Lぺぁあねじ/づざかべべ;

    invoke-direct {v6}, Lぺぁあねじ/づざかべべ;-><init>()V

    const-wide/16 v2, 0x0

    const-wide/16 v0, 0x20

    .line 3
    iget-wide v4, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    .line 4
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    move-object v0, p0

    move-object v1, v6

    invoke-virtual/range {v0 .. v5}, Lぺぁあねじ/づざかべべ;->ぺづげぺが(Lぺぁあねじ/づざかべべ;JJ)Lぺぁあねじ/づざかべべ;

    new-instance v0, Ljava/io/EOFException;

    const-string v1, "\\n not found: limit="

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 5
    iget-wide v2, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    .line 6
    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " content="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lぺぁあねじ/づざかべべ;->おかぷせ〱()Lぺぁあねじ/〳ぜぞぜべっ;

    move-result-object p1

    invoke-virtual {p1}, Lぺぁあねじ/〳ぜぞぜべっ;->ぁごぐすすぃ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2026

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_88
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "limit < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public どぇぞほだ()Ljava/io/InputStream;
    .registers 2

    new-instance v0, Lぺぁあねじ/づざかべべ$げつ〴ぬぐ;

    invoke-direct {v0, p0}, Lぺぁあねじ/づざかべべ$げつ〴ぬぐ;-><init>(Lぺぁあねじ/づざかべべ;)V

    return-object v0
.end method

.method public ながふずは(I)Lぺぁあねじ/は〲ぱなで;
    .registers 5

    const/4 v0, 0x1

    if-lt p1, v0, :cond_2a

    const/16 v0, 0x2000

    if-gt p1, v0, :cond_2a

    iget-object v1, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    if-nez v1, :cond_16

    invoke-static {}, Lぺぁあねじ/ごづごきえ;->〺つふすそ()Lぺぁあねじ/は〲ぱなで;

    move-result-object p1

    iput-object p1, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    iput-object p1, p1, Lぺぁあねじ/は〲ぱなで;->ぁごぐすすぃ:Lぺぁあねじ/は〲ぱなで;

    iput-object p1, p1, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    return-object p1

    :cond_16
    iget-object v1, v1, Lぺぁあねじ/は〲ぱなで;->ぁごぐすすぃ:Lぺぁあねじ/は〲ぱなで;

    iget v2, v1, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    add-int/2addr v2, p1

    if-gt v2, v0, :cond_21

    iget-boolean p1, v1, Lぺぁあねじ/は〲ぱなで;->づざかべべ:Z

    if-nez p1, :cond_29

    :cond_21
    invoke-static {}, Lぺぁあねじ/ごづごきえ;->〺つふすそ()Lぺぁあねじ/は〲ぱなで;

    move-result-object p1

    invoke-virtual {v1, p1}, Lぺぁあねじ/は〲ぱなで;->〺つふすそ(Lぺぁあねじ/は〲ぱなで;)Lぺぁあねじ/は〲ぱなで;

    move-object v1, p1

    :cond_29
    return-object v1

    :cond_2a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public なぎぱいぢぎ(J)Lぺぁあねじ/〳ぜぞぜべっ;
    .registers 4

    new-instance v0, Lぺぁあねじ/〳ぜぞぜべっ;

    invoke-virtual {p0, p1, p2}, Lぺぁあねじ/づざかべべ;->おぐぴう〸ず(J)[B

    move-result-object p1

    invoke-direct {v0, p1}, Lぺぁあねじ/〳ぜぞぜべっ;-><init>([B)V

    return-object v0
.end method

.method public なぶひせが()J
    .registers 16

    iget-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_a2

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-wide v4, v2

    :cond_b
    iget-object v6, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    iget-object v7, v6, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    iget v8, v6, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    iget v9, v6, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    :goto_13
    if-ge v8, v9, :cond_87

    aget-byte v10, v7, v8

    const/16 v11, 0x30

    if-lt v10, v11, :cond_22

    const/16 v11, 0x39

    if-gt v10, v11, :cond_22

    add-int/lit8 v11, v10, -0x30

    goto :goto_39

    :cond_22
    const/16 v11, 0x61

    if-lt v10, v11, :cond_2d

    const/16 v11, 0x66

    if-gt v10, v11, :cond_2d

    add-int/lit8 v11, v10, -0x61

    goto :goto_37

    :cond_2d
    const/16 v11, 0x41

    if-lt v10, v11, :cond_6c

    const/16 v11, 0x46

    if-gt v10, v11, :cond_6c

    add-int/lit8 v11, v10, -0x41

    :goto_37
    add-int/lit8 v11, v11, 0xa

    :goto_39
    const-wide/high16 v12, -0x1000000000000000L    # -3.105036184601418E231

    and-long/2addr v12, v4

    cmp-long v14, v12, v2

    if-nez v14, :cond_49

    const/4 v10, 0x4

    shl-long/2addr v4, v10

    int-to-long v10, v11

    or-long/2addr v4, v10

    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_13

    :cond_49
    new-instance v0, Lぺぁあねじ/づざかべべ;

    invoke-direct {v0}, Lぺぁあねじ/づざかべべ;-><init>()V

    invoke-virtual {v0, v4, v5}, Lぺぁあねじ/づざかべべ;->こ〲しでおか(J)Lぺぁあねじ/づざかべべ;

    move-result-object v0

    invoke-virtual {v0, v10}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    new-instance v1, Ljava/lang/NumberFormatException;

    const-string v2, "Number too large: "

    invoke-static {v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lぺぁあねじ/づざかべべ;->ぇぬぎばつ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6c
    if-eqz v0, :cond_70

    const/4 v1, 0x1

    goto :goto_87

    :cond_70
    new-instance v0, Ljava/lang/NumberFormatException;

    const-string v1, "Expected leading [0-9a-fA-F] character but was 0x"

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_87
    :goto_87
    if-ne v8, v9, :cond_93

    invoke-virtual {v6}, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ()Lぺぁあねじ/は〲ぱなで;

    move-result-object v7

    iput-object v7, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    invoke-static {v6}, Lぺぁあねじ/ごづごきえ;->げつ〴ぬぐ(Lぺぁあねじ/は〲ぱなで;)V

    goto :goto_95

    :cond_93
    iput v8, v6, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    :goto_95
    if-nez v1, :cond_9b

    iget-object v6, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    if-nez v6, :cond_b

    :cond_9b
    iget-wide v1, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    int-to-long v6, v0

    sub-long/2addr v1, v6

    iput-wide v1, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    return-wide v4

    :cond_a2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "size == 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_ab

    :goto_aa
    throw v0

    :goto_ab
    goto :goto_aa
.end method

.method public のね〱ばぁぢ(I)Lぺぁあねじ/づざかべべ;
    .registers 7

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lぺぁあねじ/づざかべべ;->ながふずは(I)Lぺぁあねじ/は〲ぱなで;

    move-result-object v0

    iget-object v1, v0, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    iget v2, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    add-int/lit8 v3, v2, 0x1

    ushr-int/lit8 v4, p1, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v1, v2

    add-int/lit8 v2, v3, 0x1

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v1, v3

    iput v2, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v2, 0x2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    return-object p0
.end method

.method public のぷのちつ()Z
    .registers 6

    iget-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_a

    const/4 v0, 0x1

    goto :goto_b

    :cond_a
    const/4 v0, 0x0

    :goto_b
    return v0
.end method

.method public は〲ぱなで()S
    .registers 3

    invoke-virtual {p0}, Lぺぁあねじ/づざかべべ;->ぶでにく〼〳()S

    move-result v0

    .line 1
    sget-object v1, Lぺぁあねじ/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/nio/charset/Charset;

    const v1, 0xffff

    and-int/2addr v0, v1

    const v1, 0xff00

    and-int/2addr v1, v0

    ushr-int/lit8 v1, v1, 0x8

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr v0, v1

    int-to-short v0, v0

    return v0
.end method

.method public ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;
    .registers 6

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lぺぁあねじ/づざかべべ;->ながふずは(I)Lぺぁあねじ/は〲ぱなで;

    move-result-object v0

    iget-object v1, v0, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    iget v2, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    add-int/lit8 v3, v2, 0x1

    iput v3, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    int-to-byte p1, p1

    aput-byte p1, v1, v2

    iget-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    return-object p0
.end method

.method public びえぁぜい(B)J
    .registers 8

    const-wide/16 v2, 0x0

    const-wide v4, 0x7fffffffffffffffL

    move-object v0, p0

    move v1, p1

    invoke-virtual/range {v0 .. v5}, Lぺぁあねじ/づざかべべ;->せづっ〸ちね(BJJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public びぐびあび(Lぺぁあねじ/づざかべべ;J)V
    .registers 12

    if-eqz p1, :cond_eb

    if-eq p1, p0, :cond_e3

    iget-wide v0, p1, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v2, 0x0

    move-wide v4, p2

    invoke-static/range {v0 .. v5}, Lぺぁあねじ/ぉ〲なぱぽた;->〺つふすそ(JJJ)V

    :goto_c
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_e2

    iget-object v0, p1, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    iget v1, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget v2, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    const/4 v3, 0x0

    cmp-long v4, p2, v1

    if-gez v4, :cond_8b

    iget-object v1, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    if-eqz v1, :cond_26

    iget-object v1, v1, Lぺぁあねじ/は〲ぱなで;->ぁごぐすすぃ:Lぺぁあねじ/は〲ぱなで;

    goto :goto_27

    :cond_26
    const/4 v1, 0x0

    :goto_27
    if-eqz v1, :cond_50

    iget-boolean v2, v1, Lぺぁあねじ/は〲ぱなで;->づざかべべ:Z

    if-eqz v2, :cond_50

    iget v2, v1, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    int-to-long v4, v2

    add-long/2addr v4, p2

    iget-boolean v2, v1, Lぺぁあねじ/は〲ぱなで;->びぐびあび:Z

    if-eqz v2, :cond_37

    const/4 v2, 0x0

    goto :goto_39

    :cond_37
    iget v2, v1, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    :goto_39
    int-to-long v6, v2

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x2000

    cmp-long v2, v4, v6

    if-gtz v2, :cond_50

    long-to-int v2, p2

    invoke-virtual {v0, v1, v2}, Lぺぁあねじ/は〲ぱなで;->びぐびあび(Lぺぁあねじ/は〲ぱなで;I)V

    iget-wide v0, p1, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    sub-long/2addr v0, p2

    iput-wide v0, p1, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    iget-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    add-long/2addr v0, p2

    iput-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    return-void

    :cond_50
    long-to-int v1, p2

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-lez v1, :cond_85

    iget v2, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget v4, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sub-int/2addr v2, v4

    if-gt v1, v2, :cond_85

    const/16 v2, 0x400

    if-lt v1, v2, :cond_66

    invoke-virtual {v0}, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ()Lぺぁあねじ/は〲ぱなで;

    move-result-object v2

    goto :goto_73

    :cond_66
    invoke-static {}, Lぺぁあねじ/ごづごきえ;->〺つふすそ()Lぺぁあねじ/は〲ぱなで;

    move-result-object v2

    iget-object v4, v0, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    iget v5, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    iget-object v6, v2, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    invoke-static {v4, v5, v6, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_73
    iget v4, v2, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    add-int/2addr v4, v1

    iput v4, v2, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget v4, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    add-int/2addr v4, v1

    iput v4, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    iget-object v0, v0, Lぺぁあねじ/は〲ぱなで;->ぁごぐすすぃ:Lぺぁあねじ/は〲ぱなで;

    invoke-virtual {v0, v2}, Lぺぁあねじ/は〲ぱなで;->〺つふすそ(Lぺぁあねじ/は〲ぱなで;)Lぺぁあねじ/は〲ぱなで;

    .line 2
    iput-object v2, p1, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    goto :goto_8b

    .line 3
    :cond_85
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 4
    :cond_8b
    :goto_8b
    iget-object v0, p1, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    iget v1, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget v2, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0}, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ()Lぺぁあねじ/は〲ぱなで;

    move-result-object v4

    iput-object v4, p1, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    iget-object v4, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    if-nez v4, :cond_a4

    iput-object v0, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    iput-object v0, v0, Lぺぁあねじ/は〲ぱなで;->ぁごぐすすぃ:Lぺぁあねじ/は〲ぱなで;

    iput-object v0, v0, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    goto :goto_cf

    :cond_a4
    iget-object v4, v4, Lぺぁあねじ/は〲ぱなで;->ぁごぐすすぃ:Lぺぁあねじ/は〲ぱなで;

    invoke-virtual {v4, v0}, Lぺぁあねじ/は〲ぱなで;->〺つふすそ(Lぺぁあねじ/は〲ぱなで;)Lぺぁあねじ/は〲ぱなで;

    .line 5
    iget-object v4, v0, Lぺぁあねじ/は〲ぱなで;->ぁごぐすすぃ:Lぺぁあねじ/は〲ぱなで;

    if-eq v4, v0, :cond_dc

    iget-boolean v5, v4, Lぺぁあねじ/は〲ぱなで;->づざかべべ:Z

    if-nez v5, :cond_b2

    goto :goto_cf

    :cond_b2
    iget v5, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget v6, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sub-int/2addr v5, v6

    iget v6, v4, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    rsub-int v6, v6, 0x2000

    iget-boolean v7, v4, Lぺぁあねじ/は〲ぱなで;->びぐびあび:Z

    if-eqz v7, :cond_c0

    goto :goto_c2

    :cond_c0
    iget v3, v4, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    :goto_c2
    add-int/2addr v6, v3

    if-le v5, v6, :cond_c6

    goto :goto_cf

    :cond_c6
    invoke-virtual {v0, v4, v5}, Lぺぁあねじ/は〲ぱなで;->びぐびあび(Lぺぁあねじ/は〲ぱなで;I)V

    invoke-virtual {v0}, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ()Lぺぁあねじ/は〲ぱなで;

    invoke-static {v0}, Lぺぁあねじ/ごづごきえ;->げつ〴ぬぐ(Lぺぁあねじ/は〲ぱなで;)V

    .line 6
    :goto_cf
    iget-wide v3, p1, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    sub-long/2addr v3, v1

    iput-wide v3, p1, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    iget-wide v3, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    add-long/2addr v3, v1

    iput-wide v3, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    sub-long/2addr p2, v1

    goto/16 :goto_c

    .line 7
    :cond_dc
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_e2
    return-void

    .line 8
    :cond_e3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "source == this"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_eb
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "source == null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_f4

    :goto_f3
    throw p1

    :goto_f4
    goto :goto_f3
.end method

.method public ぶでにく〼〳()S
    .registers 11

    iget-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v2, 0x2

    cmp-long v4, v0, v2

    if-ltz v4, :cond_48

    iget-object v4, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    iget v5, v4, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    iget v6, v4, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    sub-int v7, v6, v5

    const/4 v8, 0x2

    if-ge v7, v8, :cond_24

    invoke-virtual {p0}, Lぺぁあねじ/づざかべべ;->ぅみぱぎぎ()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    invoke-virtual {p0}, Lぺぁあねじ/づざかべべ;->ぅみぱぎぎ()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    int-to-short v0, v0

    return v0

    :cond_24
    iget-object v7, v4, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    add-int/lit8 v8, v5, 0x1

    aget-byte v5, v7, v5

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x8

    add-int/lit8 v9, v8, 0x1

    aget-byte v7, v7, v8

    and-int/lit16 v7, v7, 0xff

    or-int/2addr v5, v7

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    if-ne v9, v6, :cond_44

    invoke-virtual {v4}, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ()Lぺぁあねじ/は〲ぱなで;

    move-result-object v0

    iput-object v0, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    invoke-static {v4}, Lぺぁあねじ/ごづごきえ;->げつ〴ぬぐ(Lぺぁあねじ/は〲ぱなで;)V

    goto :goto_46

    :cond_44
    iput v9, v4, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    :goto_46
    int-to-short v0, v5

    return v0

    :cond_48
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "size < 2: "

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ぷぞてのほき([BII)I
    .registers 11

    array-length v0, p1

    int-to-long v1, v0

    int-to-long v3, p2

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, Lぺぁあねじ/ぉ〲なぱぽた;->〺つふすそ(JJJ)V

    iget-object v0, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    if-nez v0, :cond_d

    const/4 p1, -0x1

    return p1

    :cond_d
    iget v1, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget v2, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sub-int/2addr v1, v2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    iget-object v1, v0, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    iget v2, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    invoke-static {v1, v2, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    add-int/2addr p1, p3

    iput p1, v0, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    iget-wide v1, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    int-to-long v3, p3

    sub-long/2addr v1, v3

    iput-wide v1, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    iget p2, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    if-ne p1, p2, :cond_35

    invoke-virtual {v0}, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ()Lぺぁあねじ/は〲ぱなで;

    move-result-object p1

    iput-object p1, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    invoke-static {v0}, Lぺぁあねじ/ごづごきえ;->げつ〴ぬぐ(Lぺぁあねじ/は〲ぱなで;)V

    :cond_35
    return p3
.end method

.method public bridge synthetic へぬ〴づぞ(I)Lぺぁあねじ/なぎぱいぢぎ;
    .registers 2

    invoke-virtual {p0, p1}, Lぺぁあねじ/づざかべべ;->ばおぢでぎか(I)Lぺぁあねじ/づざかべべ;

    return-object p0
.end method

.method public ぺぁあねじ()I
    .registers 11

    iget-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v2, 0x4

    cmp-long v4, v0, v2

    if-ltz v4, :cond_6a

    iget-object v4, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    iget v5, v4, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    iget v6, v4, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    sub-int v7, v6, v5

    const/4 v8, 0x4

    if-ge v7, v8, :cond_35

    invoke-virtual {p0}, Lぺぁあねじ/づざかべべ;->ぅみぱぎぎ()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    invoke-virtual {p0}, Lぺぁあねじ/づざかべべ;->ぅみぱぎぎ()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    invoke-virtual {p0}, Lぺぁあねじ/づざかべべ;->ぅみぱぎぎ()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    invoke-virtual {p0}, Lぺぁあねじ/づざかべべ;->ぅみぱぎぎ()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    return v0

    :cond_35
    iget-object v7, v4, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    add-int/lit8 v8, v5, 0x1

    aget-byte v5, v7, v5

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x18

    add-int/lit8 v9, v8, 0x1

    aget-byte v8, v7, v8

    and-int/lit16 v8, v8, 0xff

    shl-int/lit8 v8, v8, 0x10

    or-int/2addr v5, v8

    add-int/lit8 v8, v9, 0x1

    aget-byte v9, v7, v9

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x8

    or-int/2addr v5, v9

    add-int/lit8 v9, v8, 0x1

    aget-byte v7, v7, v8

    and-int/lit16 v7, v7, 0xff

    or-int/2addr v5, v7

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    if-ne v9, v6, :cond_67

    invoke-virtual {v4}, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ()Lぺぁあねじ/は〲ぱなで;

    move-result-object v0

    iput-object v0, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    invoke-static {v4}, Lぺぁあねじ/ごづごきえ;->げつ〴ぬぐ(Lぺぁあねじ/は〲ぱなで;)V

    goto :goto_69

    :cond_67
    iput v9, v4, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    :goto_69
    return v5

    :cond_6a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "size < 4: "

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ぺがぅす〹ち(I)Lぺぁあねじ/づざかべべ;
    .registers 7

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lぺぁあねじ/づざかべべ;->ながふずは(I)Lぺぁあねじ/は〲ぱなで;

    move-result-object v0

    iget-object v1, v0, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    iget v2, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    add-int/lit8 v3, v2, 0x1

    ushr-int/lit8 v4, p1, 0x18

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v1, v2

    add-int/lit8 v2, v3, 0x1

    ushr-int/lit8 v4, p1, 0x10

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v1, v3

    add-int/lit8 v3, v2, 0x1

    ushr-int/lit8 v4, p1, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v1, v2

    add-int/lit8 v2, v3, 0x1

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v1, v3

    iput v2, v0, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    const-wide/16 v2, 0x4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    return-object p0
.end method

.method public ぺづげぺが(Lぺぁあねじ/づざかべべ;JJ)Lぺぁあねじ/づざかべべ;
    .registers 14

    if-eqz p1, :cond_5d

    iget-wide v0, p0, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    move-wide v2, p2

    move-wide v4, p4

    invoke-static/range {v0 .. v5}, Lぺぁあねじ/ぉ〲なぱぽた;->〺つふすそ(JJJ)V

    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    if-nez v2, :cond_10

    return-object p0

    :cond_10
    iget-wide v2, p1, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    add-long/2addr v2, p4

    iput-wide v2, p1, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    iget-object v2, p0, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    :goto_17
    iget v3, v2, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget v4, v2, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sub-int v5, v3, v4

    int-to-long v5, v5

    cmp-long v7, p2, v5

    if-ltz v7, :cond_28

    sub-int/2addr v3, v4

    int-to-long v3, v3

    sub-long/2addr p2, v3

    iget-object v2, v2, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    goto :goto_17

    :cond_28
    :goto_28
    cmp-long v3, p4, v0

    if-lez v3, :cond_5c

    invoke-virtual {v2}, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ()Lぺぁあねじ/は〲ぱなで;

    move-result-object v3

    iget v4, v3, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    int-to-long v4, v4

    add-long/2addr v4, p2

    long-to-int p2, v4

    iput p2, v3, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    long-to-int p3, p4

    add-int/2addr p2, p3

    iget p3, v3, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p2

    iput p2, v3, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget-object p2, p1, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    if-nez p2, :cond_4c

    iput-object v3, v3, Lぺぁあねじ/は〲ぱなで;->ぁごぐすすぃ:Lぺぁあねじ/は〲ぱなで;

    iput-object v3, v3, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    iput-object v3, p1, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    goto :goto_51

    :cond_4c
    iget-object p2, p2, Lぺぁあねじ/は〲ぱなで;->ぁごぐすすぃ:Lぺぁあねじ/は〲ぱなで;

    invoke-virtual {p2, v3}, Lぺぁあねじ/は〲ぱなで;->〺つふすそ(Lぺぁあねじ/は〲ぱなで;)Lぺぁあねじ/は〲ぱなで;

    :goto_51
    iget p2, v3, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget p3, v3, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sub-int/2addr p2, p3

    int-to-long p2, p2

    sub-long/2addr p4, p2

    iget-object v2, v2, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    move-wide p2, v0

    goto :goto_28

    :cond_5c
    return-object p0

    :cond_5d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "out == null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_66

    :goto_65
    throw p1

    :goto_66
    goto :goto_65
.end method

.method public ぺふねづ〺()Ljava/lang/String;
    .registers 3

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1}, Lぺぁあねじ/づざかべべ;->でどあくず(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
