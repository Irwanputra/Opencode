.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/なぎぱいぢぎ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/びぐびあび;


# instance fields
.field public final げつ〴ぬぐ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;


# direct methods
.method public constructor <init>(Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Ljava/net/Socket;Ljava/lang/String;II)V
    .registers 21

    move/from16 v0, p3

    sget-object v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ$げつ〴ぬぐ;

    move-object/from16 v2, p0

    iget-object v3, v2, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/なぎぱいぢぎ;->げつ〴ぬぐ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;

    .line 1
    iget-object v4, v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;->げつ〴ぬぐ:Ljava/lang/String;

    .line 2
    iget v5, v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;->〺つふすそ:I

    .line 3
    iget-object v6, v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/lang/String;

    .line 4
    iget-object v3, v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;->びぐびあび:Ljava/lang/String;

    .line 5
    new-instance v7, Ljava/net/InetSocketAddress;

    invoke-direct {v7, v4, v5}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    move-object/from16 v4, p1

    move/from16 v5, p4

    invoke-virtual {v4, v7, v5}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    invoke-virtual/range {p1 .. p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v5

    new-instance v7, Ljava/io/DataInputStream;

    invoke-direct {v7, v5}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual/range {p1 .. p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v4

    new-instance v5, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v5}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/4 v8, 0x5

    invoke-virtual {v5, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V

    const/4 v9, 0x2

    invoke-virtual {v5, v9}, Ljava/io/ByteArrayOutputStream;->write(I)V

    const/4 v10, 0x0

    invoke-virtual {v5, v10}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-virtual {v5, v9}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 6
    invoke-virtual {v5, v4}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V

    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->reset()V

    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V

    new-array v11, v9, [B

    .line 7
    invoke-virtual {v7, v11}, Ljava/io/DataInputStream;->readFully([B)V

    const/4 v12, 0x1

    aget-byte v11, v11, v12

    and-int/lit16 v11, v11, 0xff

    const/16 v13, 0x13

    if-eqz v11, :cond_b2

    if-eq v11, v9, :cond_57

    goto :goto_b0

    :cond_57
    if-eqz v6, :cond_b0

    if-nez v3, :cond_5c

    goto :goto_b0

    :cond_5c
    invoke-virtual {v5, v12}, Ljava/io/ByteArrayOutputStream;->write(I)V

    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v11, v13, :cond_6a

    sget-object v14, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v6, v14}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v6

    goto :goto_6e

    :cond_6a
    invoke-virtual {v6}, Ljava/lang/String;->getBytes()[B

    move-result-object v6

    :goto_6e
    array-length v14, v6

    const-string v15, "\u001ef;LghAji\u001edmOj=M7>\u001cg;\u001c0<J4>M`h\u001df=J1=\u001b0:\u001a4<JenHafK1m\u001c7n\u001aj=\u0019g9HdiL"

    invoke-static {v15}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v5, v14, v15}, Lづざかべべ/は〲ぱなで/〺つふすそ;->つしけおつ(Ljava/io/OutputStream;ILjava/lang/String;)V

    invoke-virtual {v5, v6}, Ljava/io/ByteArrayOutputStream;->write([B)V

    if-lt v11, v13, :cond_88

    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    goto :goto_8c

    :cond_88
    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    :goto_8c
    array-length v6, v3

    const-string v11, "\u0019f<La;\u001eg<Ido\u001cc>L`nA`;\u0019cfIk=\u001ag=Hem\u001dc:\u001dagH4k\u0019f=Hak\u0019`gJ79H3=Lg;\u001a4=\u001c"

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v5, v6, v11}, Lづざかべべ/は〲ぱなで/〺つふすそ;->つしけおつ(Ljava/io/OutputStream;ILjava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 8
    invoke-virtual {v5, v4}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V

    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->reset()V

    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V

    new-array v3, v9, [B

    .line 9
    invoke-virtual {v7, v3}, Ljava/io/DataInputStream;->readFully([B)V

    aget-byte v3, v3, v12

    if-nez v3, :cond_b0

    goto :goto_b2

    :cond_b0
    :goto_b0
    const/4 v3, 0x0

    goto :goto_b3

    :cond_b2
    :goto_b2
    const/4 v3, 0x1

    :goto_b3
    if-eqz v3, :cond_14e

    invoke-virtual {v5, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-virtual {v5, v12}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-virtual {v5, v10}, Ljava/io/ByteArrayOutputStream;->write(I)V

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v13, :cond_cb

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    move-object/from16 v6, p2

    invoke-virtual {v6, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    goto :goto_d1

    :cond_cb
    move-object/from16 v6, p2

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    :goto_d1
    array-length v6, v3

    const/4 v8, 0x3

    invoke-virtual {v5, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V

    const-string v10, "M7h@c;H1=J3nK`oAckO3jO0:\u001agi\u001dcfNbfJf<AdmAam\u001979\u001dj;Jgf\u001a4h\u001c7>H19Od;\u0019"

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v5, v6, v10}, Lづざかべべ/は〲ぱなで/〺つふすそ;->つしけおつ(Ljava/io/OutputStream;ILjava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V

    ushr-int/lit8 v3, v0, 0x8

    invoke-virtual {v5, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {v5, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 10
    invoke-virtual {v5, v4}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V

    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->reset()V

    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V

    const/4 v0, 0x4

    new-array v3, v0, [B

    .line 11
    invoke-virtual {v7, v3}, Ljava/io/DataInputStream;->readFully([B)V

    aget-byte v4, v3, v12

    if-nez v4, :cond_131

    aget-byte v1, v3, v8

    and-int/lit16 v1, v1, 0xff

    if-eq v1, v12, :cond_12a

    if-eq v1, v8, :cond_124

    if-ne v1, v0, :cond_110

    const/16 v0, 0x10

    goto :goto_12a

    :cond_110
    new-instance v0, Ljava/io/IOException;

    const-string v3, "O`jH0:I1:Ib:\u0019e:Hj=Hd9H3fM6kN1jLck\u001ea=H`f\u001af9@k:Je=\u00191jH0l\u001bb=K19Ld9L"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_124
    invoke-virtual {v7}, Ljava/io/DataInputStream;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    :cond_12a
    :goto_12a
    add-int/2addr v0, v9

    new-array v0, v0, [B

    invoke-virtual {v7, v0}, Ljava/io/DataInputStream;->readFully([B)V

    return-void

    :cond_131
    new-instance v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;

    const-string v4, "IbmJc:N6jL3h\u001c`mL3>\u001d4mL1j\u0019`g\u001ckg\u001bg"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    aget-byte v3, v3, v12

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;-><init>(Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ$げつ〴ぬぐ;Ljava/lang/String;)V

    throw v0

    :cond_14e
    new-instance v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;

    const-string v3, "\u001cd;\u001dagM7l@g:@do\u00194n\u001aegOjoI1j\u001efi\u001d6m\u001d`;\u001eakKcj\u001eek\u001ce<O3jO3>Kf:Abi\u0019c=\u0019"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;-><init>(Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ$げつ〴ぬぐ;Ljava/lang/String;)V

    throw v0
.end method
