.class public final Lぺぁあねじ/てぜきぽく;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lぺぁあねじ/ぶでにく〼〳;


# instance fields
.field public 〺つふすそ:I

.field public final くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

.field public final づざかべべ:Lぺぁあねじ/のぷのちつ;

.field public final なぎぱいぢぎ:Ljava/util/zip/CRC32;

.field public final びぐびあび:Ljava/util/zip/Inflater;


# direct methods
.method public constructor <init>(Lぺぁあねじ/ぶでにく〼〳;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lぺぁあねじ/てぜきぽく;->〺つふすそ:I

    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    iput-object v0, p0, Lぺぁあねじ/てぜきぽく;->なぎぱいぢぎ:Ljava/util/zip/CRC32;

    if-eqz p1, :cond_28

    new-instance v0, Ljava/util/zip/Inflater;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    iput-object v0, p0, Lぺぁあねじ/てぜきぽく;->びぐびあび:Ljava/util/zip/Inflater;

    .line 1
    sget-object v1, Lぺぁあねじ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/logging/Logger;

    new-instance v1, Lぺぁあねじ/ざとぅぼこ〺;

    invoke-direct {v1, p1}, Lぺぁあねじ/ざとぅぼこ〺;-><init>(Lぺぁあねじ/ぶでにく〼〳;)V

    .line 2
    iput-object v1, p0, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    new-instance p1, Lぺぁあねじ/のぷのちつ;

    invoke-direct {p1, v1, v0}, Lぺぁあねじ/のぷのちつ;-><init>(Lぺぁあねじ/ぁごぐすすぃ;Ljava/util/zip/Inflater;)V

    iput-object p1, p0, Lぺぁあねじ/てぜきぽく;->づざかべべ:Lぺぁあねじ/のぷのちつ;

    return-void

    :cond_28
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "source == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public close()V
    .registers 2

    iget-object v0, p0, Lぺぁあねじ/てぜきぽく;->づざかべべ:Lぺぁあねじ/のぷのちつ;

    invoke-virtual {v0}, Lぺぁあねじ/のぷのちつ;->close()V

    return-void
.end method

.method public 〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;
    .registers 2

    iget-object v0, p0, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぶでにく〼〳;->〺つふすそ()Lぺぁあねじ/〻ぞまぎな〻;

    move-result-object v0

    return-object v0
.end method

.method public ざっざへづ(Lぺぁあねじ/づざかべべ;J)J
    .registers 24

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-wide/from16 v8, p2

    const-wide/16 v0, 0x0

    cmp-long v2, v8, v0

    if-ltz v2, :cond_174

    cmp-long v2, v8, v0

    if-nez v2, :cond_11

    return-wide v0

    :cond_11
    iget v0, v6, Lぺぁあねじ/てぜきぽく;->〺つふすそ:I

    const-wide/16 v10, -0x1

    const/4 v12, 0x1

    if-nez v0, :cond_11b

    .line 1
    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    const-wide/16 v1, 0xa

    invoke-interface {v0, v1, v2}, Lぺぁあねじ/ぁごぐすすぃ;->〻ぞまぎな〻(J)V

    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぁごぐすすぃ;->げつ〴ぬぐ()Lぺぁあねじ/づざかべべ;

    move-result-object v0

    const-wide/16 v1, 0x3

    invoke-virtual {v0, v1, v2}, Lぺぁあねじ/づざかべべ;->ぉひのべい(J)B

    move-result v13

    shr-int/lit8 v0, v13, 0x1

    and-int/2addr v0, v12

    const/4 v14, 0x0

    if-ne v0, v12, :cond_33

    const/4 v15, 0x1

    goto :goto_34

    :cond_33
    const/4 v15, 0x0

    :goto_34
    if-eqz v15, :cond_45

    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぁごぐすすぃ;->げつ〴ぬぐ()Lぺぁあねじ/づざかべべ;

    move-result-object v1

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0xa

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, Lぺぁあねじ/てぜきぽく;->ぺづげぺが(Lぺぁあねじ/づざかべべ;JJ)V

    :cond_45
    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぁごぐすすぃ;->ぶでにく〼〳()S

    move-result v0

    const/16 v1, 0x1f8b

    const-string v2, "ID1ID2"

    invoke-virtual {v6, v2, v1, v0}, Lぺぁあねじ/てぜきぽく;->じぜこほぱ(Ljava/lang/String;II)V

    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    const-wide/16 v1, 0x8

    invoke-interface {v0, v1, v2}, Lぺぁあねじ/ぁごぐすすぃ;->ぁごぐすすぃ(J)V

    shr-int/lit8 v0, v13, 0x2

    and-int/2addr v0, v12

    if-ne v0, v12, :cond_a1

    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    const-wide/16 v1, 0x2

    invoke-interface {v0, v1, v2}, Lぺぁあねじ/ぁごぐすすぃ;->〻ぞまぎな〻(J)V

    if-eqz v15, :cond_76

    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぁごぐすすぃ;->げつ〴ぬぐ()Lぺぁあねじ/づざかべべ;

    move-result-object v1

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x2

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, Lぺぁあねじ/てぜきぽく;->ぺづげぺが(Lぺぁあねじ/づざかべべ;JJ)V

    :cond_76
    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぁごぐすすぃ;->げつ〴ぬぐ()Lぺぁあねじ/づざかべべ;

    move-result-object v0

    invoke-virtual {v0}, Lぺぁあねじ/づざかべべ;->は〲ぱなで()S

    move-result v0

    iget-object v1, v6, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    int-to-long v4, v0

    invoke-interface {v1, v4, v5}, Lぺぁあねじ/ぁごぐすすぃ;->〻ぞまぎな〻(J)V

    if-eqz v15, :cond_98

    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぁごぐすすぃ;->げつ〴ぬぐ()Lぺぁあねじ/づざかべべ;

    move-result-object v1

    const-wide/16 v2, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v16, v4

    invoke-virtual/range {v0 .. v5}, Lぺぁあねじ/てぜきぽく;->ぺづげぺが(Lぺぁあねじ/づざかべべ;JJ)V

    goto :goto_9a

    :cond_98
    move-wide/from16 v16, v4

    :goto_9a
    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    move-wide/from16 v1, v16

    invoke-interface {v0, v1, v2}, Lぺぁあねじ/ぁごぐすすぃ;->ぁごぐすすぃ(J)V

    :cond_a1
    shr-int/lit8 v0, v13, 0x3

    and-int/2addr v0, v12

    const-wide/16 v16, 0x1

    if-ne v0, v12, :cond_d1

    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0, v14}, Lぺぁあねじ/ぁごぐすすぃ;->びえぁぜい(B)J

    move-result-wide v18

    cmp-long v0, v18, v10

    if-eqz v0, :cond_cb

    if-eqz v15, :cond_c3

    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぁごぐすすぃ;->げつ〴ぬぐ()Lぺぁあねじ/づざかべべ;

    move-result-object v1

    const-wide/16 v2, 0x0

    add-long v4, v18, v16

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, Lぺぁあねじ/てぜきぽく;->ぺづげぺが(Lぺぁあねじ/づざかべべ;JJ)V

    :cond_c3
    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    add-long v1, v18, v16

    invoke-interface {v0, v1, v2}, Lぺぁあねじ/ぁごぐすすぃ;->ぁごぐすすぃ(J)V

    goto :goto_d1

    :cond_cb
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_d1
    :goto_d1
    shr-int/lit8 v0, v13, 0x4

    and-int/2addr v0, v12

    if-ne v0, v12, :cond_ff

    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0, v14}, Lぺぁあねじ/ぁごぐすすぃ;->びえぁぜい(B)J

    move-result-wide v13

    cmp-long v0, v13, v10

    if-eqz v0, :cond_f9

    if-eqz v15, :cond_f1

    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぁごぐすすぃ;->げつ〴ぬぐ()Lぺぁあねじ/づざかべべ;

    move-result-object v1

    const-wide/16 v2, 0x0

    add-long v4, v13, v16

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, Lぺぁあねじ/てぜきぽく;->ぺづげぺが(Lぺぁあねじ/づざかべべ;JJ)V

    :cond_f1
    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    add-long v13, v13, v16

    invoke-interface {v0, v13, v14}, Lぺぁあねじ/ぁごぐすすぃ;->ぁごぐすすぃ(J)V

    goto :goto_ff

    :cond_f9
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_ff
    :goto_ff
    if-eqz v15, :cond_119

    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぁごぐすすぃ;->は〲ぱなで()S

    move-result v0

    iget-object v1, v6, Lぺぁあねじ/てぜきぽく;->なぎぱいぢぎ:Ljava/util/zip/CRC32;

    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    long-to-int v2, v1

    int-to-short v1, v2

    const-string v2, "FHCRC"

    invoke-virtual {v6, v2, v0, v1}, Lぺぁあねじ/てぜきぽく;->じぜこほぱ(Ljava/lang/String;II)V

    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->なぎぱいぢぎ:Ljava/util/zip/CRC32;

    invoke-virtual {v0}, Ljava/util/zip/CRC32;->reset()V

    .line 2
    :cond_119
    iput v12, v6, Lぺぁあねじ/てぜきぽく;->〺つふすそ:I

    :cond_11b
    iget v0, v6, Lぺぁあねじ/てぜきぽく;->〺つふすそ:I

    const/4 v1, 0x2

    if-ne v0, v12, :cond_137

    iget-wide v2, v7, Lぺぁあねじ/づざかべべ;->くし〴〺ぅ:J

    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->づざかべべ:Lぺぁあねじ/のぷのちつ;

    invoke-virtual {v0, v7, v8, v9}, Lぺぁあねじ/のぷのちつ;->ざっざへづ(Lぺぁあねじ/づざかべべ;J)J

    move-result-wide v8

    cmp-long v0, v8, v10

    if-eqz v0, :cond_135

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v4, v8

    invoke-virtual/range {v0 .. v5}, Lぺぁあねじ/てぜきぽく;->ぺづげぺが(Lぺぁあねじ/づざかべべ;JJ)V

    return-wide v8

    :cond_135
    iput v1, v6, Lぺぁあねじ/てぜきぽく;->〺つふすそ:I

    :cond_137
    iget v0, v6, Lぺぁあねじ/てぜきぽく;->〺つふすそ:I

    if-ne v0, v1, :cond_173

    .line 3
    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぁごぐすすぃ;->てぜきぽく()I

    move-result v0

    iget-object v1, v6, Lぺぁあねじ/てぜきぽく;->なぎぱいぢぎ:Ljava/util/zip/CRC32;

    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    long-to-int v2, v1

    const-string v1, "CRC"

    invoke-virtual {v6, v1, v0, v2}, Lぺぁあねじ/てぜきぽく;->じぜこほぱ(Ljava/lang/String;II)V

    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぁごぐすすぃ;->てぜきぽく()I

    move-result v0

    iget-object v1, v6, Lぺぁあねじ/てぜきぽく;->びぐびあび:Ljava/util/zip/Inflater;

    invoke-virtual {v1}, Ljava/util/zip/Inflater;->getBytesWritten()J

    move-result-wide v1

    long-to-int v2, v1

    const-string v1, "ISIZE"

    invoke-virtual {v6, v1, v0, v2}, Lぺぁあねじ/てぜきぽく;->じぜこほぱ(Ljava/lang/String;II)V

    const/4 v0, 0x3

    .line 4
    iput v0, v6, Lぺぁあねじ/てぜきぽく;->〺つふすそ:I

    iget-object v0, v6, Lぺぁあねじ/てぜきぽく;->くし〴〺ぅ:Lぺぁあねじ/ぁごぐすすぃ;

    invoke-interface {v0}, Lぺぁあねじ/ぁごぐすすぃ;->のぷのちつ()Z

    move-result v0

    if-eqz v0, :cond_16b

    goto :goto_173

    :cond_16b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "gzip finished without exhausting source"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_173
    :goto_173
    return-wide v10

    :cond_174
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "byteCount < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final じぜこほぱ(Ljava/lang/String;II)V
    .registers 7

    if-ne p3, p2, :cond_3

    return-void

    :cond_3
    new-instance v0, Ljava/io/IOException;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v1, p1

    const/4 p1, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v1, p1

    const-string p1, "%s: actual 0x%08x != expected 0x%08x"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ぺづげぺが(Lぺぁあねじ/づざかべべ;JJ)V
    .registers 11

    iget-object p1, p1, Lぺぁあねじ/づざかべべ;->〺つふすそ:Lぺぁあねじ/は〲ぱなで;

    :goto_2
    iget v0, p1, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    iget v1, p1, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    sub-int v2, v0, v1

    int-to-long v2, v2

    cmp-long v4, p2, v2

    if-ltz v4, :cond_13

    sub-int/2addr v0, v1

    int-to-long v0, v0

    sub-long/2addr p2, v0

    iget-object p1, p1, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    goto :goto_2

    :cond_13
    const-wide/16 v0, 0x0

    :goto_15
    cmp-long v2, p4, v0

    if-lez v2, :cond_34

    iget v2, p1, Lぺぁあねじ/は〲ぱなで;->〺つふすそ:I

    int-to-long v2, v2

    add-long/2addr v2, p2

    long-to-int p2, v2

    iget p3, p1, Lぺぁあねじ/は〲ぱなで;->くし〴〺ぅ:I

    sub-int/2addr p3, p2

    int-to-long v2, p3

    invoke-static {v2, v3, p4, p5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int p3, v2

    iget-object v2, p0, Lぺぁあねじ/てぜきぽく;->なぎぱいぢぎ:Ljava/util/zip/CRC32;

    iget-object v3, p1, Lぺぁあねじ/は〲ぱなで;->げつ〴ぬぐ:[B

    invoke-virtual {v2, v3, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V

    int-to-long p2, p3

    sub-long/2addr p4, p2

    iget-object p1, p1, Lぺぁあねじ/は〲ぱなで;->なぎぱいぢぎ:Lぺぁあねじ/は〲ぱなで;

    move-wide p2, v0

    goto :goto_15

    :cond_34
    return-void
.end method
