.class public final Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;
.super Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3073\u3050\u3073\u3042\u3073"
.end annotation


# instance fields
.field public final 〺つふすそ:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;-><init>(Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$げつ〴ぬぐ;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;->〺つふすそ:Ljava/lang/StringBuilder;

    sget-object v0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$いいにぽつ;->づざかべべ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$いいにぽつ;

    iput-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;->げつ〴ぬぐ:Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$いいにぽつ;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "<!--"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1
    iget-object v1, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;->〺つふすそ:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-->"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ぁごぐすすぃ()Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;
    .registers 2

    iget-object v0, p0, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ$びぐびあび;->〺つふすそ:Ljava/lang/StringBuilder;

    invoke-static {v0}, Lいいにぽつ/〺つふすそ/づざかべべ/〳ぜぞぜべっ;->〳ぜぞぜべっ(Ljava/lang/StringBuilder;)V

    return-object p0
.end method
