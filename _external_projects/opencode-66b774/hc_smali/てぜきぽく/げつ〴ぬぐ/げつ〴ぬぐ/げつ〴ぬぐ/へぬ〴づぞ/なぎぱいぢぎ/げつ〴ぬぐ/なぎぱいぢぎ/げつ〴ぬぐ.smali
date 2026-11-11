.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/びぐびあび;


# static fields
.field public static final 〺つふすそ:Ljava/util/regex/Pattern;


# instance fields
.field public final げつ〴ぬぐ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const-string v0, "HTTP/\\S+\\s(\\d+)\\s(.*)\\s*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;->〺つふすそ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;->げつ〴ぬぐ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Ljava/net/Socket;Ljava/lang/String;II)V
    .registers 10

    sget-object p4, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ$げつ〴ぬぐ;->〺つふすそ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ$げつ〴ぬぐ;

    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;->げつ〴ぬぐ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;

    .line 1
    iget-object v1, v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;->げつ〴ぬぐ:Ljava/lang/String;

    .line 2
    iget v0, v0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;->〺つふすそ:I

    .line 3
    new-instance v2, Ljava/net/InetSocketAddress;

    invoke-direct {v2, v1, v0}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p1, v2}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "I7mI6kL3jN1l\u001b09Mf<\u00190gOkgIjk\u001a`iLc"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;->げつ〴ぬぐ:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;

    .line 4
    iget-object v4, v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/lang/String;

    if-nez v4, :cond_17a

    .line 5
    invoke-virtual {p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " HTTP/1.1\r\nHost: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ""

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\r\n\r\n"

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "\u001cb<H4lIc;Le9Kc<Mc;KkfIai\u001bjg\u001bai@1"

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p2

    invoke-virtual {v3, p2}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const/16 p3, 0x64

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 p3, 0x0

    :cond_84
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_174

    int-to-char v0, v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    const/16 v3, 0x400

    const-string v4, "M1;\u0019cn@e9\u001aegMfg\u0019fm@1>Ja;O3n\u001b0jNel\u001cd<AkjLj>\u0019`=\u001bk>A6m\u00194j\u001d49Lbi\u001bj;I"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-gt v2, v3, :cond_160

    const/4 v2, 0x1

    if-eqz p3, :cond_a7

    const/4 v3, 0x2

    if-ne p3, v3, :cond_ac

    :cond_a7
    const/16 v3, 0xd

    if-ne v0, v3, :cond_ac

    goto :goto_b5

    :cond_ac
    if-eq p3, v2, :cond_b1

    const/4 v3, 0x3

    if-ne p3, v3, :cond_b8

    :cond_b1
    const/16 v3, 0xa

    if-ne v0, v3, :cond_b8

    :goto_b5
    add-int/lit8 p3, p3, 0x1

    goto :goto_b9

    :cond_b8
    const/4 p3, 0x0

    :goto_b9
    const/4 v0, 0x4

    if-ne p3, v0, :cond_84

    if-ne p3, v0, :cond_14c

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/io/BufferedReader;

    new-instance p3, Ljava/io/StringReader;

    invoke-direct {p3, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-direct {p2, p3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    invoke-virtual {p2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_12e

    sget-object p2, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/げつ〴ぬぐ;->〺つふすそ:Ljava/util/regex/Pattern;

    invoke-virtual {p2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->matches()Z

    move-result p3

    if-eqz p3, :cond_ff

    invoke-virtual {p2, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    const/16 p2, 0xc8

    if-ne p1, p2, :cond_eb

    return-void

    :cond_eb
    new-instance p2, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;

    const-string p3, "JeoL39Jg=I4l\u001b0hL4iKan@6o\u001eg:\u00194nJ0oMc:O0>Acm\u001eaoI6;\u001b`<\u001a`gH0kI`n\u001adg\u001b"

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, p1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺづげぺが(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p4, p1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;-><init>(Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ$げつ〴ぬぐ;Ljava/lang/String;)V

    throw p2

    :cond_ff
    new-instance p2, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Mj;LjhMj9NdlAe<I4>\u001cfg\u0019j:Ac>Lji\u001b4hL7:\u001aen\u001adjI0=\u001e6>\u00196>Ifh\u001aj:IjgI3fH"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\u001dc<\u001e6:Nch\u001b4>Lf=Ae9Ab<AklOdm\u001d0mO3"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p4, p1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;-><init>(Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ$げつ〴ぬぐ;Ljava/lang/String;)V

    throw p2

    :cond_12e
    new-instance p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;

    const-string p2, "K6>\u001a3i\u0019`fAe>Jcl\u001e7hM0:\u001d1jJcf\u001a7n\u001bkjL6gMkj@d:Hb=Lb=\u001ab;IjmMeiAjm@gm\u001e"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "Akm\u001aj<\u001ak9\u001cc<L3mM1mL7mA6fM`;IfgL7"

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, v1, p3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p4, p2}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;-><init>(Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ$げつ〴ぬぐ;Ljava/lang/String;)V

    throw p1

    :cond_14c
    new-instance p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;

    const-string p2, "HeiLfnMa>LagJbl\u001b0g@0=\u001cd>\u001c1o@b<\u001d3gJjkI6:Hb>A3n\u001c1j\u001b4:K4lAgjJan\u001c`oN"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v1, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p4, p2}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;-><init>(Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ$げつ〴ぬぐ;Ljava/lang/String;)V

    throw p1

    :cond_160
    new-instance p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;

    const-string p2, "\u001e3hI7i\u001c4;\u001cjf\u001beiOjkKb9\u001dem\u0019e9Ij>\u001d4jNe>M3<I`m\u001egg\u001dfh\u001dc;Kc;M0=\u0019j:KdlJ7g\u001ajkI7h\u001eem\u001ddj\u001cdk@b<\u001d3oMg<\u001de9Afk"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v1, v4}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p4, p2}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;-><init>(Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ$げつ〴ぬぐ;Ljava/lang/String;)V

    throw p1

    :cond_174
    new-instance p1, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;

    invoke-direct {p1, p4}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/〺つふすそ;-><init>(Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ$げつ〴ぬぐ;)V

    throw p1

    .line 6
    :cond_17a
    iget-object p1, v3, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/なぎぱいぢぎ/げつ〴ぬぐ/なぎぱいぢぎ/くし〴〺ぅ;->びぐびあび:Ljava/lang/String;

    .line 7
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "\r\nProxy-Authorization: Basic "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 8
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 p3, 0x0

    const/16 p4, 0x13

    if-lt p2, p4, :cond_1a5

    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 9
    throw p3

    .line 10
    :cond_1a5
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    .line 11
    goto :goto_1aa

    :goto_1a9
    throw p3

    :goto_1aa
    goto :goto_1a9
.end method
