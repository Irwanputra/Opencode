.class public Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ$〺つふすそ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;


# direct methods
.method public constructor <init>(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;)V
    .registers 2

    iput-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ$〺つふすそ;->げつ〴ぬぐ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/content/Intent;Ljava/lang/String;I)V
    .registers 6

    iget-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ$〺つふすそ;->げつ〴ぬぐ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;

    .line 1
    iget-object v0, p1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->〺つふすそ:Landroid/os/Handler;

    .line 2
    iget-object p1, p1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->のぷのちつ:Ljava/lang/Runnable;

    .line 3
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ$〺つふすそ;->げつ〴ぬぐ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;

    sget-object v0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ$げつ〴ぬぐ;->びぐびあび:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ$げつ〴ぬぐ;

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p3

    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, p2, p3, v1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->てぜきぽく(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/くし〴〺ぅ$げつ〴ぬぐ;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 5
    iget-object p1, p0, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ$〺つふすそ;->げつ〴ぬぐ:Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;

    .line 6
    iget-object p1, p1, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/へぬ〴づぞ;->づざかべべ:Lde/blinkt/openvpn/core/OpenVPNService;

    .line 7
    invoke-static {}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;->〺つふすそ()Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;

    move-result-object p1

    invoke-virtual {p1, p0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ;->くし〴〺ぅ(Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ぇぬぎばつ$〺つふすそ;)V

    return-void
.end method

.method public くし〴〺ぅ(Landroid/content/Intent;)V
    .registers 9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    const/4 v2, 0x1

    if-nez v3, :cond_3b

    const-string v3, "H1m@c:KggLe9KkfAgj\u00196oI1oHb=\u001a6iJa"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_3f

    :cond_3b
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_3f
    aput-object v3, v5, v2

    const-string v2, "%s - \'%s\'"

    invoke-static {v4, v2, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_11

    :cond_4b
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "@ff\u001akk\u001afn@d:\u001agiO3hOgnO6gA69K3:OkmLji\u001ea;\u001bjk\u001e4l\u001agiOg<\u001c1=K49\u001d4oNbhN"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぁごぐすすぃ(Ljava/lang/String;)V

    return-void
.end method

.method public げつ〴ぬぐ(Landroid/content/Intent;)V
    .registers 2

    const-string p1, "OehKam\u001d6i\u001c`gJcnKdnAdfHj9\u001e0:A`;\u001ebjA1mIdlK7nLa>\u00196<A1<\u001agg\u001dc=Nan\u0019`f\u001bd:@1jH`nA7m@ciL4o@a:\u00193kLdkJen\u001c`<MemOg<@bf\u001d0=Ieh\u001d7:\u001bb9\u001ea9OgiKglHah\u001ec9@bnI4l\u001cdoMb:K6l\u001e3i\u001b0hHeiO3o\u001ag=O4mA`j\u001ajiMf:\u001a`:@3l\u00193lLaiH`=\u001afoOjo\u001ag9\u001ek9A1f\u001a3:\u001cj<\u001d`9\u001a0o\u001b0;Jko@3h\u001afhO`<I4o\u001acoHg;AcnMboN0:\u001aklAkk\u00196nMbo\u001a0;Kei\u001d6nMklN3n@b9LjoH3fA3mJ`kM`mK3<OjgM7o\u001dk:\u0019dhHklO`h\u001e7fLf>\u001969\u001e`n\u001efm\u001cboNan\u001b6h\u001bjg\u00191h\u001ccnJd9IjoJ1hA4;\u001bbfI6n\u001c1g\u001e7m\u001a6gL49LdiHb<\u001ea<\u001cfm\u001c1:Od9Mek\u001agmKgnMknHfo\u001bk9I6m@`i\u001bk:N0o\u001dk9\u00197l\u001b`<\u001c1kK3h@7mA4gO"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぉざぅち〻(Ljava/lang/String;)V

    return-void
.end method

.method public びぐびあび()V
    .registers 2

    const-string v0, "\u001dal@4h\u0019c:I7hK3l\u001bchI`m@`:Na;\u001bj=@19Oki\u001d7n\u001e4nJjhIc=O1;\u001daiN6:\u001agoI49\u001b"

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lぁごぐすすぃ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/ざっざへづ;->ぁごぐすすぃ(Ljava/lang/String;)V

    return-void
.end method
