.class public final L〳ぜぞぜべっ/ざっざへづ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L〳ぜぞぜべっ/ざっざへづ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final 〺つふすそ:L〳ぜぞぜべっ/びえぁぜい;

.field public final げつ〴ぬぐ:L〳ぜぞぜべっ/ぉざぅち〻;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(L〳ぜぞぜべっ/ぉざぅち〻;L〳ぜぞぜべっ/びえぁぜい;)V
    .registers 3
    .param p1    # L〳ぜぞぜべっ/ぉざぅち〻;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L〳ぜぞぜべっ/ざっざへづ$げつ〴ぬぐ;->げつ〴ぬぐ:L〳ぜぞぜべっ/ぉざぅち〻;

    iput-object p2, p0, L〳ぜぞぜべっ/ざっざへづ$げつ〴ぬぐ;->〺つふすそ:L〳ぜぞぜべっ/びえぁぜい;

    return-void
.end method
