.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;
.super Ljava/lang/Thread;
.source ""


# instance fields
.field public 〺つふすそ:Ljava/io/InputStream;

.field public ぁごぐすすぃ:Ljava/net/Socket;

.field public くし〴〺ぅ:Ljava/io/OutputStream;

.field public づざかべべ:Z

.field public なぎぱいぢぎ:Ljava/net/Socket;

.field public びぐびあび:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/io/OutputStream;Ljava/net/Socket;Ljava/net/Socket;)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const v0, 0x19000

    iput v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;->びぐびあび:I

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;->〺つふすそ:Ljava/io/InputStream;

    iput-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;->づざかべべ:Z

    iput-object p3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;->なぎぱいぢぎ:Ljava/net/Socket;

    iput-object p4, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;->ぁごぐすすぃ:Ljava/net/Socket;

    return-void
.end method


# virtual methods
.method public run()V
    .registers 6

    iget v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;->びぐびあび:I

    new-array v0, v0, [B

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_6
    iget-boolean v3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;->づざかべべ:Z

    if-eqz v3, :cond_28

    const/4 v3, -0x1

    if-ne v2, v3, :cond_e

    goto :goto_28

    :cond_e
    :try_start_e
    iget-object v3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;->〺つふすそ:Ljava/io/InputStream;

    iget v4, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;->びぐびあび:I

    invoke-virtual {v3, v0, v1, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    if-lez v2, :cond_20

    invoke-virtual {p0, v2}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;->げつ〴ぬぐ(I)V

    iget-object v3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    invoke-virtual {v3, v0, v1, v2}, Ljava/io/OutputStream;->write([BII)V

    :cond_20
    iget-object v3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;->くし〴〺ぅ:Ljava/io/OutputStream;

    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_25} :catch_26

    goto :goto_6

    :catch_26
    nop

    goto :goto_6

    :cond_28
    :goto_28
    return-void
.end method

.method public final げつ〴ぬぐ(I)V
    .registers 6

    iget-boolean v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;->づざかべべ:Z

    if-eqz v0, :cond_db

    iget-object v0, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;->なぎぱいぢぎ:Ljava/net/Socket;

    if-eqz v0, :cond_db

    const-string v0, "L6>\u0019f>L1lNe>Jj;\u001bgh\u001d3=\u001echLfm@j>@1"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    const-string v3, "\u00190:Acn\u001d0j\u001bcmA`k\u001a6mJbgJ3fKcfAkmJ0"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v2, "Ij<Ng9A7:Jg9N0=\u001banHko\u001bd:IemOcm\u0019ggH3hL6=@fgJkh\u001aan@jjAehO1>Keh\u001e0:\u001e"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぶひせが(Ljava/text/SimpleDateFormat;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lteam/dev/epro/apkcustom/App;->くし〴〺ぅ:Lteam/dev/epro/apkcustom/App;

    const v2, 0x7f110052

    .line 2
    invoke-virtual {v1, v2}, Landroid/app/Application;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\u001ak<MekM4n\u001c4i\u001bekLalLbi\u001c7:\u001afg\u0019bn@knLj:\u001b4;Ijf\u001d4m\u001cg=\u001be;Jgm\u001abkAjfO7mO"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;->ぁごぐすすぃ:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "J0=\u0019ch\u001bkoK1:H1>Adl\u0019g=Od:\u001e3jHdj\u001ad"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;->ぁごぐすすぃ:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\u0019ch\u001e`<Lg;\u001a3iNa<@joJ7f\u001ee;\u001a1lK4:\u0019`"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;->ぁごぐすすぃ:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getPort()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\u00197oId;@j;\u001a7k\u001a0nNg>\u001eef\u001b`n\u001ednK6l\u001cb"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/〳ぜぞぜべっ/くし〴〺ぅ;->なぎぱいぢぎ:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "NdkJ3m\u001bgoIdgA1k@b=\u001dcmAgg\u001dbi\u001d7m\u0019b"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-long v1, p1

    new-instance p1, Ljava/util/Locale;

    const-string v3, "\u001ej<\u001ebmJegI4:I4>Hc>\u0019j9Jd:K1g@d:J3"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p1, v3}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v2, p1}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/なぎぱいぢぎ;->〺つふすそ(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "O79A6hKcf\u001b3lA3f\u00194gJji\u0019km@0oJ3=O4"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lづざかべべ/は〲ぱなで/〺つふすそ;->ぃぜぶの〸ぃ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_db
    return-void
.end method
