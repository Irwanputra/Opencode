.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;
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

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;->げつ〴ぬぐ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Ljava/net/Socket;Ljava/lang/String;II)V
    .registers 10

    sget-object v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ$げつ〴ぬぐ;->くし〴〺ぅ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ$げつ〴ぬぐ;

    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/づざかべべ;->げつ〴ぬぐ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;

    .line 1
    iget-object v2, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;->げつ〴ぬぐ:Ljava/lang/String;

    .line 2
    iget v3, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;->〺つふすそ:I

    .line 3
    iget-object v1, v1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/lang/String;

    .line 4
    new-instance v4, Ljava/net/InetSocketAddress;

    invoke-direct {v4, v2, v3}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p1, v4, p4}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object p4

    new-instance v2, Ljava/io/DataInputStream;

    invoke-direct {v2, p4}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p1

    new-instance p4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/4 v3, 0x4

    invoke-virtual {p4, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    const/4 v3, 0x1

    invoke-virtual {p4, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    ushr-int/lit8 v4, p3, 0x8

    invoke-virtual {p4, v4}, Ljava/io/ByteArrayOutputStream;->write(I)V

    and-int/lit16 p3, p3, 0xff

    invoke-virtual {p4, p3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-static {p2}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object p2

    invoke-virtual {p2}, Ljava/net/InetAddress;->getAddress()[B

    move-result-object p2

    invoke-virtual {p4, p2}, Ljava/io/ByteArrayOutputStream;->write([B)V

    if-eqz v1, :cond_57

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x13

    if-lt p2, p3, :cond_50

    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    goto :goto_54

    :cond_50
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    :goto_54
    invoke-virtual {p4, p2}, Ljava/io/ByteArrayOutputStream;->write([B)V

    :cond_57
    const/4 p2, 0x0

    invoke-virtual {p4, p2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 5
    invoke-virtual {p4, p1}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V

    invoke-virtual {p4}, Ljava/io/ByteArrayOutputStream;->reset()V

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    const/4 p1, 0x6

    new-array p1, p1, [B

    .line 6
    invoke-virtual {v2, p1}, Ljava/io/DataInputStream;->readFully([B)V

    aget-byte p3, p1, p2

    if-nez p3, :cond_98

    aget-byte p2, p1, v3

    const/16 p3, 0x5a

    if-ne p2, p3, :cond_7b

    const/4 p1, 0x2

    new-array p1, p1, [B

    invoke-virtual {v2, p1}, Ljava/io/DataInputStream;->readFully([B)V

    return-void

    :cond_7b
    const-string p2, "\u001dk:\u001ba<\u001bfjM`fLf<@jg\u001c`gM0:\u001a4nAj<Kdi@6iMd;\u00193kO69\u001eai\u001d`fHelJ4g\u001a7>\u001ec:\u001c"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    aget-byte p1, p1, v3

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;

    invoke-direct {p2, v0, p1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;-><init>(Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ$げつ〴ぬぐ;Ljava/lang/String;)V

    throw p2

    :cond_98
    new-instance p3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;

    const-string p4, "@4;IkoI0nA0<\u0019j;K0i\u001bko\u001bji\u001bbhIc=M4hA0<Ic;A3nJfo\u001eblJ6j\u001eb<\u001cefJ0jIc9\u0019"

    invoke-static {p4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p4

    aget-byte p1, p1, p2

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, v0, p1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;-><init>(Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ$げつ〴ぬぐ;Ljava/lang/String;)V

    throw p3
.end method
