.class public Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$〺つふすそ;,
        Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public final 〺つふすそ:Ljava/io/DataOutputStream;

.field public くし〴〺ぅ:Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

.field public final げつ〴ぬぐ:Ljava/io/DataInputStream;

.field public づざかべべ:Ljava/lang/String;

.field public なぎぱいぢぎ:I

.field public びぐびあび:Ljava/net/InetAddress;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ:I

    new-instance v0, Ljava/io/DataInputStream;

    invoke-direct {v0, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/io/DataInputStream;

    new-instance p1, Ljava/io/DataOutputStream;

    invoke-direct {p1, p2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object p1, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Ljava/io/DataOutputStream;

    return-void
.end method


# virtual methods
.method public 〺つふすそ()Z
    .registers 6

    .line 1
    iget-object v0, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->read()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_8f

    .line 2
    iget-object v0, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->read()I

    move-result v0

    .line 3
    sget-object v1, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    const/4 v2, 0x1

    if-ne v0, v2, :cond_15

    goto :goto_1c

    :cond_15
    sget-object v1, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1b

    goto :goto_1c

    :cond_1b
    const/4 v1, 0x0

    .line 4
    :goto_1c
    iput-object v1, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ:Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$げつ〴ぬぐ;

    const/4 v0, 0x0

    if-nez v1, :cond_23

    const/4 v1, 0x0

    goto :goto_24

    :cond_23
    const/4 v1, 0x1

    :goto_24
    iget-object v3, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/io/DataInputStream;

    invoke-virtual {v3}, Ljava/io/DataInputStream;->read()I

    move-result v3

    if-eqz v3, :cond_2d

    const/4 v1, 0x0

    :cond_2d
    iget-object v3, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/io/DataInputStream;

    invoke-virtual {v3}, Ljava/io/DataInputStream;->read()I

    move-result v3

    const/4 v4, 0x4

    if-ne v3, v2, :cond_42

    new-array v0, v4, [B

    iget-object v2, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/io/DataInputStream;

    invoke-virtual {v2, v0}, Ljava/io/DataInputStream;->readFully([B)V

    invoke-static {v0}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object v0

    goto :goto_7a

    :cond_42
    const/4 v2, 0x3

    if-ne v3, v2, :cond_6b

    iget-object v0, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->read()I

    move-result v0

    new-array v0, v0, [B

    iget-object v2, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/io/DataInputStream;

    invoke-virtual {v2, v0}, Ljava/io/DataInputStream;->readFully([B)V

    const-string v2, "US-ASCII"

    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object v2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ:Ljava/lang/String;

    goto :goto_7c

    :cond_6b
    if-ne v3, v4, :cond_7d

    const/16 v0, 0x10

    new-array v0, v0, [B

    iget-object v2, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/io/DataInputStream;

    invoke-virtual {v2, v0}, Ljava/io/DataInputStream;->readFully([B)V

    invoke-static {v0}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object v0

    :goto_7a
    iput-object v0, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Ljava/net/InetAddress;

    :goto_7c
    move v0, v1

    :cond_7d
    iget-object v1, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/io/DataInputStream;

    invoke-virtual {v1}, Ljava/io/DataInputStream;->read()I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    iget-object v2, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/io/DataInputStream;

    invoke-virtual {v2}, Ljava/io/DataInputStream;->read()I

    move-result v2

    or-int/2addr v1, v2

    iput v1, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ:I

    return v0

    .line 5
    :cond_8f
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported protocol"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public くし〴〺ぅ(Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$〺つふすそ;)V
    .registers 6

    const/16 v0, 0xa

    new-array v0, v0, [B

    const/4 v1, 0x0

    const/4 v2, 0x5

    aput-byte v2, v0, v1

    .line 1
    iget-byte p1, p1, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ$〺つふすそ;->〺つふすそ:B

    const/4 v3, 0x1

    aput-byte p1, v0, v3

    const/4 p1, 0x2

    aput-byte v1, v0, p1

    const/4 p1, 0x3

    aput-byte v3, v0, p1

    const/4 p1, 0x4

    aput-byte v1, v0, p1

    aput-byte v1, v0, v2

    const/4 p1, 0x6

    aput-byte v1, v0, p1

    const/4 p1, 0x7

    aput-byte v1, v0, p1

    const/16 p1, 0x8

    aput-byte v1, v0, p1

    const/16 p1, 0x9

    aput-byte v1, v0, p1

    .line 2
    iget-object p1, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Ljava/io/DataOutputStream;

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->write([B)V

    return-void
.end method

.method public げつ〴ぬぐ()Z
    .registers 8

    .line 1
    iget-object v0, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->read()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_38

    .line 2
    iget-object v0, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->read()I

    move-result v0

    new-array v2, v0, [B

    iget-object v3, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/io/DataInputStream;

    invoke-virtual {v3, v2}, Ljava/io/DataInputStream;->readFully([B)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_18
    const/4 v5, 0x1

    if-ge v4, v0, :cond_24

    aget-byte v6, v2, v4

    if-nez v6, :cond_21

    const/4 v0, 0x1

    goto :goto_25

    :cond_21
    add-int/lit8 v4, v4, 0x1

    goto :goto_18

    :cond_24
    const/4 v0, 0x0

    :goto_25
    const/4 v2, 0x2

    new-array v2, v2, [B

    aput-byte v1, v2, v3

    if-eqz v0, :cond_2f

    aput-byte v3, v2, v5

    goto :goto_32

    :cond_2f
    const/4 v1, -0x1

    aput-byte v1, v2, v5

    :goto_32
    iget-object v1, p0, Lいいにぽつ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ:Ljava/io/DataOutputStream;

    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->write([B)V

    return v0

    .line 3
    :cond_38
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported protocol"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_41

    :goto_40
    throw v0

    :goto_41
    goto :goto_40
.end method
