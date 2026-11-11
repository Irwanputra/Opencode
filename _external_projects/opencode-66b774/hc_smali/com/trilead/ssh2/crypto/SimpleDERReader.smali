.class public Lcom/trilead/ssh2/crypto/SimpleDERReader;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public buffer:[B

.field public count:I

.field public pos:I


# direct methods
.method public constructor <init>([B)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->resetInput([B)V

    return-void
.end method

.method public constructor <init>([BII)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1, p2, p3}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->resetInput([BII)V

    return-void
.end method

.method private readByte()B
    .registers 4

    iget v0, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->count:I

    if-lez v0, :cond_13

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->count:I

    iget-object v0, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->buffer:[B

    iget v1, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->pos:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->pos:I

    aget-byte v0, v0, v1

    return v0

    :cond_13
    new-instance v0, Ljava/io/IOException;

    const-string v1, "L6jK4n\u001e1k\u001bgoI7f\u001ag;\u001cd9\u001b6=@kh\u001c`9@eiNb>I6l\u0019do\u0019fk\u001ef=\u00196=\u001a4k\u001ba=\u001e7oA79I"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private readBytes(I)[B
    .registers 6

    iget v0, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->count:I

    if-gt p1, v0, :cond_19

    new-array v0, p1, [B

    iget-object v1, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->buffer:[B

    iget v2, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->pos:I

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v1, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->pos:I

    add-int/2addr v1, p1

    iput v1, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->pos:I

    iget v1, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->count:I

    sub-int/2addr v1, p1

    iput v1, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->count:I

    return-object v0

    :cond_19
    new-instance p1, Ljava/io/IOException;

    const-string v0, "L6jK4n\u001e1k\u001bgoI7f\u001ag;\u001cd9\u001b6=@kh\u001c`9@eiNb>I6l\u0019do\u0019fk\u001ef=\u00196=\u001a4k\u001ba=\u001e7oA79I"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private readLength()I
    .registers 5

    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    and-int/lit16 v1, v0, 0x80

    if-nez v1, :cond_b

    return v0

    :cond_b
    and-int/lit8 v0, v0, 0x7f

    const/4 v1, -0x1

    if-eqz v0, :cond_27

    const/4 v2, 0x4

    if-le v0, v2, :cond_14

    goto :goto_27

    :cond_14
    const/4 v2, 0x0

    :goto_15
    if-lez v0, :cond_23

    shl-int/lit8 v2, v2, 0x8

    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readByte()B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    or-int/2addr v2, v3

    add-int/lit8 v0, v0, -0x1

    goto :goto_15

    :cond_23
    if-gez v2, :cond_26

    return v1

    :cond_26
    return v2

    :cond_27
    :goto_27
    return v1
.end method


# virtual methods
.method public available()I
    .registers 2

    iget v0, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->count:I

    return v0
.end method

.method public ignoreNextObject()I
    .registers 5

    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readLength()I

    move-result v1

    if-ltz v1, :cond_16

    invoke-virtual {p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->available()I

    move-result v2

    if-gt v1, v2, :cond_16

    invoke-direct {p0, v1}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readBytes(I)[B

    return v0

    :cond_16
    new-instance v0, Ljava/io/IOException;

    const-string v2, "\u001b4:\u001b7:I6>\u001d6o\u001edjOamKbhOajM3fO0jL0;J6>J7k\u001cci\u001a0=A6>@`hNefLjg\u001ekhH1;H"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉひのべい(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public readConstructed()Lcom/trilead/ssh2/crypto/SimpleDERReader;
    .registers 5

    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readLength()I

    move-result v0

    if-ltz v0, :cond_20

    invoke-virtual {p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->available()I

    move-result v1

    if-gt v0, v1, :cond_20

    new-instance v1, Lcom/trilead/ssh2/crypto/SimpleDERReader;

    iget-object v2, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->buffer:[B

    iget v3, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->pos:I

    invoke-direct {v1, v2, v3, v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;-><init>([BII)V

    iget v2, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->pos:I

    add-int/2addr v2, v0

    iput v2, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->pos:I

    iget v2, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->count:I

    sub-int/2addr v2, v0

    iput v2, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->count:I

    return-object v1

    :cond_20
    new-instance v1, Ljava/io/IOException;

    const-string v2, "\u001bkm\u001df:\u001ck>JagAk<\u0019j;\u001db;Lb;J7h\u0019bk\u001be:N3=O6nA19\u0019amNehI3oMe:N3mK1jO`:K"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉひのべい(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public readConstructedType()I
    .registers 4

    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    and-int/lit8 v1, v0, 0x20

    const/16 v2, 0x20

    if-ne v1, v2, :cond_f

    and-int/lit8 v0, v0, 0x1f

    return v0

    :cond_f
    new-instance v1, Ljava/io/IOException;

    const-string v2, "AknHbgJ1h\u001bd;O6jOaf\u001ejm\u001adlI1=HkjKajA`n\u001ee=\u001e4jMah\u001c7nO`hI7:\u001ekj\u001c4m\u001c4:\u001cffLa>\u001c`:L7hI3gLfh@1>\u001dbfNbgAelL0o"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public readInt()Ljava/math/BigInteger;
    .registers 5

    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3e

    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readLength()I

    move-result v0

    if-ltz v0, :cond_20

    invoke-virtual {p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->available()I

    move-result v1

    if-gt v0, v1, :cond_20

    invoke-direct {p0, v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readBytes(I)[B

    move-result-object v0

    new-instance v1, Ljava/math/BigInteger;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0}, Ljava/math/BigInteger;-><init>(I[B)V

    return-object v1

    :cond_20
    new-instance v1, Ljava/io/IOException;

    const-string v2, "\u001b4:\u001b7:I6>\u001d6o\u001edjOamKbhOajM3fO0jL0;J6>J7k\u001cci\u001a0=A6>@`hNefLjg\u001ekhH1;H"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉひのべい(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3e
    new-instance v1, Ljava/io/IOException;

    const-string v2, "AcnM0=AclK3:\u001e3fO49\u001cj;\u001d`<I6=LjjIfhJ3oAbl\u001baoJ`;\u001d4=N1<Ab9I1nHb>N1lIbgNfg\u00194j\u001bef@c<@e=Mk9\u0019bg@jfH3m\u001bdg"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public readOctetString()[B
    .registers 5

    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x4

    if-eq v0, v1, :cond_21

    const/4 v1, 0x3

    if-ne v0, v1, :cond_d

    goto :goto_21

    :cond_d
    new-instance v1, Ljava/io/IOException;

    const-string v2, "J1o\u001afk\u001ef9\u001ab=Oki@3jK6<MblK4kA6:HegMc>M3;Lb;H`j\u001c1kN3oM7lO4m\u001b4:K3oLenA6:\u001a6hJkgIjmK7iJ1>N19Kkf\u001e3jMag"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_21
    :goto_21
    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readLength()I

    move-result v0

    if-ltz v0, :cond_32

    invoke-virtual {p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->available()I

    move-result v1

    if-gt v0, v1, :cond_32

    invoke-direct {p0, v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readBytes(I)[B

    move-result-object v0

    return-object v0

    :cond_32
    new-instance v1, Ljava/io/IOException;

    const-string v2, "\u001b4:\u001b7:I6>\u001d6o\u001edjOamKbhOajM3fO0jL0;J6>J7k\u001cci\u001a0=A6>@`hNefLjg\u001ekhH1;H"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉひのべい(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public readOid()Ljava/lang/String;
    .registers 12

    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x6

    if-ne v0, v1, :cond_8b

    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readLength()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_6d

    invoke-virtual {p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->available()I

    move-result v2

    if-gt v0, v2, :cond_6d

    invoke-direct {p0, v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readBytes(I)[B

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v4, 0x40

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v4, 0x0

    aget-byte v5, v2, v4

    div-int/lit8 v5, v5, 0x28

    if-eqz v5, :cond_44

    if-eq v5, v1, :cond_37

    const/16 v1, 0x32

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    aget-byte v1, v2, v4

    add-int/lit8 v1, v1, -0x50

    int-to-byte v1, v1

    aput-byte v1, v2, v4

    goto :goto_49

    :cond_37
    const/16 v1, 0x31

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    aget-byte v1, v2, v4

    add-int/lit8 v1, v1, -0x28

    int-to-byte v1, v1

    aput-byte v1, v2, v4

    goto :goto_49

    :cond_44
    const/16 v1, 0x30

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_49
    const-wide/16 v5, 0x0

    move-wide v7, v5

    :goto_4c
    if-ge v4, v0, :cond_68

    const/4 v1, 0x7

    shl-long/2addr v7, v1

    aget-byte v1, v2, v4

    and-int/lit8 v1, v1, 0x7f

    int-to-long v9, v1

    add-long/2addr v7, v9

    aget-byte v1, v2, v4

    and-int/lit16 v1, v1, 0x80

    if-nez v1, :cond_65

    const/16 v1, 0x2e

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-wide v7, v5

    :cond_65
    add-int/lit8 v4, v4, 0x1

    goto :goto_4c

    :cond_68
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_6d
    new-instance v1, Ljava/io/IOException;

    const-string v2, "\u001b4:\u001b7:I6>\u001d6o\u001edjOamKbhOajM3fO0jL0;J6>J7k\u001cci\u001a0=A6>@`hNefLjg\u001ekhH1;H"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉひのべい(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8b
    new-instance v1, Ljava/io/IOException;

    const-string v2, "M4oI4n\u001egn@akKkf\u00191o@alIek\u001dao\u00193gNe;N0<O6=\u001b1jK0=@do\u001cdj\u001d3fIkl\u001efk\u001c6fKb<L4oIak\u001delL6l\u001egiId<\u001a1=@c:O3mJ4l"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_a0

    :goto_9f
    throw v1

    :goto_a0
    goto :goto_9f
.end method

.method public readSequenceAsByteArray()[B
    .registers 5

    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/16 v1, 0x30

    if-ne v0, v1, :cond_39

    invoke-direct {p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readLength()I

    move-result v0

    if-ltz v0, :cond_1b

    invoke-virtual {p0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->available()I

    move-result v1

    if-gt v0, v1, :cond_1b

    invoke-direct {p0, v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->readBytes(I)[B

    move-result-object v0

    return-object v0

    :cond_1b
    new-instance v1, Ljava/io/IOException;

    const-string v2, "\u001b4:\u001b7:I6>\u001d6o\u001edjOamKbhOajM3fO0jL0;J6>J7k\u001cci\u001a0=A6>@`hNefLjg\u001ekhH1;H"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぉひのべい(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_39
    new-instance v1, Ljava/io/IOException;

    const-string v2, "OejAai\u001a6;A4g\u00194<Ja9H4gK0hA6g\u001afk\u001bc<Mf:A`o\u001ak<@3jL7;\u0019aiH7jN6h\u001c69M`l\u001bj9\u001cfnJe>Ndj\u001bd;N`mOa>Ocn\u001909J4;Hgn"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public resetInput([B)V
    .registers 4

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/trilead/ssh2/crypto/SimpleDERReader;->resetInput([BII)V

    return-void
.end method

.method public resetInput([BII)V
    .registers 4

    iput-object p1, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->buffer:[B

    iput p2, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->pos:I

    iput p3, p0, Lcom/trilead/ssh2/crypto/SimpleDERReader;->count:I

    return-void
.end method
