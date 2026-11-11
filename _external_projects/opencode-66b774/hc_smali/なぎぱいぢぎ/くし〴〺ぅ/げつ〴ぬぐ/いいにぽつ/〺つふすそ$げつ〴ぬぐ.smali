.class public Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/〺つふすそ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/〺つふすそ;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/〺つふすそ;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/〺つふすそ;)V
    .registers 2

    iput-object p1, p0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/〺つふすそ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/〺つふすそ;

    iget-object v0, v0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/〺つふすそ;->〺つふすそ:Lcom/balsikandar/crashreporter/ui/CrashReporterActivity;

    .line 1
    iget-object v0, v0, Lcom/balsikandar/crashreporter/ui/CrashReporterActivity;->ぉざぅち〻:Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;

    .line 2
    iget-object v0, v0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/くし〴〺ぅ;->ぁごぐすすぃ:Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/げつ〴ぬぐ;

    .line 3
    iget-object v1, v0, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/げつ〴ぬぐ;->ぺがぅす〹ち:Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/〺つふすそ;

    if-eqz v1, :cond_17

    invoke-virtual {v0}, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/いいにぽつ/げつ〴ぬぐ;->にぢ〱ぁな()Ljava/util/ArrayList;

    move-result-object v0

    .line 4
    iput-object v0, v1, Lなぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ/ぺぁあねじ/〺つふすそ;->びぐびあび:Ljava/util/ArrayList;

    .line 5
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView$びぐびあび;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$づざかべべ;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$づざかべべ;->〺つふすそ()V

    :cond_17
    return-void
.end method
