.class public Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/なぎぱいぢぎ$くし〴〺ぅ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "L\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063/\u3044\u3044\u306b\u307d\u3064/\u306a\u304e\u3071\u3044\u3062\u304e$\u304f\u3057\u3034\u303a\u3045<",
        "L\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063/\u3044\u3044\u306b\u307d\u3064/\u3065\u3056\u304b\u3079\u3079$\u3073\u3050\u3073\u3042\u3073;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroid/os/Handler;

.field public final synthetic げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;


# direct methods
.method public constructor <init>(Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;Landroid/os/Handler;)V
    .registers 3

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/くし〴〺ぅ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;

    iput-object p2, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/くし〴〺ぅ;->〺つふすそ:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Ljava/lang/Object;)V
    .registers 4

    check-cast p1, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$びぐびあび;

    if-nez p1, :cond_8

    .line 1
    iget-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/くし〴〺ぅ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;

    const/4 v0, 0x1

    goto :goto_18

    :cond_8
    iget v0, p1, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$びぐびあび;->〺つふすそ:I

    if-nez v0, :cond_16

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/くし〴〺ぅ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;

    iget-object p1, p1, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Typeface;

    iget-object v1, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/くし〴〺ぅ;->〺つふすそ:Landroid/os/Handler;

    invoke-virtual {v0, p1, v1}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;->〺つふすそ(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    goto :goto_1d

    :cond_16
    iget-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/くし〴〺ぅ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;

    :goto_18
    iget-object v1, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/くし〴〺ぅ;->〺つふすそ:Landroid/os/Handler;

    invoke-virtual {p1, v0, v1}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ;->げつ〴ぬぐ(ILandroid/os/Handler;)V

    :goto_1d
    return-void
.end method
