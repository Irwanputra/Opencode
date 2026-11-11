.class public Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "L\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063/\u3044\u3044\u306b\u307d\u3064/\u3065\u3056\u304b\u3079\u3079$\u3073\u3050\u3073\u3042\u3073;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/げつ〴ぬぐ;

.field public final synthetic くし〴〺ぅ:I

.field public final synthetic げつ〴ぬぐ:Landroid/content/Context;

.field public final synthetic びぐびあび:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/げつ〴ぬぐ;ILjava/lang/String;)V
    .registers 5

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/〺つふすそ;->げつ〴ぬぐ:Landroid/content/Context;

    iput-object p2, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/〺つふすそ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/げつ〴ぬぐ;

    iput p3, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/〺つふすそ;->くし〴〺ぅ:I

    iput-object p4, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/〺つふすそ;->びぐびあび:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .registers 5

    .line 1
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/〺つふすそ;->げつ〴ぬぐ:Landroid/content/Context;

    iget-object v1, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/〺つふすそ;->〺つふすそ:Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/げつ〴ぬぐ;

    iget v2, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/〺つふすそ;->くし〴〺ぅ:I

    invoke-static {v0, v1, v2}, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ;->〺つふすそ(Landroid/content/Context;Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/げつ〴ぬぐ;I)Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$びぐびあび;

    move-result-object v0

    iget-object v1, v0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ$びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Typeface;

    if-eqz v1, :cond_15

    sget-object v2, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/づざかべべ;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/なぎぱいぢぎ;

    iget-object v3, p0, Lづざかべべ/〳ぜぞぜべっ/いいにぽつ/〺つふすそ;->びぐびあび:Ljava/lang/String;

    invoke-virtual {v2, v3, v1}, Lづざかべべ/づざかべべ/なぎぱいぢぎ;->〺つふすそ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_15
    return-object v0
.end method
