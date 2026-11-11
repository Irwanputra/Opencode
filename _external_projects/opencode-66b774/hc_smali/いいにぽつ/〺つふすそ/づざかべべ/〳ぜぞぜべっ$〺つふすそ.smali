.class public final Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$〺つふすそ;
.super Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$くし〴〺ぅ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$くし〴〺ぅ;-><init>()V

    .line 1
    iput-object p1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$くし〴〺ぅ;->〺つふすそ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 4

    const-string v0, "<![CDATA["

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1
    iget-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$くし〴〺ぅ;->〺つふすそ:Ljava/lang/String;

    const-string v2, "]]>"

    .line 2
    invoke-static {v0, v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->なぎぱいぢぎ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
