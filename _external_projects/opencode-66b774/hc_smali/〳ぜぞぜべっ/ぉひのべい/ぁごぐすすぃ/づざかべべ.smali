.class public final L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/づざかべべ;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const-string v0, " +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    return-void
.end method

.method public static 〺つふすそ(L〳ぜぞぜべっ/なぶひせが;)Z
    .registers 9

    .line 1
    iget-object v0, p0, L〳ぜぞぜべっ/なぶひせが;->〺つふすそ:L〳ぜぞぜべっ/ぉ〲なぱぽた;

    .line 2
    iget-object v0, v0, L〳ぜぞぜべっ/ぉ〲なぱぽた;->〺つふすそ:Ljava/lang/String;

    const-string v1, "HEAD"

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_e

    return v1

    .line 4
    :cond_e
    iget v0, p0, L〳ぜぞぜべっ/なぶひせが;->びぐびあび:I

    const/16 v2, 0x64

    const/4 v3, 0x1

    if-lt v0, v2, :cond_19

    const/16 v2, 0xc8

    if-lt v0, v2, :cond_22

    :cond_19
    const/16 v2, 0xcc

    if-eq v0, v2, :cond_22

    const/16 v2, 0x130

    if-eq v0, v2, :cond_22

    return v3

    .line 5
    :cond_22
    invoke-static {p0}, L〳ぜぞぜべっ/ぉひのべい/ぁごぐすすぃ/づざかべべ;->げつ〴ぬぐ(L〳ぜぞぜべっ/なぶひせが;)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_42

    .line 6
    iget-object p0, p0, L〳ぜぞぜべっ/なぶひせが;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉざぅち〻;

    const-string v0, "Transfer-Encoding"

    invoke-virtual {p0, v0}, L〳ぜぞぜべっ/ぉざぅち〻;->げつ〴ぬぐ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_37

    goto :goto_38

    :cond_37
    const/4 p0, 0x0

    :goto_38
    const-string v0, "chunked"

    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_41

    goto :goto_42

    :cond_41
    return v1

    :cond_42
    :goto_42
    return v3
.end method

.method public static くし〴〺ぅ(Ljava/lang/String;I)I
    .registers 5

    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p0
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_4} :catch_18

    const-wide/32 v0, 0x7fffffff

    cmp-long v2, p0, v0

    if-lez v2, :cond_f

    const p0, 0x7fffffff

    return p0

    :cond_f
    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-gez v2, :cond_17

    const/4 p0, 0x0

    return p0

    :cond_17
    long-to-int p1, p0

    :catch_18
    return p1
.end method

.method public static げつ〴ぬぐ(L〳ぜぞぜべっ/なぶひせが;)J
    .registers 3

    .line 1
    iget-object p0, p0, L〳ぜぞぜべっ/なぶひせが;->ぁごぐすすぃ:L〳ぜぞぜべっ/ぉざぅち〻;

    const-string v0, "Content-Length"

    .line 2
    invoke-virtual {p0, v0}, L〳ぜぞぜべっ/ぉざぅち〻;->げつ〴ぬぐ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_b

    goto :goto_10

    .line 3
    :cond_b
    :try_start_b
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_f
    .catch Ljava/lang/NumberFormatException; {:try_start_b .. :try_end_f} :catch_10

    goto :goto_12

    :catch_10
    :goto_10
    const-wide/16 v0, -0x1

    :goto_12
    return-wide v0
.end method

.method public static づざかべべ(Ljava/lang/String;ILjava/lang/String;)I
    .registers 5

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge p1, v0, :cond_15

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_12

    goto :goto_15

    :cond_12
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_15
    :goto_15
    return p1
.end method

.method public static びぐびあび(L〳ぜぞぜべっ/いいにぽつ;L〳ぜぞぜべっ/ざとぅぼこ〺;L〳ぜぞぜべっ/ぉざぅち〻;)V
    .registers 37

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    sget-object v2, L〳ぜぞぜべっ/いいにぽつ;->げつ〴ぬぐ:L〳ぜぞぜべっ/いいにぽつ;

    if-ne v1, v2, :cond_9

    return-void

    .line 1
    :cond_9
    sget-object v2, L〳ぜぞぜべっ/ぺぁあねじ;->いいにぽつ:Ljava/util/regex/Pattern;

    const-string v2, "Set-Cookie"

    .line 2
    invoke-virtual/range {p2 .. p2}, L〳ぜぞぜべっ/ぉざぅち〻;->づざかべべ()I

    move-result v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_14
    if-ge v6, v3, :cond_32

    invoke-virtual {v0, v6}, L〳ぜぞぜべっ/ぉざぅち〻;->〺つふすそ(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2f

    if-nez v7, :cond_28

    new-instance v7, Ljava/util/ArrayList;

    const/4 v8, 0x2

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    :cond_28
    invoke-virtual {v0, v6}, L〳ぜぞぜべっ/ぉざぅち〻;->なぎぱいぢぎ(I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2f
    add-int/lit8 v6, v6, 0x1

    goto :goto_14

    :cond_32
    if-eqz v7, :cond_39

    invoke-static {v7}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_3d

    :cond_39
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_3d
    move-object v2, v0

    .line 3
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_44
    if-ge v6, v3, :cond_351

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 5
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v11

    const/16 v12, 0x3b

    invoke-static {v8, v5, v11, v12}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぺぁあねじ(Ljava/lang/String;IIC)I

    move-result v0

    const/16 v13, 0x3d

    invoke-static {v8, v5, v0, v13}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぺぁあねじ(Ljava/lang/String;IIC)I

    move-result v14

    if-ne v14, v0, :cond_67

    :cond_63
    :goto_63
    move-object/from16 v8, p1

    goto/16 :goto_33e

    :cond_67
    invoke-static {v8, v5, v14}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->〻ぞまぎな〻(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->isEmpty()Z

    move-result v15

    if-nez v15, :cond_63

    invoke-static/range {v16 .. v16}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぉざぅち〻(Ljava/lang/String;)I

    move-result v15

    const/4 v4, -0x1

    if-eq v15, v4, :cond_79

    goto :goto_63

    :cond_79
    add-int/lit8 v14, v14, 0x1

    invoke-static {v8, v14, v0}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->〻ぞまぎな〻(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぉざぅち〻(Ljava/lang/String;)I

    move-result v14

    if-eq v14, v4, :cond_86

    goto :goto_63

    :cond_86
    add-int/lit8 v0, v0, 0x1

    const-wide/16 v18, -0x1

    const/4 v4, 0x1

    move-wide/from16 v20, v18

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1

    const/16 v25, 0x0

    const-wide v26, 0xe677d21fdbffL

    const/16 v28, 0x0

    const/16 v29, 0x0

    :goto_9e
    const-wide v30, 0x7fffffffffffffffL

    const-wide/high16 v32, -0x8000000000000000L

    if-ge v0, v11, :cond_154

    invoke-static {v8, v0, v11, v12}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぺぁあねじ(Ljava/lang/String;IIC)I

    move-result v14

    invoke-static {v8, v0, v14, v13}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぺぁあねじ(Ljava/lang/String;IIC)I

    move-result v15

    invoke-static {v8, v0, v15}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->〻ぞまぎな〻(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    if-ge v15, v14, :cond_bc

    add-int/lit8 v15, v15, 0x1

    invoke-static {v8, v15, v14}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->〻ぞまぎな〻(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v15

    goto :goto_be

    :cond_bc
    const-string v15, ""

    :goto_be
    const-string v12, "expires"

    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_cf

    :try_start_c6
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v15, v5, v0}, L〳ぜぞぜべっ/ぺぁあねじ;->〺つふすそ(Ljava/lang/String;II)J

    move-result-wide v26
    :try_end_ce
    .catch Ljava/lang/IllegalArgumentException; {:try_start_c6 .. :try_end_ce} :catch_14e

    goto :goto_f9

    :cond_cf
    const-string v12, "max-age"

    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_fd

    .line 6
    :try_start_d7
    invoke-static {v15}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v20
    :try_end_db
    .catch Ljava/lang/NumberFormatException; {:try_start_d7 .. :try_end_db} :catch_e2

    const-wide/16 v30, 0x0

    cmp-long v0, v20, v30

    if-gtz v0, :cond_f9

    goto :goto_f4

    :catch_e2
    move-exception v0

    move-object v12, v0

    :try_start_e4
    const-string v0, "-?\\d+"

    invoke-virtual {v15, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_fc

    const-string v0, "-"

    invoke-virtual {v15, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f7

    :goto_f4
    move-wide/from16 v20, v32

    goto :goto_f9

    :cond_f7
    move-wide/from16 v20, v30

    :cond_f9
    :goto_f9
    const/16 v25, 0x1

    goto :goto_14e

    :cond_fc
    throw v12
    :try_end_fd
    .catch Ljava/lang/NumberFormatException; {:try_start_e4 .. :try_end_fd} :catch_14e

    :cond_fd
    const-string v12, "domain"

    .line 7
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_12e

    :try_start_105
    const-string v0, "."

    .line 8
    invoke-virtual {v15, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_128

    invoke-virtual {v15, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_117

    invoke-virtual {v15, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v15

    :cond_117
    invoke-static {v15}, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->〺つふすそ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_122

    move-object/from16 v28, v0

    const/16 v24, 0x0

    goto :goto_14e

    :cond_122
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_128
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
    :try_end_12e
    .catch Ljava/lang/IllegalArgumentException; {:try_start_105 .. :try_end_12e} :catch_14e

    :cond_12e
    const-string v12, "path"

    .line 9
    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_139

    move-object/from16 v29, v15

    goto :goto_14e

    :cond_139
    const-string v12, "secure"

    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_144

    const/16 v22, 0x1

    goto :goto_14e

    :cond_144
    const-string v12, "httponly"

    invoke-virtual {v0, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14e

    const/16 v23, 0x1

    :catch_14e
    :cond_14e
    :goto_14e
    add-int/lit8 v0, v14, 0x1

    const/16 v12, 0x3b

    goto/16 :goto_9e

    :cond_154
    cmp-long v0, v20, v32

    if-nez v0, :cond_15d

    move-object/from16 v8, p1

    move-wide/from16 v18, v32

    goto :goto_18c

    :cond_15d
    cmp-long v0, v20, v18

    if-eqz v0, :cond_188

    const-wide v11, 0x20c49ba5e353f7L

    cmp-long v0, v20, v11

    if-gtz v0, :cond_16e

    const-wide/16 v11, 0x3e8

    mul-long v30, v20, v11

    :cond_16e
    add-long v30, v9, v30

    cmp-long v0, v30, v9

    const-wide v8, 0xe677d21fdbffL

    if-ltz v0, :cond_183

    cmp-long v0, v30, v8

    if-lez v0, :cond_17e

    goto :goto_183

    :cond_17e
    move-object/from16 v8, p1

    move-wide/from16 v18, v30

    goto :goto_18c

    :cond_183
    :goto_183
    move-wide/from16 v18, v8

    move-object/from16 v8, p1

    goto :goto_18c

    :cond_188
    move-object/from16 v8, p1

    move-wide/from16 v18, v26

    .line 10
    :goto_18c
    iget-object v0, v8, L〳ぜぞぜべっ/ざとぅぼこ〺;->びぐびあび:Ljava/lang/String;

    const/16 v9, 0x2e

    move-object/from16 v10, v28

    if-nez v10, :cond_196

    move-object v10, v0

    goto :goto_1c6

    .line 11
    :cond_196
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_19d

    goto :goto_1bf

    :cond_19d
    invoke-virtual {v0, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_1c1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v11

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v12

    sub-int/2addr v11, v12

    sub-int/2addr v11, v4

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-ne v11, v9, :cond_1c1

    .line 12
    sget-object v11, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぇぬぎばつ:Ljava/util/regex/Pattern;

    invoke-virtual {v11, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/regex/Matcher;->matches()Z

    move-result v11

    if-nez v11, :cond_1c1

    :goto_1bf
    const/4 v11, 0x1

    goto :goto_1c2

    :cond_1c1
    const/4 v11, 0x0

    :goto_1c2
    if-nez v11, :cond_1c6

    goto/16 :goto_33e

    .line 13
    :cond_1c6
    :goto_1c6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v11

    if-eq v0, v11, :cond_30e

    .line 14
    sget-object v11, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->〳ぜぞぜべっ:L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;

    .line 15
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10}, Ljava/net/IDN;->toUnicode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v12, "\\."

    invoke-virtual {v0, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    .line 16
    iget-object v0, v11, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_21a

    iget-object v0, v11, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v5, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_21a

    const/4 v13, 0x0

    .line 17
    :goto_1f0
    :try_start_1f0
    invoke-virtual {v11}, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->〺つふすそ()V
    :try_end_1f3
    .catch Ljava/io/InterruptedIOException; {:try_start_1f0 .. :try_end_1f3} :catch_216
    .catch Ljava/io/IOException; {:try_start_1f0 .. :try_end_1f3} :catch_1f8
    .catchall {:try_start_1f0 .. :try_end_1f3} :catchall_1f6

    if-eqz v13, :cond_21f

    goto :goto_204

    :catchall_1f6
    move-exception v0

    goto :goto_20c

    :catch_1f8
    move-exception v0

    move-object v14, v0

    .line 18
    :try_start_1fa
    sget-object v0, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;

    const/4 v15, 0x5

    const-string v9, "Failed to read public suffix list"

    .line 19
    invoke-virtual {v0, v15, v9, v14}, L〳ぜぞぜべっ/ぉひのべい/いいにぽつ/なぎぱいぢぎ;->ぺふねづ〺(ILjava/lang/String;Ljava/lang/Throwable;)V
    :try_end_202
    .catchall {:try_start_1fa .. :try_end_202} :catchall_1f6

    if-eqz v13, :cond_21f

    :goto_204
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    goto :goto_21f

    :goto_20c
    if-eqz v13, :cond_215

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    :cond_215
    throw v0

    :catch_216
    const/16 v9, 0x2e

    const/4 v13, 0x1

    goto :goto_1f0

    .line 20
    :cond_21a
    :try_start_21a
    iget-object v0, v11, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->〺つふすそ:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_21f
    .catch Ljava/lang/InterruptedException; {:try_start_21a .. :try_end_21f} :catch_21f

    :catch_21f
    :cond_21f
    :goto_21f
    monitor-enter v11

    :try_start_220
    iget-object v0, v11, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->くし〴〺ぅ:[B

    if-eqz v0, :cond_303

    monitor-exit v11
    :try_end_225
    .catchall {:try_start_220 .. :try_end_225} :catchall_30b

    array-length v0, v12

    new-array v9, v0, [[B

    const/4 v13, 0x0

    :goto_229
    array-length v14, v12

    if-ge v13, v14, :cond_239

    aget-object v14, v12, v13

    sget-object v15, L〳ぜぞぜべっ/ぉひのべい/くし〴〺ぅ;->ぺぁあねじ:Ljava/nio/charset/Charset;

    invoke-virtual {v14, v15}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v14

    aput-object v14, v9, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_229

    :cond_239
    const/4 v13, 0x0

    :goto_23a
    if-ge v13, v0, :cond_248

    iget-object v14, v11, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->くし〴〺ぅ:[B

    invoke-static {v14, v9, v13}, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->げつ〴ぬぐ([B[[BI)Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_245

    goto :goto_249

    :cond_245
    add-int/lit8 v13, v13, 0x1

    goto :goto_23a

    :cond_248
    const/4 v14, 0x0

    :goto_249
    if-le v0, v4, :cond_266

    invoke-virtual {v9}, [[B->clone()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, [[B

    const/4 v15, 0x0

    :goto_252
    array-length v5, v13

    sub-int/2addr v5, v4

    if-ge v15, v5, :cond_266

    sget-object v5, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->づざかべべ:[B

    aput-object v5, v13, v15

    iget-object v5, v11, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->くし〴〺ぅ:[B

    invoke-static {v5, v13, v15}, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->げつ〴ぬぐ([B[[BI)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_263

    goto :goto_267

    :cond_263
    add-int/lit8 v15, v15, 0x1

    goto :goto_252

    :cond_266
    const/4 v5, 0x0

    :goto_267
    if-eqz v5, :cond_27a

    const/4 v13, 0x0

    :goto_26a
    add-int/lit8 v15, v0, -0x1

    if-ge v13, v15, :cond_27a

    iget-object v15, v11, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->びぐびあび:[B

    invoke-static {v15, v9, v13}, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->げつ〴ぬぐ([B[[BI)Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_277

    goto :goto_27b

    :cond_277
    add-int/lit8 v13, v13, 0x1

    goto :goto_26a

    :cond_27a
    const/4 v15, 0x0

    :goto_27b
    if-eqz v15, :cond_295

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "!"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v5, "\\."

    invoke-virtual {v0, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    goto :goto_2b8

    :cond_295
    if-nez v14, :cond_29c

    if-nez v5, :cond_29c

    sget-object v0, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->ぁごぐすすぃ:[Ljava/lang/String;

    goto :goto_2b8

    :cond_29c
    if-eqz v14, :cond_2a5

    const-string v0, "\\."

    invoke-virtual {v14, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    goto :goto_2a7

    :cond_2a5
    sget-object v0, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->なぎぱいぢぎ:[Ljava/lang/String;

    :goto_2a7
    if-eqz v5, :cond_2b0

    const-string v9, "\\."

    invoke-virtual {v5, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    goto :goto_2b2

    :cond_2b0
    sget-object v5, L〳ぜぞぜべっ/ぉひのべい/ぺふねづ〺/げつ〴ぬぐ;->なぎぱいぢぎ:[Ljava/lang/String;

    :goto_2b2
    array-length v9, v0

    array-length v11, v5

    if-le v9, v11, :cond_2b7

    goto :goto_2b8

    :cond_2b7
    move-object v0, v5

    .line 21
    :goto_2b8
    array-length v5, v12

    array-length v9, v0

    const/16 v11, 0x21

    if-ne v5, v9, :cond_2c9

    const/4 v5, 0x0

    aget-object v9, v0, v5

    invoke-virtual {v9, v5}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-eq v9, v11, :cond_2ca

    const/4 v0, 0x0

    goto :goto_2ff

    :cond_2c9
    const/4 v5, 0x0

    :cond_2ca
    aget-object v9, v0, v5

    invoke-virtual {v9, v5}, Ljava/lang/String;->charAt(I)C

    move-result v9

    array-length v5, v12

    array-length v0, v0

    if-ne v9, v11, :cond_2d5

    goto :goto_2d7

    :cond_2d5
    add-int/lit8 v0, v0, 0x1

    :goto_2d7
    sub-int/2addr v5, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "\\."

    invoke-virtual {v10, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    :goto_2e3
    array-length v11, v9

    if-ge v5, v11, :cond_2f3

    aget-object v11, v9, v5

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v11, 0x2e

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    goto :goto_2e3

    :cond_2f3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    sub-int/2addr v5, v4

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2ff
    if-nez v0, :cond_30e

    const/4 v5, 0x0

    goto :goto_33e

    .line 22
    :cond_303
    :try_start_303
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unable to load publicsuffixes.gz resource from the classpath."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_30b
    move-exception v0

    monitor-exit v11
    :try_end_30d
    .catchall {:try_start_303 .. :try_end_30d} :catchall_30b

    throw v0

    :cond_30e
    move-object/from16 v4, v29

    if-eqz v4, :cond_31f

    const-string v0, "/"

    .line 23
    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_31b

    goto :goto_31f

    :cond_31b
    move-object/from16 v21, v4

    const/4 v5, 0x0

    goto :goto_335

    :cond_31f
    :goto_31f
    invoke-virtual/range {p1 .. p1}, L〳ぜぞぜべっ/ざとぅぼこ〺;->なぎぱいぢぎ()Ljava/lang/String;

    move-result-object v0

    const/16 v4, 0x2f

    invoke-virtual {v0, v4}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_331

    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_333

    :cond_331
    const-string v0, "/"

    :goto_333
    move-object/from16 v21, v0

    :goto_335
    new-instance v0, L〳ぜぞぜべっ/ぺぁあねじ;

    move-object v15, v0

    move-object/from16 v20, v10

    invoke-direct/range {v15 .. v25}, L〳ぜぞぜべっ/ぺぁあねじ;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V

    goto :goto_33f

    :goto_33e
    const/4 v0, 0x0

    :goto_33f
    if-nez v0, :cond_342

    goto :goto_34d

    :cond_342
    if-nez v7, :cond_34a

    .line 24
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move-object v7, v4

    :cond_34a
    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_34d
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_44

    :cond_351
    if-eqz v7, :cond_358

    invoke-static {v7}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_35c

    :cond_358
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 25
    :goto_35c
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_363

    return-void

    :cond_363
    move-object v0, v1

    check-cast v0, L〳ぜぞぜべっ/いいにぽつ$げつ〴ぬぐ;

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
